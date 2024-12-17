package com.github.zabbum.oelrlib.requests;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class JoinRequest implements OelRequest {
    private String playerName;
    private String gameId;
}