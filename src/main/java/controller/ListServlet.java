package controller;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Contact;
import model.DatabaseDAO;

/**
 * Servlet implementation class ListServlet
 */
public class ListServlet extends HttpServlet {
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   
        DatabaseDAO databaseDAO = DatabaseDAO.getInstance();
     // Listando todos os contatos
        Collection<Contact> allContacts = databaseDAO.getAllContacts();
        
        System.out.println(allContacts);
        
     // Armazenar a lista como um atributo do request
        request.setAttribute("contacts", allContacts);

        // Redirecionar para a página JSP
        request.getRequestDispatcher("list.jsp").forward(request, response);
    }

}
