package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.model.Car;
import web.service.CarService;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarsController {

    @Autowired
    private CarService carService;


    @GetMapping("/cars")
    public String showCars(@RequestParam(value = "count", required = false) String count, Model model) {
        List<Car> cars = carService.carList();
        if (count != null) {
            List<Car> newCars = cars.stream().limit(Long.parseLong(count)).collect(Collectors.toList());
            model.addAttribute("cars", newCars);
        } else {
            model.addAttribute("cars", cars);
        }
        return "cars/carList";
    }
}





