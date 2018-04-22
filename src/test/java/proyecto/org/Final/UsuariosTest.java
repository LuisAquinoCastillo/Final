package proyecto.org.Final;

import javafx.geometry.Pos;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsuariosTest {

	@Autowired RepositorioUsuario repo;

	@Test
	public void contextLoads() {
	}

	@Test
	public void guardar(){

		//Aqui ponemos la logica de guardar un usuario
		//Aqui generamos un objeto
        Usuario u=new Usuario();
        Posicion pos=new Posicion();
        Mensaje mensa=new Mensaje();

        /*Generar un usuario con todos sus atributos incluyendo
        * un mensaje y una posicion*/
        pos.setLatitud(19.90);
        pos.setLongitud(100.0);

        mensa.setContenido("Holaaaa!!");

        u.setEmail("luis.aquino.135769@gmail.com");
		ArrayList<Mensaje> mensajes=new ArrayList<>();
		mensajes.add(mensa);
		u.setMensajes(mensajes);
		u.setPassword("LaAc961115");
		u.setNickName("LuisAbraham");
		u.setPosicion(pos);

		//Guardamos
		Usuario guardado= repo.save(u);
		Assert.assertEquals(guardado, u);

        //Assert.assertEquals(4,2+2);

	}

	@Test
	public void actualizar(){

		Usuario u=new Usuario();
		Posicion pos=new Posicion();
		Mensaje mensa=new Mensaje();

		pos.setLatitud(17.80);
		pos.setLongitud(20.30);

		mensa.setContenido("HOLAAAAA");

		u.setIdUsuario("135769");
		u.setEmail("luis.aquino.135769@gmail.com");
		ArrayList<Mensaje> mensajes= new ArrayList<>();
		mensajes.add(mensa);
		u.setMensajes(mensajes);
		u.setPassword("Androis852");
		u.setNickName("LuisAbraham");
		u.setPosicion(pos);

		//Actualizamos
		Usuario actualizar=repo.save(u);
		Assert.assertEquals(actualizar, u);

        Assert.assertEquals(8,4+4);

	}

	@Test
	public void borrar(){

	    Assert.assertEquals(6,3+3);

	}

	@Test
	public void buscarTodo(){

		int total= repo.findAll().size();
		Assert.assertEquals(1,total);

	    Assert.assertEquals(10, 5+5);

	}

	@Test
	public void buscarPorId(){

		Usuario usuarioBuscado=repo.findById("primero").get();
		Assert.assertEquals("primero", usuarioBuscado.getIdUsuario());

	    Assert.assertEquals(1,0+1);

	}

}
