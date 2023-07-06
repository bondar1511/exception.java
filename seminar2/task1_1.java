// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
//  Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.



import java.util.Scanner;

 public class task1_1 {

 public static void main(String[] args) {

 public static  numberfloat(){
    Scanner num = new Scanner(System.in);
    System.out.println("Введите дробное число: ");
    float number = num.nextfloat();
     return number;
  }
     public static float enteringfractions(float number) {
       try{
           numberfloat();
        }
        catch (NumberFormatException e){
            System.out.println("Некорректный формат данных");
        }
    }
}
 }
