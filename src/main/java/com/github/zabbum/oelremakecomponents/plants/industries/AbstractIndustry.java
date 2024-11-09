package com.github.zabbum.oelremakecomponents.plants.industries;

import com.github.zabbum.oelremakecomponents.plants.AbstractPlant;
import lombok.Getter;
import lombok.Setter;

/**
 * Abstract industry class (AbstractPlant with extra steps)
 */
@Getter
@Setter
// and make AbstractIndustry and Oilfield extend that class
public abstract class AbstractIndustry extends AbstractPlant {

    /**
     * Max product price (this should be changed in every class extending AbstractIndustry).
     */
    protected int maxProductPrice;

    /**
     * Products amount in industry
     */
    protected int productsAmount;

    /**
     * Price of products
     */
    protected double productPrice;

    /**
     * Constructor of an industry.
     *
     * @param name Name of a plant
     * @param plantId ID of a plant
     */
    public AbstractIndustry(final String name, final Integer plantId) {
        super(name, plantId);
        maxProductPrice = 0;
    }

    /**
     * Method to reduce wanted products amount from the industry.
     *
     * @param productsAmount Amount of products to reduce amount of
     */
    public void buyProducts(int productsAmount) {
        this.productsAmount -= productsAmount;
    }
}
