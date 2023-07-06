// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.util.Scanner;

public class task4_4 {
  
    public static void main(String[] args) {

    Scanner str = new Scanner(System.in);
    System.out.println("Введите строку: ");
    String  string = str.nextLine();
    string = string.trim();

    if(string.isEmpty())
            throw new IllegalArgumentException(" Пустые строки вводить нельзя");
        else
            System.out.println(string);
    
           
    }
  
}