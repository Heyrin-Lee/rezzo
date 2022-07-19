package com.rezzo.mes.resour.insp.service;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RscInfVO {

    String ordrCd; // 발주코드
    String rscInspCd; // 검사코드
    String rscCd; // 자재코드

    String ccdDtl; // 공통 불량코드
    String ccdDtlNm; // 공통 불량코드 이름
    int infCnt; // 불량수량

}
