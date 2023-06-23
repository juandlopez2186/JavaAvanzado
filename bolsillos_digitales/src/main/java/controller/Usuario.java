package controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.UsuarioDAO;
import model.UsuarioVO;
public class Usuario extends HttpServlet{
    UsuarioVO b=new UsuarioVO();
    UsuarioDAO a=new UsuarioDAO();
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String h=req.getParameter("h");
        switch(h){
            case "log":
                req.getRequestDispatcher("/webapp/views/log.jsp").forward(req, resp);
            break;
            case "cs":
                req.getRequestDispatcher("../../webapp/views/f1sacar.jsp").forward(req, resp);
            break;
            case "rr":
                req.getRequestDispatcher("../../webapp/views/f3recarga.jsp").forward(req, resp);
            break;
            case "rd":
                req.getRequestDispatcher("../../webapp/views/f4retirar.jsp").forward(req, resp);
            break;
            case "a":
                req.getRequestDispatcher("../../webapp/views/regius.jsp").forward(req, resp);
            break;
            case "ini":
                req.getRequestDispatcher("../../webapp/views/inicio.jsp").forward(req, resp);
            break;
            case "off":
                req.getRequestDispatcher("../../webapp/index.jsp").forward(req, resp);
            break;
    }
     super.doGet(req, resp);
    }
}
