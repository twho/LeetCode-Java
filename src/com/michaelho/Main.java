package com.michaelho;

import com.michaelho.leetcode50.Tests5;
import com.michaelho.utils.Utils;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main {

    public static void main(String[] args) {
        runTest(Tests5.class);
    }

    private static void runTest(Class toTest) {
        int count = toTest.getName().split("\\.").length;
        String className = toTest.getName().split("\\.")[count-1];

        Result result = JUnitCore.runClasses(toTest);
        Utils.print(className + " runs " + result.getRunCount() + " tests.");
        for (Failure failure : result.getFailures()) {
            Utils.print(className + " exception: " + failure.getException());
            Utils.print(className + " failure: " + failure);
        }

        Utils.print(className + " isSuccessful: " + result.wasSuccessful());
    }
}

