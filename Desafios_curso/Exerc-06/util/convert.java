package util;

public class convertClass {
    public static double taxIOF(double value) {
        return value * 6 / 100;
    }
    
    public static double convertReaisInDollar(double dollarPrice, double reaisValue){
        return (reaisValue * dollarPrice) + taxIOF(reaisValue);
    }


}
