//package org;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * Created by cxd on 2016/11/22.
// */
//@WebServlet(name = "SendMailTest")
//public class SendMailTest extends HttpServlet {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        User user = userDao.getUser();
//        if (user != null && user.getQybj() != 1) {
//            String email = user.getEmail();
//            StringBuffer content = new StringBuffer("<h2>请点击下面的链接激活帐号，链接只能使用一次，请尽快激活！</h2>");
//            String nameMd5 = MD5Util.encodeToHex(user.getUsername()+"审核通过");//创建加密字符串
//            content.append("<a style='font-size:16px;' href='http://localhost:8080/czfc/register.reg?doType=activate&")
//                    .append("email=" + email + "&name=" + nameMd5 +"'>")
//                    .append("http://localhost:8080/czfc/register.reg?doType=activate&")
//                    .append("email=" + email + "&name=" + nameMd5 + "</a><br/><br/>")
//                    .append("<span style='color:blue;font-size:20px;font-weight:bold;'>———浙江常山欢迎您！<span>");
//            SendMailUtil.send(email, content.toString());//开始发送邮件
//        }
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//doPost(request,response);
//    }
//}
