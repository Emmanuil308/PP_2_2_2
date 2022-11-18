package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.ServiceCars;

import java.util.Optional;


@Controller
@RequestMapping("/cars")
public class CarsController {

    private ServiceCars serviceCars;



    @Autowired
    public CarsController(ServiceCars serviceCars) {
        this.serviceCars = serviceCars;
    }

    @GetMapping()
    public String showCars(@RequestParam("count") Optional<Integer> countOptional, Model model) {

        if (countOptional.isPresent()) {
            model.addAttribute("carsList", serviceCars.getListCars(countOptional.get()));
        } else {
            model.addAttribute("carsList", serviceCars.getListCars(5));
        }
        return "cars";
    }


}
