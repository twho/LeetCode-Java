package com.michaelho.easy.to300;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EasyTests251to300 {

    @Test
    public void testFirstBadVersion() {
        boolean[] input = new boolean[] { false, false, false, true, true};
        _0278_FirstBadVersion sol = new _0278_FirstBadVersion(input);
        int expected = 4;
        assertEquals(expected, sol.firstBadVersion(input.length));
    }
}
