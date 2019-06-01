package demo01;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
//servlet生命周期

public class HelloWorld extends HttpServlet{
    private String message;
    //init()：初始化
    public void init(){
        message = "hello World";
    }
    public void service(ServletRequest request, ServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        out.print(message);

    }
    public void destroy(){
        //销毁
        //这里什么都没做
    }
}
