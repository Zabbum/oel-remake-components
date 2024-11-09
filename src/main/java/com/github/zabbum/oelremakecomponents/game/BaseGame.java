package com.github.zabbum.oelremakecomponents.game;

import com.github.zabbum.oelremakecomponents.Player;
import com.github.zabbum.oelremakecomponents.plants.AbstractPlant;
import com.github.zabbum.oelremakecomponents.plants.industries.CarsIndustry;
import com.github.zabbum.oelremakecomponents.plants.industries.DrillsIndustry;
import com.github.zabbum.oelremakecomponents.plants.industries.PumpsIndustry;
import com.github.zabbum.oelremakecomponents.plants.oilfield.Oilfield;
import lombok.Data;

import java.util.List;

/**
 * Base Game class.
 */
@Data
public class BaseGame {
    /**
     * ID of the game
     */
    private String gameId;

    /**
     * GameStatus of the game
     */
    private GameStatus gameStatus;

    /**
     * Amount of rounds in the game
     */
    private Integer roundCount;

    /**
     * Amount of players in the game
     */
    private Integer playersAmount;

    /**
     * List with players
     */
    private List<Player> players;

    /**
     * List with Oilfields
     */
    private List<Oilfield> oilfields;

    /**
     * List with CarsIndustries
     */
    private List<CarsIndustry> carsIndustries;

    /**
     * List with DrillsIndustries
     */
    private List<DrillsIndustry> drillsIndustries;

    /**
     * List with PumpIndustries
     */
    private List<PumpsIndustry> pumpsIndustries;

    /**
     * List with oil prices
     */
    private List<Double> oilPrices;

    /**
     * ID of player that has turn now
     */
    private Integer currentPlayerTurn;

    /**
     * Get List with plants depending on what Class is provided
     * @param plantClass Class extending AbstractPlant that we want list made of
     * @return List of plants
     */
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

    /**
     * Increment the ID of player whose turn it is
     * @return ID of player whose turn it is now
     */
    public Integer endCurrentPlayerTurn() {
        if (currentPlayerTurn == null) {
            return null;
        }

        if (currentPlayerTurn == players.size() - 1) {
            currentPlayerTurn = 0;
            return 0;
        }

        return ++currentPlayerTurn;
    }
}
