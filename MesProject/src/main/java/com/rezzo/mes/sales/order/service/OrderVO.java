package com.rezzo.mes.sales.order.service;

import java.sql.Date;

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
	private String progAppe;
	private Date paprdDt;
	private String prdtNm;
	private int orderCnt;
}
