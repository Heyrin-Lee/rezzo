package com.rezzo.mes.prod.indica.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.rezzo.mes.prod.plan.service.PlanVO;

import lombok.Data;

@Data
public class IndicaVO {
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
	
	int orderCnt;
	String prcsCd;
	String prdtNm;
	String edctsCd;
	int indicaCnt;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	Date indicaDt;
	//생산수량
	
	String rscCd;
	int rscCnt;
	int useCnt;
	int rscUse;
	String rscLotNo;
	
	String prcsPsch;
}
