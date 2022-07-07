<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://uicdn.toast.com/grid/latest/tui-grid.css" />
<script src="https://uicdn.toast.com/grid/latest/tui-grid.js"></script>
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.13.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"
	integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
	crossorigin="anonymous">
	
</script>
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
	border-radius: 4px;
}

.linelist {
	float: right;
	margin: 0 20px 20px 0;
}
</style>
</head>
<body>
	<!-- 헤더부분 -->
	<div class="container-fluid px-4">
		<h1 class="mt-4">자재관리</h1>
		<ol class="breadcrumb mb-4">
			<li class="breadcrumb-item active">자재 발주</li>
		</ol>
	</div>
	<!-- 헤더부분 -->
	<form>
		<div class="mb-3">
			<label for="all" style="padding-left:24px;">발주신청일</label> <input type="date" id="frDate"
				name="frDate" style="width: 200px">-<input type="date"
				id="toDate" name="toDate" style="width: 200px">
		</div>
		<div class="mb-3">
			<label for="frDate" style="padding-left:24px;">자재명</label> <input type="text" id="nmae"
				name="name">
		<input type="button" class="c_btn" value="조회"></input>
		</div>
	</form>
	<div class="row">
		<div class="col-xl-6">
			<div class="card mb-4">
				<div class="card-header">
					<i class="fas fa-chart-area me-1"></i> 자재 발주 목록
				</div>
				<div class="card-body">
					<div id="grid"></div>
				</div>
			</div>
		</div>
		<div class="col-xl-6">
			<div class="card mb-4">
				<div class="card-header">
					<i class="fas fa-chart-bar me-1"></i> 자재 발주 상세보기
				</div>
				<div class="card-body">
					<div id="grid2"></div>
				</div>
			</div>
		</div>
	</div>

	<script>
		const gridData = [ {
			c1 : '100013',
			c2 : 'Mustafa Cosme',
			c3 : 291232
		}, {
			c1 : '201212',
			c2 : 'Gunnar Fausto',
			c3 : 32123
		}, {
			c1 : '241221',
			c2 : 'Junior Morgan',
			c3 : 88823
		}, {
			c1 : '991232',
			c2 : 'Tódor Ingo',
			c3 : 9981
		}, {
			c1 : '299921',
			c2 : 'Zezé Obadiah',
			c3 : 140212
		}, {
			c1 : '772193',
			c2 : 'Alfwin Damir',
			c3 : 30012
		}, {
			c1 : '991232',
			c2 : 'Feroz Fredrik',
			c3 : 111023
		}, {
			c1 : '572812',
			c2 : 'Archer Beniamino',
			c3 : 229123
		}, {
			c1 : '310832',
			c2 : 'Dado Shaul',
			c3 : 123
		}, {
			c1 : '321232',
			c2 : 'Svetoslav Eder',
			c3 : 81252
		}, {
			c1 : '229123',
			c2 : 'Lauri Gligor',
			c3 : 230923
		}, {
			c1 : '589282',
			c2 : 'Ruben Bèr',
			c3 : 11523
		}, {
			c1 : '321234',
			c2 : 'Vicenç Hadrien',
			c3 : 29912
		}, {
			c1 : '632123',
			c2 : 'Borna Rochus',
			c3 : 62842
		},

		{
			c1 : '122123',
			c2 : 'Kristijonas Tate',
			c3 : 199823
		}, {
			c1 : '211232',
			c2 : 'Kumara Archimedes',
			c3 : 112522
		}, {
			c1 : '487297',
			c2 : 'Hershel Radomil',
			c3 : 399123
		}, {
			c1 : '232123',
			c2 : 'Toma Levan',
			c3 : 231253
		}, {
			c1 : '828723',
			c2 : 'Njord Thoko',
			c3 : 89123
		} ];

		const grid = new tui.Grid({
			el : document.getElementById('grid'),
			scrollX : false,
			bodyHeight : 300,
			rowHeight : 35,
			rowHeaders : [ 'rowNum'],	
			header : {
				height : 40
			},
			columns : [ {
				header : '발주번호',
				name : 'c1'
			}, {
				header : '발주신청일',
				defaultValue : 2,
				name : 'c2'
			} ],
			data : gridData
		});

		const grid2 = new tui.Grid({
			el : document.getElementById('grid2'),
			scrollX : false,
			bodyHeight : 300,
			rowHeight : 35,
			rowHeaders : [ 'rowNum' ],
			header : {
				height : 40
			},
			columns : [ {
				header : '자재코드',
				name : 'c1'
			}, {
				header : '자재명',
				defaultValue : 2,
				name : 'c2'
			}, {
				header : '발주수량',
				name : 'c3'
			}, {
				header : '업체명',
				name : 'c3'
			}, {
				header : '발주신청일',
				name : 'c3'
			}, {
				header : '납기요청일',
				name : 'c3'
			} ],
			data : gridData
		});
	</script>
</body>
</html>