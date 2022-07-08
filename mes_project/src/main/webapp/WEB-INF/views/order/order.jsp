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
   margin-top: 0px;
   margin-left : 75%;
   margin-bottom : 10px;
}
label {
	width: 100px;
	float: left;
}
#search {
	display : inline-block;
	float : right;
	color: #fff;
    font-size: 13px;
    background: #333;
    border: none;
    padding: 6px;
    border-radius: 4px
}
.form-label {
	display : inline;
}
#search_box{
	width:200px;
}

.r_input{
	margin : 0px 10px;
	display: inline-block;
}
.form-control {
	width: 150px;
}



</style>
<link rel="stylesheet"
   href="https://uicdn.toast.com/grid/latest/tui-grid.css" />
<script src="https://uicdn.toast.com/grid/latest/tui-grid.js"></script>
 <link rel="stylesheet" href="//code.jquery.com/ui/1.13.1/themes/base/jquery-ui.css">
  <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
  <script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"></script>
    <script>integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
   crossorigin="anonymous"></script>



</head>
<body>

   <!-- 헤더부분 -->
   <div class="container-fluid px-4">
      <h1 class="mt-4">영업관리</h1>
      <ol class="breadcrumb mb-4">
         <li class="breadcrumb-item active">주문서 관리</li>
      </ol>
   </div>
   <!-- 헤더부분 -->
	
   <div class="card mb-4">
      <div id="cont" style="padding-bottom:0px">
         <section id="r_section">
            <div class="col">
               <div class="card mb-4">
                  <div class="card-header">
                     <i class="fas fa-tachometer-alt"></i> 주문서 조회
                  </div>
	<div class="card-body">
                     <form>
                      <div class="r_input">
                        <div class="mb-3">
                           <label for="no" class="form-label">진행상황</label>&nbsp;
                           <input type="radio" id="ing" name="ing">진행
                           <input type="radio" id="complete" name="complete">완료
                           <input type="radio" id="every" name="every">전체
                        </div>
                        <div class="mb-3">
                           <label for="inputPassword2" class="form-label">거래처명</label>
    						<input type="password" class="form-control" id="inputPassword2">
                            <button class="c_btn" id="openCompany" form="">검색</button>
                        </div>
                        <div class="mb-3">
                           <label for="email" class="form-label">제품명</label> 
                           <input type="text" class="form-control" id="product" name="product">
                           <button class="c_btn" id="openProduct" form="">검색</button>
                        </div>
                        <div class="mb-4">
                           <label for="email" class="form-label">주문일자</label> 
                           <input type="date" id=""> - <input type="date" id="">
                        </div>
                       </div>
                     </form>
                  </div>
               </div>
            </div>
         </section>
      </div>
       <div class="linelist">
   		<button class="c_btn" id="orderRegister">주문서 등록</button>
   		<button class="c_btn">주문서 조회</button>
   </div>
   </div>
  
  <!-- 거래처목록 모달 팝업창 -->
   <div id="dialogCom" title="거래처 목록">
   
   </div>
   
    <!-- 제품명목록 모달 팝업창 -->
   <div id="dialogPro" title="제품명 목록">
   
   </div>
  
   <!-- 주문서등록 모달 팝업창 -->
   <div id="dialogRegi" title="주문서등록">
   
   </div>
  	
   <div id="grid"></div>
   <br>
	
   <script>
   /* 그리드 */
   const gridData = [];

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
	          header: '주문코드',
	          name: 'c1'
	        },
	        {
	          header: '거래처',
	          defaultValue: 2,
	          name: 'c2'
	        },
	        {
	          header: '주문일자',
	          name: 'c3'
	        },
	        {
		       header: '납기일자',
		       name: 'c3'
		        },
		    {
			    header: '진행상황',
			    name: 'c3'
			     },
		    {
				 header: '완제품코드',
				 name: 'c3'
				  },
			{
				  header: '제품명',
				  name: 'c3'
				   },
			{
				   header: '주문수량',
				   name: 'c3'
				    }	   
			        
	      ],
	      data: gridData
	    });
	    
	 /* 거래처 목록 모달 */
	 $(function() {
		 function makeModal() {
	          var dialogCom = $("#dialogCom").dialog({
	            autoOpen: false,
	            height: 400,
	            width: 350,
	            modal: true, //true:모달창 열려있어도 부모페이지 제어 가능, true:부모페이지 제어 불가능
	            
	          });
	          return dialogCom;
	  	}
		 $("#openCompany").on("click",function(){
		        $("#dialogCom").load("companyList.do",function() {
		          var dialogCom = makeModal();
		        

		          dialogCom.dialog("open");
		      
		        });
		    });
	 })
	 
	 /* 제품명 목록 모달 */
	 $(function() {
		 function makeModal() {
	          var dialogPro = $("#dialogPro").dialog({
	            autoOpen: false,
	            height: 400,
	            width: 350,
	            modal: true, //true:모달창 열려있어도 부모페이지 제어 가능, true:부모페이지 제어 불가능
	            
	          });
	          return dialogPro;
	  	}
		 $("#openProduct").on("click",function(){
		        $("#dialogPro").load("productList.do",function() {
		          var dialogPro = makeModal();
		        

		          dialogPro.dialog("open");
		      
		        });
		    });
	 })
	 
	 /* 주문서 등록 모달 */
	 $(function() {
		 function makeModal() {
	          var dialogRegi = $("#dialogRegi").dialog({
	            autoOpen: false,
	            height: 400,
	            width: 350,
	            modal: true, //true:모달창 열려있어도 부모페이지 제어 가능, true:부모페이지 제어 불가능
	            
	          });
	          return dialogRegi;
	  	}
		 $("#orderRegister").on("click",function(){
		        $("#dialogRegi").load("orderRegister.do",function() {
		          var dialogPro = makeModal();
		        

		          dialogPro.dialog("open");
		      
		        });
		    });
	 })
	 
   </script>
   
   
</body>

</html>