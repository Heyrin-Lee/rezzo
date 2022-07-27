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
	Integer indicaCnt;
	String lineCd;
	int prefRank;
	String progCd;
	String prcsCd;
	String prcsNm;
	String prcsPsch;
//	@DateTimeFormat(pattern="yyyy-MM-dd")
//	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
//	Date wkFrTm;
	String wkFrTm;
//	@DateTimeFormat(pattern="yyyy-MM-dd")
//	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
//	Date wkToTm;
	String wkToTm;
	Integer inferCnt;
	String inferCd;
	Integer prodCnt;
	String nowSt;
	String edctsLotNo;
	String planCd;
	String eqmCd;
	String eqmCd2;
	String eqmNm;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	Date startTime;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	Date endTime;
	String yn;
	String orderNo;
	Integer seqNo;
}
