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
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>

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

</head>
<body>

   <!-- 헤더부분 -->
   <div class="container-fluid px-4">
      <h1 class="mt-4">완제품 재고관리</h1>
      <ol class="breadcrumb mb-4">
         <li class="breadcrumb-item active">완제품 재고조회</li>
      </ol>
   </div>
   <!-- 헤더부분 -->
     <section>
            <div class="col">
               <div class="card mb-4">
                  <div class="card-header">
                     <i class="fas fa-table me-1"></i> 조건별 조회
                  </div>
                  <div class="card-body">
                     
                     <form>
                        <div class="mb-3">
                           <label for="frDate">제품명</label> 
                           <input
                              type="text" id="nmae" name="name">
                              <input type="button" class="c_btn" data-bs-toggle="modal" data-bs-target="#proModal" value="검색"></input>
                        </div>
                        <div class="mb-3">
                           <label for="all">제조일자</label> 
                            <input type="date" id="frDate" name="frDate" style="width: 200px">~<input type="date" id="toDate" name="toDate" style="width: 200px">
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
   
   <!-- 제품명 모달 -->
	    <div class="modal fade" id="proModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">완제품 목록</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div id="proGrid" class="modal-body"></div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">닫기</button>
                    <button type="button" class="btn btn-primary">가져오기</button>
                </div>
            </div>
        </div>
    </div>
 	
   <script>
   const gridData = [
	      {
	        c1: '100013',
	        c2: 'Mustafa Cosme',
	        c3: 291232
	      },
	      {
	        c1: '201212',
	        c2: 'Gunnar Fausto',
	        c3: 32123
	      },
	      {
	        c1: '241221',
	        c2: 'Junior Morgan',
	        c3: 88823
	      },
	      {
	        c1: '991232',
	        c2: 'Tódor Ingo',
	        c3: 9981
	      },
	      {
	        c1: '299921',
	        c2: 'Zezé Obadiah',
	        c3: 140212
	      },
	      {
	        c1: '772193',
	        c2: 'Alfwin Damir',
	        c3: 30012
	      },
	      {
	        c1: '991232',
	        c2: 'Feroz Fredrik',
	        c3: 111023
	      },
	      {
	        c1: '572812',
	        c2: 'Archer Beniamino',
	        c3: 229123
	      },
	      {
	        c1: '310832',
	        c2: 'Dado Shaul',
	        c3: 123
	      },
	      {
	        c1: '321232',
	        c2: 'Svetoslav Eder',
	        c3: 81252
	      },
	      {
	        c1: '229123',
	        c2: 'Lauri Gligor',
	        c3: 230923
	      },
	      {
	        c1: '589282',
	        c2: 'Ruben Bèr',
	        c3: 11523
	      },
	      {
	        c1: '321234',
	        c2: 'Vicenç Hadrien',
	        c3: 29912
	      },
	      {
	        c1: '632123',
	        c2: 'Borna Rochus',
	        c3: 62842
	      },

	      {
	        c1: '122123',
	        c2: 'Kristijonas Tate',
	        c3: 199823
	      },
	      {
	        c1: '211232',
	        c2: 'Kumara Archimedes',
	        c3: 112522
	      },
	      {
	        c1: '487297',
	        c2: 'Hershel Radomil',
	        c3: 399123
	      },
	      {
	        c1: '232123',
	        c2: 'Toma Levan',
	        c3: 231253
	      },
	      {
	        c1: '828723',
	        c2: 'Njord Thoko',
	        c3: 89123
	      }
	    ];
	
   		//출고 목록 그리드
	    const grid = new tui.Grid({
	      el: document.getElementById('grid'),
	      scrollX: false,
	      bodyHeight: 300,
	      rowHeight: 35,
	      rowHeaders: ['rowNum'],
	      header: {
	        height: 40
	      },
	      columns: [
	        {
	          header: '거래처',
	          name: 'c1'
	        },
	        {
	          header: '완제품LOT번호',
	          defaultValue: 2,
	          name: 'c2'
	        },
	        {
	          header: '제품코드',
	          name: 'c3'
	        },
	        {
		      header: '제품명',
		      name: 'c3'
		    },
		    {
		      header: '주문코드',
		      name: 'c3'
		    },
		    {
		      header: '출고일자',
		      name: 'c3'
		     },
		     {
		       header: '출고량',
		       name: 'c3'
		      }
	      ],
	      data: gridData
	    });
   		   
   </script>
</body>
</html>