import java.util.Scanner;

/*
* Дочерний класс Авто - Поддержанные машины
*/
class UsedCar extends Auto implements CargoTransportation, Recyclable {
    private String degreeOfPreservation; // Степень сохраности
    private String fioOwner; // ФИО владельца
    private double mileage; // Пробег
    private boolean Dispose = false; // Утилизация 

    UsedCar(String degreeOfPreservation, String fioOwner, double mileage, String mark,
    String dateCreated, String dateSold, double price, String equipment,
    String country, String fioBuyer)
    {
        super(mark, dateCreated, dateSold, price, equipment, country, fioBuyer, price);
        this.mileage = mileage;
        this.fioOwner = fioOwner;
        this.degreeOfPreservation = degreeOfPreservation;
    }

    UsedCar(String degreeOfPreservation, String fioOwner, double mileage, String mark,
    String dateCreated, double price, String equipment,
    String country)
    {
        super(mark, dateCreated, price, equipment, country, price);
        this.mileage = mileage;
        this.fioOwner = fioOwner;
        this.degreeOfPreservation = degreeOfPreservation;
    }

    UsedCar()
    {
        super();
        System.out.print("Степень сохраности : ");
        this.setDegreeOfPreservation(sc.nextLine());
        System.out.print("ФИО владельца : ");
        this.setFioOwner(sc.nextLine());
        System.out.print("Пробег : ");
        this.setMileage(sc.nextDouble());
        System.out.print("Может использоваться для перевозки грузов (кг) : ");
        this.setCanBeUsedForCargoTransportation(sc.nextDouble());
    }

    public void getDetailedInformatoin(){
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
        System.out.println("Может использоваться для перевозки грузов (кг): " + getCanBeUsedForCargoTransportation());
    }

    public String toString(){
        return "Степень сохраности: "+getDegreeOfPreservation()+"\nФИО владельца: "+fioOwner+
                "\nПробег: "+mileage+
                ((getCanBeUsedForCargoTransportation() < 1) ? ("\nНельзя использовать для перевозки грузов")
                : ("\nМожно использовать для перевозки грузов: "+getCanBeUsedForCargoTransportation()+" кг\n"));
    }

    // Утилизация

    public void disposeOf()
    {
        this.Dispose = true;
        System.out.println("Машина отмечена как требующая утилизации");
    }

    public void getInformationAboutRecyclable()
    {
        if(Dispose) System.out.println("Машина отправленна на утилизацию");
        else System.out.println("Машина не отправленна на утилизацию");
    }

    /*
     * Сеттеры для указанных переменных
     */
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

    /*
     * Геттеры для указанных переменных
     */
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