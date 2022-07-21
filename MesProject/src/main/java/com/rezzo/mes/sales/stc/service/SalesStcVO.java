package com.rezzo.mes.sales.stc.service;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class SalesStcVO {

	String edctsLotNo;
	String prdtNm;
	Date makeDt;
	int stcCnt;
	Date distbTerm;
	String edctsIstNo;
	
	String orderNo;
	String progAppe;
	int orderCnt;
}
