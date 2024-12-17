package com.github.zabbum.oelrlib.requests;

import lombok.Data;

@Data
public class PlayerInfoRequest implements OelRequest {
    private String gameId;
    private Integer playerId;
}
