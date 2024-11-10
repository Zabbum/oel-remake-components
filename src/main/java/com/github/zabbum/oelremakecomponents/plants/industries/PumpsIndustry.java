package com.github.zabbum.oelremakecomponents.plants.industries;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Random;

/**
 * Pumps industry class
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class PumpsIndustry extends AbstractIndustry {

    /**
     * Constructor of a pumps' industry.
     *
     * @param name name of the industry
     * @param plantId ID of a plant
     */
    public PumpsIndustry(final String name, final Integer plantId) {
        super(name, plantId);
        this.maxProductPrice = 50000;
        this.maxProductAmountToBuy = 15;

        Random random = new Random();

        this.setPlantPrice(random.nextInt(80000) + 36000);
        this.setProductsAmount((this.getPlantPrice() / 10000) * 7 + 25);
    }
}
