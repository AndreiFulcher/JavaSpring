package com.andreifulcher.DSList.repositories;

import com.andreifulcher.DSList.entities.GameList;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
    // JpaRepository é uma interface do Spring Data JPA que fornece métodos para operações CRUD
    // e consultas em uma entidade. O primeiro parâmetro é a entidade que será manipulada
    // o segundo é o tipo do ID da entidade.
}
