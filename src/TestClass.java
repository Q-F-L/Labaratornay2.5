/*
 * Класс для тестирования
 */
public class TestClass {

    /*
     * Первый тест для проверки общих методов для дочерних классов
     */
    public void firstTest()
    {
        Auto[] auto = {new UsedCar("21","12",1.0,"12","21 06 2002","",100.0,"1ds","1dsa",""),
            new UsedCar("21","12",1.0,"12","21 06 2002","",100.0,"1ds","1dsa",""),
            new UsedCar("21","12",1.0,"12","21 06 2002","",100.0,"1ds","1dsa",""),
            new SportCar(),
            new CarSale(),
            new CarSale(),
            new SpecializedMachinery()};

        for (Auto car : auto) {
            System.out.println("\nВывод метода toString:");
            System.out.println(car.toString());
            System.out.println("\nВызов метода getDetailedInformatoin:");
            car.getDetailedInformatoin();
            System.out.println("\nВывод геттеров:");
            System.out.println(car.getFioBuyer());
            System.out.println(car.getCanBeUsedForCargoTransportation());
            System.out.println(car.getCountry());
            System.out.println(car.getFioBuyer());
            System.out.println(car.getMark());
            System.out.println(car.getEquipment());
            System.out.println(car.getPrice());
            System.out.println(car.getDateCreated());
            System.out.println(car.getDateSold());
        }

        System.out.println(auto);
    }

    /*
     * Второй тест для проверки общих методов из интерфейса CargoTransportation
     */
    public void secondTest()
    {
        Auto[] auto = {new UsedCar("21","12",1.0,"12","21 06 2002","",100.0,"1ds","1dsa",""),
            new UsedCar("21","12",1.0,"12","21 06 2002","",100.0,"1ds","1dsa",""),
            new UsedCar("21","12",1.0,"12","21 06 2002","",100.0,"1ds","1dsa",""),
            new SportCar(),
            new CarSale()};

        for (Auto car : auto) {
            car.setCanBeUsedForCargoTransportation(20);
            System.out.println(car.getCanBeUsedForCargoTransportation());
        }
    }
}
