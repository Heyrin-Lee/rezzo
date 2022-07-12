package com.rezzo.mes.comm.ccds.service;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CcdsVO {
	
	String ccd;
	String ccdNm;
	String ccdDesct;
	String useYn;
	
	String ccdDtl;
	String ccdDtlNm;
	String ccdDtlDesct;
	String dtlUseYn;
	
	public CcdsVO(String ccd) {
		this.ccd = ccd;
	}
}
