package com.github.zabbum.oelrlib.requests;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class PassRequest implements OelRequest{
    private String gameId;
    private Integer playerId;
}
