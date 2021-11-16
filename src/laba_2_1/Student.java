package laba_2_1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Student {

    private String surname;
    private String name;
    private GregorianCalendar calendar ;
    private String telephonNumber;
    public String street;
    public int numberDoma;
    public int numberFlat;

    public Student(String surname,String name,GregorianCalendar calendar,String telephonNumber,String street, int numberDoma, int numberFlat){

        this.surname = surname;
        this.name = name;
        this.calendar = calendar;
        this.telephonNumber = telephonNumber;
        this.street = street;
        this.numberDoma = numberDoma;
        this.numberFlat = numberFlat;

        // Adres A = new Adres(adress);
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getTelephonNumber() {
        return telephonNumber;
    }
    public void setTelephonNumber(String telephonNumber) {
        this.telephonNumber = telephonNumber;
    }

    public Calendar getCalendar() {
        return calendar;
    }
    public void setCalendar(GregorianCalendar calendar) {
        this.calendar = calendar;
    }

    public int getNumberDoma() {return numberDoma;}
    public void setNumberDoma(int numberDoma) {
        this.numberDoma = numberDoma;
    }

    public int getNumberFlat(){
        return numberFlat;
    }
    public  void setNumberFlat(int numberFlat){this.numberFlat = numberFlat;}

    public String getStreet(){
        return  street;
    }
    public void setStreet(String street){
        this.street = street;
    }

    public void OutPut(int i){

        System.out.println("Данные студента №" + i +" :");
        System.out.println("Фамилия :" + getSurname());
        System.out.println("Имя : " + getName());
        System.out.println("Дата рождения  : " + calendar.get(Calendar.YEAR) + "." + calendar.get(Calendar.MONTH) + "." +calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Номер телефона :" + getTelephonNumber());
    }
    public void Show(){
        System.out.println("Адрес : " + getStreet() + "   номер дома : " + getNumberDoma() + "   номер квартир : " + getNumberFlat() + "\n");
    }
}

