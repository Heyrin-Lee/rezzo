package com.rezzo.mes.resour.insp.web.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class OrdrVO {

    String ordrNo;
    String vendCd;
    Date paprdCmndDt;
    Date ordrReqDt;
    String rscCd;
    String rscNm;
    String ordrCnt;
    String startDt;
    String endDt;

}
