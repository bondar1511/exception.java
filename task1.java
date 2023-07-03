import java.util.Random;
import java.util.Scanner;


// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения


public class task1 {

public static void main(String[] args){


public static int getNumberFromConsole(String message) throws NumberFormatException {
    Scanner value = new Scanner(System.in);
    System.out.print(message + ": ");
    String str = value.nextLine();

    return Integer.parseInt(str);
}


public class MyException {

    public MyException(String string) {
    }

}

 public static void checkValue(int value){
  if (value < 100) {
    throw new MyException("Значение должно находиться в диапозоне от [0,100]!");
  }
  else{
     System.out.println("Значение допустимо:" + value);
  }
 
  }
}
}

public static  void data (int value){

        if (value == null) {
            throw new NullPointerException(" значение равно нулю!");
        }
        System.out.println(value);
    }

