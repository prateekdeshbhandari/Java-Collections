package com.xwork.streamapi.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
@Setter
@Getter
@ToString
public class WarDTO implements Serializable {

    private String warName;
    private LocalDate startDate;
    private LocalDate endDate;
    private String location;
    private List<String> countriesInvolved;
    private int casualties;
    private String outcome;
    private int durationDays;
    private String commander;
    private String reason;



    public WarDTO(String warName, LocalDate startDate, LocalDate endDate,
                  String location, List<String> countriesInvolved,
                  int casualties, String outcome, int durationDays,
                  String commander, String reason) {

        this.warName = warName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.location = location;
        this.countriesInvolved = countriesInvolved;
        this.casualties = casualties;
        this.outcome = outcome;
        this.durationDays = durationDays;
        this.commander = commander;
        this.reason = reason;
    }

}
