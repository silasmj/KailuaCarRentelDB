package com.example.kailuacarrenteldb.Controller;

import com.example.kailuacarrenteldb.Model.Car;
import com.example.kailuacarrenteldb.Model.Customer;
import com.example.kailuacarrenteldb.Model.Rental;
import com.example.kailuacarrenteldb.Service.CarService;
import com.example.kailuacarrenteldb.Service.CustomerService;
import com.example.kailuacarrenteldb.Service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    CarService carService;
    RentalService rentalService;
    CustomerService customerService;

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
    @PostMapping("/succesCreateRental")
    public String succesCreateRental(@ModelAttribute Rental rental, Model model) {
        rentalService.addRental(rental);
        model.addAttribute("Rental", rental);
        return "home/succesCreateRental";
    }

    @GetMapping("/rental")
    public String rental(Model model){
        List<Rental> rentalList = rentalService.showRental();
        model.addAttribute("rental", rentalList);
        return "home/rental";
    }
    
    @GetMapping("/customers/private")
    public String customerPrivate(Model model){
        List<Customer> customerList = customerService.showCustomers();
        model.addAttribute("customer", customerList);
        return "home/customer/private";
    }
    
    @GetMapping("/sport")
    public String sport(Model model) {
        List<Car> carList = carService.showSport();
        model.addAttribute("sport", carList);
        return "home/sport";
    }
    @GetMapping("/family")
    public String family(Model model) {
        List<Car> carList = carService.showFamily();
        model.addAttribute("family", carList);
        return "home/family";
    }
}
