package com.github.zabbum.oelremakecomponents.plants.industries;

import com.github.zabbum.oelremakecomponents.interfaces.BuyableIndustry;

import java.util.Random;

public class CarsIndustry extends AbstractIndustry implements BuyableIndustry {

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
