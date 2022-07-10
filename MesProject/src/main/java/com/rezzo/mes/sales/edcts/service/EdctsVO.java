package com.rezzo.mes.sales.edcts.service;

import java.sql.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EdctsVO {

	//완제품 재고 테이블
	private String edctsCd;
	private String prdtNm;
	private Date makeDt;
	private int stcCnt;
	private Date distbTerm;
	
	//완제품 입고 테이블 
	private int edctsIstNo;
	private Date edctsIstDt;
	private int edctsIstCnt;
}
