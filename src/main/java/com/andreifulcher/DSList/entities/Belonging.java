package com.andreifulcher.DSList.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity //Indica que é uma entidade e será mapeada para uma tabela no banco de dados
@Table(name = "tb_belonging") //Renomeia a table
public class Belonging {

    @EmbeddedId//anotação indica que a classe é uma chave composta
    private BelongingPK id = new BelongingPK();

    private Integer position;

    public Belonging() {
    }

    public Belonging(Game game, GameList gameList, Integer position) { //Passar os parâmetros para o construtor de Game e GameList
        id.setGame(game);
        id.setGameList(gameList);
        this.position = position;
    }

    public BelongingPK getId() {
        return id;
    }

    public void setId(BelongingPK id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Belonging belonging = (Belonging) o;
        return Objects.equals(id, belonging.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
