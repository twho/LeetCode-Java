package com.michaelho.medium.to100;

import java.util.ArrayList;
import java.util.List;

class _0017_LetterCombinationsPhoneNumber {

    List<String> letterCombinations(String digits) {
        List<String> output = new ArrayList<>();
        for (int idx = 0; idx < digits.length(); idx++) {
            String[] converted = convertDigitToString(digits.substring(idx, idx+1));
            if (output.size() == 0) {
                for (int i = 0; i < converted.length; i++) {
                    output.add(converted[i]);
                }
            } else {
                List<String> temp = output;
                output = new ArrayList<>();
                for (String str : converted) {
                    for (int i = 0; i < temp.size(); i++) {
                        String inner = temp.get(i);
                        output.add(inner + str);
                    }
                }
            }
        }
        return output;
    }

    private String[] convertDigitToString(String digit) {
        String[] output;
        switch (digit) {
            case "2":
                output = new String[]{"a", "b", "c"};
                break;
            case "3":
                output = new String[]{"d", "e", "f"};
                break;
            case "4":
                output = new String[]{"g", "h", "i"};
                break;
            case "5":
                output = new String[]{"j", "k", "l"};
                break;
            case "6":
                output = new String[]{"m", "n", "o"};
                break;
            case "7":
                output = new String[]{"p", "q", "r", "s"};
                break;
            case "8":
                output = new String[]{"t", "u", "v"};
                break;
            case "9":
                output = new String[]{"w", "x", "y", "z"};
                break;
            default:
                output = new String[]{};
        }
        return output;
    }
}
