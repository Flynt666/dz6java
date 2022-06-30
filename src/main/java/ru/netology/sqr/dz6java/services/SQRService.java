package ru.netology.sqr.dz6java.services;

public class SQRService {

    public int calcSQR(int min, int max) {
        int bingo = 0;
        for (int i = 10; i < 100; i++) {
            if (i * i > max) {
                break;
            }
            if (i * i >= min) {
                bingo = bingo + 1;
            }

        }
        return bingo;

    }
}
