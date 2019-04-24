package kea.demo.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import kea.demo.model.Cat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class CatController {

    @GetMapping("/")
    public String Meow(){

        return "index.html";
    }

    @GetMapping("/profile")
    public String ProfilePage(Model model){
        model.addAttribute("cats", new Cat());
        return "profile/profile-page.html";
    }

    @GetMapping("/test")
    public @ResponseBody String tryTest(){
        return "test works... nice";
    }

}
