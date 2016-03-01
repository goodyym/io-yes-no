$(document).ready(function(){

    ajaxPage(1);
});

function resolveData(data){
    var comment = "";
    $(data['page'].pageResult).each(function(i,index){
        comment += index.id +"==========" + index.name+"<br />";
    });

    $("#showId").html(comment);
}

function ajaxPage(pageNo){
    $.ajax({
        url:  $("#ctx").val()+"/login/welcome2Ajax",
        type : "get",
        dataType:"json",
        data:{pageNo:pageNo},
        success:function (data){
            var comment1 = "";
            for(var i= 1;i<=data['page'].maxPage;i++){
                comment1 += "<a href='javascript:void(0);' onclick='ajaxPage("+i+")'>"+i+"</a>&nbsp;&nbsp;&nbsp;";
            }

            $("#showPageId").html(comment1);
            resolveData(data);
        }
    });
}