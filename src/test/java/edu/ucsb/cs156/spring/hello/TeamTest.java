package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)
    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void testEquals() {
        Team t1 = new Team();
        t1.setName("team1");
        t1.addMember("sam");
        Team t2 = new Team();
        t2.setName("team1");
        t2.addMember("sam");
        Team t3 = new Team();
        t3.setName("team1");
        t3.addMember("baz");
        Team t4 = new Team();
        t4.setName("team2");
        t4.addMember("sam");
        assertEquals(true, t1.equals(t1));
        assertEquals(true, t1.equals(t2));
        assertEquals(false, t1.equals(t3));
        assertEquals(false, t1.equals(t4));
        assertEquals(false, t1.equals(1));
    }
    

    @Test
    public void hashCode_returns_equal(){
        Team t = new Team();
        int result = t.hashCode();
        int expectedResult = 1;
        assertEquals(expectedResult, result);
    }
}
