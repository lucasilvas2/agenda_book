package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Contact;
import model.DatabaseDAO;

import java.io.IOException;
import java.util.UUID;

/**
 * Servlet implementation class DetailContactServlet
 */
public class DetailContactServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String idString = request.getParameter("id");
		DatabaseDAO databaseDAO = DatabaseDAO.getInstance();
		UUID id = UUID.fromString(idString);
		Contact contact = databaseDAO.getContact(id);

		request.setAttribute("contact", contact);

		request.getRequestDispatcher("details.jsp").forward(request, response);
	}

}
