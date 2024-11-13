package com.devsuperior.dslist_dozero.dto;

import com.devsuperior.dslist_dozero.entities.GameList;

public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO() {}

    public GameListDTO(GameList entity) { //sem necessidade de usar o BeanUtils por ter poucos atributos
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
