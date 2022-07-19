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
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.13.1/themes/base/jquery-ui.css">
<script src="https://code.jquery.com/jquery-3.6.0.js"></script>
<script src="https://code.jquery.com/ui/1.13.1/jquery-ui.js"
	integrity = "sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
	crossorigin = "anonymous">
	
</script>
<style>
body {
   background: #eee
}
.c_btn {
   color: #fff;
   font-size: 13px;
   background: #333;
   border: none;
   padding: 6px;
   border-radius: 4px;
   float : right;
}
.linelist {
   float: right;
   margin: 0 20px 20px 0;
   
}
</style>
</head>
<body>

	 <!-- 헤더부분 -->
   <div class="container-fluid px-4">
      <h1 class="mt-4">출고관리</h1>
      <ol class="breadcrumb mb-4">
         <li class="breadcrumb-item active">출고 등록</li>
      </ol>
   </div>
   <!-- 헤더부분 -->
<div id="cont">
	<div class="container-fluid px-4">
		<div class="card mb-4">	 
		</div>
		<div class="row">
			<div class="col-lg-6">
				<div class="card mb-4">
					<div class="card-header">
						<i class="fas fa-chart-bar me-1"></i> 진행중 주문서 현황
					</div>
					<div class="card-body">
						<div id="grid"></div>
					</div>
				</div>
			</div>
			<div class="col-lg-6">
				<div class="card mb-4">
					<div class="card-header">
						<i class="fas fa-chart-pie me-1"></i> 출고 등록 현황
					<button class="c_btn">확인</button>
						
					</div>
					<div class="card-body">
						<div id="grid2"></div>
					</div>
				</div>
			</div>
		</div>
	</div>
	</div>
	
	<!-- modal -->
	<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">검사내역</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div id="modGrid" class="modal-body"></div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">닫기</button>
                    <button type="button" class="btn btn-primary">가져오기</button>
                </div>
            </div>
        </div>
    </div>
	
	<script>
	//진행중 주문서 현황 데이터
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
	
		//출고등록 현황 데이터
		const gridData2 = [
	      {
	        name: 'Beautiful Lies',
	        artist: 'Birdy',
	        release: '2016.03.26',
	        type: 'Deluxe',
	        genre: 'Pop'
	      },
	      {
	        name: 'X',
	        artist: 'Ed Sheeran',
	        release: '2014.06.24',
	        type: 'Deluxe',
	        genre: 'Pop',
	        _attributes: {
	          disabled: true // A current row is disabled
	        }
	      },
	      {
	        name: 'Moves Like Jagger',
	        release: '2011.08.08',
	        artist: 'Maroon5',
	        type: 'Single',
	        genre: 'Pop,Rock',
	        _attributes: {
	          checkDisabled: true // A checkbox is disabled only
	        }
	      },
	      {
	        name: 'A Head Full Of Dreams',
	        artist: 'Coldplay',
	        release: '2015.12.04',
	        type: 'Deluxe',
	        genre: 'Rock',
	        _attributes: {
	          checked: true, // A checkbox is already checked while rendering
	          className: {
	            // Add class name on a row
	            row: ['red']
	          }
	        }
	      },
	      {
	        name: '19',
	        artist: 'Adele',
	        release: '2008.01.27',
	        type: 'EP',
	        genre: 'Pop,R&B',
	        _attributes: {
	          rowSpan: {
	            // Merge rows
	            artist: 3,
	            genre: 2
	          }
	        }
	      },
	      {
	        name: '21',
	        artist: 'Adele',
	        release: '2011.01.21',
	        type: 'Deluxe',
	        genre: 'Pop,R&B'
	      },
	      {
		        name: '21',
		        artist: 'Adele',
		        release: '2011.01.21',
		        type: 'Deluxe',
		        genre: 'Pop,R&B'
		      },
	      {
	        name: '25',
	        artist: 'Adele',
	        release: '2015.11.20',
	        type: 'EP',
	        genre: 'Pop',
	        _attributes: {
	          className: {
	            // Add class name on each columns
	            column: {
	              type: ['blue'],
	              genre: ['blue']
	            }
	          }
	        }
	      }
	    ];
		
		//진행중 주문서 현황 그리드
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
	          header: '제품코드',
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
	    
		//출고 등록 현황 그리드
	    const grid2 = new tui.Grid({
	        el: document.getElementById('grid2'),
	        data: gridData2,
	        scrollX: false,
	        bodyHeight: 300,
	        rowHeight: 35,
	        rowHeaders: ['checkbox'],
	        columns: [
	          {
	            header: '제품코드',
	            name: 'name'
	          },
	          {
	            header: '완제품LOT번호',
	            name: 'artist'
	          },
	          {
	            header: '출고일자',
	            name: 'type'
	          },
	          {
	            header: '출고수량',
	            name: 'release'
	          }
	        ]
	      });
	
	 // 완제품 재고 모달 그리드
	    const modGrid = new tui.Grid({
	        el: document.getElementById('modGrid'),
	        scrollX: false,
	        scrollY: false,
	        rowHeaders: ['checkbox'],
	        columns: [
	            {
	                header: '검사번호',
	                name: 'inspCd',
	                width: 100
	            },
	            {
	                header: '검사일자',
	                name: 'inspDt',
	                width: 100
	            },
	            {
	                header: '업체명',
	                name: 'vend',
	                width: 100
	            },
	            {
	                header: '수량',
	                name: 'cnt',
	                width: 100
	            }
	        ],
	        data: [
	            {
	                inspCd: '12-33',
	                inspDt: '13-23',
	                vend: '13-23',
	                cnt: '15-23'
	            }
	        ]
	    });
	</script>
</body>
</html>