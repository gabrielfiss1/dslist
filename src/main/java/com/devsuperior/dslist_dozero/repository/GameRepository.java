package com.devsuperior.dslist_dozero.repository;

import com.devsuperior.dslist_dozero.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;
// para acesso do banco de dados
public interface GameRepository extends JpaRepository<Game, Long> {
}
