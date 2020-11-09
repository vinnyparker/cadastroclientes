package br.com.venustech.cadastro.tools;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.math.NumberUtils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class NumberHelper {

    public static String numberOnly(String value) {
        String result = "";

        for (int i = 0; i < value.length(); i++) {
            if (Character.isDigit(value.charAt(i))) {
                result += value.charAt(i);
            }
        }

        return result;
    }

    public static boolean isOnlyNumber(String value) {
        String regex = "\\d+";
        return value.matches(regex);
    }


}
