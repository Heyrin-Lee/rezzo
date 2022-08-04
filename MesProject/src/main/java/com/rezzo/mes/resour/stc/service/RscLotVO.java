package com.rezzo.mes.resour.stc.service;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;

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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date startDt;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date endDt;
    private String noZeroLot;
}
