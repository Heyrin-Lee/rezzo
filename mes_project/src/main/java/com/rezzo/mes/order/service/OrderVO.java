package com.rezzo.mes.order.service;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderVO {
	
	private int order_no;
	private String edcts_cd;
	private String vend_cd;
	private Date order_dt;
	private String prog_appe;
	private Date paprd_dt;
	private String prdt_nm;
	private int order_cnt;
}
