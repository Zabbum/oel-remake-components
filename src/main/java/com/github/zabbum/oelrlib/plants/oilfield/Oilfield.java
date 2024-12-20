package com.github.zabbum.oelrlib.plants.oilfield;

import com.github.zabbum.oelrlib.plants.industries.AbstractIndustry;
import lombok.*;
import com.github.zabbum.oelrlib.plants.AbstractPlant;
import com.github.zabbum.oelrlib.plants.industries.CarsIndustry;
import com.github.zabbum.oelrlib.plants.industries.DrillsIndustry;
import com.github.zabbum.oelrlib.plants.industries.PumpsIndustry;

import java.util.Random;

/**
 * Oilfield plant class
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class Oilfield extends AbstractPlant {

    /**
     * Total oil amount in oilfield.
     */
    private int totalOilAmount;

    /**
     * Is oilfield able to pump oil.
     * false by default,
     * true if player has reached required depth.
     */
    private boolean isExploitable;

    /**
     * Required depth of digging to make oilfield exploitable.
     */
    private int requiredDepth;

    /**
     * Current digging depth.
     */
    private int currentDepth;

    /**
     * Amount of oil extracted in total.
     */
    private int oilExtracted;

    /**
     * Amount of oil available to sell.
     */
    private int oilAvailabletoSell;

    /**
     * Amount of cars in oilfield.
     * Cars are needed to sell oil.
     */
    private int carsAmount;

    /**
     * Amount of drills in oilfield.
     * Drills are needed to dril (bruh).
     */
    private int drillsAmount;

    /**
     * Amount of pumps in oilfield.
     * Pumps are needed to extract oil from oilfield.
     */
    private int pumpsAmount;

    /**
     * Should player be informed during summary that oilfield is ready to extract oil from it.
     */
    private Boolean shouldInfoPlayer;

    /**
     * Constructor of a Plant.
     *
     * @param name Name of a plant
     * @param plantId ID of a plant
     */
    public Oilfield(final String name, final Integer plantId) {
        super(name, plantId);

        Random random = new Random();

        this.plantPrice = random.nextInt(70000) + 29900;
        this.ownership = null;
        this.totalOilAmount = (this.plantPrice - random.nextInt(9999) + 1) * 10;
        this.isExploitable = false;
        this.requiredDepth = random.nextInt(3666) + 1;
        this.currentDepth = 0;
        this.oilExtracted = 0;
        this.oilAvailabletoSell = 0;
        this.carsAmount = 0;
        this.drillsAmount = 0;
        this.pumpsAmount = 0;
    }

    /**
     * Method to extract oil in the oilfield.
     * This is executed every round.
     */
    @Deprecated
    public void extractOil() {
        this.oilAvailabletoSell += 8000 * this.pumpsAmount;
        this.oilExtracted += 8000 * this.pumpsAmount;
    }

    /**
     * Method to sell oil from the oilfield.
     *
     * @param oilAmount amount of oil to sell
     */
    @Deprecated
    public void sellOil(final int oilAmount) {
        this.oilAvailabletoSell -= oilAmount;
    }

    /**
     * Dig in the oilfield.
     * This is executed every round.
     */
    @Deprecated
    public void dig() {
        Random random = new Random();

        this.drillsAmount -= 500;
        this.currentDepth += 500 - (random.nextInt(30) + 1);
    }

    /**
     * Increase product amount based on industry type.
     *
     * @param industryType   type of an industry
     * @param productsAmount amount of prodduct produced by the industry
     */
    public void addProductAmount(
            final Class<? extends AbstractIndustry> industryType, final int productsAmount) {
        if (industryType.equals(CarsIndustry.class)) {
            this.carsAmount += productsAmount;
        } else if (industryType.equals(DrillsIndustry.class)) {
            this.drillsAmount += 500 * productsAmount;
        } else if (industryType.equals(PumpsIndustry.class)) {
            this.pumpsAmount += productsAmount;
        }
    }
}
