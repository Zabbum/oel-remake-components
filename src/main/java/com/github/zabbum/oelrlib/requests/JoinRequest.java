package com.github.zabbum.oelrlib.requests;

import lombok.Data;

@Data
public class JoinRequest implements OelRequest {
    private String playerName;
    private String gameId;
}