package com.tobiaswadseth.gitlabb2;

public class TextProcessor {

    public String reverse(String string) {
        return new StringBuilder(string).reverse().toString();
    }

    public String upperCase(String string) {
        return string.toUpperCase();
    }

    public String lowerCase(String string) {
        return string.toLowerCase();
    }
}
