package com.rezzo.mes.resour.insp.service;

import com.rezzo.mes.comm.rsc.service.RscVO;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
public class RscInspVO {

    // condtions
    private String startDt;
    private String endDt;

    private String rscCd; //자재코드
    private String rscNm; // 자재품명
    private String rscSpec; // 자재규격
    private String mngUnit; // 관리단위
    private String rscTyp; // 자재 유형s

    private String ordrCd; // 발주코드
    private String vendCd; // 공급업체 코드
    private String vendNm; // 공급업체 이름
    private int ordrCnt; // 발주수량
    private int preIstCnt; // 가입고수량

    private String rscInspCd; // 검사코드
    private String inspDt; // 검사일자
    private String inspTstr; // 검사자
    private int inspCnt; //검사수량
    private int inspPassCnt; // 합격수량
    private int inspFailCnt; // 불량수량

    private int passRmnCnt; // 합격잔여수량

    private List<RscInfVO> rscInfList; //불량목록
}
