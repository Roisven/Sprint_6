package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;

    @Test
    public void GetFoodMethodTest() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualFood = cat.getFood();
        Assert.assertEquals("Еда не соответствует виду животного", expectedFood, actualFood);
    }

    @Test
    public void catGedFoodLikePredatorMockTest() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(Arrays.asList("Бургеры", "Пицца", "Шаверма"));
        Assert.assertEquals(Arrays.asList("Бургеры", "Пицца", "Шаверма"), cat.getFood());
    }

    @Test
    public void getCatSoundReturn() {
        Cat cat = new Cat(feline);
        String expectedCatSound = "Мяу";
        String actualGetSound = cat.getSound();
        Assert.assertEquals("Кот издал не Мяу", expectedCatSound, actualGetSound);
    }
}