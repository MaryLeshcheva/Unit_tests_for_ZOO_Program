package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void getKittensLionTest() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion("Самец", feline);
        int actual = lion.getKittens();
        assertEquals("Метод GetKittens должен возвращать 1", 1, actual);
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
