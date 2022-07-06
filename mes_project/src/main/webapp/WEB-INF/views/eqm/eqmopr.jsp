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
	width: 90px;
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
			<li class="breadcrumb-item active">비가동관리</li>
		</ol>
	</div>
	<!-- 헤더부분 -->
	<div class="container-fluid px-4">
		<div class="row">
			<div class="col-7" style="margin-right: 5px">

				<!-- <section id="l_section"> -->
				<div class="card mr-4">

					<div class="card-header">
						<div class="sb-nav-link-icon">
							<i class="fas fa-table me-1"></i> 설비목록
						</div>
					</div>
					<div class="card-body">
						<div>
							<label for="">가동여부</label> <select
								style="width: 120px; text-align: center">
								<option selected="selected">전체</option>
								<option>가동</option>
								<option>비가동</option>
							</select>
							<button class="c_btn" form="">조회</button>
						</div>

						<!-- 	
				<div id="search_box" class="dataTable-search">
				</div>
					<input class="dataTable-input" placeholder="Search..." type="text"> -->
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
						<i class="fas fa-tachometer-alt"></i> 설비목록검색
					</div>

					<div class="card-body">
						<div class="row">
							<div class="col" style="margin-bottom: 3px">
								<label for="">해당일자</label> <input type="date" id="" name="">&nbsp;
								- &nbsp;<input type="date" id="" name="">
							</div>
						</div>
						<div class="row" style="margin-bottom: 3px">
							<div class="col-5">
								<label for="">설비코드</label> <input type="text"
									readonly="readonly" id="" name="" style="width: 150px">
							</div>
							<div class="col-7">
								<label for="" autofocus="autofocus">설비명</label> <input
									type="text" readonly="readonly" id="" name="">
								<button class="c_btn" form="">검색</button>
								<button class="c_btn" form="">조회</button>
							</div>
						</div>

						<div id="grid2" style="width: 630px"></div>
					</div>
				</div>

			</div>
		</div>
		<!-- 			</section> -->
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
				header : '설비코드',
				name : 'c1',
				align : 'center',
			}, {
				header : '설비명',
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
			} ]
		});

		const grid2 = new tui.Grid({
			el : document.getElementById('grid2'),
			data : gridData,
			scrollX : false,
			bodyHeight : 200,
			rowHeaders : [ 'rowNum' ],
			columns : [ {
				header : '설비코드',
				name : 'c1',
				align : 'center',
			}, {
				header : '설비명',
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
			} ]
		});
	</script>
</body>

</html>