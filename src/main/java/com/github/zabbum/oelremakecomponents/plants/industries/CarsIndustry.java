package com.github.zabbum.oelremakecomponents.plants.industries;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Random;

/**
 * Cars industry class
 */
@NoArgsConstructor
@AllArgsConstructor
public class CarsIndustry extends AbstractIndustry{

    /**
     * Constructor of a cars' industry.
     *
     * @param name name of the industry
     * @param plantId ID of a plant
     */
    public CarsIndustry(final String name, final Integer plantId) {
        super(name, plantId);
        this.maxProductPrice = 50000;
        this.maxProductAmountToBuy = 15;

        Random random = new Random();

        this.setPlantPrice(random.nextInt(55000) + 45000);
        this.setProductsAmount((this.getPlantPrice() / 10000) * 3 + 15);
    }
}
