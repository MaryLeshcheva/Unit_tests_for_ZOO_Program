package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class GetFoodForAnimalsTest {
    private final String text;
    private final List expected;

    public GetFoodForAnimalsTest(String text, List expected) {
        this.text = text;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }

    @Test
    public void GetFoodCheck() throws Exception {
        Animal animal = new Animal();
        List<String> actual = animal.getFood(text);
        assertEquals("Ошибка!", expected, actual);
    }
}
