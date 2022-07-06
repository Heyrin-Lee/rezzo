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

#search_box{
width:200px}
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
      <h1 class="mt-4">생산계획조회</h1>
      <ol class="breadcrumb mb-4">
         <li class="breadcrumb-item active">생산</li>
      </ol>
   </div>
   <!-- 헤더부분 -->
     <section>
            <div class="col">
               <div class="card mb-4">
                  <div class="card-header">
                     <i class="fas fa-table me-1"></i> 조건설정
                  </div>
                  <div class="card-body">
                     
                     <form>
                        <div class="mb-3">
                           <label for="frDate">계획일자</label> 
                           <input type="date" id="frDate" name="frDate" style="width: 200px">~<input type="date" id="toDate" name="toDate" style="width: 200px">
                        </div>
                        <div class="mb-3">
                           <label for="all">지시상태</label> 
                            <label><input type="radio" name="all" value="all">전체</label>
                            <label><input type="radio" name="indicaY" value="indicaY">지시</label>
                            <label><input type="radio" name="indicaN" value="indicaN">미지시</label>
                        </div>
                        <div class="mb-3">
                           <label for="name">제품명</label> <input
                              type="text" id="nmae" name="name">
                        </div>
     					<div class="linelist">
                        <button class="c_btn" form="">조회</button>
                     </div>
              	
                     </form>
                  </div>
               </div>
            </div>
         </section>
   
   <div id='grid'></div> 
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
	          header: '계획코드',
	          name: 'name'
	        },
	        {
	          header: '라인코드',
	          name: 'artist'
	        },
	        {
	          header: '제품코드',
	          name: 'type'
	        },
	        {
	          header: '필요수량',
	          name: 'release'
	        },
	        {
	          header: '지시수량',
	          name: 'IndicaCnt'
	        },
	        {
	          header: '작업시작일',
	          name: 'frWkDt'
	        }
	      ]
	    });
   
   
   </script>
</body>

</html>