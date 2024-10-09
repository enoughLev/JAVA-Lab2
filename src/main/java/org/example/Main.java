package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /// 1
        System.out.println("TRIANGLE");
        double a = 10;
        double b = 10;
        double c = 15;
        System.out.println(a + "\n" + b + "\n" + c + "\n" + "It is triangle -" + TriangleBool(a, b, c));

        /// 2
        System.out.println("\nDistance");
        double x1, x2, y1, y2;
        x1 = 10;
        y1 = 5;
        x2 = 15;
        y2 = 30;
        System.out.println("Distance between (" + x1 + ", " + y1 + ") and " +
                "(" + x2 + ", " + y2 + ") = " + Distance(x1, y1, x2, y2));

        /// 3
        System.out.println("\nLoop");
        double number = 5;
        int pow = 3;
        System.out.println(number + powerLoop(number, pow));
        pow = -3;
        System.out.println(number + powerLoop(number, pow));

        /// 4
        System.out.println("\nRecurrent");
        number = 2;
        pow = 12;
        System.out.println(number + power(number, pow));

        /// 5
        System.out.println("\nTribonacci's number");
        number = 20;
        System.out.println("Tribonacci numbers up to the " + number + ": ");
        for(int i=1; i<number; i++){
            System.out.print(tribonacci(i) + "  ");
        }

    }
    public static boolean TriangleBool (double a, double b, double c) {
        if(a<=0 || b<=0 || c<=0){
            return false;
        }
        return (a<b+c) && (b<a+c) && (c<a+b);
    }

    public static double Distance (double x1, double y1, double x2, double y2){
        double dist;
        dist = Math.sqrt((Math.pow((x1-x2),2) + Math.pow((y1-y2),2)));
        return dist;
    }

    public static double powerLoop(double num, int pw){
        if(num < 0){
            return -1;
        }
        if(pw == 0){
            return 1;
        }
        double res = 2;
        for(int i = Math.abs(pw); i>1; i--){
            res = res*num;
        }
        if(pw>0){
            return res;
        }
        else{
            return 1.0/res;
        }
    }

    public static double power(double num, int pw){
        if(num < 0){
            return -1;
        }
        if(pw > 1){
            return num * power(num, pw-1);
        }
        if(pw == 1){
            return num;
        }
        if(pw == 0){
            return 1;
        }
        else return -1;
    }

    public static double tribonacci(int num){
        if(num < 1){
            return -1;
        }
        if(num == 1 || num == 2)
        {
            return 0;
        }
        if(num == 3){
            return 1;
        }
        return (tribonacci(num-3) + tribonacci(num-2) + tribonacci(num-1));
    }
}
