public class App {
    public static void main(String[] args) throws Exception {
        TestClass test = new TestClass();

        Auto[] auto = {new UsedCar("21","12",1.0,"12","21 06 2002",100.0,"1ds","1dsa"),
            new SportCar(),
            new CarSale(),
            new SpecializedMachinery()};

        Auto[] auto1 = {new UsedCar("21","12",1.0,"12","21 06 2002",100.0,"1ds","1dsa"),
            new SportCar(),
            new CarSale()};

        test.firstTest(auto);
        test.secondTest(auto1);
    }
}
