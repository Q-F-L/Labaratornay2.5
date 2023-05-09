import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/*
 * Продажа автомобиля
 */
import java.util.Scanner;

public class CarSale extends Auto implements CargoTransportation, Recyclable  {
    private String fioBuyer; // ФИО покупателя
    private LocalDate dateSold; // Дата продажи
    private double canBeUsedForCargoTransportation; // Можно использовать для перевозки грузов
    private boolean dispose = false; // Утилизация 

    public void getDetailedInformatoin(){
        System.out.println("Цена: " + getPrice());
        System.out.println("Страна: " + getCountry());
        System.out.println("Мартка: " + getMark());
        System.out.println("Комплектация: " + getEquipment());
        System.out.println("Дата производства авто: " + getDateCreated());
        System.out.println("Дата продажи: " + getDateSold());
        System.out.println("ФИО Покупателя: " + getFioBuyer());
        System.out.println("Пробег: " + getMark());
        System.out.println("Можно использовать для перевозки грузов: " + getCanBeUsedForCargoTransportation());
    }

    public String toString(){
        return "ФИО покупателя: "+fioBuyer+"\nДата продажи: "+dateSold
                + ((canBeUsedForCargoTransportation < 1) ? ("\nНельзя использовать для перевозки грузов")
                                                         : ("\nМожно использовать для перевозки грузов: "+canBeUsedForCargoTransportation+" кг"));
    }

    CarSale(String fioBuyer, LocalDate dateSold, double canBeUsedForCargoTransportation, boolean dispose)
    {
        super();
        this.fioBuyer = fioBuyer;
        this.dateSold = dateSold;
        this.canBeUsedForCargoTransportation = canBeUsedForCargoTransportation;
        this.dispose = dispose;
    }

    CarSale(LocalDate dateSold, double canBeUsedForCargoTransportation, boolean dispose)
    {
        super();
        this.dateSold = dateSold;
        this.canBeUsedForCargoTransportation = canBeUsedForCargoTransportation;
        this.dispose = dispose;
    }

    CarSale(LocalDate dateSold, double canBeUsedForCargoTransportation)
    {
        super();
        this.dateSold = dateSold;
        this.canBeUsedForCargoTransportation = canBeUsedForCargoTransportation;
    }

    CarSale()
    {
        super();
        Scanner sc = new Scanner(System.in, "cp1251");
        System.out.print("ФИО покупателя : ");
        this.setFioBuyer(sc.nextLine());
        System.out.print("\nМожно использовать для перевозки грузов (кг) : ");
        this.setCanBeUsedForCargoTransportation(sc.nextDouble());
        System.out.print("\nДата продажи авто в формате dd MM yyyy : ");
        this.setDateSold(sc.nextLine());
        sc.close();
    }

    public void disposeOf()
    {
        this.dispose = true;
        System.out.println("Машина отмечена как требующая утилизации");
    }

    public void getInformationAboutRecyclable()
    {
        if(dispose) System.out.println("Машина отправленна на утилизацию");
        else System.out.println("Машина не отправленна на утилизацию");
    }

    public void setDateSold(String dateSold)
    {
        if (dateSold.isEmpty())
            System.out.println("Недопустимое значение !");
        else this.dateSold =  LocalDate.parse(dateSold, DateTimeFormatter.ofPattern("dd MM yyyy"));
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

    public String getFioBuyer()
    {
        return fioBuyer;
    }

    public LocalDate getDateSold()
    {
        return dateSold;
    }

    public double getCanBeUsedForCargoTransportation() {
        return canBeUsedForCargoTransportation;
    }
}
