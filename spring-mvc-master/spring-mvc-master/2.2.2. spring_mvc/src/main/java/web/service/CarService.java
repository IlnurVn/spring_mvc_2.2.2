package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    public List<Car> carList() {
        List<Car> carList = new ArrayList<>();

        carList.add(new Car(1, "BMW", 300));
        carList.add(new Car(2, "Mercedes", 200));
        carList.add(new Car(3, "UAZ", 4101));
        carList.add(new Car(4, "Lada", 2108));
        carList.add(new Car(5, "Mazda ", 3));

        return carList;
    }
}
