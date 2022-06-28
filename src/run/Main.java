package run;

import calculate.Operations;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String dollar="$10";
        String rub="1000p";

        System.out.println(rub+" is: "+ Operations.toDollars(rub)+"$");
        System.out.println(dollar+" is: "+ Operations.toRubles(dollar)+"p");
//        System.out.println(Operations.toDollars("737р" + Operations.toRubles("$85.4")));


//        String[] dollars= value.split("\\$");
//        System.out.println(rubles);
    }
}
