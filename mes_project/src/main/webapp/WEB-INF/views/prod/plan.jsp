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
   width: 700px
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
   margin: 0 20px 20px 0;
   
}

#pDate {
   float: left;
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
      <h1 class="mt-4">생산계획</h1>
      <ol class="breadcrumb mb-4">
         <li class="breadcrumb-item active">생산</li>
      </ol>
   </div>
   <!-- 헤더부분 -->
 	 <div id="pDate">
 	 	<label>생산계획일자</label>
 	 	<input type="date">
 	 </div>  
     <div class="linelist">
       <button class="c_btn" form="">주문서조회</button>
       <button class="c_btn" form="">계획등록</button>
       <button class="c_btn" form="">저장</button>
     </div>
     
	 <div id="grid"></div>
	 <br>
	 <div class="container">
	  <div class="row justify-content-between">
	     <div id="grid2" style="width: 700px;">제품</div>
	     <div id="grid3" style="width: 300px;">제품공정확인</div>
	  </div>
	  <br>
	  <div class="row justify-content-between">
	  	 <div id="grid4" style="width: 700px;">사용가능자재</div>
	     <div id="grid5" style="width: 300px;">자재확인</div>
      </div>
     </div>
   <br>

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
	          header: '주문코드',
	          name: 'artist'
	        },
	        {
	          header: '주문량',
	          name: 'type'
	        },
	        {
	          header: '납기일자',
	          name: 'release'
	        }
	      ]
	    });
   
   const gridData2 = [];
   (function() {
      for (let i = 0; i < 2; i += 1) {
         gridData2.push({
            c1 : 'User' + (i + 1),
            c2 : ((i + 5) % 8) * 100 + i,
            c3 : ((i + 3) % 7) * 60,
            c4 : ((i + 3) % 7) * 60
         });
      }
   })();
   
   const grid2 = new tui.Grid({
	      el: document.getElementById('grid2'),
	      data: gridData2,
	      scrollX: false,
	      scrollY: false,
	      columns: [
	        {
	          header: '제품코드',
	          name: 'c1'
	        },
	        {
	          header: '제품명',
	          name: 'c2'
	        },
	        {
	          header: '라인번호',
	          name: 'c3'
	        },
	        {
	          header: '시작일자',
	          name: 'c4'
	        },
	        {
	          header: '종료일자',
	          name: 'c5'
	        },
	        {
	          header: '생산수량',
	          name: 'c6'
	        },
	        {
		      header: '작업우선순위',
		      name: 'c7'
		    },
	        {
	          header: '계획코드',
	          name: 'c8'
	        }
	      ]
	    });
   const gridData3 = [];
   (function() {
      for (let i = 0; i < 2; i += 1) {
         gridData3.push({
            c1 : 'User' + (i + 1),
            c2 : ((i + 5) % 8) * 100 + i,
            c3 : ((i + 3) % 7) * 60,
            c4 : ((i + 3) % 7) * 60
         });
      }
   })();
   
   const grid3 = new tui.Grid({
	      el: document.getElementById('grid3'),
	      data: gridData3,
	      scrollX: false,
	      scrollY: false,
	      columns: [
	        {
	          header: '제품코드',
	          name: 'name'
	        },
	        {
	          header: '라인번호',
	          name: 'artist'
	        },
	        {
	          header: '공정코드',
	          name: 'type'
	        },
	        {
	          header: '계획코드',
	          name: 'release'
	        }
	      ]
	    });
   
   const gridData4 = [];
   (function() {
      for (let i = 0; i < 1; i += 1) {
         gridData4.push({
            c1 : 'User' + (i + 1),
            c2 : ((i + 5) % 8) * 100 + i,
            c3 : ((i + 3) % 7) * 60,
            c4 : ((i + 3) % 7) * 60
         });
      }
   })();
   const grid4 = new tui.Grid({
	      el: document.getElementById('grid4'),
	      data: gridData,
	      scrollX: false,
	      scrollY: false,
	      columns: [
	        {
	          header: '자재코드',
	          name: 'name'
	        },
	        {
	          header: '자재LOT',
	          name: 'artist'
	        },
	        {
	          header: '사용가능수량',
	          name: 'type'
	        },
	        {
	          header: '출고수량',
	          name: 'release'
	        },
	        {
	          header: '사용량',
	          name: 'release'
		    }
	      ]
	    });
   
   const gridData5 = [];
   (function() {
      for (let i = 0; i < 1; i += 1) {
         gridData5.push({
            c1 : 'User' + (i + 1),
            c2 : ((i + 5) % 8) * 100 + i,
            c3 : ((i + 3) % 7) * 60,
            c4 : ((i + 3) % 7) * 60
         });
      }
   })();
   const grid5 = new tui.Grid({
	      el: document.getElementById('grid5'),
	      data: gridData,
	      scrollX: false,
	      scrollY: false,
	      columns: [
	        {
	          header: '자재코드',
	          name: 'name'
	        },
	        {
	          header: '공정코드',
	          name: 'artist'
	        },
	        {
	          header: '출고수량',
	          name: 'type'
	        },
	        {
	          header: '계획코드',
	          name: 'release'
	        }
	      ]
	    });

	   
   </script>
</body>

</html>