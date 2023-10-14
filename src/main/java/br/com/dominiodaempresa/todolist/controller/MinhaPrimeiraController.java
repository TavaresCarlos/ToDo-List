package br.com.dominiodaempresa.todolist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

//Indica a criação de uma rota
@RestController
@RequestMapping("/primeiraRota")
//http:localhost:8080/primeiraRota
public class MinhaPrimeiraController {
    
    /**
     * Métodos de acesso de uma requisição HTTP
     * GET - buscar um dado
     * POST - adicionar um dado
     * PUT - alterar um dado
     * DELETE - remover um dado
     * PATCH - alterar somente uma parte do dado
     * 
    */

    //Método da classe
    @GetMapping("/")
    public String primeiraMensagem() {
        return "Funcionou";
    }
}
