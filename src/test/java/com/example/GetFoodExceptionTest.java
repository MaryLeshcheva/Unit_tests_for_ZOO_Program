package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetFoodExceptionTest {
    @Test
    public void GetFoodCheckException() {
        Animal animal = new Animal();
        try {
            animal.getFood("Всеядное");
        } catch (Exception exception) {
            assertEquals("Ошибка! При вызове метода getFood нужно использовать значение Травоядное или Хищник", "Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage());
        }
    }
}
