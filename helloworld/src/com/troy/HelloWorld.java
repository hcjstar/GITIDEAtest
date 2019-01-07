package com.troy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @author hechaojun
 * @Description: 测试hello
 * @ClassName: HelloWorld
 * @date 2019/1/7 9:58
 */
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("helloworld");
        try {
            InputStream inputStream = new FileInputStream("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
