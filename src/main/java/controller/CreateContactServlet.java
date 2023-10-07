package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Contact;
import model.DatabaseDAO;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

/**
 * Servlet implementation class CreateContactServlet
 */
public class CreateContactServlet extends HttpServlet {       
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String phoneHome = request.getParameter("phone_home");
        String email = request.getParameter("email");
        String date = request.getParameter("date");

        Contact newContact = new Contact(name, phone, phoneHome, email, date);
        
        DatabaseDAO databaseDAO = DatabaseDAO.getInstance();
        databaseDAO.addContact(newContact);
        Collection<Contact> allContacts = databaseDAO.getAllContacts();

		request.getRequestDispatcher("menu.jsp").forward(request, response);

    }
}
