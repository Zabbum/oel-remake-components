package com.github.zabbum.oelremakecomponents.kits;

import lombok.Data;

@Data
public class BuyProductsKit {
    private String gameId;
    private Integer playerId;
    private String industryClassName;
    private Integer industryId;
    private Integer productAmount;
    private Integer oilfieldId;
}
