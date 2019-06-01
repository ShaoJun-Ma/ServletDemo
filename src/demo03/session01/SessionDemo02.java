package demo03.session01;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session2")
public class SessionDemo02 extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        //3、获取session
        HttpSession session = request.getSession();
        //4、获取数据
        Object msg = session.getAttribute("msg");
        System.out.println(msg);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response){
        this.doGet(request,response);
    }
}
