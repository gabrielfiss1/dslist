package com.devsuperior.dslist_dozero.services;

import com.devsuperior.dslist_dozero.dto.GameDTO;
import com.devsuperior.dslist_dozero.dto.GameListDTO;
import com.devsuperior.dslist_dozero.dto.GameMinDTO;
import com.devsuperior.dslist_dozero.entities.GameList;
import com.devsuperior.dslist_dozero.projections.GameMinProjection;
import com.devsuperior.dslist_dozero.repository.GameListRepository;
import com.devsuperior.dslist_dozero.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return  result.stream().map(x -> new GameListDTO(x)).toList();

    }

    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex) {

        List<GameMinProjection> list = gameRepository.searchByList(listId);
            GameMinProjection obg = list.remove(sourceIndex);
            list.add(destinationIndex, obg);

            int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
            int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

            for (int i = min; i <= max; i++) {
                gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
            }
    }
}
