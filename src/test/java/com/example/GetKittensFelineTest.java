package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class GetKittensFelineTest {


    private final int amountKittens;
    private final int expected;

    public GetKittensFelineTest(int amountKittens, int expected) {
        this.amountKittens = amountKittens;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "Тестовые данные: {0} {1}")
    public static Object[][] getTestData() {
        return new Object[][]{
                {0, 0},
                {1, 1},
                {5, 5},
        };
    }

    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
        int actual = feline.getKittens(amountKittens);
        assertEquals("Ошибка! Количество котят неверное", expected, actual);
    }
}
