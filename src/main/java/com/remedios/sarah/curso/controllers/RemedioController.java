package com.remedios.sarah.curso.controllers;

import com.remedios.sarah.curso.remedio.DadosCadastroRemedio;
import com.remedios.sarah.curso.remedio.Remedio;
import com.remedios.sarah.curso.remedio.RemedioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController   //indica para o spring que ele deve inicializar a classe como um controller
@RequestMapping("/remedios")   //mapeia o endpoint que será usado na URL
public class RemedioController {

    @Autowired
    private RemedioRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroRemedio dados){
        repository.save(new Remedio(dados));
    }
}
