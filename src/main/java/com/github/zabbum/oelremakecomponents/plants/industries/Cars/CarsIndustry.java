package com.github.zabbum.oelremakecomponents.plants.industries.Cars;

import com.github.zabbum.oelremakecomponents.interfaces.BuyableIndustry;
import com.github.zabbum.oelremakecomponents.plants.industries.AbstractIndustry;

import java.util.Random;

public class CarsIndustry extends AbstractIndustry implements BuyableIndustry {

    /**
     * Max product price (this should be changed in every class extending AbstractIndustry).
     */
    public static final int maxProductPrice = 50000;

    /**
     * Constructor of a cars' industry.
     *
     * @param name name of the industry
     */
    public CarsIndustry(final String name) {
        super(name);

        Random random = new Random();

        this.setPlantPrice(random.nextInt(55000) + 45000);
        this.setProductsAmount((this.getPlantPrice() / 10000) * 3 + 15);
    }
}
