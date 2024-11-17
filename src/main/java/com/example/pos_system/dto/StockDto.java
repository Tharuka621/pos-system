package com.example.pos_system.dto;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StockDto {

    private Long id;

    private String name;

    private Long itemId;

    private Integer qty;
    
}
