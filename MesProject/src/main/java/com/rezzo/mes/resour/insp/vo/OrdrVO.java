package com.rezzo.mes.resour.insp.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class OrdrVO {

    String ordrNo;
    String vendNm;
    Date paprdCmndDt;
    Date ordrReqDt;

}
