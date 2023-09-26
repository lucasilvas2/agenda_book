package com.imd.contacts.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

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
            response.sendRedirect("menu/index.jsp");
        }else {
            response.sendRedirect("index.jsp");
        }
    }
}
