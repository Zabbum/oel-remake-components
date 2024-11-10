package com.github.zabbum.oelremakecomponents.plants.industries;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Random;

/**
 * Drills industry class
 */
@NoArgsConstructor
@AllArgsConstructor
public class DrillsIndustry extends AbstractIndustry {

    /**
     * Constructor of a drills' industry.
     *
     * @param name name of the industry
     * @param plantId ID of a plant
     */
    public DrillsIndustry(final String name, final Integer plantId) {
        super(name, plantId);
        this.maxProductPrice = 60000;
        this.maxProductAmountToBuy = 10;

        Random random = new Random();

        this.setPlantPrice(random.nextInt(50000) + 10000);
        this.setProductsAmount((this.getPlantPrice() / 10000) * 8 + 25);
    }
}
