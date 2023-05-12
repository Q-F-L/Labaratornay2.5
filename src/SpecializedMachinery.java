/*
* Дочерний класс Авто - Спецтехника
*/
class SpecializedMachinery extends Auto implements CargoTransportation {
    private String focus; //(строительная, грузовая, дорожная и т.д.),
    private double weight; // масса
    private double overallDimensions; // габаритные размеры
    private double canBeUsedForCargoTransportation; //Можно использовать для перевозки грузов

    /*
     * Конструктор при отсутствии параметров
     */
    SpecializedMachinery()
    {
        super();
        int a = sc.nextInt();
        System.out.print("Специализация авто(строительная, грузовая, дорожная и т.д.): ");
        this.setFocus(sc.nextLine());
        System.out.print("\nМасса (кг): ");
        this.setWeight(sc.nextDouble());
        System.out.print("\nГабаритные размеры): ");
        this.setOverallDimensions(sc.nextDouble());
        System.out.print("\nМожно использовать для перевозки грузов: ");
        this.setCanBeUsedForCargoTransportation(sc.nextDouble());
    }

    /*
     * Конструктор при отсутсвии даты продажи
     */
    SpecializedMachinery(double overallDimensions, double weight, String focus, String mark,
        String dateCreated, double price, String equipment,
        String country, String fioBuyer, double canBeUsedForCargoTransportation)
    {
        super(mark, dateCreated, price, equipment, country, fioBuyer, price);
        this.focus = focus;
        this.weight = weight;
        this.overallDimensions = overallDimensions;
        this.canBeUsedForCargoTransportation = canBeUsedForCargoTransportation;
    }

    /*
     * Конструктор при наличии всех параметров
     */
    SpecializedMachinery(double overallDimensions, double weight, String focus, String mark,
        String dateCreated, String dateSold, double price, String equipment,
        String country, String fioBuyer, double canBeUsedForCargoTransportation)
    {
        super(mark, dateCreated, dateSold, price, equipment, country, fioBuyer, price);
        this.focus = focus;
        this.weight = weight;
        this.overallDimensions = overallDimensions;
        this.canBeUsedForCargoTransportation = canBeUsedForCargoTransportation;
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
        System.out.println("Масса (кг): "+weight);
        System.out.println("Габаритные размеры): "+overallDimensions);
        System.out.println("Специализация авто(строительная, грузовая, дорожная и т.д.): "+focus);
    }

    /*
     * Вывод строкой всей информации класса
     */
    public String toString(){
        return "Специализация авто(строительная, грузовая, дорожная и т.д.): "+focus+"\nМасса (кг): "+weight+
                "\nГабаритные размеры: "+overallDimensions+
                ((canBeUsedForCargoTransportation < 1) ? ("\nНельзя использовать для перевозки грузов")
                : ("\nМожно использовать для перевозки грузов: "+canBeUsedForCargoTransportation+" кг"));
    }

    /*
     * Сеттеры для указанных переменных
     */
    public void setFocus(String focus) {
        if (focus.isEmpty())
            System.out.println("Недопустимое значение !");
        else this.focus = focus;
    }

    public void setOverallDimensions(double overallDimensions) {
        if (overallDimensions < 1)
            System.out.println("Недопустимое значение !");
        else this.overallDimensions = overallDimensions;
    }

    public void setWeight(double weight) {
        if (weight < 1)
            System.out.println("Недопустимое значение !");
        else this.weight = weight;
    }

    /*
     * Геттеры для указанных переменных
     */
    public String getFocus() {
        return focus;
    }

    public double getOverallDimensions() {
        return overallDimensions;
    }

    public double getWeight(double weight) {
        return weight;
    }
}