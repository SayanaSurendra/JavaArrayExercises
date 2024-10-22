package se.lexicon;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayExercises {

    public static void printArrayExercises() {
        printArrayElementsEx1();
        printArrayElementIndexEx2();
        printSortedArrayEx3();
        printCopyOfArrayElemntsEx4();
        printTwoDimensionalArrayEx5();
        printAverageEx6();
        printOddNumbersEx7();
        printArrayWithoutDuplicatesEx8();
        printAddElementsCopyEx9();
        printMultiplicationTableEx10();
        printReverseOfArrayEx11();
        printDiagonalElementsEx12();
        printArrayWithEvenOddEx13();
    }




    private static void printArrayElementsEx1() {
        System.out.println("==========Exercise 1=========");
        int arrNumbers[]={23,45,56,33,11};

        for(int num:arrNumbers){
            System.out.println(num);
        }
    }



    private static void printArrayElementIndexEx2() {
        System.out.println();
        System.out.println("==========Exercise 2=========");
        int numbers[]={2,3,4,5,6,7,8,9};
       int index=indexOf(numbers,10);
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


    private static void printSortedArrayEx3(){
        System.out.println();
        System.out.println("==========Exercise 3=========");
        String countryArrays[]= {"Paris","London","New York","Stockholm"};
        Arrays.sort(countryArrays);
        System.out.println( Arrays.toString(countryArrays));
    }


    private static void printCopyOfArrayElemntsEx4(){
        System.out.println();
        System.out.println("==========Exercise 4=========");
        int numberArrays[]={2,8,5,596,20};
        int copyOfNumberArrays[]=Arrays.copyOf(numberArrays,numberArrays.length);
        for(int number:copyOfNumberArrays){
            System.out.println(number);

        }
        System.out.println(Arrays.toString(copyOfNumberArrays));
    }

    private static void printTwoDimensionalArrayEx5(){
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

    private static void printAverageEx6(){
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

    private static void printOddNumbersEx7(){
        System.out.println();
        System.out.println("==========Exercise 7=========");
        int numbers[]={1,2,3,5,9,78,11,59,22,16};
        System.out.println("Given Array:"+Arrays.toString(numbers));
        int oddArray[]=new int[10];
        int count=0;int j=0;
        for(int i=0;i< numbers.length;i++){
           if((numbers[i]%2) != 0){
               oddArray[j]=numbers[i];
               j++;
               count++;
           }
        }
        System.out.println("Odd Array: "+Arrays.toString(Arrays.copyOf(oddArray,count)));

    }


    private static void printAddElementsCopyEx9() {
        System.out.println();
        System.out.println("==========Exercise 9=========");

        int numbers[]={2,3,4,5,6,7,9,89};
        int copyArrays[]=Arrays.copyOf(numbers,numbers.length+3);
        copyArrays[numbers.length]=22;
        copyArrays[numbers.length+1]=42;
        copyArrays[numbers.length+2]=52;
        /*for(int num:copyArrays){
            System.out.println(num);
        }*/
        System.out.println("Array:"+Arrays.toString(numbers));
        System.out.println("Expanded Array with 3 elements:"+Arrays.toString(copyArrays));
    }

    private static void printMultiplicationTableEx10(){

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


    private static void printDiagonalElementsEx12(){
        System.out.println();
        System.out.println("==========Exercise 12=========");
        int numberArray[][]={{1,2,3},{2,4,6},{3,6,9}};
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==j){
                    System.out.print("Diagonal elements ::"+numberArray[i][j]+" ");
                }

            }
        }
    }

    private static void printArrayWithoutDuplicatesEx8(){
        System.out.println();
        System.out.println("==========Exercise 8=========");
        int numbers[]={20,20,40,20,30,40,50,60,50};
        Arrays.sort(numbers);
         int j=1;
         for(int i=0;i< numbers.length -1;i++){
             if(numbers[i]!= numbers[i+1]) {
                 numbers[j]=numbers[i+1];
                 j++;
             }
         }

         for(int i=0;i<j;i++){
             System.out.print(numbers[i]+" " );
         }




    }


    private static void printReverseOfArrayEx11() {
        System.out.println();
        System.out.println("==========Exercise 11=========");
        Scanner in=new Scanner(System.in);
        int numbers[]=new int[10];
        int count=0;
        boolean exit=false;
        while(!exit){

            System.out.println("You can enter -1 to exit ");
            System.out.println("Please enter a number:");
            int n=in.nextInt();
            if(n != -1 ){
            numbers[count++]=n;
            }else{
                break;
            }

        }

        int newArray[]=resizeArray(numbers,count);
        System.out.println("Original Array:"+Arrays.toString(newArray));
        int reverseArray[]=reverseArray(newArray);
        System.out.println("Reversed Array::"+Arrays.toString(reverseArray));


    }

    private static int[] reverseArray(int[] newArray) {
        int i=0,j= newArray.length -1,temp=0;
        while(i<j){
            temp=newArray[i];
            newArray[i]=newArray[j];
            newArray[j]=temp;
            j--;
            i++;
        }
        return newArray;

    }

    private static int[] resizeArray(int[] numbers, int count) {
       int newArray[]= Arrays.copyOf(numbers,count);
       return newArray;
    }


    private static void printArrayWithEvenOddEx13(){
        System.out.println();
        System.out.println("==========Exercise 13=========");

        int array1[]=new int[10];
        int array2[] =new int[20];
        Random random=new Random();
        for(int i=0;i<array1.length;i++){
            array1[i]=random.nextInt(50);

        }
        System.out.println("Array::"+Arrays.toString(array1));
        array2=oddEvenArrays(array1,array2);
        System.out.println("OddEvenArray:"+Arrays.toString(array2));

    }

    private static int[] oddEvenArrays(int[] array1,int array2[]) {
        array2=Arrays.copyOf(array1,array1.length);
        int odd=0,even=array1.length -1;

        for(int i=0;i<array1.length;i++){
           if(array1[i]%2==0){
               array2[even]=array1[i];
               even--;

           }else{
               array2[odd]=array1[i];
               odd++;
           }
        }
        return array2;
    }

}
