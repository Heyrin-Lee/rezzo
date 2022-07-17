package com.rezzo.mes.prod.plan.service;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.rezzo.mes.comm.ccds.service.CcdsVO;
import com.rezzo.mes.sales.order.service.OrderVO;

import groovy.transform.builder.Builder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PlanVO implements Serializable {
	String planCd;
	Date paprdDt;
	int prefRank;
	String nowSt;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	Date planDt;
	Date wkFrDt; 
	Date wkToDt;
	String lineCd;
	String prdtCd;
	
	String orderNo;
	Date orderDt;
	String vendNm;
	int orderCnt;
	String prcsCd;
	String prdtNm;
	String edctsCd;
	int indicaCnt;
	//생산수량
	
	String rscCd;
	int rscCnt;
	int useCnt;
	int rscUse;
	String rscLotNo;

	

}
