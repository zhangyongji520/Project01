package com.atguigu.bean;

import java.util.ArrayList;

/**
 * @author zyj
 * @date 2020/8/28 - 16:31
 */
public class Hello {
    //这是单行注释
    public static void main(String[] args){

        System.out.print("helloa");

        int i = 10;
        System.out.println("i = " + i);

        String[] haha = new String[]{"1","2","#"};
        for (int j = 0; j < haha.length; j++) {
            System.out.println(haha[j]);
        }

        System.out.println("-------------");
        for (String s : haha) {
            System.out.println(s);
        }

        System.out.println("-----------------");

        ArrayList arrayList = new ArrayList();

        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(32);

        for (Object o : arrayList) {
            System.out.println(o);
        }


        System.out.println();
        System.out.println("hahaha");
        


    }

    public void hah(){


    }
}

