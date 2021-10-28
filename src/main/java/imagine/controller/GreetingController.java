package imagine.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import imagine.model.User;

@Controller
public class GreetingController {

    @GetMapping("/")
    public String greeting(@AuthenticationPrincipal User user, Model model){
        model.addAttribute("user", user);
        return "greeting";
    }
}
