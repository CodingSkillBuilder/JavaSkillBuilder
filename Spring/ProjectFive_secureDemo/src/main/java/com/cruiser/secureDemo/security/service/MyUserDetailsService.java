package com.cruiser.secureDemo.security.service;

import com.cruiser.secureDemo.entity.Users;
import com.cruiser.secureDemo.repo.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


// So this is the Custom UserDetailsService that we create.
// And here you should tell how the users should be loaded.
// Apart from we have to take care of mapping which we would be pass to another class.


@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UsersRepository usersRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Users user = usersRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("Username Not Found"));



        return null;
    }
}
