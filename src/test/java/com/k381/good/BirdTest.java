package com.k381.good;

import org.junit.Assert;
import org.junit.Test;

public class BirdTest {

    @Test
    public void nameTest() {
        String name = "Magie";
        Bird bird = new Crow(name);
        Assert.assertEquals("Wrong name", name, bird.getName());
    }

    @Test
    public void toStringTest(){
        String name = "Magie";
        Bird bird = new Crow(name);
        Assert.assertTrue(bird.toString().contains(name));
    }

    @Test(expected = RuntimeException.class)
    public void wrongNameTest(){
        String name = "";
        Bird bird = new Crow(name);
            bird.newExceprtion();
    }
}