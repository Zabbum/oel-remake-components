package com.github.zabbum.oelrlib.requests;

import lombok.Data;

@Data
public class JoinRequest {
    private String playerName;
    private String gameId;
}