package com.github.zabbum.oelrlib.requests;

import lombok.Data;

@Data
public class BuyProductsRequest {
    private String gameId;
    private Integer playerId;
    private String industryClassName;
    private Integer industryId;
    private Integer productAmount;
    private Integer oilfieldId;
}
