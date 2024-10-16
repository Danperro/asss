package com.unu.proyectowe.models;
import java.util.ArrayList;
import java.util.List;

import com.unu.proyectowe.beans.*;

public class Autores {

	
	public List<Autor> ListarAutores(){
		ArrayList<Autor> autores=new ArrayList<>();
		autores.add(new Autor(1,"Garcia Marquez","Colombia"));
		autores.add(new Autor(1,"Juan S. Guarnizo","Colombia"));
		autores.add(new Autor(1," Luis Garcia","Colombia"));
		return autores;
	}
}
