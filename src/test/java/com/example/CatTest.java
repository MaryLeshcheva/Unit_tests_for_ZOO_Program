package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CatTest {
    @Test
    public void getSoundCatTest() {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        Assert.assertEquals("Ошибка! Кошка Мяукает", "Мяу", cat.getSound());
    }

    @Test
    public void getFoodCatTest() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        Assert.assertEquals("Ошибка! Кошка - хищник, у неё должно быть соответствующее питание.", List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }
}
