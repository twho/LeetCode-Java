package com.michaelho;

import com.michaelho.easy.to100.EasyTests1to50;
import com.michaelho.easy.to200.EasyTests101to150;
import com.michaelho.easy.to300.EasyTests201to250;
import com.michaelho.hard.HardTests1to50;
import com.michaelho.medium.to100.MediumTests1to50;
import com.michaelho.medium.to200.MediumTests101to150;
import com.michaelho.utils.Utils;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main {

    public static void main(String[] args) {
        // Tests 1 to 50
        runTest(EasyTests1to50.class);
        runTest(MediumTests1to50.class);
        runTest(HardTests1to50.class);

        // Tests 101 to 150
        runTest(EasyTests101to150.class);
        runTest(MediumTests101to150.class);

        // Tests 201 to 250
        runTest(EasyTests201to250.class);
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

