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
        sortable: true,
        sortingType: 'desc'
    }, {
        header: '코드명',
        name: 'ccdDtlNm',
        align: 'center',
        editor: 'text',
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
            type: 'radio',
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

// 공통코드 클릭시 상세코드 리스트
grid.on('click', ev => {
    var keyword = grid.getValue(ev.rowKey, 'ccdNm');
    var ccd = grid.getValue(ev.rowKey, 'ccd');
    $('#selCcd').val(keyword);

    //list 호출
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
            console.log(result);
            //$('#ccd').val(result[0].ccd);
            //$('#ccdNm').val(result[0].ccdNm);
            //$('#ccdDesct').val(result[0].ccdDesct);
            //$('#useYn').val(result[0].useYn);
        }
    });

});

//검색버튼
$('#searchBtn').click(ev => {
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
})

//저장버튼
$('#saveBtn').click(ev => {
    if ($('#selCcd').val() == '') {
        alert('공통코드를 먼저 선택해주세요!')
    } else {

        if ($('#nav-codes').hasClass("active")) {
            //그리드 저장
            grid2.appendRow();

        } else if ($('#nav-cdInfo').hasClass("active")) {
            //form 저장
            $('#dataForm')[0].reset();
        }
    }
});

//추가버튼
$('#newBtn').click(ev => {
    if ($('#selCcd').val() == '') {
        alert('공통코드를 먼저 선택해주세요!')
    } else {

        if ($('#nav-codes').hasClass("active")) {
            //그리드 추가
            grid2.appendRow();

        } else if ($('#nav-cdInfo').hasClass("active")) {
            //form 초기화
            $('#dataForm')[0].reset();
        }
    }
});

//byte수 출력
$(function () {
    $('#codeIdDc').keyup(function () {
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
