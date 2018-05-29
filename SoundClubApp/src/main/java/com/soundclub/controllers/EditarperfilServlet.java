package com.soundclub.controllers;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.soundclub.database.DDBB;
import com.soundclub.models.Instrumento;
import com.soundclub.models.Usuario;

@WebServlet("/editarperfil")
public class EditarperfilServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = "ca@mail.es";//lo obtendre de sesion cuando este listo sesion
		//obtener usuario de base de datos con email y guardarlo en variable usuarioActual
		Usuario usuario = DDBB.getInstancia().getUsuariobyEmail("is@mail.es");
		System.out.println(usuario);
		List<Instrumento> listaInstrumento=DDBB.getInstancia().getInstrumentos();
		//pasar usuarioActual al JSP mediante request.Attribute
		request.setAttribute("listaInstrumentos", listaInstrumento);
		request.setAttribute("usuario", usuario);
		request.getRequestDispatcher("editarperfil.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 int id_Usuario = Integer.parseInt(request.getParameter("id"));
		 String Sexos = request.getParameter("group");
		 int sexousuario = Integer.parseInt(Sexos);
	 	 String nombre = request.getParameter("nombre");
		 String apellidos = request.getParameter("apellidos");
		 String email  = request.getParameter("email");
		 String pais_recide = request.getParameter("pais");
		 String ciudad_recide = request.getParameter("ciudad");
		 String calle = request.getParameter("direccion");
		 
		 

	}

}
