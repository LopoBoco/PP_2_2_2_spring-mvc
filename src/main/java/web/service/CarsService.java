package web.service;

import web.model.Cars;

import java.util.ArrayList;
import java.util.List;

public class CarsService {
    public static List<Cars> getCarsList(int count) {
        List<Cars> cars = new ArrayList<>();
        cars.add(new Cars(1, "BMW", "black"));
        cars.add(new Cars(2, "Audi", "white"));
        cars.add(new Cars(3, "Lexus", "yellow"));
        cars.add(new Cars(4, "Infiniti", "blue"));
        cars.add(new Cars(5, "Acura", "red"));

        return cars.stream().limit(count).toList();
    }
}
