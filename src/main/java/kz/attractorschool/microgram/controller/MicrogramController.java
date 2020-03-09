package kz.attractorschool.microgram.controller;
import kz.attractorschool.microgram.model.UserRepo;
//import kz.attractorschool.microgram.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MicrogramController {
   // private final UserService service;
    private final UserRepo repository;

    public MicrogramController(UserRepo repository) {
        this.repository = repository;
        //this.service = service;
    }


    @GetMapping
    public String root(Model model) {
        model.addAttribute("users", repository.findAll());
        return "users";
    }
}

