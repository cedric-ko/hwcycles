package ru.netology.services;

public class VacationService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // если накоплено достаточно денег
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - expenses) / 3; // отдых: деньги уменьшаются на расходы, остаток уменьшается на траты на отдых
            } else {
                money = money + income - expenses; // иначе работа: деньги увеличиваются на доход и уменьшаются на расходы
            }
        }
        return count;
    }
}
