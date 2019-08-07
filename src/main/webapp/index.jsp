<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>登录</title>
    <!-- import CSS -->
    <link rel="stylesheet" href="https://unpkg.com/element-ui/lib/theme-chalk/index.css">
    <style>
        body{
            background: url("img/1.jpg") no-repeat;
            background-size: 100%;
        }
        .input {
            width: 20%;
            position: relative;
            left: 620px;
            top: 250px;
        }
        .button1{
            position: relative;
            width: 6%;
            top: 300px;
            left: 340px;
        }
        .button2{
            position: relative;
            width: 6%;
            top: 300px;
            left: 390px;
        }
        [v-cloak] {
            display: none
        }
    </style>
</head>
<body>
<div id="app">
    <h1 v-cloak style="font-family:'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif">{{title}}</h1>
    <el-input placeholder="请输入用户名" v-model="input1" clearable autocomplete="on" :class="{ input: is }"></el-input>
    <div style="margin: 20px 0;"></div>
    <el-input placeholder="请输入密码" v-model="input2"  show-password :class="{ input: is }"></el-input>
    <el-button type="primary" :class="{button1:is}" v-cloak>{{button1}}</el-button>
    <el-button type="primary" :class="{button2:is}" v-cloak @click="sigin()">{{button2}}</el-button>
</div>
</body>
<!-- import Vue before Element -->
<script src="https://unpkg.com/vue/dist/vue.js"></script>
<!-- import JavaScript -->
<script src="https://unpkg.com/element-ui/lib/index.js"></script>
<script>
    new Vue({
        el: '#app',
        data: function() {
            return {
                input1: '',
                input2:'',
                title:'高校人力资源管理系统',
                button1:'登录',
                button2:'注册',
                is:true
            }
        },
        methods:{
            sigin(){
                location.href="Login";
            }
        }
    })
</script>
</html>