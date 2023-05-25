package Figure;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class d extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        String h=req.getParameter("h");
        switch(h){
            case "log":
            req.getRequestDispatcher("log.jsp").forward(req, resp);
            break;
            case "controles":
            req.getRequestDispatcher("controles.jsp").forward(req, resp);
            break;
            case "ctweet":
            req.getRequestDispatcher("ctweet.jsp").forward(req, resp);
            break;
            case "etiquetas":
            req.getRequestDispatcher("etiquetas.jsp").forward(req, resp);
            break;
            case "index.jps":
            req.getRequestDispatcher("index.jsp").forward(req, resp);
            break;
            case "cons":
            req.getRequestDispatcher("cons.jsp").forward(req, resp);
            break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        String hos=req.getParameter("hos");
        switch(hos){
            case "controles":
            String n=req.getParameter("nom");
            String c=req.getParameter("con");
            if (n == "juan" && c == "con" ) {
                req.getRequestDispatcher("controles.jsp").forward(req, resp);    
            }
            else{
                System.out.println("credenciales incorrectas");
            }
            break;
            case "ctweet":
            req.getRequestDispatcher("ctweet.jsp").forward(req, resp);
            break;
            case "ser":
            String p=req.getParameter("p");
            System.out.println("tweet posteado");
            req.getRequestDispatcher("controles.jsp").forward(req, resp);
            System.out.println(p);
            break;
    }
    
}
}
