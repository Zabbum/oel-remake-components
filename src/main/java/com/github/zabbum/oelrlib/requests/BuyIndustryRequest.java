package com.github.zabbum.oelrlib.requests;

import lombok.Data;

@Data
public class BuyIndustryRequest implements OelRequest {
    private String gameId;
    private Integer playerId;
    private String industryClassName;
    private Integer industryId;
    private Integer productPrice;
}
