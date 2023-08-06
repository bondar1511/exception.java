
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class task3 {

    private static final String To = null;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
    //     System.out.print("Введите Фамилию: ");
    //     String surname = scanner.nextLine();
    //     System.out.print("Введите Имя: ");
    //     String firstName = scanner.nextLine();
    //     System.out.print("Введите Отчество: ");
    //     String middleName = scanner.nextLine(); 
    //     System.out.print("Введите Дату рождения: ");
    //     String birthDate  = scanner.nextLine();
    //     System.out.print("Введите Номер телефона: ");
    //     String phoneNumber = scanner.nextLine();
    //     System.out.print("Введите Пол: ");
    //     String gender = scanner.nextLine();
    //  ArrayList<String> list = new ArrayList<String>();
    //    list.add(surname);
    //    list.add(firstName);
    //    list.add(middleName);
    //    list.add(birthDate);
    //    list.add(phoneNumber);
    //    list.add(gender);
    //    System.out.println("Введеные данные: "+ list);

        // if (list.size() != 6) {
        //     // System.out.println("Ошибка! Введены не все данные.");
        //     // return;
        // }
        //   if (list.size() != 6) {
            System.out.print("Введите данные: Фамилия Имя Отчество дата рождения номер телефона пол: ");
            String str = scanner.nextLine();
            
            String[]  data= str.split(" ");
            if (data.length != 6) {
                    throw new Exception("Ошибка! Введены не все данные");
                }
            if (data.length > 6) {
                  throw new   ArrayIndexOutOfBoundsException ("Ошибка! Вы ввели данные больше 6");
                }
            try {
                String surname = data[0];
                String firstName = data[1];
                String middleName = data[2];
                String birthDate = data[3];
                String phoneNumber = data[4];
                String gender = data[5];
                
                String result = surname + "\r\n" + firstName + "\r\n" + middleName + "\r\n" + birthDate + " \r\n" + phoneNumber + "\r\n" + gender +"\r\n";
                
                FileWriter fileWriter = new FileWriter(surname + ".txt");
                fileWriter.write(result);
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Ошибка! Не удалось создать файл.");
                return;
            }
             System.out.println("Данные успешно сохранены в файле " + data[0] + ".txt");
           
         
          
    }     
    
}

