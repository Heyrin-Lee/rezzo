package com.rezzo.mes.resour.ist.service;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@NoArgsConstructor
public class RscIstVO {

    //
    String rscInspCd; // 검사코드
    String ordrCd;

    // lot 관리
    String rscLotCd; // lot 코드
    String rscCd; // 자재코드
    String rscTyp; // 자재유형
    int lotCnt; // lot 수량
    int lotRmnCnt; // lot 잔여수량
    int holdCnt; // 생산홀딩
    Date regDt; // lot등록일자
    Date expDt; // 유통기한

    // 자재 입고관리
    String rscIstCd; // 입고코드
    String istDt; // 입고일자
    int istCnt; // 입고수량
    int inspPassCnt; // 합격-입고량
}
