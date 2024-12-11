package com.github.zabbum.oelrlib.plants.industries;

import com.github.zabbum.oelrlib.plants.AbstractPlant;
import lombok.*;

/**
 * Abstract industry class (AbstractPlant with extra steps)
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
// and make AbstractIndustry and Oilfield extend that class
public abstract class AbstractIndustry extends AbstractPlant {

    /**
     * Max product price (this should be changed in every class extending AbstractIndustry).
     */
    protected int maxProductPrice;

    /**
     * Max product amount to buy at one time from industry.
     */
    protected int maxProductAmountToBuy;

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
        maxProductAmountToBuy = 0;
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
