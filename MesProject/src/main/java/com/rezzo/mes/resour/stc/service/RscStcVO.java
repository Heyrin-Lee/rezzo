package com.rezzo.mes.resour.stc.service;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


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

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
    private Date inqDt; // 조회일자

}
