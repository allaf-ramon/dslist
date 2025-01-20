package com.intensivaojava.dslist.repositories;

import com.intensivaojava.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
