package com.rezzo.mes.equip.eqm.service;

import java.sql.Date;

import lombok.Data;

@Data
public class EqmVO {
	private String eqmCd;
	private String eqmFg;
	private String lineCd;
	private String prcsCd;
	private String eqmNm;
	private Date eqmIstDt;
	private int minTemp;
	private int maxTemp;
	private int chckPred;
	private String useYn;
	private String prcsNm;
	private String imgPath;
	private String eqmImg;
}
