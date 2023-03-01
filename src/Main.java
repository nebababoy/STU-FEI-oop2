import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
public class Main {
    public static void zadanie_1(){
        while(true){
            System.out.println("Den narodenia: ");
            Scanner in = new Scanner(System.in);
            int day = in.nextInt();
            System.out.println("Mesiac: ");
            int mounth = in.nextInt();
            horoscope(day, mounth);
            System.out.println("Chcete pokracovať? 1 ak ano 0 ako nie: ");
            int answer = in.nextInt();
            if(answer == 1)
                horoscope(day, mounth);
            else
                break;
        }
        return;
    }
    public static void horoscope(int d, int m){
      /*  switch (m){
            case 1:
                if (d <= 20){
                    System.out.println("Kozorožec");
                }else
                    System.out.println("Vodnár");
                break;
            case 2:
                if (d <= 19) {
                    System.out.println("Vodnár");
                }else
                    System.out.println("Ryby");
                break;
        }
      */
        if((d >= 21 && m == 3) || (d <= 20 && m == 4)){
            System.out.println("Aries");
        }else if((d >= 21 && m == 4) || (d <= 20 && m == 5)){
            System.out.println("Taurus");
        }else if((d >= 21 && m == 5) || (d <= 21 && m == 6)){
            System.out.println("Gemini");
        }else if((d >= 22 && m == 6) || (d <= 22  && m == 7)){
            System.out.println("Cancer");
        }else if((d >= 23 && m == 7) || (d <= 22 && m == 8)){
            System.out.println("Leo");
        }else if((d >= 23 && m == 8) || (d <= 22 && m == 9)){
            System.out.println("Virgo");
        }else if((d >= 23 && m == 9) || (d <= 22 && m == 10)){
            System.out.println("Libra");
        }else if((d >= 23 && m == 10) || (d <= 22 && m == 11)) {
            System.out.println("Scorpius");
        }else if((d >= 23 && m == 11) || (d <= 22 && m == 12)) {
             System.out.println("Sagittarius");
        }else if((d >= 22 && m == 12) || (d <= 20 && m == 1)) {
            System.out.println("Capricornus");
        }else if((d >= 21 && m == 1) || (d <= 19 && m == 2)) {
            System.out.println("Aquarius");
        }else if((d >= 20 && m == 2) || (d <= 20 && m == 3)) {
            System.out.println("Pisces");
        }
        return;
    }
    public static void zadanie_2(){
        System.out.println("Rozmer pola: ");
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int nums[];
        nums = new int[r];
        System.out.println("Vvedite cisla: ");
        for (int i = 0; i < r; i++) {
            nums[i] = in.nextInt();
        }
        System.out.print ("Pole: ");
        for (int i = 0; i < r; i++) {
            System.out.print (" " + nums[i]); // Выводим на экран, полученный массив
        }
        System.out.println();
        return;
    }
    public static void zadanie_3(){
        int num2[] = {1 , 2, 3, 4};
        System.out.print ("Pole2: ");
        for (int i = 0; i < num2.length; i++) {
            System.out.print (" " + num2[i]);
        }
        return;
    }
    public static void zadanie_4(){
        int[] array;
        array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 31);
        }
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void zadanie_5(){
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                arr[i][j] = (int)(Math.random() * 31);
        }
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + "\t");
            System.out.println();
        }
    }
    public static void zadanie_6(){
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = (int)(Math.random() * 31);
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                System.out.print(matrix[i][j] + "\t");
            System.out.println();
        }
        int determinant,x,y,z;
        x=(matrix[0][0] * (matrix[1][1] * matrix[2][2]
                - matrix[1][2] * matrix[2][1]));
        y=(matrix[0][1] * (matrix[1][0] * matrix[2][2]
                - matrix[1][2] * matrix[2][0]));
        z=(matrix[0][2] * (matrix[1][0] * matrix[2][1]
                - matrix[1][1] * matrix[2][0]));
        determinant= x - y + z;
        System.out.println("Determinant: "+ determinant);
    }

    public static void main(String[] args) {
        //--------------- zadanie 2.1----------------------
        zadanie_1();
        //--------------- zadanie 2.2----------------------
        zadanie_2();
        // ---------------zadanie 2.3----------------------
        zadanie_3();
        //----------------zadanie 2.4----------------------
        zadanie_4();
        //----------------zadanie 2.5----------------------
        zadanie_5();
        //----------------zadanie 2.6----------------------
        zadanie_6();

















    }
}