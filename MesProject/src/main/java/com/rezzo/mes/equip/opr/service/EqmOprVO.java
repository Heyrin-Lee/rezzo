package com.rezzo.mes.equip.opr.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class EqmOprVO {
	
	String noprCd;
	String frmEqmCd;
	String frmEqmNm;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	Date frDt;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	Date toDt;
	String frmPsch;
	String opertCtnt;
	String frmUseYN;
	
}
