package com.Albun.mish.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlbumController {


    @GetMapping("/home")
    public String mostrarHome() {
        return "home";
    }


    @GetMapping("/album")
    public String mostrarAlbum() {
        return "album";
    }
}