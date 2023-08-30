package org.example;

public class ParsingNumber {
    public long parsing(String str) {

        long result = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                throw new IllegalArgumentException("숫자로만 구성되어 있지 않습니다.");
            }
            result *= 10;
            result += c - '0';
        }
        return result;
    }
}
