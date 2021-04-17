package com.leammin.jvm;

public class NotInitialization {
    public static void main(String[] args) {
        // y 表示会触发 ConstClass初始化
//        System.out.println(ConstClass.CONST_OBJECT); y
//        System.out.println(ConstClass.CONST_BIG_DECIMAL); y
//        System.out.println(ConstClass.CONST_INT); n
//        System.out.println(ConstClass.CONST_INTEGER); y
//        System.out.println(ConstClass.CONST_STRING); n
    }
}
