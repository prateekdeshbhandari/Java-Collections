package com.xworkz.SmartWatch.Dto;

import lombok.*;

import java.time.LocalDateTime;
@Getter
@Setter

@NoArgsConstructor
@ToString
@EqualsAndHashCode

public class SmartWatchDto {
    @EqualsAndHashCode.Include

    private String brand;
    @EqualsAndHashCode.Include
    private String model;
    private String color;
    private double displaySize;
    private boolean hasGPS;
    private boolean hasHeartRateMonitor;
    private int batteryLifeDays;
    private double price;
    private String operatingSystem;
    private LocalDateTime releaseDate;

    public SmartWatchDto(String brand, String model, String color,
                         double displaySize, boolean hasGPS,
                         boolean hasHeartRateMonitor, int batteryLifeDays,
                         double price, String operatingSystem,
                         LocalDateTime releaseDate) {

        this.brand = brand;
        this.model = model;
        this.color = color;
        this.displaySize = displaySize;
        this.hasGPS = hasGPS;
        this.hasHeartRateMonitor = hasHeartRateMonitor;
        this.batteryLifeDays = batteryLifeDays;
        this.price = price;
        this.operatingSystem = operatingSystem;
        this.releaseDate = releaseDate;
    }
}