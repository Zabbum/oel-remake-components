package com.github.zabbum.oelrlib.requests;

import lombok.Data;

@Data
public class BuyOilfieldRequest {
    private String gameId;
    private Integer playerId;
    private Integer oilfieldId;
}
