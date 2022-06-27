package ru.netology.sqr;

public class SQRService {

    public int calcSqrt(int min, int max) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int x = i * i;
            if (x >= min) {
                if (x <= max) {
                    count++;
                }
            }
        }
        return count;
    }
}
