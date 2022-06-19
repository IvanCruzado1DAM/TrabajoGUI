package trabajo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ListaPeliculas {
	private static ArrayList<Pelicula> peliculas;
	
	private static String nombrefichero="files/ficheropeliculas";
	
	public static ArrayList<Pelicula> getUsuarios() {
		return peliculas;
	}

	public static void setUsuarios(ArrayList<Pelicula> peliculas) {
		ListaPeliculas.peliculas = peliculas;
	}

	public ListaPeliculas() {
		peliculas=new ArrayList<>();
	}
	
	public static void salvarArrayList() throws IOException {
		File f=new File(nombrefichero);
		if(!f.exists()) {
			f.createNewFile();
		}
		else {
			FileWriter os = new FileWriter(f,true);
		for(Pelicula p: peliculas) {
			p=new Pelicula(p.getNombre(), p.getGénero(), p.getAño(), p.getPais(), p.getCaratula());
			os.write(p+"\n");
		}
		os.close();
		}
	}
	
	public static void leerfichero() throws IOException {
		File f=new File(nombrefichero);
		BufferedReader br = new BufferedReader(new FileReader(f));
		String linea;
		while((linea=br.readLine())!=null)
	            System.out.println(linea);
	}
	
	public void añadePelicula(Pelicula p) {
		if(peliculas==null) {
			peliculas=new ArrayList<Pelicula>();
		}
		else
			peliculas.add(p);
	}
	

}
