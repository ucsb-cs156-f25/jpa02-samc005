package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

public class DeveloperTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        // this hack is from https://www.timomeinen.de/2013/10/test-for-private-constructor-to-get-full-code-coverage/
        Constructor<Developer> constructor = Developer.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()),"Constructor is not private");

        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    public void getName_returns_correct_name() {
        assertEquals("Samprita", Developer.getName());
    }

    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)
    @Test
    public void getGithubId_returns_correct_githubId() {
        assertEquals("samc005", Developer.getGithubId());
    }

    @Test
    public void getTeam_returns_team_with_correct_name() {
        Team  t = Developer.getTeam();
        assertEquals("f25-09", t.getName());
    }

    @Test
    public void getTeam_returns_team_with_Lauren() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("LAUREN GRACE"),"Team should contain Lauren");
    }
    @Test
    public void getTeam_returns_team_with_Viktor() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("SAMPRITA"),"Team should contain Viktor");
    }
    @Test
    public void getTeam_returns_team_with_Dennis() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("DAVID MARIO"),"Team should contain Dennis");
    }
    @Test
    public void getTeam_returns_team_with_Onur() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("DENNIS"),"Team should contain Onur");
    }
    @Test
    public void getTeam_returns_team_with_Samprita() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("VIKTOR STANISLAVOV"),"Team should contain Samprita");
    }
    @Test
    public void getTeam_returns_team_with_David() {
        Team  t = Developer.getTeam();
        assertTrue(t.getMembers().contains("ONUR"),"Team should contain David");
    }
}
