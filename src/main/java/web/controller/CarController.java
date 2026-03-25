package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
@RequestMapping("/cars")
public class CarController {

    private CarServiceImpl carService;

    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping()
    public String listOfCars(@RequestParam(value = "count", defaultValue = "5") int carQuantity, Model model) {
        model.addAttribute("cars", carService.getQuantityOfCars(carQuantity));
        return "cars";
    }


}
