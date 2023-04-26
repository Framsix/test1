package controllers;

import model.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UsersController {

    @GetMapping()
    public String getAllUsers(Model model) {
        return null;
    }

//    @GetMapping()
//    public String getUserForId (@RequestMapping(value = "id", defaultValue = "1") int id, Model model) {
//
//    }

    @GetMapping("/new")
    public String newUesr(Model model) {
        model.addAttribute("users", new Users());
        return "users/new";
    }

    @PostMapping
    public String createUser(@ModelAttribute("user") Users user) {

        return "redirect:/users";
    }
}
