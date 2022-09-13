package com.example.backend_project.DataLoader;


import com.example.backend_project.models.Battle;
import com.example.backend_project.models.Monster;
import com.example.backend_project.models.Player;
import com.example.backend_project.repositories.BattleRepository;
import com.example.backend_project.repositories.MonsterRepository;
import com.example.backend_project.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BattleRepository battleRepository;

    @Autowired
    MonsterRepository monsterRepository;
    @Autowired
    PlayerRepository playerRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Player player1 = new Player("Bob",5 );
        Player player2 = new Player("john",0);

        Monster monster1 = new Monster("Dracula",4);
        Monster monster2 = new Monster("Wolf", 2);
        Monster monster3 = new Monster("Demon", 3);

        Battle battle1 = new Battle("Forest");
        Battle battle2 = new Battle("Cave");
        Battle battle3 = new Battle("Mountain");

//        battle1.setVictorious(true);
//        battle2.setVictorious(true);
//        battle3.setVictorious(true);

        playerRepository.saveAll(Arrays.asList(player1,player2));
        monsterRepository.saveAll(Arrays.asList(monster1, monster2,monster3));
        battleRepository.saveAll(Arrays.asList(battle1, battle2, battle3));


    }





}
