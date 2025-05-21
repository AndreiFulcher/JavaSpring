package com.andreifulcher.DSList.services;

import com.andreifulcher.DSList.dto.GameListDTO;
import com.andreifulcher.DSList.entities.GameList;
import com.andreifulcher.DSList.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(GameListDTO::new).toList();//st
    }
}
