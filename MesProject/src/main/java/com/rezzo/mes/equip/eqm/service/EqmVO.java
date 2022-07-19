package com.rezzo.mes.equip.eqm.service;

import java.sql.Date;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class EqmVO {
	String eqmCd;
	String eqmFg;
	String lineCd;
	String prcsCd;
	String eqmNm;
	Date eqmIstDt;
	int minTemp;
	int maxTemp;
	String chckPerd;
	String useYN;
	String prcsNm;
	String imgPath;
	String eqmImg;
	String eqmFgNm;
	String frmUseYN;

	
}
