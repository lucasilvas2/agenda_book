package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Contact;
import model.DatabaseDAO;

import java.io.IOException;
import java.util.UUID;

/**
 * Servlet implementation class DeleteContactServlet
 */
public class DeleteContactServlet extends HttpServlet {
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
		boolean isDeleted = databaseDAO.deleteContact(id);

		if(isDeleted) {
			request.setAttribute("deleted", true);	        
		}
		request.getRequestDispatcher("ListServlet").forward(request, response);
	}

}
