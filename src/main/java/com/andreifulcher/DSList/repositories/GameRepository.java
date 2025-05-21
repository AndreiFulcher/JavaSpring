package com.andreifulcher.DSList.repositories;

import com.andreifulcher.DSList.entities.Game;

import com.andreifulcher.DSList.projections.GameMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface  GameRepository extends JpaRepository<Game, Long> {//Responsável por acessar o banco de dados

    //Serve para fazer uma consulta no banco de dados, usando a linguagem SQL
        @Query(nativeQuery = true, value = """
            SELECT tb_game.id, tb_game.title, tb_game.game_year AS `year`, tb_game.img_url AS imgUrl,
            tb_game.short_description AS shortDescription, tb_belonging.position
            FROM tb_game
            INNER JOIN tb_belonging ON tb_game.id = tb_belonging.game_id
            WHERE tb_belonging.list_id = :listId
            ORDER BY tb_belonging.position
               """)
    List<GameMinProjection> searchByList(Long listId);//Parametro passado para o query



}
