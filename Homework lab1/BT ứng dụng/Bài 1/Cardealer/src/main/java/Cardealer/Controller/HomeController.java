package Cardealer.Controller;

import Cardealer.Model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/car")
    public String getCar(Model model){
        Car[] cars= {new Car("BMW 2021","bmw",2000,"bmw.jpg") ,
                new Car("FERARI 2020","FERARI",3000,"ferari.jpg"),
                new Car("LAMBOGINI 2021","Lambogini",2500,"lambo.jpg"),
                new Car("HONDA 2019","HONDA",1500,"hondacivic.jpg"),
                new Car("HURACAN 2021","HURACAN",2100,"huracan.jpg")
        };
        model.addAttribute("cars",cars);
        return "car";
    }

}