package com.github.zabbum.oelremakecomponents.game;

import com.github.zabbum.oelremakecomponents.Player;
import com.github.zabbum.oelremakecomponents.plants.AbstractPlant;
import com.github.zabbum.oelremakecomponents.plants.industries.CarsIndustry;
import com.github.zabbum.oelremakecomponents.plants.industries.DrillsIndustry;
import com.github.zabbum.oelremakecomponents.plants.industries.PumpsIndustry;
import com.github.zabbum.oelremakecomponents.plants.oilfield.Oilfield;
import lombok.Data;

import java.util.List;

@Data
public class BaseGame {
    private String gameId;
    private GameStatus gameStatus;
    private Integer roundCount;
    private Integer playersAmount;

    private List<Player> players;

    private List<Oilfield> oilfields;
    private List<CarsIndustry> carsIndustries;
    private List<DrillsIndustry> drillsIndustries;
    private List<PumpsIndustry> pumpsIndustries;

    private Double[] oilPrices;
    public List<? extends AbstractPlant> getPlantsList(Class<? extends AbstractPlant> plantClass) {
        switch (plantClass.getSimpleName()) {
            case "Oilfield" -> {
                return oilfields;
            }
            case "CarsIndustry" -> {
                return carsIndustries;
            }
            case "DrillsIndustry" -> {
                return drillsIndustries;
            }
            case "PumpsIndustry" -> {
                return pumpsIndustries;
            }
            default -> {
                return null;
            }
        }
    }
}
