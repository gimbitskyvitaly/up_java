import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

class Array{
    public static int task1(ArrayList<Integer> a, int k){
        int y = 0;
        for(Integer x : a){
            if(x % k == 0);
            y += x;
        }
        return y;
    }
    public static void task2(ArrayList<Double> a, double z){
        int y = 0;
        for(int i = 0 ; i < a.size(); i++){
            if(a.get(i) > z){
                a.set(i, z);
                y++;
            }
        }
        System.out.println(y + " ");
        for(int i = 0; i < a.size(); i++){
            System.out.print(a.get(i) + " ");
        }
        System.out.println("");
    }
    public static void task3(ArrayList<Double> a){
        int p = 0;
        int n = 0;
        int z = 0;
        for(Double x : a){
            if(x > 0){
                p++;
            }else if(x < 0){
                n++;
            }else{
                z++;
            }
        }
        System.out.println("positive " + p);
        System.out.println("negative " + n);
        System.out.println("zero " + z);
    }
    public static void task4(ArrayList<Double> a){
        double min = Integer.MAX_VALUE;
        double max = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;
        for(int k = 0; k < a.size(); k++){
            if(a.get(k) < min){
                min = a.get(k);
                i = k;
            }
            if(a.get(k) > max){
                max = a.get(k);
                j = k;
            }
        }
        a.set(i, max);
        a.set(j, min);
        for(Double x : a){
            System.out.print(x + " ");
        }
        System.out.println("");
    }
    public static void task5(ArrayList<Double> a){
        for(int i = 0; i < a.size(); i++){
            if(a.get(i) > i){
                System.out.print(a.get(i) + " ");
            }
        }
        System.out.println("");
    }
    static boolean prost(int x){
        if(x < 2){
            return false;
        }
        for(int i = 2; i < x; i++){
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }
    public static double task6(ArrayList<Double> a){
        double e = 0;
        for(int i = 0 ; i < a.size(); i++){
            if(prost(i) == true){
                e += a.get(i);
            }
        }
        return e;
    }
    public static double task7(ArrayList<Double> a){
        double max = a.get(0) + a.get(a.size() - 1);
        for(int i = 0; i < a.size() / 2; i++){
            if(max < a.get(i) + a.get(a.size() - 1 - i)){
                max = a.get(i) + a.get(a.size() - i - 1);
            }
        }
        return max;
    }
    public static void task8(ArrayList<Double> a){
        double min = Integer.MAX_VALUE;
        for(int i = 0; i < a.size(); i++){
            if(a.get(i) < min){
                min = a.get(i);
            }
        }
        for(int i = 0; i < a.size(); i++){
            if(a.get(i) == min){
                a.remove(i);
                i--;
            }
        }
        for(int i = 0; i < a.size(); i++){
            System.out.print(a.get(i) + " ");
        }
        System.out.println("");
    }
    public static void task10(ArrayList<Double> a){
        for(int i = 1; i < a.size(); i += 2){
            a.set(i, 0.0);
        }
        for(int i = 0; i < a.size(); i++){
            System.out.print(a.get(i) + " ");
        }
    }
}

public class Main {
    public static void main(String args[]){
        ArrayList<Double> a = new ArrayList<Double>();
        a.add(1.0);
        a.add(2.0);
        a.add(3.0);
        a.add(4.0);
        Array.task10(a);
    }
}
