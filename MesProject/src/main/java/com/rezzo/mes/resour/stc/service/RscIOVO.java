package com.rezzo.mes.resour.stc.service;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@NoArgsConstructor
public class RscIOVO {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date prcsDt;
    private String rscCd;
    private String rscNm;
    private String rscSpec;
    private String mngUnit;
    private int istCnt; // 입고수량
    private int oustCnt; // 출고수량

    // misc
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date startDt;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date endDt;
    private String sortTyp;
}
