// Если необходимо, исправьте данный код

// Добавила массив

public class task2_2 {
public static void main(String[] args) {
    int[] intArray = {14, 8, 6, 99, 56, 63, 14, 4, 77};
   System.out.println(intArray);
    try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}

}
}