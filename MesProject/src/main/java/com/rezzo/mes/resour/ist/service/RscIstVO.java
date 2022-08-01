package com.rezzo.mes.resour.ist.service;

import com.rezzo.mes.resour.insp.service.RscInspVO;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
public class RscIstVO {

    // code
    private String rscInspCd; // 검사코드
    private String ordrCd; // 발주코드

    // lot 관리
    private String rscLotCd; // lot 코드
    private String rscCd; // 자재코드
    private String rscSpec; // 자재규격
    private String mngUnit; // 관리단위
    private String rscTyp; // 자재유형
    private int lotCnt; // lot 수량
    private int lotRmnCnt; // lot 잔여수량
    private int holdCnt; // 생산홀딩
    private Date regDt; // lot등록일자
    private Date expDt; // 유통기한

    // 자재 입고관리
    private String rscIstCd; // 입고코드
    private String istDt; // 입고일자
    private int istCnt; // 입고수량
    private int passRmnCnt; //

    // misc
    private String vendNm;
    private String vendCd;
    private String rscNm;
    private String startDt;
    private String endDt;

}