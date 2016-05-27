package com.onetomany;

import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author nikesh.maharjan
 */
public class OneToManyTest {

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("OneToManyPU");
        EntityManager em = factory.createEntityManager();

        OneToManyPU service = new OneToManyPU(em);

        /**
         * UNIDIRECTIONAL STARTS *
         */
        /* Adding Game  */
        /**
         * Creating players first *
         */
        Player p1 = new Player("Player 1");
        Player p2 = new Player("Player 2");
        Player p3 = new Player("Player 3");
        Player p4 = new Player("Player 4");

        service.addPlayer(p1);
        service.addPlayer(p2);
        service.addPlayer(p3);
        service.addPlayer(p4);

        /**
         * Creating game.
         */
        Game game = new Game("Game One");
        Collection<Player> players = new ArrayList<Player>();
        players.add(p1);
        players.add(p2);
        players.add(p3);
        players.add(p4);

        game.setPlayers(players);

        service.addGame(game);

        /**
         * UNIDIRECTIONAL ENDS *
         */
    }

}
