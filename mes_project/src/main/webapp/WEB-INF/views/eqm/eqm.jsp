<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	background: #eee
}

/* #cont {
	display: flex;
	justify-content: center;
	align-items: center;
	width: 100%;
	padding: 3%;
	margin: 0, -5%, 0, -5%
}
#l_section {
	float: left;
	margin-right: 4%;
}

#r_section {
	float: right;
	margin-bottom: 18%;
	margin-right: 4%;
} */


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
	float: right;
	margin-top: 0px;
}

label {
	width: 100px;
	float: left;
}
/* 
.l_input {
	/* float: left; */
	margin: 0px 10px;
	width: 300px;
	display: inline-block;
}

.r_input {
	float: right;
	width: 300px;
	display: inline-block;
} */
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
			<div class="col-8 ">

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

						<!-- 	
				<div id="search_box" class="dataTable-search">
				</div>
					<input class="dataTable-input" placeholder="Search..." type="text"> -->
						<br>
						<div id="grid" ></div>
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
								<div class="l_input">
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
									<div class="r_input">
										<div class="mb-4">
											<label for="email" class="form-label">설비입고날짜</label> <input
												type="text" class="form-control" id="check"
												style="width: 180px">
										</div>
										<div class="mb-4">
											<label for="email" class="form-label">설비입고날짜</label> <input
												type="text" class="form-control" id="check"
												style="width: 180px">
										</div>
										<div class="mb-4">
											<label for="email" class="form-label">설비입고날짜</label> <input
												type="text" class="form-control" id="check"
												style="width: 180px">
										</div>
										<div class="mb-4">
											<label for="email" class="form-label">설비입고날짜</label> <input
												type="text" class="form-control" id="check"
												style="width: 180px">
										</div>
									</div>
								</div>
							</form>
							<br>
							<div class="linelist">
								<button class="c_btn" form="">등록</button>
								<button class="c_btn" form="">수정</button>
								<button class="c_btn" form="">삭제</button>
								<button type="reset" class="c_btn">취소</button>
							</div>
						</div>
					</div>
				</div>
				<!-- 			</section> -->
			</div>
		</div>


	<br>

	<script>
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
				header : '온도',
				name : 'c6',
				align : 'center'
			}, {
				header : '점검주기',
				name : 'c7',
				align : 'center'
			}, {
				header : '라인코드',
				name : 'c8',
				align : 'center'
			} ]
		});
	</script>
</body>

</html>