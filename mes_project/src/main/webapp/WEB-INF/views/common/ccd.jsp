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
<script src="https://code.jquery.com/jquery-3.6.0.js"
	integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
	crossorigin="anonymous"></script>
</head>
<body>
	<div class="container-fluid px-4">
		<h1 class="mt-4">Tables</h1>
		<ol class="breadcrumb mb-4">
			<li class="breadcrumb-item"><a href="index.html">Dashboard</a></li>
			<li class="breadcrumb-item active">Tables</li>
		</ol>
		<div class="card mb-4">
			<div class="card-body">
				DataTables is a third party plugin that is used to generate the demo
				table below. For more information about DataTables, please visit the
				<a target="_blank" href="https://datatables.net/">official
					DataTables documentation</a> .
			</div>
		</div>
		<div class="card mb-4">
			<div class="card-header">
				<i class="fas fa-table me-1"></i> DataTable Example
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
          name: 'id'
        },
        {
          header: 'CITY',
          name: 'city',
          editor: 'text'
        },
        {
          header: 'COUNTRY',
          name: 'country'
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
		</div>
	</div>

</body>
</html>