
package com.example;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class FelineTest {

    @Test
    public void felineFoodTest() throws Exception {
        Feline feline = new Feline();
        List<String> actualFoodList = feline.eatMeat();
        List<String> expectedList = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expectedList, actualFoodList);
    }

    @Test
    public void felineFamalyTest() {
        Feline feline = new Feline();
        String actualFamaly = feline.getFamily();
        assertEquals("Кошачьи", actualFamaly);
    }

    @Test
    public void felineKittensTest() {
        Feline feline = new Feline();
        int actualKittens = feline.getKittens();
        assertEquals(1, actualKittens);
    }
}
