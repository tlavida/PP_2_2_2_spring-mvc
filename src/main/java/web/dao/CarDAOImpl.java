package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO {
    private static int CAR_COUNT;
    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car(++CAR_COUNT, "model1", 10));
        cars.add(new Car(++CAR_COUNT, "model2", 20));
        cars.add(new Car(++CAR_COUNT, "model3", 30));
        cars.add(new Car(++CAR_COUNT, "model4", 40));
        cars.add(new Car(++CAR_COUNT, "model5", 50));
    }

    @Override
    public List<Car> getCar(int count) {
        return cars.stream().limit(count).toList();
    }
}
