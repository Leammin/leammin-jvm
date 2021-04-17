package com.leammin.jvm;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public final class TestClass implements Serializable, Runnable {
    private static final boolean testConstantBoolean = true;
    private static final Boolean testConstantWrapperBoolean = false;
    private static final String testConstantString = "testConstantString-content";
    private static final Date testConstantDate = new Date(1560000000001L);
    private static final TestObject testConstantObject = new TestObject("testConstantObject");

    private static byte testStaticByte = 127;
    private static Byte testStaticWrapperBoolean = -128;
    private static String testStaticString = "testStaticString-content";
    private static Date testStaticDate = new Date(1560000000002L);
    private static TestObject testStaticObject = new TestObject("testStaticObject");

    private final short testFinalByte = 32767;
    private final Short testFinalWrapperBoolean = -32768;
    private final String testFinalString = "testFinalString-content";
    private final Date testFinalDate = new Date(1560000000003L);
    private final TestObject testFinalObject = new TestObject("testFinalObject");

    private int testInt = 2147483647;
    private Integer testWrapperInt = -2147483648;
    private String testString = "testString-content";
    private Date testDate = new Date(1560000000004L);
    private TestObject testObject = new TestObject("testObject");

    private static String testStaticCode;
    static {
        System.out.println("testStaticCode-print");
        testStaticCode = "testStaticCode-content";
    }

    private String testCode;
    {
        System.out.println("testCode-print");
        testCode = "testCode-content";
    }

    @Override
    public final void run() {
        System.out.println("test");
    }

    public int getTestInt() {
        return testInt;
    }

    public void setTestInt(int testInt) {
        this.testInt = testInt;
    }

    public String getTestString() {
        return testString;
    }

    public void setTestString(String testString) {
        this.testString = testString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestClass testClass = (TestClass) o;
        return Objects.equals(testDate, testClass.testDate) &&
                Objects.equals(testObject, testClass.testObject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testDate, testObject);
    }
}
