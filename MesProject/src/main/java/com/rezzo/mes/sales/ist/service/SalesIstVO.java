package com.rezzo.mes.sales.ist.service;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class SalesIstVO {

	int edctsIstNo;
	Date edctsIstDt;
	int edctsIstCnt;
	String edctsCd;
	int edctsLotNo;
}
