package trabajo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Prueba {

	static ListaUsuarios lu=new ListaUsuarios();

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		File f=new File("files/binariousuarios");
		Usuario u=null;
		try {
			ObjectInputStream is=new ObjectInputStream(new FileInputStream(f));
			u=(Usuario) is.readObject();
			for(int i=0;i<lu.getUsuarios().size();i++) {
			System.out.println(u);
			}
			is.close();
		}catch(Exception e) {};

	}
}
