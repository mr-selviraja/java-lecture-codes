import java.math.RoundingMode;
import java.text.DecimalFormat;

import java.lang.Math;

public class roundNumberToNDecimals {
    public static void main(String args[]) {
        double time = 3.4810237178;

        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING); // rounds a number upto the nearest highest integer value

        System.out.println(df.format(time));

        // use those many 0s after 1 to convert to that many digits
        // but as you can see it just removes the remaining digits rather than trying to be precise
        System.out.println((int)(time * 100)/100.0);

        System.out.println(Math.round(time * 100) / 100.0);

        System.out.format("%.2f", time);

        /* 
            CONCLUSION: So, if you want precise use .format() method (or) Math.round() method else use whichever one you want to.
        */
    }
}