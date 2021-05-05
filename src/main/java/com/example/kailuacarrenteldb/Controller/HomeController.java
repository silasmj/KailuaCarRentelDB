package com.example.kailuacarrenteldb.Controller;

import com.example.kailuacarrenteldb.Model.Car;
import com.example.kailuacarrenteldb.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    CarService carService;

    @GetMapping("/")
    public String index(Model model) {
        return "home/index";
    }

    @GetMapping("/luxury")
    public String luxury(Model model) {
        List<Car> carList = carService.showLuxury();
        model.addAttribute("luxury", carList);
        return "home/luxury";
    }

}
