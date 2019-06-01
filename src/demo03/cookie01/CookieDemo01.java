package demo03.cookie01;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//cookie
@WebServlet("/cookie1")
public class CookieDemo01 extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        //1、创建cookie对象
        Cookie c = new Cookie("msg", "hello");
        //2、服务器发送cookie信息到浏览器，保存在浏览器中
        response.addCookie(c);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response){
        this.doGet(request,response);
    }
}
