package org.example;

public class Calculate {
    public int sum(int x, int y) {
        return x + y;
    }
    
    public double average(int x,int y){
        return (x + y) / 2.0;
    }

    public int sumBetween(int x, int y){
        int sum = 0;
        for(int i = x; i <= y; i++){
            sum += i;
        }
        return sum;
        
    }

    public int sumEvenBetween(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) sum += i;
        }
        return sum;
    }

    public int sumOddBetween(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 1) sum += i;
        }
        return sum;
    }


    public static void main(String[] args) {
        Calculate cal = new Calculate();
        System.out.println("Hello World!");
        System.out.println("Sum of 2 and 3 is " + cal.sum(2, 3) + ". Average is " + cal.average(2, 3) + ".");
        System.out.println("Sum of 1 to 10 is " + cal.sumBetween(1, 10) + ". Average is" + cal.average(1,10) + ".");
        System.out.println("Sum of odd of 1 to 10 is " + cal.sumOddBetween(1, 10) + ".");
        System.out.println("Sum of even of 1 to 10 is " + cal.sumEvenBetween(1, 10) + ".");
    }
}

