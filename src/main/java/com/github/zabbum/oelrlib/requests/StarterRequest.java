package com.github.zabbum.oelrlib.requests;

import lombok.Data;

@Data
public class StarterRequest implements OelRequest {
    private String playerName;
    private Integer playersAmount;
}
