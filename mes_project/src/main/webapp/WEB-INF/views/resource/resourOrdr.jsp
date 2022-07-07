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
	float: right;
}

.linelist {
	float: right;
	margin: 0 20px 20px 0;
}
.mb-3 {
	/*display:inline-block;*/
	float:right;
	margin-bottom:3%;
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
	<div class="card mb-4">
		<div class="card-header">
			<i class="fas fa-chart-area me-1"></i> 자재 재고 목록
			<form>
				<div class="mb-3">
                           <label for="frDate">자재명</label> 
                           <input
                              type="text" id="nmae" name="name">
                              <input type="button" class="c_btn" value="검색"></input>
                        </div>
			</form>
		</div>
		<div class="card-body">
			<div id="grid"></div>
		</div>
	</div>
	<div class="card mb-4">
		<div class="card-header">
			<i class="fas fa-chart-area me-1"></i> 자재 발주 등록			
                        <button class="c_btn" id="addBtn" form="">추가</button>
                        <button class="c_btn" form="">삭제</button>
                        <button class="c_btn" form="">발주등록</button>                     
		</div>
		<div class="card-body">
			<div id="grid2"></div>
		</div>
	</div>

	<script>
		const grid = new tui.Grid({
			el : document.getElementById('grid'),
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
				header : '거래처',
				name : 'c3'
			}, {
				header : '현재 재고',
				name : 'c3'
			} ],
			
		});

		const grid2 = new tui.Grid({
			el : document.getElementById('grid2'),
			scrollX : false,
			bodyHeight : 300,
			rowHeight : 35,
			rowHeaders : [ 'rowNum','checkbox' ],
			header : {
				height : 40
			},
			columns : [ {
				header : '자재코드',
				name : 'c1'
			}, {
				header : '자재명',
				name : 'c2'
			}, {
				header : '거래처',
				name : 'c3'
			}, {
				header : '현재 재고',
				name : 'c3'
			}, {
				header : '요청수량',
				name : 'c3'
			}, {
				header : '납기요청일',
				name : 'c3'
			} ],
			
		});
		
		//추가 버튼
		var rowData = [{cntCd: "", cntNm: "", cntKorNm: "",  cntetKorNm: "", useYn : "" , dispSeq: ""}]
		   let addBtn = document.getElementById('addBtn')
		   addBtn.addEventListener('click', function(e){
		      grid2.appendRow(rowData,{
		         at : grid.getRowCount(),
		         focus : true
		         });
		   })
	</script>

</body>
</html>