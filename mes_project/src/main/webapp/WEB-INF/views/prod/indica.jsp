<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <script src="https://code.jquery.com/jquery-3.6.0.js"
   integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
   crossorigin="anonymous"></script>
<link rel="stylesheet" href="//code.jquery.com/ui/1.13.1/themes/base/jquery-ui.css">
  <script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>
  
<style>
body {
   background: #eee
}

#container {
   width : 98%;
   margin : 0 auto;
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



</style>
<link rel="stylesheet"
   href="https://uicdn.toast.com/grid/latest/tui-grid.css" />
<script src="https://uicdn.toast.com/grid/latest/tui-grid.js"></script>



</head>
<body>

   <!-- 헤더부분 -->
   <div class="container-fluid px-4">
      <h1 class="mt-4">생산지시</h1>
      <ol class="breadcrumb mb-4">
         <li class="breadcrumb-item active">생산</li>
      </ol>
   </div>
   <!-- 헤더부분 -->
   <div id="container">
 	
     <div class="linelist">
       <button class="c_btn" form="">초기화</button>
       <button id="btnModal" class="c_btn" form="">생산계획조회</button>
       <button class="c_btn" form="">저장</button>
     </div>
     
	 <div id="grid"></div>
	 <br>
	  <div class="d-flex flex-row justify-content-between">
	     <div id="grid2" style="width: 1000px;">공정자재</div>
	     <div id="grid3" style="width: 500px;">자재지시</div>
	  </div>
	  
	  <div id="dialog" title="생산계획조회"></div>
   <br>
 </div>	
   <script>
   const gridData = [];
   (function() {
      for (let i = 0; i < 0; i += 1) {
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
	          header: '제품코드',
	          name: 'name'
	        },
	        {
	          header: '제품명',
	          name: 'artist'
	        },
	        {
	          header: '계획번호',
	          name: 'type'
	        },
	        {
		      header: '납기일자',
		      name: 'release'
		    },
	        {
	          header: '라인코드',
	          name: 'release'
	        },
	        {
	          header: '공정코드',
	          name: 'release'
	        },
	        {
	          header: '담당자',
	          name: 'release'
	        },
	        {
	          header: '필요수량',
	          name: 'release'
	        },
	        {
	          header: '지시수량',
	          name: 'release'
	        },
	        {
	          header: '작업지시일',
	          name: 'release'
	        }
	      ]
	    });
   
   const gridData2 = [];
   (function() {
      for (let i = 0; i < 0; i += 1) {
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
	          header: '공정코드',
	          name: 'c1'
	        },
	        {
	          header: '자재코드',
	          name: 'c2'
	        },
	        {
	          header: 'LOT번호',
	          name: 'c3'
	        },
	        {
	          header: '사용수량',
	          name: 'c4',
	        },
	        {
	          header: '재고수량',
	          name: 'c5',
	        },
	        {
	          header: '사용량',
	          name: 'c6'
	        }
	      ]
	    });
   
   const gridData3 = [];
   (function() {
      for (let i = 0; i < 0; i += 1) {
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
	      data: gridData2,
	      scrollX: false,
	      scrollY: false,
	      columns: [
	        {
	          header: '공정코드',
	          name: 'c1'
	        },
	        {
	          header: 'LOT번호',
	          name: 'c3'
	        },
	        {
	          header: '사용수량',
	          name: 'c4'
	        }
	      ]
	    });
   
   function makeModal() {
       //모달
       var dialog = $("#dialog").dialog({
         autoOpen: false,
         height: 400,
         width: 350,
         modal: true
       });
       return dialog;
     }

     //버튼 클릭
     $("#btnModal").on("click", function () {
       $("#dialog").load("newfile.do", function() {  // load 앞에 선택자가 와야 함 그 선택자에 ajax로 가져온 결과를 넣음 load(컨트롤러) 도 가능함
         var dialog = makeModal();
         dialog.dialog("open");
       })
     })
   
   	
   </script>
</body>

</html>