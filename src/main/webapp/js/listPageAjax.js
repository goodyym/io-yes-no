$(document).ready(function(){

    $.ajax({
        url:  $("#ctx").val()+"/login/welcome2Ajax",
        type : "get",
        dataType:"json",
        data:{pageNo:1},
        success:function (data){
            ajaxPage(data['page'].dataCount,data['page'].pageSize,1);
        }
    });

    aa();
});



function ajaxPage(dataCount,pageSize,pageNo){


    $("#showPageId").pagination(dataCount, {
        callback: PageCallback,  //PageCallback() Ϊ��ҳ���ôκ�����
        items_per_page:pageSize,
        num_edge_entries: 2,       //������β��ҳ��Ŀ��
        num_display_entries: 6,    //������ҳ���岿�ַ�ҳ��Ŀ��
        current_page: pageNo-1,   //��ǰҳ����
        link_to:"javascript:void(0)"
    });

    if(pageNo==1){
        PageCallback(0,"222");
    }

}

function PageCallback(pageNo,jq){
    $.ajax({
        url:  $("#ctx").val()+"/login/welcome2Ajax",
        type : "get",
        dataType:"text",
        data:{pageNo:pageNo+1},
        success:function (data){
            resolveData(data);
        }
    });
}

function resolveData(data){
    //var comment = "";
    //$(data['page'].pageResult).each(function(i,index){
    //    comment += index.id +"==========" + index.name+"<br />";
    //});
    //
    //$("#showId").html(comment);
}


function aa(){
    $.ajax({
        url:  $("#ctx").val()+"/login/testVoid",
        type : "get",
        dataType:"json",
        data:{},
        success:function (data){
            console.log(data+"==============");
        }
    });
}