
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HealthServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain; version=0.0.4; charset=utf-8");
        resp.getWriter().print("namespace_pod{tenant=\"系统部\",namespace=\"ns1\",app=\"app1\",service=\"svc1\",} 1\n" +
                "namespace_pod{tenant=\"测试部\",namespace=\"ns1\",app=\"app1\",service=\"svc1\",} 1\n" +
                "namespace_pod{tenant=\"开发部\",namespace=\"ns1\",app=\"app1\",service=\"svc1\",} 1\n" +
                "\n");
    }
}
