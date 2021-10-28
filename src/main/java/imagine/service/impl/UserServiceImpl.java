package imagine.service.impl;

import java.util.Collections;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import imagine.model.User;
import imagine.model.UserRole;
import imagine.repository.UserRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByUsername(username);
    }

    public boolean addUser(String username, String password) {
        if(userRepository.findByUsername(username) != null){
            return false;
        }
        return userRepository.save(User.builder()
            .username(username)
            .password(password)
            .isActive(true)
            .roles(Collections.singleton(UserRole.ADMIN))
            .build()) != null;
    }
}
