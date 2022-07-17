package com.rezzo.mes.comm.edcts.service;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EdctsmVO {
	
	String edctsCd;
	String prdtNm;
	String spec;            
	String unit;   
	Integer safStc;
	String wrhousCd;

}
