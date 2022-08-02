package com.rezzo.mes.resour.stc.service;

import java.util.List;

public interface RscStcService {

    // 입출고조회
    List<RscIOVO> getIOList(RscIOVO rscIOVO);

    // Lot 재고조회
    List<RscLotVO> getRscLotList(RscLotVO rscLotVO);

    // 자재별 재고조회
    List<RscStcVO> getRscStcList(RscStcVO rscStcVO);

}
