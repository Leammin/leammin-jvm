package com.leammin.jvm;

public class TestPretenureSizeThreshold {
    private static final int _1MB=1024*1024;

    public static void main(String[] args) {
        testPretenureSizeThreshold();
    }

    /**
     *VM参数：-XX:+UseSerialGC -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:PretenureSizeThreshold=3145728
     */
    public static void testPretenureSizeThreshold(){
        byte[] allocation;
        allocation=new byte[4*_1MB];//直接分配在老年代中
    }
}
