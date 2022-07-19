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

#cont {
	display: flex;
	justify-content: center;
	align-items: center;
	width: 100%;
	padding: 3%;
	margin: 0, -5%, 0, -5%
}

#l_section {
	float: left;
	margin-right: 8%;
}

#r_section {
	float: right;
	margin-bottom: 4%;
	margin-right: 4%;
}

.col {
	width: 300px
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
	float: right;
	margin-top: 0px;
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
			<li class="breadcrumb-item active">라인관리</li>
		</ol>
		</div>
		<!-- 헤더부분 -->
		
		<div class="card mb-4">
			<div id="cont">

				<section id="l_section">
					<div class="card mb-4">
						<div class="card-header">
							<div class="sb-nav-link-icon">
								<i class="fas fa-table me-1"></i> 라인목록
							</div>
						</div>
						<br>
						<div class="card-body">
							<div id="grid" style="width: 600px;"></div>
						</div>
					</div>
				</section>

				<section id="r_section">
					<div class="col">
						<div class="card mb-4">
							<div class="card-header">
								<i class="fas fa-tachometer-alt"></i> 라인정보
							</div>

							<div class="card-body">
								<div class="linelist">
									<button class="c_btn" form="">등록</button>
									<button class="c_btn" form="">수정</button>
									<button class="c_btn" form="">삭제</button>
									<button class="c_btn" form="">취소</button>
								</div>
								<br> <br>
								<form>
									<div class="mb-3">
										<label for="no" class="form-label">라인코드</label> <input
											type="text" class="form-control" id="no" name="no">
									</div>
									<div class="mb-3">
										<label for="id" class="form-label">UPH생산량</label> <input
											type="text" class="form-control" id="id" name="id">
									</div>
									<div class="mb-3">
										<label for="email" class="form-label">담당자</label> <input
											type="text" class="form-control" id="email" name="email">
									</div>
									<div class="mb-4">
										<label for="email" class="form-label">사용여부</label> <input
											type="checkbox" id="check">
									</div>
								</form>
							</div>
						</div>
					</div>
				</section>
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
						c4 : ((i + 3) % 7) * 60
					});
				}
			})();

			const grid = new tui.Grid({
				el : document.getElementById('grid'),
				data : gridData,
				scrollX : false,
				bodyHeight : 500,
				columns : [ {
					header : '라인코드',
					name : 'c1',
					align : 'center',
				}, {
					header : 'UPH생산량',
					name : 'c2',
					align : 'center'
				}, {
					header : '담당자',
					name : 'c3',
					align : 'center'
				}, {
					header : '사용여부',
					name : 'c4',
					align : 'center'
				} ]
			});
		</script>
</body>

</html>