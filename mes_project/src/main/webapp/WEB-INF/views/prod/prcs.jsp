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
      <h1 class="mt-4">공정관리</h1>
      <ol class="breadcrumb mb-4">
         <li class="breadcrumb-item active">생산</li>
      </ol>
   </div>
   <!-- 헤더부분 -->
   <div>
      <div>
         <section>
            <div>
               <div class="card-header">
                  <div class="sb-nav-link-icon">
                     <i class="fas fa-table me-1"></i> 공정목록
                  </div>
               </div>
               <br>
               <div>
               		 <div class="linelist">
               		 	<button id="addBtn" class="c_btn" form="">추가</button>
               		 	<button class="c_btn" form="">저장</button>
                        <button class="c_btn" form="">삭제</button>
                     </div>
                     <br>
                     <br>
                   <div id="grid"></div>
               </div>
            </div>
         </section>
      </div>
   </div>



   <br>

   <script>
   const gridData = [
	      {
	        name: 'Beautiful Lies',
	        artist: 'Birdy',
	        release: '2016.03.26',
	        type: 'Deluxe',
	        genre: 'Pop'
	      }
	      ]

      const grid = new tui.Grid({
          el: document.getElementById('grid'),
          data: gridData,
          scrollX: false,
          scrollY: false,
          rowHeaders: ['checkbox'],
          columns: [
            {
              header: '공정코드',
              name: 'name',
              editor: 'text'
            },
            {
              header: '공정명',
              name: 'artist',
              editor: 'text'
            },
            {
              header: '공정구분',
              name: 'type',
              editor: 'text'
            },
            {
              header: '공정설명',
              name: 'release',
              editor: 'text'
            }
          ]
        });
   var rowData = [{cntCd: "", cntNm: "", cntKorNm: "",  cntetKorNm: "", useYn : "" , dispSeq: ""}]
   let addBtn = document.getElementById('addBtn')
   addBtn.addEventListener('click', function(e){
	   grid.appendRow(rowData,{
		   at : grid.getRowCount(),
		   focus : true
		   });
		   grid.enable()
   })
   
   </script>
</body>

</html>