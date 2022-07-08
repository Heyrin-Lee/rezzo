<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	background: #eee
}

.c_btn {
	color: #fff;
	font-size: 13px;
	background: #333;
	border: none;
	padding: 6px;
	border-radius: 4px
}

.c_btn:hover {
	background: #555;
}

.linelist {
	display: inline-block;
	float: right;
	margin-top: 0px;
	float: right;
}

#grid {
	width: 100%
}

label {
	width: 100px;
	float: left;
}
</style>
<link rel="stylesheet"
	href="https://uicdn.toast.com/grid/latest/tui-grid.css" />
<script src="https://uicdn.toast.com/grid/latest/tui-grid.js"></script>
<script src="https://code.jquery.com/jquery-3.6.0.js"
	integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
	crossorigin="anonymous"></script>



</head>
<body>
	<!-- 헤더부분 -->
	<div class="container-fluid px-4">
		<h1 class="mt-4">설비관리</h1>
		<ol class="breadcrumb mb-4">
			<li class="breadcrumb-item active">설비</li>
		</ol>
	</div>
	<!-- 헤더부분 -->
	<div class="container-fluid px-4">
		<div class="row">
			<div class="col-7 ">

				<div class="card mr-4">

					<div class="card-header">
						<div class="sb-nav-link-icon">
							<i class="fas fa-table me-1"></i> 설비목록
						</div>
					</div>
					<div class="card-body">
						<div>
							<label for=""  autofocus="autofocus">설비명</label> <input
								type="text" id="" name="" style="width: 150px" readonly="readonly"  > <input
								type="button" data-bs-toggle="modal" id="modalBtn"
								data-bs-target="#exampleModal" value="검색"></input>
							<button class="c_btn" form="">조회</button>
						</div>

						<br>
						<div id="grid"></div>
					</div>
				</div>


			</div>
			<div class="col-5 ms-auto">
				<div class="card mb-4">
					<div class="card-header">
						<i class="fas fa-tachometer-alt"></i> 설비등록
					</div>

					<div class="card-body">

						<form>
							<input type="file" id="myFile" name="filename">
							<div class="row">
								<div class="col-6">
									<div class="mb-3">
										<label for="no" class="form-label">설비명</label> <input
											type="text" class="form-control" id="no" name="no"
											style="width: 180px">
									</div>
									<div class="mb-3">
										<label for="id" class="fom-label">설비코드</label> <input
											type="text" class="form-control" id="id" name="id"
											style="width: 180px">
									</div>
									<div class="mb-3">
										<label for="email" class="form-label">공정코드</label> <input
											type="text" class="form-control" id="email" name="email"
											style="width: 180px">
									</div>
									<div class="mb-4">
										<label for="email" class="form-label">공정명</label> <input
											type="text" class="form-control" id="check"
											style="width: 180px">
									</div>
									<div class="mb-4">
										<label for="email" class="form-label">설비입고날짜</label> <input
											type="text" class="form-control" id="check"
											style="width: 180px">
									</div>
								</div>
								<br>
								<div class="col-5">

									<div class="mb-4">
										<label for="email" class="form-label">온도</label>
										<div class="row">
											<input type="text" class="form-control" id="check"
												style="width: 50px">&nbsp; - &nbsp; <input
												type="text" class="form-control" id="check"
												style="width: 50px"> &nbsp;°C
										</div>
										<br> <label>사용여부</label>
										<div class="form-check form-check-inline"
											style="margin-bottom: 3px">
											<input class="form-check-input" type="radio" name="useYN"
												id="Y" value="Y"> <label class="form-check-label"
												for="Y">사용</label> <input class="form-check-input"
												type="radio" name="useYN" id="N" value="N"> <label
												class="form-check-label" for="N">미사용</label>
										</div>
										<br> <br>
										<div class="mb-4">
											<label for="email" class="form-label">점검주기(일)</label> <input
												type="text" class="form-control" id="check"
												style="width: 150px">
										</div>
										<div class="mb-4">
											<label for="form-select" class="form-label">라인코드</label> <select
												class="form-select" aria-label="Default select example"
												style="width: 180px">
												<option>1</option>
												<option>2</option>
												<option>3</option>
											</select>
										</div>
									</div>
								</div>
							</div>
						</form>
					</div>
					<div class="linelist">
						<button class="c_btn" form="">등록</button>
						<button class="c_btn" form="">수정</button>
						<button class="c_btn" form="">삭제</button>
						<button type="reset" class="c_btn">취소</button>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!-- Modal -->
	<div class="modal fade" id="exampleModal" tabindex="-1"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">설비명 검색</h5>
					<br> <br>
					<button type="button" class="btn-close" data-bs-dismiss="modal"
						aria-label="Close"></button>

				</div><br>
				<div class="ms-3">
					<label style="width:60px" for="">설비명</label><input type="text" ></input>
					<button class="c_btn btn-dark btn-primary btn-sm">검색</button>
					
				</div>
				<div id="modGrid" class="modal-body"></div>

				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-bs-dismiss="modal">닫기</button>
					<button type="button" class="btn btn-primary">가져오기</button>
				</div>
			</div>
		</div>
	</div>




	<br>

	<script>
	
	// 메인화면 그리드
	$.ajax({
		url : "/mes/eqmList",
		method : "GET",
		dataType : "JSON",
		success : function(result) {
			grid.resetData(result);
			console.log(result);
		}
	});
	const grid = new tui.Grid({
		el : document.getElementById('grid'),
		scrollX : false,
		bodyHeight : 500,
		rowHeaders : [ 'rowNum' ],
		columns : [ {
			header : '설비명',
			name : 'eqmNm',
			align : 'center',
		}, {
			header : '설비코드',
			name : 'eqmCd',
			align : 'center'
		}, {
			header : '공정코드',
			name : 'prcsCd',
			align : 'center'
		}, {
			header : '공정명',
			name : 'prcsNm',
			align : 'center'
		}, {
			header : '사용여부',
			name : 'useYn',
			align : 'center'
		}, {
			header : '최소온도',
			name : 'minTemp',
			align : 'center'
		}, {
			header : '최대온도',
			name : 'maxTemp',
			align : 'center'
		}, {
			header : '점검주기',
			name : 'chckPred',
			align : 'center'
		}, {
			header : '라인코드',
			name : 'lineCd',
			align : 'center'
		} ]
	});

	
	//모달 그리드
$.ajax({
				url : "/mes/eqmList",
				method : "GET",
				dataType : "JSON",
				success : function(result) {
					modGrid.resetData(result);
					console.log(result);
				}
			});

		const modGrid = new tui.Grid({
			el : document.getElementById('modGrid'),
			scrollX : false,
			rowHeaders : [ 'rowNum' ],
			columns : [ {
				header : '설비명',
				name : 'eqmNm',
				align : 'center',
			}, {
				header : '설비코드',
				name : 'eqmCd',
				align : 'center'
			}, {
				header : '공정코드',
				name : 'prcsCd',
				align : 'center',
			}, {
				header : '공정명',
				name : 'prcsNm',
				align : 'center',
			}, {
				header : '사용여부',
				name : 'useYn',
				align : 'center',
			} ]
		})
		
	modalBtn.addEventListener('click', function() {
			setTimeout(function() {
				modGrid.refreshLayout()
			}, 300);
		});
		
	</script>
</body>

</html>