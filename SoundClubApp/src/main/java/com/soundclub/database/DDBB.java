package com.soundclub.database;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.soundclub.models.Genero_Musical;
import com.soundclub.models.Instrumento;
import com.soundclub.models.Usuario;


public class DDBB {
	private static DDBB Instancia = null;
	private static List<Usuario> listaUsuario = new ArrayList<>();
	private static List<Genero_Musical> listaGeneroMusical = new ArrayList<>();
	private static List<Instrumento> listaInstrumento = new ArrayList<>();

	public static final DDBB getInstancia() {
		if(Instancia == null) Instancia = new DDBB(); 
		return Instancia;
	}
	private DDBB() {
		CargarInstrumento();
		CargarGeneroMusical();
		CargarUsuario();
		
	}
	private static final boolean CargarUsuario() {
		//listaUsuario.add(new Usuario(1,"Carla","Perez","c@mail.es","123","EspaÃ±a","Barcelona","C/Fontsanta","30/07/1988","M","foto.jpg",null,null,null));

		
		SimpleDateFormat d = new SimpleDateFormat("dd-MM-yy");
		Date date = null;
		try {
			date = d.parse("30-07-1986");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		listaUsuario.add(new Usuario(1,"Carla","Perez","ca@mail.es","123","España","Barcelona","C/Fontsanta",date,1,"./assets/images/betty.jpg"));
		listaUsuario.add(new Usuario(2,"Isaac","Perez","is@mail.es","123","España","Barcelona","C/Fontsanta",date,1,"./assets/images/foto.jpg"));
		listaUsuario.add(new Usuario(3,"Marta","Perez","ma@mail.es","123","España","Barcelona","C/Fontsanta",date,1,"./assets/images/contacto1.png"));
		listaUsuario.add(new Usuario(4,"Carles","Perez","carles@mail.es","123","España","Barcelona","C/Fontsanta",date,1,"./assets/images/betty.jpg"));
		listaUsuario.add(new Usuario(5,"Carlos","Perez","carlos@mail.es","123","España","Barcelona","C/Fontsanta",date,1,"./assets/images/depositp.jpg"));
		listaUsuario.add(new Usuario(6,"Ricardo","Perez","ricar@mail.es","123","España","Barcelona","C/Fontsanta",date,1,"./assets/images/adam.jpg"));
		listaUsuario.add(new Usuario(7,"David","Perez","david@mail.es","123","España","Barcelona","C/Fontsanta",date,1,"./assets/images/nota.jpg"));
		listaUsuario.add(new Usuario(8,"Cleomedes","Perez","cleo@mail.es","123","España","Barcelona","C/Fontsanta",date,1,"./assets/images/musica.jpg"));
		listaUsuario.add(new Usuario(9,"Adriana","Perez","adri@mail.es","123","España","Barcelona","C/Fontsanta",date,1,"./assets/images/bea.jpg"));
		listaUsuario.add(new Usuario(10,"Margrita","Perez","mar@mail.es","123","España","Barcelona","C/Fontsanta",date,1,"./assets/images/bea.jpg"));
		listaUsuario.add(new Usuario(11,"Cristina","Perez","cris@mail.es","123","España","Barcelona","C/Fontsanta",date,1,"./assets/images/ada.jpg"));
		listaUsuario.add(new Usuario(12,"Alex","Perez","alex@mail.es","123","España","Barcelona","C/Fontsanta",date,1,"./assets/images/depositp.jpg"));
		listaUsuario.add(new Usuario(13,"Joan","Perez","joan@mail.es","123","España","Barcelona","C/Fontsanta",date,1,"./assets/images/perfil.jpg"));
		listaUsuario.add(new Usuario(14,"Carmen","Perez","carmen@mail.es","123","España","Barcelona","C/Fontsanta",date,1,"./assets/images/depositp.jpg"));
		listaUsuario.add(new Usuario(15,"Tito","Perez","tito@mail.es","123","España","Barcelona","C/Fontsanta",date,1,"./assets/images/nota.jpg"));
		listaUsuario.add(new Usuario(16,"Maria Rene","Perez","maria@mail.es","123","España","Barcelona","C/Fontsanta",date,1,"./assets/images/musica.jpg"));


//		listaUsuario.get(1).setNuevoInstrumento(listaInstrumento.get(1));
//		listaUsuario.get(1).setNuevoInstrumento(listaInstrumento.get(3));
//		listaUsuario.get(1).setNuevoInstrumento(listaInstrumento.get(4));
//		listaUsuario.get(2).setNuevoInstrumento(listaInstrumento.get(1));
//		listaUsuario.get(2).setNuevoInstrumento(listaInstrumento.get(2));
//		listaUsuario.get(2).setNuevoInstrumento(listaInstrumento.get(5));
//		listaUsuario.get(3).setNuevoInstrumento(listaInstrumento.get(0));
//		listaUsuario.get(3).setNuevoInstrumento(listaInstrumento.get(3));
//		listaUsuario.get(4).setNuevoInstrumento(listaInstrumento.get(4));
//		listaUsuario.get(4).setNuevoInstrumento(listaInstrumento.get(1));
//		listaUsuario.get(5).setNuevoInstrumento(listaInstrumento.get(2));
//		listaUsuario.get(6).setNuevoInstrumento(listaInstrumento.get(5));
//
//		listaUsuario.get(1).setGenero_musical(listaGeneroMusical.get(0));
//		listaUsuario.get(1).setGenero_musical(listaGeneroMusical.get(3));
//		listaUsuario.get(1).setGenero_musical(listaGeneroMusical.get(4));
//		listaUsuario.get(2).setGenero_musical(listaGeneroMusical.get(1));
//		listaUsuario.get(2).setGenero_musical(listaGeneroMusical.get(2));
//		listaUsuario.get(2).setGenero_musical(listaGeneroMusical.get(5));
//		listaUsuario.get(3).setGenero_musical(listaGeneroMusical.get(0));
//		listaUsuario.get(3).setGenero_musical(listaGeneroMusical.get(3));
//		listaUsuario.get(4).setGenero_musical(listaGeneroMusical.get(4));
//		listaUsuario.get(4).setGenero_musical(listaGeneroMusical.get(1));
//		listaUsuario.get(5).setGenero_musical(listaGeneroMusical.get(2));
//		listaUsuario.get(6).setGenero_musical(listaGeneroMusical.get(5));
//		
//		listaUsuario.get(1).setlistaAmigos(listaUsuario.get(0));
//		listaUsuario.get(1).setlistaAmigos(listaUsuario.get(3));
//		listaUsuario.get(1).setlistaAmigos(listaUsuario.get(4));
//		listaUsuario.get(2).setlistaAmigos(listaUsuario.get(1));
//		listaUsuario.get(2).setlistaAmigos(listaUsuario.get(8));
//		listaUsuario.get(3).setlistaAmigos(listaUsuario.get(5));
//		listaUsuario.get(4).setlistaAmigos(listaUsuario.get(0));
//		listaUsuario.get(5).setlistaAmigos(listaUsuario.get(3));
//		listaUsuario.get(6).setlistaAmigos(listaUsuario.get(4));
//		listaUsuario.get(8).setlistaAmigos(listaUsuario.get(15));
//		listaUsuario.get(10).setlistaAmigos(listaUsuario.get(12));
//		listaUsuario.get(10).setlistaAmigos(listaUsuario.get(5));

		return true;
	}
	
	private static final boolean CargarInstrumento() {
		listaInstrumento.add(new Instrumento("guitarra"));
		listaInstrumento.add(new Instrumento("violín"));
		listaInstrumento.add(new Instrumento("piano"));
		listaInstrumento.add(new Instrumento("bateria"));
		listaInstrumento.add(new Instrumento("trompeta"));
		listaInstrumento.add(new Instrumento("flauta"));
		listaInstrumento.add(new Instrumento("bombo"));
		listaInstrumento.add(new Instrumento("caja"));
		listaInstrumento.add(new Instrumento("quena"));
		return true;
	}
	private static final boolean CargarGeneroMusical() {
		listaGeneroMusical.add(new Genero_Musical("pop"));
		listaGeneroMusical.add(new Genero_Musical("rock"));
		listaGeneroMusical.add(new Genero_Musical("blues"));
		listaGeneroMusical.add(new Genero_Musical("jazz"));
		listaGeneroMusical.add(new Genero_Musical("metal"));
		listaGeneroMusical.add(new Genero_Musical("hip hop"));
		return true;
	}
	/**************************************************************/
	
	public Usuario Obtener_Usuario_Id(int id_Usuario) {
		Usuario resultadoUsuario=null;
		for (Usuario unUsuario : listaUsuario) {
			if(unUsuario.getId()==id_Usuario) {
				resultadoUsuario=unUsuario;
				break;
			}
		}
		return resultadoUsuario;
	}
	
	public Usuario get_Usuario_Email_Pass(String email, String pass) {
		Usuario resultadoUsuario=null;
		for (Usuario unUsuario : listaUsuario) {
			if(unUsuario.getEmail().equals(email)&& unUsuario.getPassword().equals(pass)) {
				resultadoUsuario=unUsuario;
				break;
			}
		}
		return resultadoUsuario;
	}
	
	public Usuario get_Usuario_Email(String email) {
		Usuario resultadoUsuario=null;
		for (Usuario unUsuario : listaUsuario) {
			if(unUsuario.getEmail().equals(email)) {
				resultadoUsuario=unUsuario;
				break;
			}
		}
		return resultadoUsuario;
	}
	
	/**************************************************************/
	
	public final boolean AnadirUsuario(String nombre, String apellidos, String email, String password) {
		boolean isOK = false;
		int id = listaUsuario.get(listaUsuario.size() - 1).getId();
		Usuario nuevoUsu = new Usuario(id +1, nombre, apellidos, email, password );
		isOK=listaUsuario.add(nuevoUsu);
				
		return isOK;
	}
	
	public static final List<Usuario> getUsuariosParaBusqueda(String busqueda) {
		List<Usuario> encontrados = new ArrayList<>();

		for (Usuario unUsuario : listaUsuario) {
			if (unUsuario.getNombre().toLowerCase().contains(busqueda.toLowerCase())) {
				encontrados.add(unUsuario);
			}
		}

		return encontrados;

	}
	
}
