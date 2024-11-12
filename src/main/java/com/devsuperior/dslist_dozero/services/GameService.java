package com.devsuperior.dslist_dozero.services;

import com.devsuperior.dslist_dozero.dto.GameMinDTO;
import com.devsuperior.dslist_dozero.entities.Game;
import com.devsuperior.dslist_dozero.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @GetMapping
    public List<Game> findAll(){
        List<Game> result = gameRepository.findAll();
        return result;
    }
}