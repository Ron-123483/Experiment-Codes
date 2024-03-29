//import java.util.Scanner;
//
//public class main {
//    public static int calculateMultiple (int a, int b){
//        return a * b;
//
//
//
//    }
//
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//
//        System.out.println("Multiple of 2 numbers is: " + calculateMultiple(a,b));
//
//    }
//}


//import java.util.Scanner;
//
//public class main {
//    public static int calculateMultiple (int a, int b){
//        return a * b;
//
//    }
//
//    public static void printFactorial(int n){
//
//        if (n < 0){
//            System.out.println("no factorial for negative number");
//            return;
//        }
//        //loop
//        int factorial = 1;
//        for (int i = n; i > 1; i--){
//            factorial = factorial * i;
//        }
//        System.out.println(factorial);
//        return;
//    }
//
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        printFactorial(n);
//
//    }
//}





//public class main{
//    public static void main(String[]args){
//
//        int x = 3;
//        int y = 4;
//
//        add(x,y);
//
//
//
//    }
//    static int add(int x,int y){
//
//        int sum = x + y;
//        System.out.println(sum);
//        return sum;
//
//
//
//
//
//    }
//}


//public class main{
//public static void numbersFrom1to100() {
//    for (int i = 1; i <= 100; i++) {
//        System.out.println(i);
//
//
//    }
//}
//    public static void main (String[]args){
//
//        numbersFrom1to100();
//
//    }
//
//}


//public class main {
//    public static void main(String[] args) {
//        System.out.println("The grade is ");
//        printGrade(78.5);
//        System.out.println("The grade is ");
//        printGrade(59.5);
//    }
//
//    public static void printGrade(double score) {
//
//        if (score >= 90.0) {
//            System.out.println("A");
//        } else if (score >= 80.0) {
//            System.out.println("B");
//        } else if (score >= 70.0) {
//            System.out.println("C");
//        } else if (score >= 60.0) {
//            System.out.println("D");
//        } else {
//            System.out.println("F");
//        }
//
//    }
//    }
//
//


//public class main {
//    public static void main(String[] args) {
//
//        System.out.print("The grade is " + getGrade(78.5));
//        System.out.print("\nThe grade is " + getGrade(59.5));
//    }
//
//    public static char getGrade(double score) {
//
//        if (score >= 90.0) {
//            return 'A';
//        } else if (score >= 80.0) {
//            return 'B';
//        } else if (score >= 70.0) {
//            return 'C';
//        } else if (score >= 60.0) {
//            return 'D';
//        } else {
//            return 'F';
//        }
//
//    }
//}
//
//
//

//public class main{
//    public static void main(String[]args){
//
//        int max=0;
//
//        if(max!=0){
//
//            System.out.println(max);
//        }
//        else{
//            return;
//        }
//
//
//
//        }
//        }




//public class main{
//    public static void main(String[]args){
//
//        nPrint();
//
//
//
//    }
//}
//

//
//public class main{
//    public static void main(String[]args){
//
//
//        class Test{
//            public static void main(String[]args){
//                System.out.println( hero(1,2));
//            }
//            public static double hero(int num1, double num2){
//                System.out.println("max(int, double) is invoked");
//
//                if(num1 > num2){
//                    return num1;
//                }
//                else
//                    return num2;
//            }
//
//            public static double max(double num1, int num2){
//                System.out.println("max(double, int) is invoked");
//
//                if(num1 > num2){
//                    return num1;
//                }
//                else
//                    return num2;
//            }
//        }
//
//
//
//    }
//}



//import java.util.Scanner;
//public class main{
//    public static void main(String[]args) {
//
//        Scanner sc = new Scanner(System.in);
//
//
//        int n = sc.nextInt();
//
//        int m = sc.nextInt();
//
//        // creating an array
//        int matrix[][] = new int[n][m];
//
//        for(int i = 0; i < n; i++){
//            for (int j = 0; j < m; j++){
//
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//
//        System.out.println("The transporse is: ");
//
//
//        for(int j = 0; j < m; j++){
//            for(int i = 0; i < n; i++){
//
//                System.out.println(matrix[n][m] + " ");
//
//            }
//            System.out.println();
//        }
//
//
//
//
//    }
//}



//import java.util.*;
//
//
//public class main {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//
//
//        int matrix[][] = new int[n][m];
//        for(int i=0; i<n; i++) {
//            for(int j=0; j<m; j++) {
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//
//        System.out.println("The transpose is : ");
//        //To print transpose
//
//
//        for(int j=0; j<m ;j++) {
//            for(int i=0; i<n; i++) {
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
//}
//





////Take an array of names as input from the user and print them on the screen.
//
//
//import java.util.Scanner;
//public class main{
//    public static void main(String[]args){
//
//        Scanner sc = new Scanner(System.in);
//
//        // first create an array to take an input
//
//        // size is the input
//        int size  = sc.nextInt();
//
//        //Whatever input the user provides that is going to be the size
//        String [] names = new String [size];
//
//        // input
//        for(int i = 0; i < size; i++){
//            names[i] = sc.next();
//
//        }
//
//
//            // this is the output loop and when ever names.length is bigger the code extends
//        for(int i = 0; i < names.length; i++) {
//
//            // this is going to spit out the input we took above
//            System.out.println("name " + (i + 1) + " is : " + names[i]);
//
//        }
//    }
//
//
//
//
//
//    }
//



//Find the maximum & minimum number in an array of integers.


//
//import java.util.*;
//
//
//public class main {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int numbers[] = new int[size];
//
//
//        //input
//        for(int i=0; i<size; i++) {
//            numbers[i] = sc.nextInt();
//        }
//
//
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//
//        for(int i=0; i<numbers.length; i++) {
//            if(numbers[i] < min) {
//                min = numbers[i];
//            }
//            if(numbers[i] > max) {
//                max = numbers[i];
//            }
//        }
//
//
//        System.out.println("Largest number is : " + max);
//        System.out.println("Smallest number is : " + min);
//
//    }
//}






//import java.util.*;
//
//
//public class main {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//
//
//        float [] numbers = {33.5f, 44.6f, 56.7f, 67.8f, 89.9f};
//
//        float sum = 0;
//
//        for(float element: numbers) {
//
//            sum = sum + element;
//        }
//
//        System.out.println("the sum is " + sum);
//        }



//            float solution = numbers[0] +  numbers[1] +  numbers[2] +  numbers[3] +  numbers[4];
//
//            System.out.println(solution);







//
//        }
//









