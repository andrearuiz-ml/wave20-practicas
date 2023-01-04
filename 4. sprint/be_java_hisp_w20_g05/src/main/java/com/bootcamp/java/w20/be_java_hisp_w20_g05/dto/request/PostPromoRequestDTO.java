package com.bootcamp.java.w20.be_java_hisp_w20_g05.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostPromoRequestDTO {
    private int user_id;
    @JsonFormat(pattern = "dd-MM-yyyy", shape = JsonFormat.Shape.STRING)
    private LocalDate date;
    private ProductRequestDTO product;
    private int category;
    private double price;
    private boolean has_promo;
    private double discount;

}