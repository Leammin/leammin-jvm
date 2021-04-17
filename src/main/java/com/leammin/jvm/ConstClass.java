package com.leammin.jvm;

import java.math.BigDecimal;

public class ConstClass {
    static{
        System.out.println("ConstClass init！");
    }
    public static final String CONST_STRING= "CONST_STRING";
    public static final int CONST_INT= 1;
    public static final Integer CONST_INTEGER= 0;
    public static final BigDecimal CONST_BIG_DECIMAL= BigDecimal.TEN;
    public static final Object CONST_OBJECT = "CONST_OBJECT";
}
