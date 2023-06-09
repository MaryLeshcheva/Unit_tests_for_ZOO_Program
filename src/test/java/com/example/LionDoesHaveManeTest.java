package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionDoesHaveManeTest {
    @Mock
    Feline feline;

    private final String text;
    private final boolean expected;

    public LionDoesHaveManeTest(String text, boolean expected) {
        this.text = text;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void doesHaveManLionTest() throws Exception {
        Lion lion = new Lion(text, feline);
        boolean actual = lion.doesHaveMane();
        assertEquals("Ошибка! При создании объекта Lion параметр sex может быть либо 'Самец', или 'Самка'", expected, actual);
    }
}
