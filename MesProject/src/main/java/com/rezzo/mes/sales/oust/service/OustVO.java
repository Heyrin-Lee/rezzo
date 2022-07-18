package com.rezzo.mes.sales.oust.service;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OustVO {

	private int edctsOustNo;
	private Date edctsOustDt;
	private int edctsOustCnt;
	private String edctsCd;
	
	//order_sheet 
	private String orderNo;
	private String vendNm;
	private String prdtNm;
	private int orderCnt;
	
	//edcts_stc
	private Date makeDt;
	private int stcCnt;
	private Date distbTerm;
	
	
}
