package com.example.demo.Respository;

import com.example.demo.Entity.InfoPedidos;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface InfoPedidosRepo extends CrudRepository<InfoPedidos, Integer> {
    //consultar
    String getInfoPedidosQuery = "SELECT * FROM infopedidos";

    @Query(nativeQuery = true, value = getInfoPedidosQuery)
    List<InfoPedidos> getInfoPedidos();

    //buscar
    String getInfoPedidoQuery = "SELECT * FROM categorias WHERE numero_pedido = :id_pedido AND id_producto = :id_producto";
    String getInfoPedidoNumeroQuery = "SELECT * FROM categorias WHERE numero_pedido = :id";
    String getInfoPedidoProductoQuery = "SELECT * FROM categorias WHERE id_producto = :id";
    String getInfoPedidoFechaQuery = "SELECT * FROM categorias WHERE fecha = :fecha";

    @Query(nativeQuery = true, value = getInfoPedidoQuery)
    List<InfoPedidos> getInfoPedido(Set<Integer> id_pedido, Set<Integer> id_producto);

    @Query(nativeQuery = true, value = getInfoPedidoNumeroQuery)
    List<InfoPedidos> getInfoPedidoPorPedido(Set<Integer> id);

    @Query(nativeQuery = true, value = getInfoPedidoProductoQuery)
    List<InfoPedidos> getInfoPedidoPorProducto(Set<Integer> id);

    @Query(nativeQuery = true, value = getInfoPedidoFechaQuery)
    List<InfoPedidos> getInfoPedidoPorFecha(Date fecha);

    //crear
    String crearInfoPedidoQuery = "INSERT INTO infopedidos (numero_pedido, id_producto, fecha) VALUES (:numero, :id, :fecha)";

    @Modifying
    @Query(nativeQuery = true, value = crearInfoPedidoQuery)
    void crearInfoPedido(Integer numero, Integer id, Date fecha);

    //modificar
    String modificarInfoPedidoQuery = "UPDATE infopedidos SET fecha = :fecha WHERE infopedidos.numero_pedido = :id_pedido AND infopedidos.id_producto = :id_producto";

    @Modifying
    @Query(nativeQuery = true, value = modificarInfoPedidoQuery)
    void modificarInfoPedido(Date fecha, Integer id_pedido, Integer id_producto);

    //borrar
    String borrarInfoPedidoQuery = "DELETE FROM infopedidos WHERE numero_pedido = :id";

    @Modifying
    @Query(nativeQuery = true, value = borrarInfoPedidoQuery)
    void eliminarInfoPedido(Integer id);
}
