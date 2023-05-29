package net.azarquiel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import net.azarquiel.model.Usuarios;
import net.azarquiel.repository.UsuariosRepository;

@RestController
@CrossOrigin
@EnableAutoConfiguration

public class UsuariosController {
	@Autowired
    UsuariosRepository usuariosRepository;

    // Welcome de nuestra api por ejemplo podríamos poner aquí
    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "text/html")
    public String get() {
   	 String cadena = "<h1 style='text-align: center; background-color: #0000c0; color: #C0C0FF;'>Welcome to Tareas Api with SpringBoot - Jesus Diaz</h1>";
   	 cadena +="<table border='1' style='width: 40%;margin: 0 auto; background-color: #C0C0FF; color:#0000c0;'>";
   	 cadena +="<tr style='background-color: #0000c0; color: #C0C0FF;'><th>Method</th><th>Url</th><th>Description</th></tr>";
   	 cadena +="<tr><td>get </td><td>/usuarios</td><td>Lista de usuarios</td></tr>";
   	 cadena +="<tr><td>get </td><td>/usuario/{usuario}</td><td>Usuario</td></tr>";
   	 cadena +="<tr><td>post </td><td>/usuario</td><td>Inserta Usuario</td></tr>";
    	cadena +="</table>";
   	 return cadena;
    }

    // Get usuarios
    @RequestMapping(value = "usuarios", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<?> getUsuarios() {
   	 try {
   		 Iterable<Usuarios> usuarios = usuariosRepository.findAll();
   		 return new ResponseEntity<>(usuarios, HttpStatus.OK);

   	 } catch (Exception ex) {
   		 return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
   	 }

    }

    // Get user by id
    @RequestMapping(value = "usuario/{usuario}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<?> getUsuarios(@PathVariable(value = "usuario") int usuario) {
   	 try {
   		 Usuarios usuarioResponse = usuariosRepository.findById(usuario).orElse(null);
   		 return new ResponseEntity<>(usuarioResponse, HttpStatus.OK);

   	 } catch (Exception ex) {
   		 return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
   	 }

    }
    // Insert una linea
    @RequestMapping(value = "usuario", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<?> insertarUsuario(@RequestBody Usuarios usuario) {
   	 try {
   		Usuarios usuarioResponse = usuariosRepository.save(usuario);
   		 return new ResponseEntity<>(usuarioResponse, HttpStatus.CREATED);

   	 } catch (Exception e) {
   		 return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
   	 }
    }
    // Delete la linea a traves del numero de linea
    /*@RequestMapping(value = "linea/{linea}", method = RequestMethod.DELETE, produces = "application/json")
    public ResponseEntity<Void> borrarLinea(@PathVariable(value = "linea") int linea) {
   	 try {
   		 lineaRepository.deleteById(linea);
   		 return new ResponseEntity<Void>(HttpStatus.OK);
   		 
   	 } catch (Exception ex) {
   		 return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
   	 }
    }*/

}
