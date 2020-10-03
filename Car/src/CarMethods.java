import java.util.ArrayList;
import java.util.List;

public class CarMethods {
    public static List<Car> sortByCompany(List<Car> ListOfCars, String company) {
        ArrayList<Car> newListCars = new ArrayList<Car>();
        for (Car car : ListOfCars) {
            if (car.getCompany() == company) {
                newListCars.add(car);
            }
        }
        return newListCars;
    }

    public static List<Car> sortByCompanyAndYear(List<Car> ListOfCars, String company, int countOfYear, int currentYear) {
        ArrayList<Car> newListCars = new ArrayList<Car>();
        for (Car car : ListOfCars) {
            if (car.getCompany() == company && countOfYear < (currentYear - car.getYear())) {
                newListCars.add(car);
            }
        }
        return newListCars;
    }

    public static List<Car> sortByYearAndPrice(List<Car> ListOfCars, int price, int year) {
        ArrayList<Car> newListCars = new ArrayList<Car>();
        for (Car car : ListOfCars) {
            if (car.getYear() == year && price < car.getPrice()) {
                newListCars.add(car);
            }
        }
        return newListCars;
    }
}
