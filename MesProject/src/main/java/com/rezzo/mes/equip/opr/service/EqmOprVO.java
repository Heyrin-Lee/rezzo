package com.rezzo.mes.equip.opr.service;

import java.util.Date;

import lombok.Data;

@Data
public class EqmOprVO {
	
	String noprCd;
	String eqmCd;
	String eqmNm;
	Date ftDt;
	Date toDt;
	String eqmPsch;
	String opertCtnt;
	
}
