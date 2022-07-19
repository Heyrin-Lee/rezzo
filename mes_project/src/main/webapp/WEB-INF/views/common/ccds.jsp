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
  <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<style>
a {
	text-decoration: none;
}

body {
	font-size: 14px;
	color: #333;
}

li {
	list-style: none;
}

.card-header .tab {
	display: flex;
	justify-content: space-between;
}

.card-header .tab li a {
	font-size: 15px;
	color: #333;
	font-weight: 500;
}

/* 탭버튼 눌렀을시 글자 색상변경 */
.card-header .tab li.on a {
	font-weight: bold;
	color: crimson;
}
/* 탭박스 영역 기본 옵션은 디스플레이 숨김 */
.card-body .tabBox {
	display: none;
}
/* 탭버튼이 눌러졌을시 관련된 탭박스 활성화 */
.card-body .tabBox.on {
	display: block;
}
</style>
</head>
<body>
	<div class="container-fluid px-4">
		<h1 class="mt-4">공통코드관리</h1>
		<ol class="breadcrumb mb-4">
			<li class="breadcrumb-item"><a href="home.do">홈</a></li>
			<li class="breadcrumb-item">> 기준정보관리</li>
			<li class="breadcrumb-item active">> 공통코드관리</li>
		</ol>
		<div class="card mb-4">
			<div class="card-body">
				<label for="" autofocus="autofocus">코드명</label> <input type="text"
					readonly="readonly" id="" name="" style="width: 150px">
				<button class="c_btn" >검색</button>
			</div>
		</div>

		<div class="row">
			<div class="col-lg-6">
				<div class="card mb-4">
					<div class="card-header">
					</div>
					<div class="card-body">
						<div id="grid"></div>
						<script>
    var Grid = tui.Grid;
     const data = [{
         id: '10012',
         city: 'Seoul',
         country: 'South Korea'
       },
       {
         id: '10013',
         city: 'Tokyo',
         country: 'Japan'
       }
     ]
    // case 1 : 인스턴스 생성시 data 옵션으로 데이터 입력
    const grid = new Grid({
      el: document.getElementById('grid'),
      data : data ,
      //data만 적어도 가능(축약형)
      columns: [{
          header: 'ID',
          name: 'id',
        	sortable: true,
          sortingType: 'desc'
        },
        {
          header: 'CITY',
          name: 'city',
          editor: 'text',
        	sortable: true,
          sortingType: 'desc'
        }
      ]
    });
    //ajax조회하고 grid
    //$.ajax({
    //  url: 'data.json'
    //}).done(result => grid.resetData(result) ) //람다식표현
    // }).done(function (result) {
    //   // case 2 : resetData() 메서드로 입력
    //   grid.resetData(result);
    // })
    grid.on('click', ev => {
      console.log(ev.rowKey)
      console.log(ev.columnName)
      var value = grid.getValue(ev.rowKey,ev.columnName);
      console.log(value);
    })
  </script>
					</div>
					<div class="card-footer small text-muted"></div>
				</div>
			</div>
			<div class="col-lg-6">
				<div class="card mb-4">
					<div class="card-header">
						<ul class="tab">
							<li class="on"><a href="#!"><span>상세코드</span></a></li>
							<li><a href="#!"><span>코드정보</span></a></li>
						</ul>
					</div>
					<div class="card-body">
						<div class="tabBox on">
							<div class="ccd">
								<div id="grid2"></div>
								<script>
    var Grid = tui.Grid;
  
    // case 1 : 인스턴스 생성시 data 옵션으로 데이터 입력
    const grid2 = new Grid({
      el: document.getElementById('grid2'),
      data : data ,
      //data만 적어도 가능(축약형)
      columns: [{
          header: 'ID',
          name: 'id'
        },
        {
          header: 'CITY',
          name: 'city',
          editor: 'text'
        }
      ]
    });
    //ajax조회하고 grid
    //$.ajax({
    //  url: 'data.json'
    //}).done(result => grid.resetData(result) ) //람다식표현
    // }).done(function (result) {
    //   // case 2 : resetData() 메서드로 입력
    //   grid.resetData(result);
    // })
    grid2.on('click', ev => {
      console.log(ev.rowKey)
      console.log(ev.columnName)
      var value = grid2.getValue(ev.rowKey,ev.columnName);
      console.log(value);
    })
  </script>
							</div>
						</div>
						<div class="tabBox">
							<div class="linelist">
								<button class="c_btn" form="">등록</button>
								<button class="c_btn" form="">수정</button>
								<button class="c_btn" form="">삭제</button>
								<button class="c_btn" form="">취소</button>
							</div>
							<br> <br>
							<form>
								<div class="mb-3">
									<label for="no" class="form-label">공통코드</label> <input
										type="text" class="form-control" id="no" name="no">
								</div>
								<div class="mb-3">
									<label for="name" class="form-label">공통코드명</label> <input
										type="text" class="form-control" id="name" name="name">
								</div>
								<div class="mb-3">
									<label for="cdInfo" class="form-label">공통코드상세</label> <input
										type="text" class="form-control" id="cdInfo" name="cdInfo">
								</div>
								<div class="mb-4">
									<label for="cdInfo" class="form-label">사용여부</label> <input
										type="checkbox" id="check">
								</div>
							</form>
						</div>
					</div>
					<div class="card-footer small text-muted"></div>
					<div id="wrap"></div>
					<script type="text/javascript">
					$(document).ready(function(){
						  $(".card-header .tab li a").on("click", function(){
						    // 해당 요소를 클릭하는 내 자신의 index 번호를 가져온다. [0], [1]
						    const num = $(".card-header .tab li a").index($(this));
						    // 기존에 적용되어 있는 on class 삭제
						    $(".card-header .tab li").removeClass("on");
						    $(".card-body .tabBox").removeClass("on");

						    // 다음 요소 클릭시 on class 추가
						    $('.card-header .tab li:eq(' + num + ')').addClass("on");
						    $('.card-body .tabBox:eq(' + num + ')').addClass("on");

						  });
						});
					
					</script>
				</div>
			</div>
		</div>
	</div>
</body>
</html>