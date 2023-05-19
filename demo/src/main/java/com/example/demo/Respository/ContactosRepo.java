package com.example.demo.Respository;

import com.example.demo.Entity.Contactos;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ContactosRepo extends CrudRepository<Contactos, Integer>{
     //consultar
     String getContactosQuery = "SELECT * FROM contactos";

     @Query(nativeQuery = true, value = getContactosQuery)
     List<Contactos> getContactos();

     //buscar
     String getContactoQuery = "SELECT * FROM trabajos WHERE id_contacto = :id";

     @Query(nativeQuery = true, value = getContactoQuery)
     List<Contactos> getContactoPorId(Set<Integer> id);
 
     //crear
     String crearContactoQuery = "INSERT INTO contactos (nombre, email, telefono, mensaje ) VALUES (:nombre, :email, :telefono, :mensaje)";

     @Modifying
     @Query(nativeQuery = true, value = crearContactoQuery)
     void crearContacto(String nombre, String email, String telefono, String mensaje);

     //modificar
     String modificarContactoNombreQuery = "UPDATE contactos SET nombre = :nombre WHERE contactos.id_contacto = :id";
     String modificarContactoEmailQuery = "UPDATE contactos SET email = :email WHERE contactos.email = :id";
     String modificarContactoTelefonoQuery = "UPDATE contactos SET telefono = :telefono WHERE contactos.telefono = :id";
     String modificarContactoMensajeQuery = "UPDATE contactos SET mensaje = :mensaje WHERE contactos.mensaje = :id";

     @Modifying
     @Query(nativeQuery = true, value = modificarContactoNombreQuery)
     void modificarContactoNombrePorId(Integer id, String nombre);
     
     @Modifying
     @Query(nativeQuery = true, value = modificarContactoEmailQuery)
     void modificarContactoEmailPorId(Integer id, String email);

     @Modifying
     @Query(nativeQuery = true, value = modificarContactoTelefonoQuery)
     void modificarContactoTelefonoPorId(Integer id, String telefono);

     @Modifying
     @Query(nativeQuery = true, value = modificarContactoMensajeQuery)
     void modificarContactoMensajePorId(Integer id, String mensaje);

     //borrar
     String borrarContactoQuery = "DELETE FROM contactos WHERE id_contacto = :id";

     @Modifying
     @Query(nativeQuery = true, value = borrarContactoQuery)
     void eliminarContactoPorId(Integer id);
}
