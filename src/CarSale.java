import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
 * Продажа автомобиля
 */
public class CarSale extends Auto implements CargoTransportation, Recyclable  {
    private String fioBuyer; // ФИО покупателя
    private LocalDate dateSold; // Дата продажи
    private double canBeUsedForCargoTransportation; // Можно использовать для перевозки грузов
    private boolean dispose = false; // Утилизация 

    /*
     * Конструкторы
     */
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
        this.fioBuyer = super.getFioBuyer();
        System.out.print("\nМожно использовать для перевозки грузов (кг) : ");
        this.setCanBeUsedForCargoTransportation(sc.nextDouble());
        System.out.print("\nДата продажи авто в формате dd MM yyyy : ");
        this.setDateSold(sc.nextLine());
    }

    /*
     * Метод для вывода детальной информации по машине
     */
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

    /*
     * Вывод строкой всей информации класса
     */
    public String toString(){
        return "ФИО покупателя: "+((fioBuyer.isEmpty()) ? "Не проданно" : fioBuyer) +
                "\nДата продажи: "+((dateSold == null) ? "Не проданно" : dateSold) +
                ((canBeUsedForCargoTransportation < 1) ? ("\nНельзя использовать для перевозки грузов")
                : ("\nМожно использовать для перевозки грузов: "+canBeUsedForCargoTransportation+" кг"));
    }

    /*
     * Методы для утилизации
     */
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

    /*
     * Сеттеры для указанных переменных
     */
    
    /*
     * Геттеры для указанных переменных
     */

    public double getCanBeUsedForCargoTransportation() {
        return canBeUsedForCargoTransportation;
    }
}
