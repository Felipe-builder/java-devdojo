package br.com.abc.javacore.a17wrappers.test;

public class WrappersTest {
    public static void main(String[] args) {
        byte bytePrimitive = 127;
        short shortPrimitive = 32767;
        int intPrimitive = 2_147_483_647;
        long longPrimitive = 9_223_372_036_854_775_807L;
        float floatPrimitive = 3.40282347e+38f;
        double doublePrimitive = 1.7976931348623157e+308;
        char charPrimitive = 'a';
        boolean booleanPrimitive = true;

        Byte byteWrapper = Byte.valueOf("-128");
        Short shortWrapper = Short.valueOf("-32768");
        Integer intWrapper = Integer.valueOf("-2_147_483_648");
        Long longWrapper = Long.valueOf("-9_223_372_036_854_775_808L");
        Float floatWrapper = Float.valueOf("1.40239846e-46");
        Double doubleWrapper = Double.valueOf("4.94065645841246544e-324");
        Character charWrapper = 'a';
        Boolean booleanWrapper = Boolean.valueOf("true");

        String valor = "10";
        Float f = Float.parseFloat(valor);
    }
}
