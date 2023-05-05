import java.time.*;
import java.util.Scanner;

/*
* Дочерний класс Авто - Поддержанные машины
*/
class UsedCar extends Auto {
    private String degreeOfPreservation; // Степень сохраности
    private String fioOwner; // ФИО владельца
    private double mileage; // Пробег

    void getDetailedInformatoin(){
        System.out.println("Цена: " + this.getPrice());
        System.out.println("Страна: " + this.getCountry());
        System.out.println("Мартка: " + this.getMark());
        System.out.println("Комплектация: " + this.getEquipment());
        System.out.println("Дата производства авто: " + this.getDateCreated());
        System.out.println("Дата продажи: " + this.getDateSold());
        System.out.println("ФИО Покупателя: " + this.getFioBuyer());
        System.out.println("Степень сохраности: " + getDegreeOfPreservation());
        System.out.println("ФИО владельца: " + getFioOwner());
        System.out.println("Пробег: " + getMark());
    }

    UsedCar(String degreeOfPreservation, String fioOwner, double mileage, String mark,
            LocalDate dateCreated, LocalDate dateSold, double price, String equipment,
            String country, String fioBuyer)
    {
        super(mark, dateCreated, dateSold, price, equipment, country, fioBuyer);
        this.mileage = mileage;
        this.fioOwner = fioOwner;
        this.degreeOfPreservation = degreeOfPreservation;
    }

    UsedCar()
    {
        super();
        Scanner sc = new Scanner(System.in, "cp1251");
        System.out.print("Степень сохраности : ");
        this.setDegreeOfPreservation(sc.nextLine());
        System.out.print("ФИО владельца : ");
        this.setFioOwner(sc.nextLine());
        System.out.print("Пробег : ");
        this.setMileage(sc.nextDouble());
        sc.close();
    }

    void setDegreeOfPreservation(String degreeOfPreservation){
        if(degreeOfPreservation.isEmpty()) System.out.println("Недопустимое значение !");
        else  this.degreeOfPreservation = degreeOfPreservation;
    }

    void setFioOwner(String fioOwner){
        if(degreeOfPreservation.isEmpty()) System.out.println("Недопустимое значение !");
        else  this.fioOwner = fioOwner;
    }

    void setMileage(double mileage){
        if(degreeOfPreservation.isEmpty()) System.out.println("Недопустимое значение !");
        else  this.mileage = mileage;
    }

    String getDegreeOfPreservation(){
        return degreeOfPreservation;
    }

    String getFioOwner(){
        return fioOwner;
    }

    double getMileage(){
        return mileage;
    }
}