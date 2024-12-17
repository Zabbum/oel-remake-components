package com.github.zabbum.oelrlib.requests;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PlayerInfoRequest implements OelRequest {
    private String gameId;
    private Integer playerId;
}
