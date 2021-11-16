package laba_2_1;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {

    public static boolean proverkaWord(String s) {

        for (int i = 0; i<s.length(); i++) {
            if ((s.charAt(i) < 'a' || s.charAt(i) > 'z') && (s.charAt(i) < 'A' || s.charAt(i) > 'Z')) {
                return false;
            }
        }
        return true;
    }
    public static boolean proverkaNumber(String s) {

        for (int i = 0; i<s.length(); i++) {
            if ((s.charAt(i) < '0' && s.charAt(i) > '9')) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        ArrayList<Student> Jurnal = new ArrayList<Student>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число : ");
        int kolStudentov = scanner.nextInt();
        System.out.print("Все данные вводить!!!!! только на английском языке \n");

        for (int i = 0; i < kolStudentov; i++) {

            int p=i+1;
            System.out.println("Введите данные студента номер " + p);

            System.out.print("Введите фамилию студента "  + " : ");
            String str1 = scanner.nextLine();
            str1 = scanner.nextLine();
            while (!Main.proverkaWord(str1)) {

                System.out.println("Некоректная фамилия , введите пожалуйста еще раз");
                str1 = scanner.nextLine();
            }

            System.out.print("Введите имя студента "  + " : ");
            String str2 = scanner.nextLine();
            //str2 = scanner.nextLine();
            while (!Main.proverkaWord(str2)) {

                System.out.println("Некоректное имя , введите пожалуйста еще раз");
                str2 = scanner.nextLine();
            }

            System.out.print("Введите дату рождения студента" + " вида (день месяц год): ");
            int day, mounght, year;

            day = scanner.nextInt();
            while (day < 0 || day > 32) {
                System.out.println("День не может быть меньше 0 или больше 31 !!! Ведите еще раз день рождения");
                day = scanner.nextInt();
            }

            mounght = scanner.nextInt();
            while (mounght < 0 || mounght > 12) {
                System.out.println("Месяц не может быть меньше 0 или больше 12 !!! Ведите еще раз месяц рождения");
                mounght = scanner.nextInt();
            }

            year = scanner.nextInt();
            while (year < 0 || year > 2022) {
                System.out.println("Год не может быть меньше 0 или больше 2022 !!! ведите еще раз год рождения");
                year = scanner.nextInt();
            }

            GregorianCalendar calendar = new GregorianCalendar();
            calendar.set(GregorianCalendar.YEAR, year);
            calendar.set(GregorianCalendar.MONTH, mounght);
            calendar.set(GregorianCalendar.DAY_OF_MONTH, day);

            System.out.print("Введите номер студента " +  " : ");
            String str4 = scanner.nextLine();
            str4 = scanner.nextLine();
            while (!Main.proverkaNumber(str4)) {

                System.out.println("Некоректный номер , введите пожалуйста еще раз");
                str4 = scanner.nextLine();
            }

            System.out.println("Введите адрес студента вида ( название улицы , номер дома , номер квартиры) : ");
            String s;
            int numberFlat, numberHouse;

            s = scanner.nextLine();
            while (Main.proverkaWord(s)) {

                System.out.println("Некоректное название улицы , введите пожалуйста еще раз");
                s = scanner.nextLine();
            }

            numberFlat = scanner.nextInt();
            while (numberFlat < 0 ) {
                System.out.println("Номер квартиры не может быть меньше 0 !!! Ведите еще раз номер квартиры");
                numberFlat = scanner.nextInt();
            }

            numberHouse = scanner.nextInt();
            while (numberHouse < 0) {
                System.out.println("Номер дома не может быть меньше 0 !!! Введите еще раз номер дома");
                numberHouse = scanner.nextInt();
            }

            Student S = new Student(str1,str2,calendar,str4,s,numberHouse,numberFlat);
            Jurnal.add(S);
        }

        System.out.println("Журнал : \n");

        for (int i=0;i<kolStudentov;i++){

            int p=i+1;
            Student A = Jurnal.get(i);
            A.OutPut(p);
            A.Show();
        }
    }

}
