package com.example.backend_project.repositories;

import com.example.backend_project.models.Battle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BattleRepository extends JpaRepository<Battle, Long> {
}
