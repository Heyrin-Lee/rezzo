package com.rezzo.mes.comm.rsc.service;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RscVO {
	
	String rscCd;  
	String rscNm;  
	String rscSpec;       
	String mngUnit;         
	String rscTyp;        
	Integer safStc;      
	String useYn;    
	String wrhousCd; 
	String vendCd;
	String vendNm;
}
