import java.util.Scanner;
import java.util.TreeSet;

class Cycle{
    public static double task1(double x){
        return (x + 1) / 2 * x;
    }
    public static void task2(double a, double b, double h){
        while(a <= b){
            if(a > 2){
                System.out.print(a + " ");
            }else{
                System.out.print(-1 * a + " ");
            }
            a += h;
        }
        System.out.println("");
    }
    public static int task3(){
        int e = 0;
        int i = 1;
        while(i <= 100){
            e += (i * i);
            i++;
        }
        return e;
    }
    public static long task4(){
        long e = 1;
        int i = 1;
        while(i <= 200){
            e *= (i * i);
            e = e % 1000000007;
            i++;
        }
        return e;
    }
    public static double task5(double e){
        double a = 1/2 + 1/3;
        double x = 0;
        int i = 1;
        while(Math.abs(a) >= e){
            x += a;
            i++;
            a = 1/Math.pow(2, i) + 1/Math.pow(3, i);
        }
        return x;
    }
    public static void task6(String x){
        for(int i = 0; i < x.length(); i++){System.out.print((int)x.charAt(i) + " ");
        }
        System.out.println("");
    }
    public static void task7(int m, int n){
        while (m <= n){
            for(int i = 2; i < m; i++){
                if(m % i == 0){
                    System.out.print(i + " ");
                }
            }
            System.out.println("");
        }
    }
    public static void task8(String x, String y){
        TreeSet<Character> set = new TreeSet<Character>();
        for(int i = 0; i < x.length(); i++){
            for(int j = 0; j < y.length(); j++){
                if(x.charAt(i) == y.charAt(j)){
                    set.add(x.charAt(i));
                }
            }
        }
        for(Character i : set){
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}

public class Main {
    public static void main(String args[]){
        double a, b, x;
        int y, z;
        String c, d;
        System.out.println("Enter the number of task");
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        if(n == 1){
            System.out.println("Enter one argument");
            x = scan.nextDouble();
            System.out.println(Cycle.task1(x));
        }
        if(n == 2){
            System.out.println("Enter three arguments");
            a = scan.nextDouble();
            b = scan.nextDouble();
            x = scan.nextDouble();
            Cycle.task2(a, b, x);
        }
        if(n == 3){
            System.out.println(Cycle.task3());
        }
        if(n == 4){
            System.out.println(Cycle.task4());
        }
        if(n == 5){
            System.out.println("Enter one argument");
            a = scan.nextDouble();
            System.out.println(Cycle.task5(a));
        }
        if(n == 6){
            System.out.println("Enter one argument");
            d = scan.next();
            Cycle.task6(d);
        }
        if(n == 7){
            System.out.println("Enter twoo arguments");
            y = scan.nextInt();
            z = scan.nextInt();
            Cycle.task7(y, z);
        }
        if(n == 8){
            System.out.println("Enter two arguments");
            c = scan.next();
            d = scan.next();
            Cycle.task8(c, d);
        }
    }
}
