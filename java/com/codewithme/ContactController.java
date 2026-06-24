package com.codewithme;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ContactController {

    @PostMapping("/contact")
    @ResponseBody
    public String submitForm(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String message) {

        System.out.println("Name : " + name);
        System.out.println("Email : " + email);
        System.out.println("Message : " + message);

        return "Form Submitted Successfully";
    }
}