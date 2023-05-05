package com.example.demo.Service;

import com.example.demo.Entity.*;
import com.example.demo.Respository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class SesionesService {

    @Autowired
    private SesionesRepo sesionesRepo;

    // -----------------------------------------sesiones-----------------------------------------\\
    public List<Sesiones> ConsultarSesiones() {
        List<Sesiones> listaSesiones = sesionesRepo.getSesiones();
        return listaSesiones;
    }

    public List<Sesiones> BuscaSesion(String token) {
        List<Sesiones> listSesiones = sesionesRepo.getSesionPorToken(token);
        return listSesiones;
    }

    public void CrearSesion(int id, String token, String dispositivo, Date fecha) {
        sesionesRepo.crearSesion(id, token, dispositivo, fecha);
    }

    public void ModificarSesionFecha(String token, Date fecha) {
        sesionesRepo.modificarSesionFechaPorToken(fecha, token);
    }

    public void EliminarSesion(String token) {
        sesionesRepo.eliminarSesionPorToken(token);
    }
}
