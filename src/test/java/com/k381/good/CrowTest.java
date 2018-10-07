package com.k381.good;

import org.junit.Assert;
import org.junit.Test;

public class CrowTest {
    @Test
    public void flyingTest() {
        Crow crow = new Crow("Magie");
        crow.feed();
        Assert.assertFalse(crow.isFlying());
    }
}
