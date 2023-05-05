import java.time.*;

public class App {
    public static void main(String[] args) throws Exception {
        UsedCar car = new UsedCar("21","12",1.0,"12",LocalDate.now(),LocalDate.now(),100.0,"1ds","1dsa","1dsa");
        car.getDetailedInformatoin();
    }
}
