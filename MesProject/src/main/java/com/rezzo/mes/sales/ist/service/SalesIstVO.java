package com.rezzo.mes.sales.ist.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class SalesIstVO {

	String edctsIstNo;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	Date edctsIstDt;
	int edctsIstCnt;
	String edctsCd;
	int edctsLotNo;
	String index;
	String edcts_cd;
	String prdt_nm;
}
