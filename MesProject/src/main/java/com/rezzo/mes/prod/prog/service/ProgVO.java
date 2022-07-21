package com.rezzo.mes.prod.prog.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class ProgVO {
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	Date indicaDt;
	String prdtNm;
	String edctsCd;
	int indicaCnt;
	String lineCd;
	int prefRank;
	String progCd;
	String prcsCd;
	String prcsNm;
	String prcsPsch;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	Date wkFrDttm;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	Date wkToDttm;
	Integer inferCnt;
	Integer prodCnt;
	String nowSt;
	String edctsLotNo;
	String planCd;
	
}
