package com.unu.proyectowe.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.unu.proyectowe.models.Autores;

/**
 * Servlet implementation class AutoresControllers
 */
public class AutoresControllers extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Autores modelo=new Autores();
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AutoresControllers() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void processRequest(HttpServletRequest request, HttpServletRequest response) {

		if (request.getParameter("op") == null) {
			// si op no es nulo se muestra la lista
			return;
		}
		String operacion = request.getParameter("op");
		switch (operacion) {
		case "listar":
			break;
		case "nuevo":
			break;
		}
	}
	private void listar(HttpServletRequest request,HttpServletRequest response) {
		request.setAttribute("ListaAutores", modelo.ListarAutores());
		request.getRequestDispatcher("/autores/ListaAutores.jsp");
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
