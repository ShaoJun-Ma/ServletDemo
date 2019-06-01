package demo02;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
//客户端Http请求
public class TestDemo extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String myName = request.getParameter("myName");
        System.out.println(myName);
        PrintWriter out = response.getWriter();
        out.print(myName);
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.doGet(request,response);
    }
}
