package com.rezzo.mes.resour.stc.service;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RscIOVO {

    private String prcsDt;
    private String rscCd;
    private String rscNm;
    private String rscSpec;
    private String mngUnit;
    private int istCnt; // 입고수량
    private int oustCnt; // 출고수량

    // misc
    private String startDt;
    private String endDt;
    private String sortTyp;
}
