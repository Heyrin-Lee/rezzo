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
	
   <script>
   
   
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