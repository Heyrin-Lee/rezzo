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

#container {
   width : 98%;
   margin : 0 auto;
}

.col {
   width: 100%
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
      <h1 class="mt-4">공정실적조회</h1>
      <ol class="breadcrumb mb-4">
         <li class="breadcrumb-item active">생산</li>
      </ol>
   </div>
   <!-- 헤더부분 -->
  <div id="container">
     <section>
            <div class="col">
               <div class="card mb-4">
                  <div class="card-header">
                     <i class="fas fa-table me-1"></i> 조건설정
                  </div>
                  <div class="card-body">
                     
                     <form>
                        <div class="mb-3">
                           <label for="name">생산지시코드</label> 
               				<input type="text" id="name" name="name">
                        </div>
                        <div class="mb-3">
                           <label for="prcsName">공정명</label> 
                           <input type="text" id="prcsName" name="prcsName">
                        </div>
                        <div class="mb-3">
                           <label for="prcs">공정분류</label> 
                           <input type="text" id="prcs" name="prcs">
                        </div>
                        <div class="mb-3">
                           <label for="prcs">계획일자</label> 
                           <input type="date" id="frDate" name="frDate" style="width: 200px">~<input type="date" id="toDate" name="toDate" style="width: 200px">
                        </div>
     					<div class="linelist">
                        <button class="c_btn" form="">검색</button>
                        <button class="c_btn" form="">초기화</button>
                     </div>
              	
                     </form>
                  </div>
               </div>
            </div>
         </section>
   <div id='grid'></div>
   </div> 
   <script>
   const gridData = [];
   (function() {
      for (let i = 0; i < 1; i += 1) {
         gridData.push({
            c1 : 'User' + (i + 1),
            c2 : ((i + 5) % 8) * 100 + i,
            c3 : ((i + 3) % 7) * 60,
            c4 : ((i + 3) % 7) * 60
         });
      }
   })();
   const grid = new tui.Grid({
	      el: document.getElementById('grid'),
	      data: gridData,
	      scrollX: false,
	      scrollY: false,
	      columns: [
	        {
	          header: '생산지시일자',
	          name: 'name'
	        },
	        {
	          header: '생산계획코드',
	          name: 'artist'
	        },
	        {
	          header: '공정명',
	          name: 'type'
	        },
	        {
	          header: '설비코드',
	          name: 'release'
	        },
	        {
	          header: '설비명',
	          name: 'IndicaCnt'
	        },
	        {
	          header: '투입량',
	          name: 'frWkDt'
	        },
	        {
	          header: '생산량',
	          name: 'frWkDt'
	        },
	        {
	          header: '불량량',
	          name: 'frWkDt'
	        },
	        {
	          header: '불량코드',
	          name: 'frWkDt'
	        },
	        {
	          header: '불량상세',
	          name: 'frWkDt'
	        },
	        {
	          header: '시작시간',
	          name: 'frWkDt'
	        },
	        {
	          header: '종료시간',
	          name: 'frWkDt'
	        },
	        {
	          header: '담당자',
	          name: 'frWkDt'
	        }
	      ]
	    });
    
   
   
   </script>
</body>

</html>