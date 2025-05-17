package com.cruiser.secureDemo.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration // to let spring know that this is a configuration class.
@EnableWebSecurity // will give this the priority.
public class SecurityConfig {

    @Autowired
    private UserDetailsService userDetailsService; // If you make your own userDetail service by implementing this
        //Interface spring will inject that otherwise it will do the injection from the default one
        // (we are going are going to create our own).


    // Customising the security filter chain.
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {

        httpSecurity.csrf(customizer -> customizer.disable()); //disabling the CSRF token
        httpSecurity.authorizeHttpRequests(request -> request.anyRequest().authenticated()); // Making every Request Authorized
                                            //At this point we ask the spring to use authorization but not specifying how to
                                            //So at the moment no one can log in.
//        httpSecurity.formLogin(Customizer.withDefaults()); //Asks Spring to use form login Strategy
                                            //At the moment i will send a form even if it is a CLI (like postman) to inorder for spring to support
        httpSecurity.httpBasic(Customizer.withDefaults()); // This will make sure that we support CLI interface as well.
        httpSecurity.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
                                            // So this will make sure that you will be receiving a new session id everytime u log in
                                            // This is what makes your API truly stateless.
                                            // But with this setting so far we can't use the form as it is a dedicated page.
                                            // Once you log in spring will not remember that you are logged in.
                                            // SO MIND THAT we will be commenting the form login option.
                                            // SO MIND THAT this will require you to send the sure name and password along with each request.

        return httpSecurity.build(); // returns the security chain by compiling the above settings
    }

    //customise UserDetailService,
            // In other words we use the our own defined way of verifying the users.
    // So here is a basic version of it where is no database connection.

//    @Bean
//    public UserDetailsService userDetailsService(){ // So mind that this is an interface an there are various
//        // implementations of this interface that we can use depending on the Use case
//        // In this case we will be using InMemoryUserDetailsManager that will manage users (multiple hardcoded users)
//
//        // so this will be expecting user details (unlimited amount using params (you have other constructors as well so visit the class if wanted)) objects so we will be creating two just for now
//
//        UserDetails user1 = User.withDefaultPasswordEncoder() //This is deprecated mind replacing when it comes to production
//                .username("Akash")
//                .password("1234")
//                .roles("ADMIN")
//                .build();
//
//        UserDetails user2 = User.withDefaultPasswordEncoder()
//                .username("Shirmil")
//                .password("1234")
//                .roles("USER")
//                .build();
//
//
//        return new InMemoryUserDetailsManager(user1, user2);
//    }

    //Next
        // We will be trying to connect our database to make this work.
        // The reason  So here unlike we used the built in userDetail service we are going to
        // create our own. and my doing that we will be a able to take the data from third party
        // APIs in this case from Databases. So since they have their own ways of storing data
        // we have to move to a little bit more abstract level where we need to let spring boot know the
        // strategy that is need for the spring boot to connect to the application So that we can
        // define the way how we should be mapping the value
            //At the end it will look as if that we are doing the same thing we did in UserDetailService but
            //But by setting a proper way to map the values as you experience next we define the patter on how
            //the how values should be compared and considered (the thing is above we hard orded using official
    //          spring objects but here we are kinda specifying how to do that to the spring ...
    //          while this might feel doable using the above manner using an iterative strategy and more logic
    //          shown below is the clean way where we declare our own Authentication provider)


    @Bean
    public AuthenticationProvider authenticationProvider(){ //We are implement choose the authentication provider out
        //out of the AuthenticationProvider interface that is for making DB connections which is Dao
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider(); // take the empty provider
//        provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance()); // specifies the provider to not use hashing when saving to the DB
        provider.setPasswordEncoder(new BCryptPasswordEncoder(12)); // specifies the provider the way that the password should be shown along with strength used
                                                                                        // Strength in the sense how many encryption algo iterations
        provider.setUserDetailsService(userDetailsService);
        return provider;
    }

    //Adding JWT security.
        //To make this happen should  give even more abstract and should override the behavior of AuthenticationManager

}
