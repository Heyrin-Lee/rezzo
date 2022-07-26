package com.rezzo.mes.equip.eqm.service;


import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Component
public class EqmVO {
	String eqmCd;
	String eqmFg;
	String lineCd;
	String prcsCd;
	String eqmNm;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	public Date eqmIstDt;
	int minTemp;
	int maxTemp;
	String chckPerd;
	String useYN;
	String prcsNm;
	String imgPath;
	String eqmImg;
	String eqmFgNm;
	String frmUseYN;
	String lineNm;
	
	
}
