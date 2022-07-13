package com.rezzo.mes.sales.order.service;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OrderVO {
	
	private int orderNo;
	private String edctsCd;
	private String vendCd;
	private String vendNm;
	private Date orderDt;
	private Date start;
	private Date end;
	private String progAppe;
	private Date paprdDt;
	private String prdtNm;
	private int orderCnt;
	
	//거래처관리 테이블-사업자등록번호,거래처유형,전화번호 컬럼
	private String bizNo;
	private String vendTyp;
	private String telNo;

	
}
