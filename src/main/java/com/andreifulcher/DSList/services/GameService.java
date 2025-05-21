package com.andreifulcher.DSList.services;

import java.util.List;

import com.andreifulcher.DSList.projections.GameMinProjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.andreifulcher.DSList.dto.GameDTO;
import com.andreifulcher.DSList.dto.GameMinDTO;
import com.andreifulcher.DSList.entities.Game;
import com.andreifulcher.DSList.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game result = repository.findById(id).get();
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> result = repository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId) {
        List<GameMinProjection> result = repository.searchByList(listId);
        return result.stream().map(GameMinDTO::new).toList();
    }


}
