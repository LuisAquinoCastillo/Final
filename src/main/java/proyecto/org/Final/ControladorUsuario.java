package proyecto.org.Final;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping("/api/usuario")
public class ControladorUsuario {

    //Aqui van las 5 operaciones basicas
    //Autowired 
    @Autowired RepositorioUsuario repoUsu;

    @CrossOrigin
    @RequestMapping(value = {"/todos"}, method = RequestMethod.GET, headers = {"Accept=application/json"})
    public ArrayList<Usuario> todosUsuarios(){
        return (ArrayList<Usuario>)repoUsu.findAll();
    }

    //primer metodo guardar
    @RequestMapping(value = {"/guardar"},method = RequestMethod.POST, headers = {"Accept=application/json"})
    public Estatus guardar(@RequestBody String json) throws Exception{

       /*RequestBody envia un json*/

       ObjectMapper maper= new ObjectMapper();
       Usuario u=maper.readValue(json, Usuario.class);
       Estatus e=new Estatus();
       repoUsu.save(u);
       e.setSuccess(true);
       return e;
    }

    @CrossOrigin
    @RequestMapping(value = {"/actualizar"},method = RequestMethod.PUT, headers = {"Accept=application/json"})
    public Estatus actualizar(@RequestBody String json) throws Exception{

        /*RequestBody envia un json*/

        ObjectMapper maper= new ObjectMapper();
        Usuario u=maper.readValue(json, Usuario.class);
        Estatus e=new Estatus();
        repoUsu.findById(u.getIdUsuario());
        repoUsu.save(u);
        e.setSuccess(true);
        return e;
    }

}
