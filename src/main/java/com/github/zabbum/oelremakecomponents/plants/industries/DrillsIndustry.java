package com.github.zabbum.oelremakecomponents.plants.industries;

import java.util.Random;

/**
 * Drills industry class
 */
public class DrillsIndustry extends AbstractIndustry {

    /**
     * Constructor of a drills' industry.
     *
     * @param name name of the industry
     */
    public DrillsIndustry(final String name) {
        super(name);
        this.maxProductPrice = 60000;

        Random random = new Random();

        this.setPlantPrice(random.nextInt(50000) + 10000);
        this.setProductsAmount((this.getPlantPrice() / 10000) * 8 + 25);
    }
}
