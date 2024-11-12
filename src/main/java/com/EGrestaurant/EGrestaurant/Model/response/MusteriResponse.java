package com.EGrestaurant.EGrestaurant.Model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MusteriResponse {
    private LocalTime openTime;
    private LocalTime closeTime;
    private String location;
    private List<String> menu;
    private String chefName;
}
