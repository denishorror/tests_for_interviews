package BigInteger;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class BigIntegerToFloat {
    public static void main(String[] args) {

        BigDecimal integer = new BigDecimal(-20.6)/*.setScale(2, RoundingMode.HALF_UP)*/;
//        String result = String.format("%f", integer.);

        System.out.println(new DecimalFormat( "###,###.##" ).format(integer));
        System.out.println(integer.setScale(0, RoundingMode.HALF_UP));
//        System.out.println(new DecimalFormat( "###,###.##" ).format(Double.valueOf(integer.toPlainString())));
//        float result = integer.floatValue();
//        System.out.println(result);
    }
}
