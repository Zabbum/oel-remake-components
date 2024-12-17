package com.github.zabbum.oelrlib.requests;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class GameIdRequest implements OelRequest {
    String gameId;
}
