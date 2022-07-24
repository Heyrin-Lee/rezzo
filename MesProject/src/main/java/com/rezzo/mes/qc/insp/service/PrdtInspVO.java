package com.rezzo.mes.qc.insp.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PrdtInspVO {
	
	String edctsLotNo;       
	String edctsCd;  
	String edctsNm;
	String orderCd;
	String inspRslt;
	String inspPsch;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
	Date inspDt;
	
	
	String inspCd;	
	String inspNm;
	String inspSd;	
	String inspRsltDtl;
	String inspJm;

}
