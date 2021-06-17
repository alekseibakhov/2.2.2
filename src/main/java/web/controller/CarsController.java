package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarsController {
    @Autowired
    private CarService serviceCar;

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, @RequestParam(value = "cars", required = false) Integer count) {
        List<Car> cars;
        if (count == null) {
            count = 5;
        }
        if (count <= 0 || count >= 5) {
            cars = serviceCar.getCars(5);
        } else {
            cars = serviceCar.getCars(count);
        }
        model.addAttribute("carrs", cars);
        return "car";
    }

}
