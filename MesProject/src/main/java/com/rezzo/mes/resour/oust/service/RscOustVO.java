package com.rezzo.mes.resour.oust.service;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.rezzo.mes.comm.rsc.service.RscVO;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@NoArgsConstructor
public class RscOustVO extends RscVO {

    private String rscOustCd; // 출고코드
    private String rscCd; // 자재코드
    private String rscLotCd; // lot코드
    private int oustCnt; // 출고수량
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date oustDt; // 출고일자
    private String oustTyp; // 출고유형

    // misc
    private int lotRmnCnt;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date expDt;
    private String from;
    private String planCd;
    
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date startDt;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date endDt;
    private String note;
}
