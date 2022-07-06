import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Branching{
    public static void task1(double x, double y){
        if(x + y >= 180 || x <= 0 || y <= 0){
            System.out.println("Not a triangle");
            return;
        }
        if(x == 90 || y == 90 || x + y == 90){
            System.out.println("NRight triangle");
            return;
        }
        System.out.println("Not right triangle");
    }
    public static double task2(double a, double b, double c, double d){
        double x = Math.min(a, b);
        double y = Math.min(c, d);
        if(x > y){
            return x;
        }else{
            return y;
        }
    }
    public static void task3(double x1, double y1, double x2, double y2, double x3, double y3){
        if((x2 - x1) / (y2 - y1) == (x3 - x2) / (y3 - y2)){
            System.out.println("on one line");
        }else{
            System.out.println("not on one line");
        }
    }
    public static void task4(double a, double b, double x, double y, double z){
        ArrayList<Double> list = new ArrayList<Double>();
        list.add(x);
        list.add(y);
        list.add(z);
        Collections.sort(list);
        if(Math.min(a, b) >= list.get(0) && Math.max(a, b) >= list.get(1)){
            System.out.println("can");
        }else{
            System.out.println("cant");
        }
    }
    public static double task5(double x){
        if(x > 3){
            return 1 / (x * x * x + 6);
        }else{
            return x * x - 3 * x + 9;
        }
    }
}

public class Main {
    public static void main(String args[]){
        double a, b, c, d, x, y, z;
        System.out.println("Enter the number of task");
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        if(n == 1){
            System.out.println("Enter two arguments");
            x = scan.nextDouble();
            y = scan.nextDouble();
            Branching.task1(x, y);
        }
        if(n == 2){
            System.out.println("Enter four arguments");
            a = scan.nextDouble();
            b = scan.nextDouble();
            c = scan.nextDouble();
            d = scan.nextDouble();
            System.out.println(Branching.task2(a, b, c, d));
        }
        if(n == 3){
            System.out.println("Enter six arguments");
            a = scan.nextDouble();
            b = scan.nextDouble();
            c = scan.nextDouble();
            d = scan.nextDouble();
            x = scan.nextDouble();
            y = scan.nextDouble();
            Branching.task3(a, b, c, d, x, y);
        }
        if(n == 4){
            System.out.println("Enter five argument");
            a = scan.nextDouble();
            b = scan.nextDouble();
            x = scan.nextDouble();
            y = scan.nextDouble();
            z = scan.nextDouble();
            Branching.task4(a, b, x, y, z);
        }
        if(n == 5){
            System.out.println("Enter one argument");
            a = scan.nextDouble();
            System.out.println(Branching.task5(a));
        }
    }
}
