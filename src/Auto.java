import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*
 * Класс Авто
 */

abstract class Auto {
    private String mark; // Марка
    private LocalDate dateCreated, dateSold; // Дата производства авто, Дата продажи
    private double price; // Цена
    private String equipment, country, fioBuyer; // Комплектация, Страна, ФИО Покупателя

    abstract void getDetailedInformatoin();

    Auto(String mark, LocalDate dateCreated, LocalDate dateSold, double price, String equipment, String country, String fioBuyer)
    {
        System.out.println("class Auto constructor(...)");
        this.mark = mark;
        this.dateCreated = dateCreated;
        this.dateSold = dateSold;
        this.equipment = equipment;
        this.country = country;
        this.fioBuyer = fioBuyer;
        this.price = price;
    }

    Auto()
    {
        System.out.println("class Auto constructor()");
        Scanner sc = new Scanner(System.in, "cp1251");
        System.out.print("Марка : ");
        this.setMark(sc.nextLine());
        System.out.print("\nДата производства авто в формате dd MM yyyy : ");
        this.setDateCreated(sc.nextLine());
        System.out.print("\nДата продажи авто в формате dd MM yyyy : ");
        this.setDateCreated(sc.nextLine());
        System.out.print("\nЦена : ");
        this.setPrice(sc.nextDouble());
        System.out.print("\nКомплектация : ");
        this.setEquipment(sc.nextLine());
        System.out.print("\nСтрана : ");
        this.setCountry(sc.nextLine());
        System.out.print("\nФИО Покупателя : ");
        this.setFioBuyer(sc.nextLine());
        sc.close();
    }

    public void setMark(String mark)
    {
        if (mark.isEmpty())
            System.out.println("Недопустимое значение !");
        else this.mark = mark;
    }

    public void setDateCreated(String dateCreated)
    {
        if (dateCreated.isEmpty())
            System.out.println("Недопустимое значение !");
        else this.dateCreated =  LocalDate.parse(dateCreated, DateTimeFormatter.ofPattern("dd MM yyyy"));
    }

    public void setDateSold(String dateSold)
    {
        if (dateSold.isEmpty())
            System.out.println("Недопустимое значение !");
        else this.dateSold =  LocalDate.parse(dateSold, DateTimeFormatter.ofPattern("dd MM yyyy"));
    }

    public void setPrice(double price)
    {
        if (price <= 0)
            System.out.println("Недопустимое значение !");
        else this.price = price;
    }

    public void setEquipment(String equipment)
    {
        if (equipment.toString().isEmpty())
            System.out.println("Недопустимое значение !");
        else this.equipment = equipment;
    }

    public void setCountry(String country)
    {
        if (country.toString().isEmpty())
            System.out.println("Недопустимое значение !");
        else this.country = country;
    }

    public void setFioBuyer(String fioBuyer)
    {
        if (fioBuyer.toString().isEmpty())
            System.out.println("Недопустимое значение !");
        else this.fioBuyer = fioBuyer;
    }

    public String getMark()
    {
        return mark;
    }

    public LocalDate getDateCreated()
    {
        return dateCreated;
    }

    public LocalDate getDateSold()
    {
        return dateSold;
    }

    public double getPrice()
    {
        return price;
    }

    public String getEquipment()
    {
        return equipment;
    }

    public String getCountry()
    {
        return country;
    }

    public String getFioBuyer()
    {
        return fioBuyer;
    }
}
