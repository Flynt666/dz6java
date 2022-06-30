package ru.netology.sqr.dz6java.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.dz6java.services.SQRService;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files ="src/test/resources/Bingo.csv")
    public void shouldCalcundermin(int expected, int min, int max) {
        SQRService service = new SQRService();
        // int expected = 0;
        int actual = service.calcSQR(min, max);
        Assertions.assertEquals(expected, actual);
    }

    // 1 тест проверяем диапозон меньше квадрата минимального числа (10)""СЫ

    //   @Test   // 2 тест проверяем диапозон больше квадрата максимального числа (99)
    // public void shouldCalcabovemax () {
    //   SQRService service = new SQRService();
    // int expected = 0;
    //int actual = service.calcSQR(9802, 100000);
    // Assertions.assertEquals (expected, actual);

    //}

    // @Test   // 3 тест проверяем диапозон максимального числа квадратов
    // public void shouldCalcmaxbingo () {
    //   SQRService service = new SQRService();
    //  int expected = 89;
    // int actual = service.calcSQR(100, 9801);
    // Assertions.assertEquals (expected, actual);

    // }

}
