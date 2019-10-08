package com.sputnik.foodadvisor.controller;

import com.sputnik.foodadvisor.service.PlacesService;
import com.sputnik.foodadvisor.service.UsersService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@AllArgsConstructor
@Slf4j
@RequestMapping("/")
public class MainController {

  private final PlacesService placesService;
  private final UsersService usersService;

  @GetMapping("")
  public ModelAndView getAllPlaces() {
    ModelAndView res = new ModelAndView();
    res.setViewName("index");
    res.addObject("places", placesService.getAll());

    return res;
  }
}
