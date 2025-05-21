package com.andreifulcher.DSList.controllers;

import com.andreifulcher.DSList.dto.GameListDTO;
import com.andreifulcher.DSList.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController//Responsável por receber as requisições HTTP, GET/games, POST/games e DELETE/games no Postman
@RequestMapping(value = "/lists")////Define o caminho da requisição, ou seja, o que vem depois de localhost:8080/lists
public class GameListController {

    @Autowired//Injeta a dependência do GameListService, que precisa de um GameListRepository
    private GameListService gameListService;

    @GetMapping////Responde a requisição GET do HTTP
    public List<GameListDTO> findAll() { //procura todos os GameListDTOs
        return gameListService.findAll();
    }
}
