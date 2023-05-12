/*
* Дочерний класс Авто - Спортивные машины
*/

import java.util.Scanner;

class SportCar extends Auto implements CargoTransportation, Recyclable{
    private double secondsToSpeedUp; // Секунды до набора скорости
    private double engineCapacity; // Объем двигателя
    private double power; // Мощность
    private boolean dispose = false; // Утилизация

    SportCar()
    {
        super();
        System.out.print("Секунды до набора скорости : ");
        this.setSecondsToSpeedUp(sc.nextDouble());
        System.out.print("\nОбъем двигателя : ");
        this.setEngineCapacity(sc.nextDouble());
        System.out.print("\nМощность : ");
        this.setPower(sc.nextDouble());
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
        System.out.println("Секунды до набора скорости: " + getSecondsToSpeedUp());
        System.out.println("Объем двигателя: " + getEngineCapacity());
        System.out.println("Мощность: " + getPower());
    }

    /*
     * Вывод строкой всей информации класса
     */
    public String toString()
    {
        return "Секунды до набора скорости: " + getSecondsToSpeedUp()+"Объем двигателя: " + getEngineCapacity()+
            "Мощность: " + getPower()+((getCanBeUsedForCargoTransportation() < 1) ? ("\nНельзя использовать для перевозки грузов")
            : ("\nМожно использовать для перевозки грузов: "+getCanBeUsedForCargoTransportation()+" кг"));
    }

    public void disposeOf()
    {
        this.dispose = true;
        System.out.println("Машина отмечена как требующая утилизации");
    }

    /*
     * Сеттеры для указанных переменных
     */
    public void setSecondsToSpeedUp(double secondsToSpeedUp)
    {
        if(secondsToSpeedUp > -1) this.secondsToSpeedUp = secondsToSpeedUp;
        else System.out.println("Недопустимое значение !");
    }

    public void setPower(double power)
    {
        if(power > -1) this.power = power;
        else System.out.println("Недопустимое значение !");
    }

    public void setEngineCapacity(double engineCapacity)
    {
        if(engineCapacity > -1) this.engineCapacity = engineCapacity;
        else System.out.println("Недопустимое значение !");
    }

    /*
     * Геттеры для указанных переменных
     */
    public double getSecondsToSpeedUp()
    {
        return secondsToSpeedUp;
    }

    public void getInformationAboutRecyclable()
    {
        if(dispose) System.out.println("Машина отправленна на утилизацию");
        else System.out.println("Машина не отправленна на утилизацию");
    }

    public double getEngineCapacity()
    {
        return engineCapacity;
    }

    public double getPower()
    {
        return power;
    }
}
