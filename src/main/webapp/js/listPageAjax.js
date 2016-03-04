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
        callback: PageCallback,  //PageCallback() 为翻页调用次函数。
        items_per_page:pageSize,
        num_edge_entries: 2,       //两侧首尾分页条目数
        num_display_entries: 6,    //连续分页主体部分分页条目数
        current_page: pageNo-1,   //当前页索引
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