// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
// каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class task2 {
 public static void main(String[] args){   
   int[] arr1= new int[10];
   for (int i = 0; i < arr1.length; i++) {
    arr1[i] = ((int)(Math.random() * 20) + 3);
    System.out.println(arr1[i]);
}
   int[] arr2 =new int[10];
   for (int i = 0; i < arr2.length; i++) {
    arr2[i] = ((int)(Math.random() * 30) + 3);
    System.out.println(arr2[i]);

     System.out.println("Первый массив " + Arrays.toString(arr1));  
     System.out.println("Второй массив " + Arrays.toString(arr2));
     System.out.println("Разница двух  массивов " + differenceArray(arr1, arr2));
     System.out.println("Частное двух массивов " + divideArray(arr1, arr2));

}

private static ArrayList<Integer> differenceArray(int[] arr1, int[] arr2) {
   ArrayList<Integer> result = new ArrayList<>();
            int min = Math.min(arr1.length, arr2.length);
            int max = Math.max(arr1.length, arr2.length);
            if (min < 1) {
                throw new RuntimeException("Один из массивов пуст");
            }
            if (min < max) {
                throw new RuntimeException("Длинны массивов не равны!");
            }
            for (int i = 0; i < min; i++) {
                result.add(arr1[i] - arr2[i]);
            }
            return result;
}
 }


public static ArrayList<Float> divideArray(int[] arr1, int[] arr2) {
            ArrayList<Float> result = new ArrayList<>();
            int min = Math.min(arr1.length, arr2.length);
            int max = Math.max(arr1.length, arr2.length);
            if (min < 1) {
                throw new RuntimeException("один из массивов пуст");
            }
            if (min < max) {
                throw new RuntimeException("Длинны массивов не равны!");
            }
            for (int i = 0; i < min; i++) {
                if (arr2[i] != 0) {
                    result.add((float) (arr1[i] / arr2[i]));
                } else {
                    throw new RuntimeException("Делить на ноль нельзя");
                }
            }
            return result;
        }
}
