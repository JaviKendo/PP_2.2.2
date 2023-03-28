package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", "X6", 3));
        cars.add(new Car("Toyota", "RAV4", 5));
        cars.add(new Car("Porsche", "911", 8));
        cars.add(new Car("Lamborghini", "Urus", 1));
        cars.add(new Car("Ferrari", "F430", 1));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getCarsCount(int count) {
        if (count >= 5) {
            return getAllCars();
        }

        return getAllCars().subList(0, count);
    }
}
