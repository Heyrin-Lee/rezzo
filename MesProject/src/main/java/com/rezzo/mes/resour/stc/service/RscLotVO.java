package com.rezzo.mes.resour.stc.service;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RscLotVO {

    private String rscCd;
    private String rscNm;
    private String rscTyp;
    private String rscSpec;
    private String mngUnit;
    private String rscLotCd;

    private int holdCnt;
    private int istCnt; // 최초입고량
    private int oustCnt; // 출고수량
    private int lotRmnCnt;

    // misc
    private String startDt;
    private String endDt;
    private String noZeroLot;
}
