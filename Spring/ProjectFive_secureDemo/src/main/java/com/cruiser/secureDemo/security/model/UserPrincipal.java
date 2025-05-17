package com.cruiser.secureDemo.security.model;

import com.cruiser.secureDemo.Common.enums.Roles;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

public class UserPrincipal implements UserDetails {

    private String username;
    private String password;
    private Roles role;



    public UserPrincipal(String username, String password, Roles role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }


    //When a guest shows up at the entrance (logs in),
    // you (the “Badge Issuer”) stick a badge on them that
    // says what they’re allowed to do—like “ADMIN” or “USER.”

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        // Role enum: ADMIN or USER (that’s who the guest is)
        // We turn it into a badge: "ROLE_ADMIN" or "ROLE_USER"
        String badge = "ROLE_" + this.role.name();

        // We give them exactly one badge on a string holder
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(badge);

        // We hand that one‐badge list back to Spring
        return Collections.singletonList(authority);
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
//        return UserDetails.super.isAccountNonExpired();
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
//        return UserDetails.super.isAccountNonLocked();
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
//        return UserDetails.super.isCredentialsNonExpired();
        return true;
    }

    //to check whether it's a valid account
    @Override
    public boolean isEnabled() {
//        return UserDetails.super.isEnabled();
        return true;
    }
}
