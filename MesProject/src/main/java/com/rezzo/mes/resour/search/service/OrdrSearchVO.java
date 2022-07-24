package com.rezzo.mes.resour.search.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class OrdrSearchVO {
	
	String ordrCd;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	Date ordrReqDt;
	String vendCd;
	String vendNm;
	int ordrCnt;
	int rmnCnt;
	String rscCd;
	String rscNm;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	Date paprdCmndDt;
	String ordrSCnt;
	String rscStc;
	String safStc;
}
