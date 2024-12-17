package com.github.zabbum.oelrlib.requests;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class GameIdRequest implements OelRequest {
    String gameId;
}
