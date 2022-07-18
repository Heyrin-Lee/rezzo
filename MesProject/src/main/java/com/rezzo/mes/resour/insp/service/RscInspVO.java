package com.rezzo.mes.resour.insp.service;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
public class RscInspVO {

    String rscCd; //자재코드
    String rscNm; // 자재품명

    int ordrNo; // 발주번호
    int ordrCnt; // 발주수량
    int ordrInstCnt; // 입고수량

    int rscInspNo; // 검사번호
    Date inspDt; // 검사일자
    int inspCnt; //검사수량
    int inspPassCnt; // 합격수량
    int inspFailCnt; // 불량수량

    List<RscInfVO> rscInf; // 불량 항목 및 수량

}
