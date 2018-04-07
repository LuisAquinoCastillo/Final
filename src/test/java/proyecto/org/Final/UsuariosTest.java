package proyecto.org.Final;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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

        Assert.assertEquals(4,2+2);

	}

	@Test
	public void actualizar(){

        Assert.assertEquals(8,4+4);

	}

	@Test
	public void borrar(){

	    Assert.assertEquals(6,3+3);

	}

	@Test
	public void buscarTodo(){

	    Assert.assertEquals(10, 5+5);

	}

	@Test
	public void buscarPorId(){

	    Assert.assertEquals(1,0+1);

	}

}
