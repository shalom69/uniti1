package ru.netology.servise;

public class CashBackHacker {
    private final int boundary = 1000;

    public int remain(int amount) {
        return boundary - amount % boundary;
    }


}
