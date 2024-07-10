package com.swiggy.assignment_2;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class MagicalATest {
	   @Test
	    public void testFight() {
	        Player playerA = new Player(50, 5, 10);
	        Player playerB = new Player(100, 10, 5);

	        MagicalArena arena = new MagicalArena(playerA, playerB);
	        arena.fight();
	        assertFalse(playerA.isAlive() && playerB.isAlive()); 
	        //  playerA or playerB should be dead after the fight
	    }
	}

	
