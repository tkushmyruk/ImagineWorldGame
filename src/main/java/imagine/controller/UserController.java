package imagine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import imagine.service.impl.UserServiceImpl;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class UserController {
    private final UserServiceImpl userService;

    @GetMapping("/registration")
    public String getRegistrationPage(){
        return"registration";
    }

    @GetMapping("/login")
    public String getLoginPage(){
        return "login";
    }

    @PostMapping("/registration")
    public String registrateUser(@RequestParam String username,
        @RequestParam String password){
        return userService.addUser(username, password)? "redirect:/login" : "registration";
    }
}
