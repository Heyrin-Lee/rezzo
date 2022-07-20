package com.rezzo.mes.prod.plan.service;


import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.rezzo.mes.sales.order.service.OrderVO;

import lombok.Data;

@Data
public class PlanVO{
	
	// plan
	String planCd;
	int prefRank;
	String nowSt;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	Date planDt;
	Date wkFrDt; 
	Date wkToDt;
	String lineCd;
	int indicaCnt;
	
	// orderSheet
	String orderNo;
	Date orderDt;
	String vendNm;
	int orderCnt;
	Date paprdDt;
	
	// edcts
	String prdtNm;
	String edctsCd;
	
	// 자재코드, 자재lot, 자재재고, 
	String rscCd;
	int rscCnt;
	String rscLotNo;
	
	// bom  
	int useCnt;
	String prcsCd;
	
	// holding 출고수량
	int rscUse;
	
	String index;
	

}
