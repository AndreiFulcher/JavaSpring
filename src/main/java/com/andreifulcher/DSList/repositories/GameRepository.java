package com.andreifulcher.DSList.repositories;

import com.andreifulcher.DSList.entities.Game;

import org.springframework.data.jpa.repository.JpaRepository;

public interface  GameRepository extends JpaRepository<Game, Long> {
    //Fornece métodos para acessar o banco de dados
    // Game é a entidade e Long é o tipo do id
    //JpaRepository é uma interface do Spring Data JPA que fornece métodos para operações CRUD (Create, Read, Update, Delete) em entidades JPA.
    //O primeiro parâmetro é a entidade e o segundo é o tipo do id da entidade.
}
