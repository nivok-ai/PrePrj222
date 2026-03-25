package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.*;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> listOfCars = new ArrayList<>(List.of(new Car(123, "X8", "Black"),
            new Car(111, "Laddar", "Gray"),
            new Car(222, "Ferraro Rocher", "White"),
            new Car(2, "Bugagatti", "Blue"),
            new Car(65, "LD", "Purple")));

    @Override
    public List<Car> getQuantityOfCars(int carQuantity) {
        return listOfCars.stream().limit(carQuantity).collect(Collectors.toList());
    }
}
