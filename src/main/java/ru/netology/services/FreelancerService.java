package ru.netology.services;

public class FreelancerService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0; //кол-во денег на счету
        int counter = 0;//кол-во месяцев отдыха
        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                //отдыхать
                money -= expenses;
                money /= 3;
                counter++;
            } else {
                // работать
                money += income;
                money -= expenses;
            }
        }

        return counter;

    }

}

