layui.use(['form','layer','laydate','table','laytpl'],function(){
    var form = layui.form,
        layer = parent.layer === undefined ? layui.layer : top.layer,
        $ = layui.jquery,
        laydate = layui.laydate,
        laytpl = layui.laytpl,
        table = layui.table;
    var arr = [
        {type:'checkbox'},
        {field:'tName', title: '用户名'},
        {field:'tAddress', title: '地址'},
        {field:'tAge', title: '年龄'},
        {fixed: 'right', title:'操作',  width: '13%', align: 'center',toolbar: '#barDemo'}
    ];
    var opt=({
        elem: '#newsList',
        url:'/user/list',
        id: 'tableId',
        page: { //支持传入 laypage 组件的所有参数（某些参数除外，如：jump/elem） - 详见文档
            layout: ['limit', 'count', 'prev', 'page', 'next', 'skip'], //自定义分页布局
            //,curr: 5 //设定初始在第 5 页
            groups: 2, //只显示 1 个连续页码
            first: "首页", //显示首页
            last: "尾页", //显示尾页
            limits:[3,10, 20, 30]
        },
        cellMinWidth: 80, //全局定义常规单元格的最小宽度，layui 2.2.1 新增
        cols: [arr]
    });
    table.render(opt);
//搜索【此功能需要后台配合，所以暂时没有动态效果演示】
    $(".search_btn").on("click",function(){
        if($(".searchVal").val() != ''){
            table.reload("tableId",{
                page: {
                    curr: 1 //重新从第 1 页开始
                },
                where: {
                    username: $(".searchVal").val()  //搜索的关键字
                }
            })
        }else{
            layer.msg("请输入搜索的内容");
        }
    });

    $('.addNews_btn').on('click', function(){
        window.location.href = '/user/add?';


    });

    $(".submit_btn").on("click",function(){
        table.render(opt);

    });


    //监听工具条
    table.on('tool(newsList)', function(obj){ //注：tool是工具条事件名，test是table原始容器的属性 lay-filter="对应的值"
        //debugger
        var data = obj.data; //获得当前行数据
        var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
        var tr = obj.tr; //获得当前行 tr 的DOM对象

        if(layEvent === 'detail'){ //查看
            //do somehing
        } else if(layEvent === 'del'){ //删除
            layer.confirm('真的删除行么', function(index){
                layer.close(index);
                $.ajax({
                    type:'post',

                    url:'/user/delete',
                    dataType:'json',
                    data:{"id":data.tId},//这是是要提交的参数

                    success:function(data){
                        layer.msg("删除成功！");
                        table.reload('tableId')
                    }
                })





                //window.location.href="/user/delete?id="+data.tId;
                //向服务端发送删除指令
            });
        } else if(layEvent === 'edit'){ //编辑
            window.location.href="/user/edit?id="+data.tId;
        }
    });


});


