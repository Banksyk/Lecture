package com.test;

import java.io.*;

public class task1 {
    public static void main(String[] args) throws Exception {
        //创建一个BufferedReader缓冲对象
        FileReader fr=new FileReader("C:\\Users\\banksy\\IdeaProjects\\Lecture\\src\\com\\test\\jpg01.jpg");
        BufferedReader br=new BufferedReader(fr);
        //创建一个BufferedWriter缓冲对象
        FileWriter fw=new FileWriter("C:\\Users\\banksy\\IdeaProjects\\Lecture\\src\\com\\test\\jpg02.jpg");
        BufferedWriter bw=new BufferedWriter(fw);
        String s;
        //判断是否到文本文件末尾
        while((s=br.readLine())!=null){
            bw.write(s);
        }
        //关闭流
        br.close();
        bw.close();
    }
}