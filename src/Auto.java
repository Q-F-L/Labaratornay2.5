import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*
 * Класс Авто
 */

public abstract class Auto {
    private String mark; // Марка
    private LocalDate dateCreated, dateSold; // Дата производства авто, Дата продажи
    private double price; // Цена
    private String equipment, country, fioBuyer; // Комплектация, Страна, ФИО Покупателя
    private double canBeUsedForCargoTransportation; //Можно использовать для перевозки грузов

    /*
     * Метод для вывода детальной информации по машине
     */
    abstract void getDetailedInformatoin();

    /*
     * Конструктор при наличии всех параметров
     */
    Auto(String mark, String dateCreated, String dateSold, double price, String equipment, String country, String fioBuyer, Double canBeUsedForCargoTransportation)
    {
        this.mark = mark;
        this.dateCreated = LocalDate.parse(dateCreated, DateTimeFormatter.ofPattern("dd MM yyyy"));
        this.dateSold = LocalDate.parse(dateSold, DateTimeFormatter.ofPattern("dd MM yyyy"));
        this.equipment = equipment;
        this.country = country;
        this.fioBuyer = fioBuyer;
        this.price = price;
        this.canBeUsedForCargoTransportation = canBeUsedForCargoTransportation;
    }

    /*
     * Конструктор при отсутсвии ФИО покупателя
     */
    Auto(String mark, String dateCreated, String dateSold, double price, String equipment, String country, Double canBeUsedForCargoTransportation)
    {
        this.mark = mark;
        this.dateCreated = LocalDate.parse(dateCreated, DateTimeFormatter.ofPattern("dd MM yyyy"));
        this.dateSold = LocalDate.parse(dateSold, DateTimeFormatter.ofPattern("dd MM yyyy"));
        this.equipment = equipment;
        this.country = country;
        this.fioBuyer = "";
        this.price = price;
        this.canBeUsedForCargoTransportation = canBeUsedForCargoTransportation;
    }

    /*
     * Конструктор при отсутсвии даты продажи
     */
    Auto(String mark, String dateCreated, double price, String equipment, String country, String fioBuyer, Double canBeUsedForCargoTransportation)
    {
        this.mark = mark;
        this.dateCreated = LocalDate.parse(dateCreated, DateTimeFormatter.ofPattern("dd MM yyyy"));
        this.equipment = equipment;
        this.country = country;
        this.fioBuyer = fioBuyer;
        this.price = price;
        this.canBeUsedForCargoTransportation = canBeUsedForCargoTransportation;
    }

    /*
     * Конструктор при отсутсвии параметров
     */
    Auto()
    {
        Scanner sc = new Scanner(System.in, "cp1251");
        System.out.print("Марка : ");
        this.setMark(sc.nextLine());
        System.out.print("\nДата производства авто в формате dd MM yyyy : ");
        this.setDateCreated(sc.nextLine());
        System.out.print("\nДата продажи авто в формате dd MM yyyy : ");
        this.setDateSold(sc.nextLine());
        System.out.print("\nЦена : ");
        this.setPrice(sc.nextDouble());
        System.out.print("\nКомплектация : ");
        this.setEquipment(sc.nextLine());
        System.out.print("\nСтрана : ");
        this.setCountry(sc.nextLine());
        System.out.print("\nФИО Покупателя : ");
        this.setFioBuyer(sc.nextLine());
        System.out.print("\nМожно использовать для перевозки грузов : ");
        this.setCanBeUsedForCargoTransportation(sc.nextDouble());
        sc.close();
    }

    /*
     * Вывод строкой всей информации класса
     */
    public String toString()
    {
        return "Марка :"+mark+"\nДата производства авто в формате: "+dateCreated+((dateSold != null) ? "Не проданно" : dateSold)+
            "\nЦена : "+price+"\nКомплектация : "+equipment+"\nСтрана : "+country+"\nФИО Покупателя : "+fioBuyer+
            ((canBeUsedForCargoTransportation < 1) ? ("\nНельзя использовать для перевозки грузов")
            : ("\nМожно использовать для перевозки грузов: "+canBeUsedForCargoTransportation+" кг"));
    }

    /*
     * Сеттеры для указанных переменных
     */
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

    public void setCanBeUsedForCargoTransportation(double canBeUsedForCargoTransportation) {
        if (canBeUsedForCargoTransportation < 0)
            System.out.println("Недопустимое значение !");
        else this.canBeUsedForCargoTransportation = canBeUsedForCargoTransportation;
    }

    /*
     * Геттеры для указанных переменных
     */
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

    public double getCanBeUsedForCargoTransportation() {
        return canBeUsedForCargoTransportation;
    }
}
