package com.devsuperior.dslist_dozero.repository;

import com.devsuperior.dslist_dozero.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;
// para acesso do banco de dados
public interface GameListRepository extends JpaRepository<GameList, Long> {
}
