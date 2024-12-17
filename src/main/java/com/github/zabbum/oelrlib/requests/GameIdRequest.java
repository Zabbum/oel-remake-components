package com.github.zabbum.oelrlib.requests;

import lombok.Data;

@Data
public class GameIdRequest implements OelRequest {
    String gameId;
}
