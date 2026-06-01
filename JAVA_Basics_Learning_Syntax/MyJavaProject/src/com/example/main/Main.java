package com.example.main;

import com.example.utilities.MathUtils;
import com.example.utilities.StringUtils;

public class Main {
    public static void main(String[] args) {
        int result = MathUtils.add(5, 3);
        System.out.println("Result: " + result);

        String reversed = StringUtils.reverse("Hello");
        System.out.println("Reversed: " + reversed);
    }
}
