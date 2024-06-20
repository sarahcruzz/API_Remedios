package com.remedios.sarah.curso.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController   //indica para o spring que ele deve inicializar a classe como um controller
@RequestMapping("/remedios")   //mapeia o endpoint que será usado na URL
public class RemedioController {

    @PostMapping
    public void cadastrar(@RequestBody String json){
        System.out.println(json);
    }
}
