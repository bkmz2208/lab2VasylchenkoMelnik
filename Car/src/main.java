import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[]args) {
        // public Car(long id, String company, String model, int Year, String color, int price, String registerNumber)
        Car car1 = new Car(1, "Mercedes", "S200", 2010, "silver", 50000, "AA2043AA");
        Car car2 = new Car(2, "Audi", "A6", 2012, "black", 124000, "AA9754BA");
        Car car3 = new Car(3, "BMW", "X5", 2014, "green", 95000, "AA6446AA");
//     Car car4 = new Car(14, "Toyota", 1991, "blue", 124, 11, "kuzov11", 10);

        List<Car> cars = Arrays.asList(car1, car2, car3);

//    CarList carCar = new CarList();
        System.out.println("Список Машин марки Mercedes:");
        List<Car> resultList1 = CarMethods.sortByCompany(cars, "Mercedes");
        System.out.println(resultList1.toString());
        // for(Car a: resultList1)
        //     System.out.println(a.toString());
    }
}