package demo03.session01;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session1")
public class SessionDemo01 extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        //1、创建session
        HttpSession session = request.getSession();
        //2、设置数据
        session.setAttribute("msg","hello session");
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response){
        this.doGet(request,response);
    }

}
