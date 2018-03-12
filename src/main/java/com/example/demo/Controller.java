package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    Model model = new Model();

    @GetMapping( value = {"", "/", "/index"})
    public String index() {
        log.info("index action called...");
        return "index";
    }

    @PostMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password) {
        log.info("login action called...");
        User user;
        user = model.getUser(username, password);
        System.out.println(user.getUsername() + " " + user.getPassword() );


        if (user != null) {
            System.out.println("succes");
            return "redirect:/Admin";
        }
        return "index";
    }

    @RequestMapping(value = {"HovedMenu"})
    public String HovedMenu() {
        log.info("Hovedmenu action called...");
        return "HovedMenu";
    }

    @RequestMapping(value = {"Admin"})
    public String Admin() {
        log.info("Admin action called...");
        return "Admin";
    }

    @RequestMapping(value = {"/Vagtplan"})
    public String Vagtplan() {
        log.info("Vagtplan action called...");
        return "Vagtplan";
    }

    @RequestMapping(value = {"/Venteliste"})
    public String Venteliste() {
        log.info("Venteliste action called...");
        return "Venteliste";
    }

    @RequestMapping(value = {"/Telefonliste"})
    public String Telefonliste() {
        log.info("Telefonliste action called...");
        return "Telefonliste";
    }

    @RequestMapping(value = {"/Forældreoplysninger"})
    public String Foraeldreoplysninger() {
        log.info("Forældreoplysninger action called...");
        return "Forældreoplysninger";
    }

    @RequestMapping(value = {"/Medarbejderoplysninger"})
    public String Medarbejderoplysninger() {
        log.info("Medarbejderoplysninger action called...");
        return "Medarbejderoplysninger";
    }

}