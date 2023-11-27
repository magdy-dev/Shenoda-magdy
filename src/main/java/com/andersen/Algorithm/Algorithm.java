package com.andersen.Algorithm;

import java.util.Objects;

public class Algorithm {
    public void numeric_array(int[] array)  {
        for (int j : array) {
            if (j % 3 == 0) {
                System.out.println(j);
            }
        }
    }

    public String matches(String name) {
        String outPut = "Hi";
        String outPut2 = "No such name";
        if (Objects.equals(name.startsWith("V"), "Vyacheslav")) {

            return outPut + " " + name;
        } else {
            return outPut2;
        }
    }


    public String greater_number(int number) {
        String result = "HI";
        if (number > 7) {
            return result;

        } else {
            return "Number is <7";
        }
    }
}
