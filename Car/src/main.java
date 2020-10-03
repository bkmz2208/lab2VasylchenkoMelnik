import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // public Car(long id, String company, String model, int Year, String color, int price, String registerNumber)
        Car car1 = new Car(1, "Mercedes", "S200", 2010, "silver", 50000, "AA2043AA");
        Car car2 = new Car(2, "Audi", "A6", 2012, "black", 124000, "AA9754BA");
        Car car3 = new Car(3, "BMW", "X5", 2012, "green", 95000, "AA6446AA");
        Car car4 = new Car(4, "BMW", "X6", 2017, "red", 99000, "AA6444AA");

        List<Car> cars = List.of(car1, car2, car3, car4);

        System.out.println("Список Машин марки Mercedes:");
        List<Car> result1 = CarMethods.sortByCompany(cars, "Mercedes");
        System.out.println(result1);

        System.out.println("Список Машин марки BMW старше 4-х лет:");
        List<Car> result2 = CarMethods.sortByCompanyAndYear(cars, "BMW", 4, 2020);
        System.out.println(result2);

        System.out.println("Список Машин 2012 года, дороже 100000:");
        List<Car> result3 = CarMethods.sortByYearAndPrice(cars, 100000, 2012);
        System.out.println(result3);
    }
}