package com.leammin.jvm;

import java.util.ArrayList;

/**
 *VM Args：-XX:PermSize=10M -XX:MaxPermSize=10M
 *
 * Jdk6会返回两个false
 * Jdk7会返回一个true和一个false
 *
 * Jdk6会抛出“java.lang.OutOfMemoryError: PermGen space”
 * Jdk7则会死循环
 *
 *@author zzm
 */
public class RuntimeConstantPoolOOM{
    public static void main(String[] args) {
        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern() == str1);
        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern() == str2);

        //使用List保持着常量池引用，避免Full GC回收常量池行为
        ArrayList<String> list = new ArrayList<String>();
        //10MB的PermSize在integer范围内足够产生OOM了
        int i = 0;
        while (true) {
            list.add(String.valueOf(i++).intern());
        }
    }

}
