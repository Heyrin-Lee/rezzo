<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

				<!-- <section id="l_section"> -->
				<div class="card mr-4">

					<div class="card-header">
						<div class="sb-nav-link-icon">
							<i class="fas fa-table me-1"></i> 설비목록
						</div>
					</div>
					<div class="card-body">
						<div>
							<label for="" autofocus="autofocus">설비명</label> <input
								type="text" readonly="readonly" id="" name=""
								style="width: 150px">
							<button class="c_btn" form="">검색</button>
							<button class="c_btn" form="">조회</button>
						</div>

						<br>
						<div id="grid"></div>
					</div>
				</div>
				<!-- 			</section> -->


				<!-- 		<section id="r_section"> -->
			</div>
			<div class="col">
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
								<div class="col-6">

									<div class="mb-4">
										<label for="email" class="form-label">온도</label>
										<div class="row">
											<input type="text" class="form-control" id="check"
												style="width: 50px">&nbsp; - &nbsp; <input
												type="text" class="form-control" id="check"
												style="width: 50px"> &nbsp;°C
										</div>
										<br> <label>사용여부</label>
										<div class="form-check form-check-inline">
											<input class="form-check-input" type="radio" name="useYN"
												id="Y" value="Y"> <label class="form-check-label"
												for="Y">Y</label> <input class="form-check-input"
												type="radio" name="useYN" id="N" value="N"> <label
												class="form-check-label" for="N">N</label>
										</div>
										<br>
										<div class="mb-4">
											<label for="email" class="form-label">점검주기</label> <input
												type="text" class="form-control" id="check"
												style="width: 180px">
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


	<br>

	<script>
	
		
	
	const dataSource = {
			contentType : 'application/josn',
			api:{
				readData :{
					url : '',
					method:'GET'
				}
			}
	};
	
		const gridData = [];
		(function() {
			for (let i = 0; i < 120; i += 1) {
				gridData.push({
					c1 : 'User' + (i + 1),
					c2 : ((i + 5) % 8) * 100 + i,
					c3 : ((i + 3) % 7) * 60,
					c4 : ((i + 3) % 7) * 60,
					c5 : ((i + 3) % 7) * 60,
					c6 : ((i + 3) % 7) * 60,
					c7 : ((i + 3) % 7) * 60,
					c8 : ((i + 3) % 7) * 60,
					c9 : ((i + 3) % 7) * 60

				});
			}
		})();

		const grid = new tui.Grid({
			el : document.getElementById('grid'),
			data : gridData,
			scrollX : false,
			bodyHeight : 500,
			rowHeaders : [ 'rowNum' ],
			columns : [ {
				header : '설비명',
				name : 'c1',
				align : 'center',
			}, {
				header : '설비코드',
				name : 'c2',
				align : 'center'
			}, {
				header : '공정코드',
				name : 'c3',
				align : 'center'
			}, {
				header : '공정명',
				name : 'c4',
				align : 'center'
			}, {
				header : '사용여부',
				name : 'c5',
				align : 'center'
			}, {
				header : '최소온도',
				name : 'c6',
				align : 'center'
			}, {
				header : '최대온도',
				name : 'c7',
				align : 'center'
			}, {
				header : '점검주기',
				name : 'c8',
				align : 'center'
			}, {
				header : '라인코드',
				name : 'c9',
				align : 'center'
			} ]
		});
	</script>
</body>

</html>