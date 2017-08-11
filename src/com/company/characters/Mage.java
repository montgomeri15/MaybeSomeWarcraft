package com.company.characters;

import com.company.common.Action;
import com.company.common.CharConstructor;
import com.company.common.Chars;

public class Mage {

    protected String main_class = "кастующий юнит";

    public void MageRealiz(){

        Chars chars = new CharConstructor();
        Action action = new CharConstructor();

        chars.message();
        System.out.println(action.msg_specialization() + main_class);
    }
}
