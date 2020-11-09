package com.tobiaswadseth.gitlabb2;

import java.util.Arrays;

public class Calculator {

    public int add(int... values) {
        int res = 0;
        for (int i : values) {
            res += i;
        }
        return res;
    }

    public int subtract(int... values) {
        int res = values[0];
        for (int i : Arrays.copyOfRange(values, 1, values.length)) {
            res -= i;
        }
        return res;
    }

    public int multiply(int... values) {
        int res = 1;
        for (int i : values) {
            res *= i;
        }
        return res;
    }

    public int divide(int... values) {
        int res = values[0];
        for (int i : Arrays.copyOfRange(values, 1, values.length)) {
            res /= i;
        }
        return res;
    }
}
