package com.rezzo.mes.resour.oust.service;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RscOustVO {

    private String rscOustCd; // 출고코드
    private String rscCd; // 자재코드
    private String rscLotCd; // lot코드
    private int oustCnt; // 출고수량
    private String oustDt; // 출고일자
    private String oustTyp; // 출고유형

    // misc
    private int lotRmnCnt;
    private String expDt;
    private String from;

    private String startDt;
    private String endDt;

}
