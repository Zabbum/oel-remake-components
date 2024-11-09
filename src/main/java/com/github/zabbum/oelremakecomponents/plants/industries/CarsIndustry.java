package com.github.zabbum.oelremakecomponents.plants.industries;

import java.util.Random;

/**
 * Cars industry class
 */
public class CarsIndustry extends AbstractIndustry{

    /**
     * Constructor of a cars' industry.
     *
     * @param name name of the industry
     */
    public CarsIndustry(final String name) {
        super(name);
        this.maxProductPrice = 50000;

        Random random = new Random();

        this.setPlantPrice(random.nextInt(55000) + 45000);
        this.setProductsAmount((this.getPlantPrice() / 10000) * 3 + 15);
    }
}
