$(document).ready(function () {
   //查询所有商品信息
    var getGoods=function () {

    $.ajax({
        url:"/ssm01/goods/getGoods",
        data:{},
        dataType:"json",
        Type:"post",
        success:function (data) {
            for(var i = 0; i<data.length;i++){
                var $li = $(
                    "<li>" +
                    "<dl>" +
                    "<dt><a href='#' target='_self'><img src='/ssm01/"+data[i].goods_img+"' /></a></dt>" +
                    "<dd class='title'><a href='#' target='_self'>"+data[i].goods_name+"</a></dd>" +
                    "<dd class='price'>"+data[i].goods_price+"</dd>" +
                    "</dl>"+
                    "</li>"
                );
                $("#goods").append($li);

            }
        },
        error:function () {
            alert("由于网络原因,请求失败")
        }
    });
    };
    getGoods();
});

