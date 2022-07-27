package com.rezzo.mes.resour.ordr.service;

import java.sql.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RscOrdrVO {

	//자재발주 디테일 테이블
	private String ordrCd;
	private String rscCd;
	private String rscNm;
	private int ordrCnt;
	private int rmnCnt;
	
	//자재발주 테이블
	private String ordrNo;
	private String vendCd;
	private Date paprdCmndDt;
	private Date ordrReqDt;
	
	// 자재발주 코드 카운트
	private String ordrSCnt;
	private String rscStc;
	private String safStc;
	private String vendNm;
	
	// misc
	private Date startDt;
	private Date endDt;

	private String rscSpec; // 자재규격
	private String mngUnit; // 관리단위
}
