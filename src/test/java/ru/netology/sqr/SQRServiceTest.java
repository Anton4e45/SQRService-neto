package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource({
            "3,200,300",
            "0,200,200",
            "5,-100,200"
    }

    )
    public void testSQRExact(int expected, int min, int max) {
        SQRService service = new SQRService();

        int actual = service.calcSqrt(min, max);
        Assertions.assertEquals(expected, actual);
    }
}
