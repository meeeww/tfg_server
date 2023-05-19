package com.example.demo.Service;

import com.example.demo.Entity.*;
import com.example.demo.Respository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.Set;

@Service
public class TrabajosService {

    @Autowired
    private TrabajosRepo trabajosRepo;

    //-----------------------------------------Categoria-----------------------------------------\\
    public List<Trabajos> ConsultarTrabajos() {
        List<Trabajos> listaTrabajos = trabajosRepo.getTrabajos();
        return listaTrabajos;
    }

    public List<Trabajos> BuscarTrabajoPorId(Set<Integer> id) {
        List<Trabajos> listaTrabajos = trabajosRepo.getTrabajoPorId(id);
        return listaTrabajos;
    }

    public void CrearTrabajo(int id_usuario, String segundo_apellido, String ssc, String codigo_postal, String ciudad, String condado, String estado, String puesto_trabajo, Date fecha_nacimiento ) {
        trabajosRepo.crearTrabajo(id_usuario, segundo_apellido, ssc, codigo_postal, ciudad, condado, estado, puesto_trabajo, fecha_nacimiento);
    }

    public void ModificarTrabajoIdUsuario(Integer id, int id_usuario) {
        trabajosRepo.modificarTrabajoIdUsuarioPorId(id, id_usuario);
    }

    public void ModificarTrabajoSegundoApellido(Integer id, String segundo_apellido){
        trabajosRepo.modificarTrabajoSegundoApellidoPorId(id, segundo_apellido);
    }

    public void ModificarTrabajoScc(Integer id, String scc){
        trabajosRepo.modificarTrabajoSSCPorId(id, scc);
    }

    public void ModificarTrabajoCodigoPostal(Integer id, String codigo_postal){
        trabajosRepo.modificarTrabajoCodigoPostalPorId(id, codigo_postal);
    }

    public void ModificarTrabajoCiudad(Integer id, String ciudad){
        trabajosRepo.modificarTrabajoCiudadPorId(id, ciudad);
    }

    public void ModificarTrabajoCondado(Integer id, String condado){
        trabajosRepo.modificarTrabajoCondadoPorId(id, condado);
    }

    public void ModificarTrabajoEstado(Integer id, String estado){
        trabajosRepo.modificarTrabajoEstadoPorId(id, estado);
    }

    public void ModificarTrabajoPuestoTrabajo(Integer id, String puesto_trabajo){
        trabajosRepo.modificarTrabajoPuestoTrabajoPorId(id, puesto_trabajo);
    }

    public void ModificarTrabajoFechaNacimiento(Integer id, Date fecha_nacimiento){
        trabajosRepo.modificarTrabajoFechaNacimientoPorId(id, fecha_nacimiento);
    }

    public void EliminarTrabajo(Integer id) {
        trabajosRepo.eliminarTrabajoPorId(id);
    }
}
