package academy.learnprogramming;

import org.w3c.dom.ls.LSOutput;

public class FunctionManager {

    //1
    public int sum(int x, int y) {
        return x + y;
    }

    //2

    public double multiply(double x, double y){
        return x*y;
    }

    //3

    static void printIfFirstIsGreater(float a, float b) {
        if(a>b){
            System.out.println("Yes");
        }
        System.out.println("No");
    }

    //4

    static void printGreatestNumber(long a,long b, long c) {
        long max= a>b? (a>c? a : c):(b>c ? b :c);
        System.out.println(max);
    }

    //5
    static void printIfGenderIsMale(Human h1){
        if(h1.gender=='m'){
            System.out.println("Yes");
        }
        System.out.println("No");
    }

    //6

    public static void printLongestLastName(Human h1, Human h2, Human h3){
        if(h1.lastName.length() > h2.lastName.length() & h1.lastName.length() > h3.lastName.length()){
            System.out.println(h1.lastName);
        }



    }

    //7

    public static void printNamesNextToEachOther(Human h1, Human h2){
        System.out.println(h1.firstName + " " + h2.firstName);
    }


    //8

    public static void printHumansName(boolean n, Human h1){

        if(n){
            System.out.println(h1.firstName);
        }
        if(!n){
            System.out.println(h1.lastName);

        }
    }

    //9

    public static void printMaxElement(int[] arr){
        int current = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > current){
                current = arr[i];
            }

        }
        System.out.println(current);

    }



    //10

    public static void printMinElementIndex(float[] arr){
        int index = 0;
        float curr=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < curr){
                curr=arr[i];
                index=i;
            }

        }


        System.out.println(index);
    }

    //11

    public static void sortedHumansByAscending(Human[] humans) {
        for (int i = 0; i < humans.length - 1; i++) {
            for (int j = 0; j < humans.length - i - 1; j++) {
                if (humans[j].getBornYear() > humans[j + 1].getBornYear()) {
                    Human temp = humans[j];
                    humans[j] = humans[j + 1];
                    humans[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < humans.length; i++) {
            humans[i].printHuman();
        }
    }





}
