package com.company.common;

public class CharConstructor implements Chars, Action {

    /*protected String race;
    protected String specialization;
    protected String category;
    protected int power;
    protected int hp;*/

    protected String s = "Увеливиает";

    /******** Данные о самих персонажах *********/

    @Override
    public void message() {
        System.out.println("Данные о юните:\n");
    }

    @Override
    public String race(String rac) {
        return rac;
    }

    @Override
    public String specialization(String spec) {
        return spec;
    }

    @Override
    public String category(String cat) {
        return cat;
    }

    @Override
    public double special_pow(double sp_pow1) {
        return sp_pow1;
    }

    @Override
    public double power(double pow) {
        return pow;
    }

    @Override
    public double health(double hp) {
        return hp;
    }


    /********* Стринговые описания этих данных ********/

    @Override
    public String msg_race() {
        return "Раса: ";
    }

    @Override
    public String msg_specialization() {
        return "Специализация: ";
    }

    @Override
    public String msg_category() {
        return "Класс: ";
    }

    @Override
    public String msg_special_power1_positive() {
        return "Увеличивает силу дружеского персонажа в (раз): ";
    }

    @Override
    public String msg_special_power1_negative() {
        return "Уменьшает силу вражеского персонажа на (%): ";
    }

    @Override
    public String msg_special_power2() {
        return "Снимает одно улучшение с противника.";
    }

    @Override
    public String msg_power() {
        return "Сила: ";
    }

    @Override
    public String msg_health() {
        return "Здоровье: ";
    }
}
