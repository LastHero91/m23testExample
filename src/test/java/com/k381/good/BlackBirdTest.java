package com.k381.good;

import org.junit.Assert;
import org.junit.Test;

public class BlackBirdTest {
    @Test
    public void flyingTest() {
        Blackbird blackbird = new Blackbird("Marg");
        blackbird.feed();
        Assert.assertTrue(blackbird.isFlying());
    }
}
