package work1;

import java.util.Scanner;

public class InputData {
    public String[] enterData() {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Введите строку через ПРОБЕЛ (строка должна содержать Ф.И.О, дату рождения - dd.mm.yyyy, номер телефона - цифры, пол - f/m ) : ");
            String data = sc.nextLine();
            String[] arrayData = data.split(" ");
            if (arrayData.length == 6) {
                return arrayData;
            } else if (arrayData.length < 6){
                System.out.println("Вы ввели не все данные! Пожалуйстя, повторите попытку.");
            } else System.out.println("Вы ввели дополнительные данные! Пожалуйстя, повторите попытку, следуя инструкции.");
            sc.close();
        }
    }
}
