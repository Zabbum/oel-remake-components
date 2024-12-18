package com.github.zabbum.oelrlib.requests;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class SummaryRequest implements OelRequest {
    private String gameId;
    private String playerId;
    private Map<Integer, Integer> oilfieldsOilAmountSold;
}
