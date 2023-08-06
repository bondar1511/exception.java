
// Напишите приложение, которое будет запрашивать у пользователя следующие данные, разделенные пробелом:
// Фамилия Имя Отчество номертелефона

// Форматы данных:
// фамилия, имя, отчество - строки
// номертелефона - целое беззнаковое число без форматирования

// Ввод всех элементов через пробел

// Приложение должно проверить введенные данные по количеству. Если количество не совпадает с требуемым, вернуть код ошибки, обработать его и показать пользователю сообщение, что он ввел меньше и больше данных, чем требуется.

// Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры. Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы. Можно использовать встроенные типы java и создать свои. Исключение должно быть корректно обработано, пользователю выведено сообщение с информацией, что именно неверно.

// Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии, в него в одну строку должны записаться полученные данные, вида

// <Фамилия><Имя><Отчество><номер_телефона>

// Однофамильцы должны записаться в один и тот же файл, в отдельные строки.

// Не забудьте закрыть соединение с файлом.

// При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано, пользователь должен увидеть стектрейс ошибки.




import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class task3 {

    private static final String To = null;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
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

