package com.rezzo.mes.resour.stc.service;

import com.rezzo.mes.comm.rsc.service.RscVO;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RscStcVO {

    private String rscCd;
    private String rscNm;
    private String rscSpec;
    private String mngUnit;
    private String rscTyp;
    private int safStc;
    private int avalStc;
    private int prvmmStc; // 전월재고(기초재고)
    private int stcCnt; // 재고량
    
    private String inqDt; // 조회일자
    
}
