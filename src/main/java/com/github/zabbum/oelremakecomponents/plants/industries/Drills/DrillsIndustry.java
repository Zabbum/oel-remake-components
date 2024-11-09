package com.github.zabbum.oelremakecomponents.plants.industries.Drills;

import com.github.zabbum.oelremakecomponents.interfaces.BuyableIndustry;
import com.github.zabbum.oelremakecomponents.plants.industries.AbstractIndustry;

import java.util.Random;

public class DrillsIndustry extends AbstractIndustry implements BuyableIndustry {

    /**
     * Max product price (this should be changed in every class extending AbstractIndustry).
     */
    public static final int maxProductPrice = 60000;

    /**
     * Constructor of a drills' industry.
     *
     * @param name name of the industry
     */
    public DrillsIndustry(final String name) {
        super(name);

        Random random = new Random();

        this.setPlantPrice(random.nextInt(50000) + 10000);
        this.setProductsAmount((this.getPlantPrice() / 10000) * 8 + 25);
    }
}
