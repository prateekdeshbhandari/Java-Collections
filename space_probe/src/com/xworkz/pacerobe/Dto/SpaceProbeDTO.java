package com.xworkz.pacerobe.Dto;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Comparator;

@Setter
@Getter
@AllArgsConstructor

@ToString

public class SpaceProbeDTO implements Serializable,Comparable<SpaceProbeDTO> {

    private int probeId;
    private String missionName;
    private String targetCelestialBody;
    private String manufacturer;
    private double launchMass;
    private LocalDateTime launchDate;
    private LocalDateTime arrivalDate;
    private String propulsionType;
    private double powerOutput;
    private String communicationFrequency;
    private double distanceFromEarth;
    private double orbitalVelocity;
    private String primaryInstrument;
    private String secondaryInstrument;
    private int missionDurationDays;
    private boolean isActive;
    private String status;
    private double fuelRemaining;
    private String trajectoryPath;

    @Override
    public int compareTo(SpaceProbeDTO o) {
        SpaceProbeDTO left=this;
        SpaceProbeDTO right=o;
        if(left.probeId==right.probeId)return 0;
     else if (left.probeId >right.probeId) return 100;
            else return -100;

    }
}

