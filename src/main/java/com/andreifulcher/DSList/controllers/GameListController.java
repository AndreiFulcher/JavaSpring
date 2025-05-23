package com.andreifulcher.DSList.controllers;

import com.andreifulcher.DSList.dto.GameListDTO;
import com.andreifulcher.DSList.dto.GameMinDTO;
import com.andreifulcher.DSList.dto.ReplacementDTO;
import com.andreifulcher.DSList.services.GameListService;
import com.andreifulcher.DSList.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        return gameListService.findAll();
    }

    @GetMapping("/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId) {
        return gameService.findByList(listId);
    }

    @PostMapping("/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body) {
        gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex() );
    }
}