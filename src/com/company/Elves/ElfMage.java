package com.company.Elves;

import com.company.characters.Mage;
import com.company.common.Action;
import com.company.common.CharConstructor;
import com.company.common.Chars;

public class ElfMage extends Mage {

    Chars chars = new CharConstructor();
    Action action = new CharConstructor();

    private String race = "Эльф";
    private String name = "Маг";
    private double sp_pow = 1.5;
    private double pow = 10;
    private double hp = 100;

    public double getSp_pow() {
        return sp_pow;
    }

    public void setSp_pow(double sp_pow) {
        this.sp_pow = sp_pow;
    }

    public double getPow() {
        return pow;
    }

    public void setPow(double pow) {
        this.pow = pow;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    //Стандартные характеристики
    public void ElfMageRealiz(){

        System.out.println(action.msg_race() + race);
        System.out.println(action.msg_category() + name);
        System.out.println(action.msg_special_power1_positive() + chars.special_pow(sp_pow));
    }

    //Характеристики, которые важно отслеживать во время боя (хп, скиллы (бафы, дебафы))
    public void ElfMageFight(){

        System.out.println(action.msg_power() + chars.power(pow));
        System.out.println(action.msg_health() + chars.health(hp));
    }
}
