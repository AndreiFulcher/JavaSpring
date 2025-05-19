package com.andreifulcher.DSList.services;

import java.util.List;
import java.util.stream.Collectors;

import com.andreifulcher.DSList.dto.GameMinDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andreifulcher.DSList.entities.Game;
import com.andreifulcher.DSList.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    public List<GameMinDTO> findAll(){
        List<Game> result = repository.findAll(); // pega os jogos do banco
        return result.stream().map(GameMinDTO::new).toList();
    }
}
