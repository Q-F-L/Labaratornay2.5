/*
* Дочерний класс Авто - Спортивные машины
*/
class SportCar extends Auto implements CargoTransportation, Recyclable{
    private double secondsToSpeedUp; // Секунды до набора скорости
    private double engineCapacity; // Объем двигателя
    private double power; // Мощность
    private double canBeUsedForCargoTransportation; // Можно использовать для перевозки грузов
    private boolean dispose = false; // Утилизация

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
            "Мощность: " + getPower()+((canBeUsedForCargoTransportation < 1) ? ("\nНельзя использовать для перевозки грузов")
            : ("\nМожно использовать для перевозки грузов: "+canBeUsedForCargoTransportation+" кг"));
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
        if(secondsToSpeedUp > -1) System.out.println("Недопустимое значение !");
        else this.secondsToSpeedUp = secondsToSpeedUp;
    }

    public void setEngineCapacity(double engineCapacity)
    {
        if(engineCapacity > -1) System.out.println("Недопустимое значение !");
        else this.engineCapacity = engineCapacity;
    }

    public void setPower(double power)
    {
        if(power > -1) System.out.println("Недопустимое значение !");
        else this.power = power;
    }

    public double setEngineCapacity()
    {
        return engineCapacity;
    }

    public double setPower()
    {
        return power;
    }

    /*
     * Геттеры для указанных переменных
     */
    public double getCanBeUsedForCargoTransportation() {
        return canBeUsedForCargoTransportation;
    }
     
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
