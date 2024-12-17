package com.github.zabbum.oelrlib.requests;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class StarterRequest implements OelRequest {
    private String playerName;
    private Integer playersAmount;
}
