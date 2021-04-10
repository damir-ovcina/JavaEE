package test;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/test")
public class TestServlet extends HttpServlet {

    @EJB
    TestEjb testEjb;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int a =10;
        int b =20;
        int res = testEjb.addTwoNumbers(a,b);

        resp.getWriter().write("a + b = " + res);
    }
}
