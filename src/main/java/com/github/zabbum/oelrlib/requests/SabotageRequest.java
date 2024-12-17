package com.github.zabbum.oelrlib.requests;

import lombok.Data;

@Data
public class SabotageRequest implements OelRequest {
    private String gameId;
    private Integer playerId;
    private String plantClassName;
    private Integer plantId;
}
