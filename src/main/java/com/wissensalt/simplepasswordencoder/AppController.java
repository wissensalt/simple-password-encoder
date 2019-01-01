package com.wissensalt.simplepasswordencoder;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created on 11/25/18.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Controller
public class AppController {

    @GetMapping("/")
    public String showIndex(Model model) {
        model.addAttribute("requestPasswordDTO", new RequestPasswordDTO());
        return "index";
    }


    @PostMapping("/encode")
    public ModelAndView encode(@ModelAttribute RequestPasswordDTO requestPasswordDTO) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(requestPasswordDTO.getPassword());
        return new ModelAndView("result", "password", encodedPassword);
    }
}
