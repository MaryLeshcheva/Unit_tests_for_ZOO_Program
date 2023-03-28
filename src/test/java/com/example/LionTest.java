package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void getKittensLionTest() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(2);
        Lion lion = new Lion("Самец", feline);
        int expected = 2;
        int actual = lion.getKittens();
        assertEquals("Метод должен возвращать 2", expected, actual);
    }

    @Test
    public void doesHaveManeLionException() {
        try {
            Lion lion = new Lion("неСамец", feline);
        } catch (Exception exception) {
            assertEquals("Ошибка! При создании класса Lion использовался не правильный аргумент", "Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
        }
    }

    @Test
    public void getFoodLionTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самка", feline);
        Assert.assertEquals("Ошибка! Лев питается мясом", List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}
