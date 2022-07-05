import java.util.Scanner;

class LineralTasks{
    public static double z(double a, double b, double c){
        return (a - 3) * b / 2 + c;
    }
    public static double task2(double a, double b, double c){
        return (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
    }
    public static double task3(double x, double y){
        return ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
    }
    public static double task4(double e){
        double d, n;
        d = e % 1;
        n = e - d;
        return 1000 * d + n / 1000;
    }
    public static void task5(double t){
        int h = (int)(t / 3600);
        int min;
        t -= h * 3600;
        min = (int)(t / 60);
        t -= min * 60;
        double s = t;
        System.out.println(h + "h " + min + "min " + s + "s");
    }
}

public class Main {
    public static void main(String args[]){
        double a, b, c;
        System.out.println("Enter the number of task");
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        if(n == 1){
            System.out.println("Enter three arguments");
            a = scan.nextDouble();
            b = scan.nextDouble();
            c = scan.nextDouble();
            System.out.println(LineralTasks.z(a, b, c));
        }
        if(n == 2){
            System.out.println("Enter three arguments");
            a = scan.nextDouble();
            b = scan.nextDouble();
            c = scan.nextDouble();
            System.out.println(LineralTasks.task2(a, b, c));
        }
        if(n == 3){
            System.out.println("Enter two arguments");
            a = scan.nextDouble();
            b = scan.nextDouble();
            System.out.println(LineralTasks.task3(a, b));
        }
        if(n == 4){
            System.out.println("Enter one argument");
            a = scan.nextDouble();
            System.out.println(LineralTasks.task4(a));
        }
        if(n == 5){
            System.out.println("Enter one argument");
            a = scan.nextDouble();
            LineralTasks.task5(a);
        }
        }
    }
