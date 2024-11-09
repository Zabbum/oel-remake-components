package com.github.zabbum.oelremakecomponents.plants;

import lombok.Getter;
import lombok.Setter;
import com.github.zabbum.oelremakecomponents.Player;

/**
 * Abstract plant class
 */
@Getter
@Setter
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
     * Constructor of a Plant.
     *
     * @param name Name of a plant
     */
    public AbstractPlant(String name) {
        this.name = name;
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
