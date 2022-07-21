package com.rezzo.mes.sales.oust.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class SalesOustVO {

	String edctsOustNo;
	Date edctsOustDt;
	int edctsOustCnt;
	String edctsCd;
	
	String orderNo;
	String vendNm;
	String prdtNm;
	int orderCnt;
	
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	Date makeDt;
	int stcCnt;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	Date distbTerm;
	String edctsLotNo;
	
}
