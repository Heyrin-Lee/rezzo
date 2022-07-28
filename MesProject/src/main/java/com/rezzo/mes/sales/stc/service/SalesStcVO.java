package com.rezzo.mes.sales.stc.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SalesStcVO {

	String edctsLotNo;
	String prdtNm;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	Date makeDt;
	int stcCnt;
	Date distbTerm;
	String edctsIstNo;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	Date inspStart;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	Date inspEnd;
	
	String orderNo;
	String progAppe;
	int orderCnt;
	int lotCnt;
	String edctsCd;
	String spec;
	String unit;
	int edctsIstCnt;
	int edctsOustCnt;
}
