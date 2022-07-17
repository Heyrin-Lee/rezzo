 // 코드화면(왼쪽) 그리드
 const grid = new tui.Grid({
     el: document.getElementById('grid'),
     scrollX: false,
     bodyHeight: 500,
     rowHeaders: ['rowNum'],
     columns: [{
         header: '공통코드',
         name: 'ccd',
         align: 'center',
         sortable: true,
         sortingType: 'desc'
     }, {
         header: '공통코드명',
         name: 'ccdNm',
         align: 'center',
         sortable: true,
         sortingType: 'desc'
     }]
 });

 $.ajax({
     url: "ccdsList",
     method: "GET",
     dataType: "JSON",
     success: function (result) {
         grid.resetData(result);
     }
 });

 //테마 호버
 let hoverOption = {
     row: {
         hover: {
             background: 'rgba(19,78,94,0.2)'
         }
     }
 }
 tui.Grid.applyTheme('default', hoverOption);


 //상세코드 그리드
 const grid2 = new tui.Grid({
     el: document.getElementById('grid2'),
     scrollX: false,
     bodyHeight: 500,
     rowHeaders: ['checkbox'],
     columns: [{
         header: '코드',
         name: 'ccdDtl',
         align: 'center',
         editor: 'text',
         validation: {
             required: true
         },
         sortable: true,
         sortingType: 'desc'
     }, {
         header: '코드명',
         name: 'ccdDtlNm',
         align: 'center',
         editor: 'text',
         validation: {
             required: true
         },
         sortable: true,
         sortingType: 'desc'
     }, {
         header: '코드설명',
         name: 'ccdDtlDesct',
         align: 'center',
         editor: 'text',
         sortable: true,
         sortingType: 'desc'
     }, {
         header: '사용여부',
         name: 'dtlUseYn',
         editor: {
             type: 'select',
             options: {
                 listItems: [{
                         text: 'Y',
                         value: 'Y'
                     },
                     {
                         text: 'N',
                         value: 'N'
                     }
                 ]
             }
         },
         align: 'center',
         sortable: true,
         sortingType: 'desc'
     }]
 });

 //데이터 편집 후 체크박스
 grid2.on('editingFinish', (ev) => {
     const { rowKey } = ev;
     grid2.check(rowKey);
 });
 
 //체크된 셀 하이라이팅
 grid2.on('check', (ev) => {
   grid2.addRowClassName(ev.rowKey, 'highlight2');
 });

 grid2.on('uncheck', (ev) => {
   grid2.removeRowClassName(ev.rowKey, 'highlight2');
 });

 //그리드 영역 벗어나면 수정 종료
 $('#grid2').mouseleave(ev => {
     grid2.finishEditing();
 })

 // 공통코드 클릭시 상세코드 리스트
 var rowCount = 0;
 var selectedRowKey = null;
 
 grid.on('click', ev => {
     var keyword = grid.getValue(ev.rowKey, 'ccdNm');
     var ccd = grid.getValue(ev.rowKey, 'ccd');
     $('#selCcd').val(keyword);

     //셀 클릭시 로우 하이라이팅
     if (selectedRowKey != ev.rowKey) {
         grid.removeRowClassName(selectedRowKey, 'highlight');
     }
     selectedRowKey = ev.rowKey;
     grid.addRowClassName(selectedRowKey, 'highlight');

 	    //세부코드 list 호출
 	    $.ajax({
 	        url: "getCodeList",
 	        method: "POST",
 	        data: {
 	            "ccd": ccd
 	        },
 	        success: function (result) {
 	            setTimeout(function () {
 	                grid2.refreshLayout()
 	            }, 300);
 	            grid2.resetData(result);
 	            rowCount = grid2.getRowCount();
 	        }
 	    });

 	    //코드정보 form
 	    $.ajax({
 	        url: "ccdInfo",
 	        method: "POST",
 	        data: {
 	            "ccd": ccd
 	        },
 	        success: function (result) {
 	            $('#ccd').val(result.ccd).attr("readonly", true);
 	            $('#ccdNm').val(result.ccdNm);
 	            $('#ccdDesct').val(result.ccdDesct);
 	            $('#useYn').val(result.useYn);
 	        }
 	    });
 });
 
 //레이아웃 재배치
 $('#nav-codes-tab').click(ev => {
	 setTimeout(function () {
   		grid2.refreshLayout()
   }, 200);
 });
 
 //기존정보 셀 편집 막기 & 하이라이팅
 var selectedRowKey2 = null;
 grid2.on('click', (ev) => {
     const { columnName, rowKey } = ev;
     if (columnName == 'ccdDtl' && rowKey < rowCount) {
         toastr.warning('이미 저장된 코드ID는 변경할 수 없습니다.');
         return;
     }

     if (selectedRowKey2 != ev.rowKey) {
         grid2.removeRowClassName(selectedRowKey2, 'highlight');
     }
     selectedRowKey2 = ev.rowKey;
     grid2.addRowClassName(selectedRowKey2, 'highlight');

 });

 //검색버튼
 $('#searchBtn').click(ev => {
     search();
 })

 function search() {
     var keyword = $('#selCcd').val()
     $.ajax({
         url: "ccdsSelect",
         method: "POST",
         data: {
             "keyword": keyword
         },
         success: function (result) {
             grid.resetData(result);
         }
     });
 }

 //저장버튼
 $('#saveBtn').click(ev => {
     //상세코드탭
     if ($('#nav-codes').hasClass("active")) {
         var data = grid2.getCheckedRows();
         var ccd = $('#ccd').val();
         $.ajax({
             url: "/saveCcdDtl/" + ccd,
             type: "POST",
             data: JSON.stringify(data),
             contentType: 'application/json',
             success: function (result) {
                 setTimeout(function () {
                     grid2.refreshLayout()
                     grid2.uncheckAll()
                 }, 300);
                 grid2.resetData(result);
                 toastr.success('성공적으로 저장되었습니다.');
             }
         })
       //코드정보탭
     } else if ($('#nav-cdInfo').hasClass("active")) {
     		if ($('#ccd').attr("readonly")!='readonly') {
         //추가
         $.ajax({
             url: "ccdsInsert",
             type: "POST",
             data: $('#dataForm').serialize(),
             dataType: 'json',
             success: function() {
             	$('#ccd').attr("readonly", true);
             	toastr.success('성공적으로 저장되었습니다.');
             	search();
             }
         })
        } else { 
         //수정
         $.ajax({
             url: "ccdsUpdate",
             type: "POST",
             data: $('#dataForm').serialize(),
             dataType: 'json',
             success: function() { search();
             toastr.success('성공적으로 저장되었습니다.');
             }
         })
        }
     }
 });

 //추가버튼
 $('#newBtn').click(ev => {
     //상세코드탭
     if ($('#nav-codes').hasClass("active")) {
         //상세코드탭 오류
         if ($('#selCcd').val() == '') {
             alert('공통코드를 먼저 선택해주세요!')
         } else {
             //그리드 추가
             grid2.appendRow();
         }
         //코드정보탭
     } else if ($('#nav-cdInfo').hasClass("active")) {

         //form 초기화
         $('#dataForm')[0].reset();
         $('#ccd').attr("readonly", false);
     }
 });

 //byte수 출력
 $(function () {
     $('#ccdDesct').keyup(function () {
         bytesHandler(this);
     });
 });

 function getTextLength(str) {
     var len = 0;

     for (var i = 0; i < str.length; i++) {
         if (escape(str.charAt(i)).length == 6) {
             len++;
         }
         len++;
     }
     return len;
 }

 function bytesHandler(obj) {
     var text = $(obj).val();
     $('#limit').text(getTextLength(text));
 }