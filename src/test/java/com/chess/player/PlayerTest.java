package com.chess.player;

import com.chess.player.interfaces.IPlayerFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Sanjuna Konda
 */

public class PlayerTest {
    IPlayerFactory playerFactory = new PlayerFactory();

    @Test
    public void testPlayerNotNull() {
        Assert.assertNotNull(playerFactory.createPlayer());
    }
}
