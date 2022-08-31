import java.sql.SQLOutput;

public class Main {
    //Задание 1
    public static void main(String[] args) {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName +" "+  firstName +" "+ middleName;
        System.out.println("ФИО сотрудника — " +fullName);

    //Задание 2
        String UpperFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + UpperFullName);

    //Задание 3

        String [] fullName1 = fullName.split(" ");
        fullName1[0] = "Иванов";
        fullName1[1] = "Семён";
        fullName1[2] = "Семёнович";
        for(int i=0; i < fullName1.length; i++){
        fullName1[i] = fullName1[i].replace("ё","е");
        System.out.print(fullName1[i]+" ");}
















    }
}