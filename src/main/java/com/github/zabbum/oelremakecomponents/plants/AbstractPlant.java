package com.github.zabbum.oelremakecomponents.plants;

import lombok.*;
import com.github.zabbum.oelremakecomponents.Player;

/**
 * Abstract plant class
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class AbstractPlant {
    /**
     * ID of the plant
     */
    protected Integer plantId;

    /**
     * Name of plant
     */
    protected String name;
    /**
     * Price of plant
     */
    protected int plantPrice;
    /**
     * Ownership of plant
     */
    protected Player ownership;

    /**
     * Constructor of a plant.
     *
     * @param name Name of a plant
     * @param plantId ID of a plant
     */
    public AbstractPlant(final String name, final Integer plantId) {
        this.name = name;
        this.plantId = plantId;
        this.ownership = null;
    }

    /**
     * Method to get if plant is bought.
     *
     * @return true if is bought, false if is not
     */
    public boolean isBought() {
        return this.ownership != null;
    }
}
