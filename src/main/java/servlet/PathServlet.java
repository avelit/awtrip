package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        name = "pathGoogle", 
        urlPatterns = {"/path"}
    )
public class PathServlet extends HttpServlet {

  private static final long serialVersionUID = -930386857509367419L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        ServletOutputStream out = resp.getOutputStream();
        out.write(("Hello! Wait for around the world service here! You start from " + req.getParameter("startPoint")).getBytes());
        out.flush();
        out.close();
    }
    
}
