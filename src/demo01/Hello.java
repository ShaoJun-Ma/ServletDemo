package demo01;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

//使用注解
@WebServlet("/hello2")
public class Hello extends HttpServlet{
    private String message;

    //初始化
   public void init(){
       message = "hello white";
   }

   public void service(ServletRequest request, ServletResponse response) throws IOException {
       PrintWriter out = response.getWriter();
       out.write(message);
   }

   public void destroy(){
       //销毁
   }
}
