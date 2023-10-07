package controller;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String password = request.getParameter("password").toString();
        String user = request.getParameter("user").toString();
        PrintWriter out = response.getWriter();
        out.println("senha: " + password);
        out.println("login: " + user);

        if(user.equals("admin") && password.equals("admin")) {
            HttpSession sessao = request.getSession();
            sessao.setAttribute("nome", user);
            sessao.setAttribute("senha", password);

            sessao.setMaxInactiveInterval(60);
            response.sendRedirect("menu.jsp");
        }else {
            response.sendRedirect("index.jsp");
        }
    }

}
