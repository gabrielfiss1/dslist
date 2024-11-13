package com.devsuperior.dslist_dozero.controllers;

import com.devsuperior.dslist_dozero.dto.GameDTO;
import com.devsuperior.dslist_dozero.dto.GameListDTO;
import com.devsuperior.dslist_dozero.dto.GameMinDTO;
import com.devsuperior.dslist_dozero.services.GameListService;
import com.devsuperior.dslist_dozero.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }
}
