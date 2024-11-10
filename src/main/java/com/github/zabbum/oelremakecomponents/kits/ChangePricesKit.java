package com.github.zabbum.oelremakecomponents.kits;

import lombok.Data;

@Data
public class ChangePricesKit {
    private String gameId;
    private Integer playerId;
    private String industryClassName;
    private Integer industryId;
    private Integer newPrice;
}
