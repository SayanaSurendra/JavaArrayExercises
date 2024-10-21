package se.lexicon;

import java.util.Arrays;

public class ArrayExercises {

    public static void printArrayExercises() {
        printArrayElements();
        printArrayElementIndex();
        printSortedArray();
        printCopyOfArrayElemnts();
        printTwoDimensionalArray();
        printAverage();
        printOddNumbers();
        printAddElementsCopy();
        printMultiplicationTable();
        printDiagonalElements();
        printArrayWithoutDuplicates();
    }




    private static void printArrayElements() {
        System.out.println("==========Exercise 1=========");
        int arrNumbers[]={23,45,56,33,11};

        for(int num:arrNumbers){
            System.out.println(num);
        }
    }



    private static void printArrayElementIndex() {
        System.out.println();
        System.out.println("==========Exercise 2=========");
        int numbers[]={2,3,4,5,6,7,8,9};
       int index=indexOf(numbers,5);
        System.out.println("index = " + index);


    }

    private static int indexOf(int arrayNumbers[],int num) {
          int index=-1;
        for(int i=0;i<arrayNumbers.length;i++){
            if(arrayNumbers[i]==num){
                index=i;
            }
        }
        
        return index;
    }


    private static void printSortedArray(){
        System.out.println();
        System.out.println("==========Exercise 3=========");
        String countryArrays[]= {"Paris","London","New York","Stockholm"};
        Arrays.sort(countryArrays);
        System.out.println( Arrays.toString(countryArrays));
    }


    private static void printCopyOfArrayElemnts(){
        System.out.println();
        System.out.println("==========Exercise 4=========");
        int numberArrays[]={2,8,5,596,20};
        int copyOfNumberArrays[]=Arrays.copyOf(numberArrays,numberArrays.length);
        for(int number:copyOfNumberArrays){
            System.out.println(number);

        }
    }

    private static void printTwoDimensionalArray(){
        System.out.println();
        System.out.println("==========Exercise 5=========");
        String countryArray[][]=new String[2][2];
        countryArray[0][0]="Sweden";
        countryArray[0][1]="Stockholm";

        countryArray[1][0]="France";
        countryArray[1][1]="Paris";

        for(int rows=0;rows< countryArray.length;rows++){
            for(int column=0;column< countryArray.length;column++){
                System.out.print(countryArray[rows][column]+" ");
            }
            System.out.println();


        }
    }

    private static void printAverage(){
        System.out.println();
        System.out.println("==========Exercise 6=========");
        int numbers[]={43,5,23,17,2,14};
        double sum=0;
        for(int num:numbers){
            sum+=num;
        }
        double avaerge=sum/ numbers.length;
        System.out.println(avaerge);

    }

    private static void printOddNumbers(){
        System.out.println();
        System.out.println("==========Exercise 7=========");
        int numbers[]={1,2,3,5,9,78,100,54,22,16};
        for(int i=0;i< numbers.length;i++){
           if((numbers[i]%2) != 0){
               System.out.println(numbers[i]);

           }
        }

    }


    private static void printAddElementsCopy() {
        System.out.println();
        System.out.println("==========Exercise 9=========");

        int numbers[]={2,3,4,5,6,7,9,89};
        int copyArrays[]=Arrays.copyOf(numbers,numbers.length+3);
        copyArrays[numbers.length]=22;
        copyArrays[numbers.length+1]=42;
        copyArrays[numbers.length+2]=52;
        for(int num:copyArrays){
            System.out.println(num);
        }
    }

    private static void printMultiplicationTable(){

        System.out.println();
        System.out.println("==========Exercise 10=========");
        int multiplicationTables[][]=new int[10][10];

        for(int i=1;i<= multiplicationTables.length;i++){
            for(int j=1;j<= multiplicationTables.length;j++){
                System.out.println(i+" x "+j+"="+i*j);
            }

            System.out.println();
        }
    }


    private static void printDiagonalElements(){
        System.out.println();
        System.out.println("==========Exercise 12=========");
        int numberArray[][]={{1,2,3},{2,4,6},{3,6,9}};
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==j){
                    System.out.print(numberArray[i][j]+" ");
                }

            }
        }
    }

    private static void printArrayWithoutDuplicates(){
        System.out.println();
        System.out.println("==========Exercise 8=========");
        int numbers[]={20,20,40,20,30,40,50,60,50};

    }

}
