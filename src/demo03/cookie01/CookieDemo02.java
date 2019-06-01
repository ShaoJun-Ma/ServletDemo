package demo03.cookie01;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie2")
public class CookieDemo02 extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        //3、获取cookie
        Cookie[] cookies = request.getCookies();
        //获取数据，遍历cookies
        if(cookies!=null){
            for(Cookie c:cookies){
                String name = c.getName();
                String value = c.getValue();
                System.out.println(name+"---"+value);
            }
        }
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response){
        this.doGet(request,response);
    }
}
