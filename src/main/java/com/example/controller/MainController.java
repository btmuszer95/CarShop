package com.example.controller;

import com.example.Dtos.CarDto;
import com.example.Dtos.OwnerDto;
import com.example.repository.CarRepository;
import com.example.repository.OwnerRepository;
import com.example.services.CarService;
import com.example.services.OwnerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

/**
 * Created by Bartixon on 2017-05-04.
 */

@Controller
public class MainController {

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private CarService carService;

    @Autowired
    private OwnerService ownerService;

    @Autowired
    private OwnerRepository ownerRepository;





    private final Logger log = LoggerFactory.getLogger(MainController.class);




    @RequestMapping("index")
    public ModelAndView index (ModelMap modelMap) {
        return new ModelAndView("index" , modelMap);
    }


    @RequestMapping("/carList")
    public ModelAndView carList (ModelMap modelMap) {
        modelMap.addAttribute("cars" , carService.showAvailableCars());
        return new ModelAndView("carList" , modelMap);
    }


    @GetMapping("/sellCar")
    public ModelAndView sellCarView (ModelMap modelMap) {
        modelMap.addAttribute("carDto" , new CarDto());
        modelMap.addAttribute("ownerId" , modelMap.get("ownerId"));
        return new ModelAndView("sellCar" , modelMap);
    }



    @PostMapping("/sellCar")
    public ModelAndView submit (@Valid @ModelAttribute(name = "carDto") CarDto carDto , BindingResult bindingResult , ModelMap modelMap) {
        if(bindingResult.hasErrors()) {
            modelMap.addAttribute(carDto);
            return new ModelAndView("sellCar" , modelMap);
        }
        else {
            carService.save(carDto);
            return new ModelAndView("placedOffer");
        }
    }


    @GetMapping("/details/{id}")
    public ModelAndView seeDetails(@PathVariable("id") Integer id, ModelMap modelMap) {
        modelMap.addAttribute("cars" , carService.viewThisCar(id));
        return new ModelAndView("carDetails", modelMap);
    }


    @GetMapping("/{id}")
    public ModelAndView sold (@PathVariable("id") Integer id , ModelMap modelMap) {
        carService.setAsSold(id);
        modelMap.addAttribute("cars" , carService.showSoldCars());
        return new ModelAndView("boughtCarMessage");
    }

    @GetMapping("/soldCars")
    public ModelAndView soldCars(ModelMap modelMap) {
        modelMap.addAttribute("cars" , carService.showSoldCars());
        return new ModelAndView("soldCars" , modelMap);
    }


    @GetMapping("/setOwner")
    public ModelAndView setOwner(ModelMap modelMap) {
        modelMap.addAttribute("ownerDto" , new OwnerDto());
        return new ModelAndView("ownerForm" , modelMap);
    }

    @PostMapping("/setOwner")
    public String submit (@ModelAttribute(name = "ownerDto") OwnerDto ownerDto , RedirectAttributes redirectAttributes) {
        Integer save = ownerService.save(ownerDto);
        redirectAttributes.addFlashAttribute("ownerId" , save);
        return "redirect:/sellCar";
    }



}
