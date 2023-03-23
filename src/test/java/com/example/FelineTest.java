package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        assertEquals("Ошибка! Хищники должен принадлежать семейству кошачьих", List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String expected= "Кошачьи";
        String actual = feline.getFamily();
        assertEquals("Ошибка! Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", expected, actual);
    }

    @Test
    public void getKittensNotParametersTest() {
        Feline feline = new Feline();
        int actual = feline.getKittens();
        assertEquals("Ошибка!", 1, actual);
    }
}
