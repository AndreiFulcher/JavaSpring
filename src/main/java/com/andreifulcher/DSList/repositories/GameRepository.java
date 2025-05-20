package com.andreifulcher.DSList.repositories;

import com.andreifulcher.DSList.entities.Game;

import org.springframework.data.jpa.repository.JpaRepository;

public interface  GameRepository extends JpaRepository<Game, Long> {
}
