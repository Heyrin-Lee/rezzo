<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://uicdn.toast.com/grid/latest/tui-grid.css" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://uicdn.toast.com/grid/latest/tui-grid.js"></script>
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
</head>
<body>
	<div class="container-fluid px-4">
		<h1 class="mt-4">자재관리</h1>
		<ol class="breadcrumb mb-4">
			<li class="breadcrumb-item"><a href="home.do">홈</a></li>
			<li class="breadcrumb-item">> 기준정보관리</li>
			<li class="breadcrumb-item active">> 자재관리</li>
		</ol>
		<div class="card mb-4">
			<div class="card-body">
				<label for="" autofocus="autofocus">자재명</label> <input type="text"
					readonly="readonly" id="" name="" style="width: 150px">
				<button class="c_btn">검색</button>
			</div>
		</div>

		<div class="row">
			<div class="col-lg-6">
				<div class="card mb-4">
					<div class="card-header"></div>
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
          header: '자재코드',
          name: '자재코드',
        	sortable: true,
          sortingType: 'desc'
        },
        {
          header: '자재명',
          name: '자재명',
          editor: 'text',
        	sortable: true,
          sortingType: 'desc'
        },
        {
            header: '규격',
            name: '규격',
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
						<i class="fas fa-table me-1"></i> 상세조회
					</div>
					<div class="card-body">
						<div class="linelist">
							<button class="c_btn" form="">등록</button>
							<button class="c_btn" form="">수정</button>
							<button class="c_btn" form="">삭제</button>
							<button class="c_btn" form="">취소</button>
						</div>
						<br> <br>

						<form autocomplete="off" id="dataForm" name="dataForm" action="#"
							method="post">
							<table class="table table-bbs table-write" summary="내용.....">
								<colgroup>
									<col style="width: 90px">
									<col>
									<col style="width: 90px">
									<col>
								</colgroup>
								<tbody>
									<tr>
										<th scope="row">자재코드 <strong class="blue">*</strong></th>
										<td data-matr-cd=""><input class="form-control"
											type="text" id="matrCd" name="matrCd" style="width: 150px"
											maxlength="20" /> <input type="hidden" id="dbAccessDiv"
											name="dbAccessDiv" value="insert" /></td>
										<th scope="row">자재명 <strong class="blue">*</strong></th>
										<td><input class="form-control" type="text" id="matrNm"
											name="matrNm" style="width: 220px" maxlength="50" /></td>
									</tr>
									<tr>
										<th scope="row">자재규격</th>
										<td><input class="form-control" type="text" id="stndrd"
											name="stndrd" style="width: 120px" maxlength="50"
											readonly="readonly" /></td>
										<th scope="row">관리단위</th>
										<td><input class="form-control" type="text"
											id="manageUnit" name="manageUnit" style="width: 120px"
											maxlength="50" readonly="readonly" /></td>
									</tr>
									<tr>
										<th scope="row">입고업체</th>
										<td><input type="text" id="wrhousngEntrps"
											name="wrhousngEntrps" data-input="search"
											data-fn-name="fnEntrpsSearchView()" class="form-control"
											maxlength="20" style="width: 120px" />
											<button type="button" id="entrpsPopBtn"
												class="btn btn-find-small">찾아보기</button></td>
										<th scope="row">업체명</th>
										<td colspan="2"><input type="text" id="wrhousngEntrpsNm"
											class="form-control disabled" style="width: 120px"
											maxlength="50" readonly="readonly" /></td>
									</tr>
									<tr>
										<th scope="row">자재구분</th>
										<td><input id="matrAcnt" name="matrAcnt" type="text"
											data-input="search"
											class="form-control" style="width: 50px" />
											<button id="matrAcntPopBtn" type="button"
												class="btn btn-find-small">찾아보기</button> <input
											id="matrAcntNm" type="text" class="form-control"
											style="width: 100px" readonly="readonly" /></td>
										<th scope="row">보관창고</th>
										<td><input id="matrDiv" name="matrDiv" type="text"
											data-input="search"
											class="form-control" style="width: 50px" />
											<button id="matrDivPopBtn" type="button"
												class="btn btn-find-small">찾아보기</button> <input
											id="matrDivNm" type="text" class="form-control"
											style="width: 100px" readonly="readonly" /></td>
									</tr>
									<tr>
										<th>사용유무</th>
										<td><input type="checkbox" id="notUseYn" name="notUseYn" /></td>
										<th scope="row">안전재고</th>
										<td><input class="form-control" type="text" id="stndrd"
											name="stndrd" style="width: 120px" maxlength="50"/></td>
									</tr>
								</tbody>
							</table>
						</form>
					</div>
					<div class="card-footer small text-muted"></div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>