package com.test;

import com.test.generic.GenericClass0;

import java.util.ArrayList;

public class test {
    public static void main(String args[]) {
        ArrayList prizelist = new ArrayList();
        prizelist.add("熊猫");
        prizelist.add("恐龙");
        prizelist.add("谢谢惠顾");
        GenericClass0<ArrayList> prize0 = new GenericClass0<ArrayList>();
        prize0.set(prizelist);
        
    }
}
