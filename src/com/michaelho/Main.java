package com.michaelho;

import com.michaelho.easy.to100.EasyTests1to50;
import com.michaelho.easy.to200.EasyTests201to250;
import com.michaelho.medium.MediumTests1to50;
import com.michaelho.utils.Utils;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main {

    public static void main(String[] args) {
        runTest(EasyTests1to50.class);
        runTest(EasyTests201to250.class);
        runTest(MediumTests1to50.class);
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

