package com.rezzo.mes.prod.plan.service;

import java.util.Date;

import lombok.Data;
@Data
public class PlanVO {
	String planCd;
	Date paprdDt;
	int prefRank;
	String nowSt;
	Date planDt;
	Date wkFrDt;
	String lineCd;
	String prdtCd;
	int orderNo;
	Date orderDt;
	String vendNm;
	int orderCnt;
	String prcsCd;
	String prdtNm;
	
}
