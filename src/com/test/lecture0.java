package com.test;
import java.util.*;
public class lecture0 {
    public static void main(String args[]) {
        ArrayList arrayList = new ArrayList();

        arrayList.add("张一");

        arrayList.add("张二");

        arrayList.add("张三");

        arrayList.add("李四");

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).toString().contains("张"))
            {arrayList.remove(i);
                i--;}
        }

        System.out.println(arrayList);
    }}