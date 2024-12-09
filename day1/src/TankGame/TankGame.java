package TankGame;

import java.math.BigDecimal;

class BaoZhuang {
    public static void main(String[] args) {
//        Integer i = 123;
//        Character c = '看';
//        System.out.println(Integer.max(3, 4));
//        System.out.println(i.toString());
//        System.out.println(i.doubleValue());
//        System.out.println(parseFloat("1230.001"));
//        System.out.println(Integer.MIN_VALUE);
//        BigInteger a = new BigInteger("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
//        BigInteger b = new BigInteger("11111111123123123112321321379821738164982164923649236471927648");
//        System.out.println(a.add(b));
        BigDecimal a = new BigDecimal("0.11");
        BigDecimal b = new BigDecimal("0.8");
        BigDecimal c = new BigDecimal("0.91");
        System.out.println(a.add(b).equals(c));
        
    }
}