package com.rezzo.mes.prod.plan.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.rezzo.mes.comm.ccds.service.CcdsVO;
import com.rezzo.mes.sales.order.service.OrderVO;

import lombok.Data;
@Data
public class PlanVO {
	String planCd;
	Date paprdDt;
	int prefRank;
	String nowSt;
	@DateTimeFormat(pattern = "yyyyMMdd")
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
	String edctsCd;
	int indicaCnt;
	String rscCd;
	int rscCnt;
	int useCnt;
	int rcsUse;

	

}
