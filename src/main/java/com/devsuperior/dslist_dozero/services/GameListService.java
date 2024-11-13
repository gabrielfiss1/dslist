package com.devsuperior.dslist_dozero.services;

import com.devsuperior.dslist_dozero.dto.GameDTO;
import com.devsuperior.dslist_dozero.dto.GameListDTO;
import com.devsuperior.dslist_dozero.dto.GameMinDTO;
import com.devsuperior.dslist_dozero.entities.GameList;
import com.devsuperior.dslist_dozero.repository.GameListRepository;
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
        return  result.stream().map(x -> new GameListDTO(x)).toList();

    }
}
