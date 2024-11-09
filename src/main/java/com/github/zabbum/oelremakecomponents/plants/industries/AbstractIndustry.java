package com.github.zabbum.oelremakecomponents.plants.industries;

import com.github.zabbum.oelremakecomponents.plants.AbstractPlant;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
// and make AbstractIndustry and Oilfield extend that class
public abstract class AbstractIndustry extends AbstractPlant {

    /**
     * Max product price (this should be changed in every class extending AbstractIndustry).
     */
    public static final int maxProductPrice = 0;
    /**
     * Products amount in industry
     */
    protected int productsAmount;

    /**
     * Price of products
     */
    protected double productPrice;

    /**
     * Constructor of a Plant.
     *
     * @param name Name of a plant
     */
    public AbstractIndustry(String name) {
        super(name);
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
