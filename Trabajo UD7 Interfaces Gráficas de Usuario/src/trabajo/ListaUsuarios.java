package trabajo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ListaUsuarios {
	private static ArrayList<Usuario> usuarios;
	
	private static String nombrefichero="files/binariousuarios";
	
	public static ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public static void setUsuarios(ArrayList<Usuario> usuarios) {
		ListaUsuarios.usuarios = usuarios;
	}

	public ListaUsuarios() {
		usuarios=new ArrayList<>();
	}
	
	public static void salvarArrayList() throws IOException {
		File f=new File(nombrefichero);
		if(!f.exists()) {
			f.createNewFile();
		}
		else {
		ObjectOutputStream os=new AppendableObjectOutputStream(new FileOutputStream(f,true));
		for(Usuario u:usuarios) {
			u=new Usuario(u.getUsername(),u.getPassword(),u.getNombre(),u.getEmail(),u.isEsAdmin(),u.isEstaactivo());
			os.writeObject(u);
		}
		os.close();
		}
	}
	
	public static void leerfichero() throws IOException {
		File f=new File(nombrefichero);
		Usuario u=null;
		if(!f.exists()) throw new FileNotFoundException("El fichero indicado no existe");
		try {
			ObjectInputStream is=new ObjectInputStream(new FileInputStream(f));
			u=(Usuario) is.readObject();
			is.close();
		}catch(Exception e) {}
		for(int i=0;i<usuarios.size();i++) {
			System.out.println(usuarios.get(i));
		}
	}
	
	public void añadeUsuario(Usuario u) {
		if(usuarios==null) {
			usuarios=new ArrayList<Usuario>();
		}
		else
			usuarios.add(u);
	}
	
	
	
	public ArrayList<Usuario> leerArray() {
		for(int i=0;i<usuarios.size();i++) {
			System.out.println(usuarios.get(i));
		}
		return null;
	}
	

}
