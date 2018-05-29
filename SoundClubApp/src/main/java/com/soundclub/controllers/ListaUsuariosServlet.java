package com.soundclub.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.soundclub.database.DDBB;
import com.soundclub.models.Usuario;

@WebServlet("/lista_usuarios")
public class ListaUsuariosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
			
		//request.setAttribute("usuario", );
		request.getRequestDispatcher("lista_usuarios.jsp").forward(request, response);
	}

	@SuppressWarnings("static-access")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Obtener del request el keyword de carlos
	
		String keyword = "car";//request.getParameter("buscador");
		
		//pedir a base de datos la lista de usuarios que contengan la keyword en nombre, apellido, email
		List<Usuario> listaUsuario = DDBB.getInstancia().getUsuariosParaBusqueda(keyword);
		System.out.println(keyword+"::"+listaUsuario);
		
		//guardar resultados en variable listaUsuarios
		request.setAttribute("resultadoBusquesda", listaUsuario);
		
		//pasar al jsp la variable listaUsuarios mediante request.setAttribute
		doGet(request, response);
	}

}
