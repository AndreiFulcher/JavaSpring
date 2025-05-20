package com.andreifulcher.DSList.controllers;

import com.andreifulcher.DSList.dto.GameMinDTO;
import com.andreifulcher.DSList.entities.Game;
import com.andreifulcher.DSList.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController//Responsável por receber as requisições HTTP, GET/games, POST/games e DELETE/games
@RequestMapping(value = "/games")
public class GameController {

    @Autowired//Injeta a dependência do GameService, que precisa de um GameRepository
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll() { //Responde a requisição GET do HTTP
        return gameService.findAll();
    }

}
