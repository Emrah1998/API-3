package com.EGrestaurant.EGrestaurant.Service;

import com.EGrestaurant.EGrestaurant.Model.response.MusteriResponse;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.List;

@Service
public class MusteriService {
    public MusteriResponse getEGR(String chefName){
        System.out.println("Chef`s name:"+chefName);
        return MusteriResponse.builder()
                .openTime(LocalTime.of(7,00))
                .closeTime(LocalTime.of(23,00))
                .location("Nizami Kucesi")
                .menu(List.of("Soyuq Yemekler","Isti Yemekler","Desert","Ickiler"))
                .chefName("Danilo Zanna")
                .build();
    }
}
