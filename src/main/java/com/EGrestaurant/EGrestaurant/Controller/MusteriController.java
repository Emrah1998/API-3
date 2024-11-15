package com.EGrestaurant.EGrestaurant.Controller;

import com.EGrestaurant.EGrestaurant.Model.response.MusteriResponse;
import com.EGrestaurant.EGrestaurant.Service.MusteriService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/EGrestaurant")
public class MusteriController {
    private final MusteriService musteriService;

    @GetMapping("/{chefName}")
    public MusteriResponse getEGR(@PathVariable String chefName){
        return musteriService.getEGR(chefName);
    }
}
