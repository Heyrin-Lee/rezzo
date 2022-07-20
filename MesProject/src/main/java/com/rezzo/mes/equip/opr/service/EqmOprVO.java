package com.rezzo.mes.equip.opr.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class EqmOprVO {
	
	String eqmNm;
	String eqmCd;
	String noprCd;
	String frmEqmCd;
	String frmEqmNm;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	Date frDt;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	Date toDt;
	String frmPsch;
	String opertCtnt;
	String frmUseYN;
	String eqmPsch;	
}
