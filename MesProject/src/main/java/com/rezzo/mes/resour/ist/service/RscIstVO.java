package com.rezzo.mes.resour.ist.service;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class RscIstVO {

    // lot 관리
    String lotCd; // lot 코드
    String rscCd; // 자재코드
    String rscTyp; // 자재유형
    int lotCnt; // lot 수량
    int lotCntRem; // lot 잔여수량
    Date regDt; // lot등록일자
    Date expDt; // 유통기한

    // 자재 입고관리
    String ordrCd; // 발주코드
    String istCd; // 입고일자
    Date istDt; // 입고일자
    int istCnt; // 입고수량
}
