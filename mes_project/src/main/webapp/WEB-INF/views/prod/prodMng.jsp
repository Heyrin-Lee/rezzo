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

#pDate {
   float: left;
}

#search_box{
width:200px}

#lbtn{
float:left;
display:inline-block;
}

#rbtn{
float:right;
display:inline-block;
}


#grid3{
 float: right;
   margin-top: 0px;
}

</style>
<link rel="stylesheet"
   href="https://uicdn.toast.com/grid/latest/tui-grid.css" />
<script src="https://uicdn.toast.com/grid/latest/tui-grid.js"></script>

</head>
<body>

   <!-- 헤더부분 -->
   <div class="container-fluid px-4">
      <h1 class="mt-4">생산관리</h1>
      <ol class="breadcrumb mb-4">
         <li class="breadcrumb-item active">생산</li>
      </ol>
   </div>
   <!-- 헤더부분 -->
   <button id="lbtn" name="lbtn" class="c_btn" form="">생산지시조회</button>
   <button id="rbtn" name="rbtn" class="c_btn" form="">공정이동표</button>
   <br>
   <br>
   <div id="grid">진행생산지시</div>
   <br>
   <div class="d-flex flex-row justify-content-between">
   	   <div id="grid2"  style="width: 1000px;">공정목록</div>	
	   <div id="grid3" style="width: 400px;">공정가동관리<br>
	   <br>
	   	<div class="linelist">
	       <button id="btnModal" class="c_btn" form="">시작</button>
	       <button class="c_btn" form="">긴급중지</button>
	       <button class="c_btn" form="">재시작</button>
	     </div>
	   </div>
	</div>	  
	<div id="dialog" title="생산지시조회"></div> 

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
	          header: '생산지시일자',
	          name: 'c1'
	        },
	        {
	          header: '제품명',
	          name: 'c2'
	        },
	        {
	          header: '제품코드',
	          name: 'c3'
	        },
	        {
	          header: '수량',
	          name: 'c4',
	        },
	        {
	          header: '라인코드',
	          name: 'c5',
	        },
	        {
	          header: '지시순번',
	          name: 'c6'
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
	          header: '진행공정코드',
	          name: 'c1'
	        },
	        {
	          header: '생산지시일자',
	          name: 'c2'
	        },
	        {
	          header: '공정코드',
	          name: 'c3'
	        },
	        {
	          header: '공정명',
	          name: 'c4',
	        },
	        {
	          header: '담당자',
	          name: 'c5',
	        },
	        {
	          header: '시작시간',
	          name: 'c6'
	        },
	        {
	          header: '종료시간',
	          name: 'c6'
	        },
	        {
	          header: '불량량',
	          name: 'c6'
	        },
	        {
	          header: '현재상태',
	          name: 'c6'
	        },
	        {
	          header: '완제품LOT번호',
	          name: 'c6'
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
     $("#lbtn").on("click", function () {
       $("#dialog").load("newfile.do", function() {  // load 앞에 선택자가 와야 함 그 선택자에 ajax로 가져온 결과를 넣음 load(컨트롤러) 도 가능함
         var dialog = makeModal();
         dialog.dialog("open");
       })
     })
   
   	
   </script>
</body>

</html>