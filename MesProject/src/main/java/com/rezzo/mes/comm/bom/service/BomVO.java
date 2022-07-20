package com.rezzo.mes.comm.bom.service;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BomVO {
	
	String bomCd;
	Integer bomSq;
	String edctsCd;
	String rscCd;
	String unit;
	Integer useCnt; 
	String prcsCd;
	String remk;     

}
