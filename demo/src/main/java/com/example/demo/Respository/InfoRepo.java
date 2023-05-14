package com.example.demo.Respository;

import com.example.demo.Entity.Info;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface InfoRepo extends CrudRepository<Info, Integer> {
    //consultar
    String getPedidosQuery = "SELECT * FROM infopedidos ORDER BY numero_pedido ASC";

    @Query(nativeQuery = true, value = getPedidosQuery)
    List<Info> getPedidos();

    //buscar
    String getPedidoQuery = "SELECT * FROM infopedidos WHERE numero_pedido = :id";
    String getPedidoPorUsuarioQuery = "SELECT * FROM infopedidos WHERE id_producto = :id";
    String getPedidoPorUsuarioEIDQuery = "SELECT * FROM infopedidos WHERE id_producto = :id_producto AND numero_pedido = :numero_pedido";

    @Query(nativeQuery = true, value = getPedidoQuery)
    List<Info> getPedidoPorId(Set<Integer> id);

    @Query(nativeQuery = true, value = getPedidoPorUsuarioQuery)
    List<Info> getPedidoPorUsuario(Set<Integer> id);

    @Query(nativeQuery = true, value = getPedidoPorUsuarioEIDQuery)
    List<Info> getPedido(Set<Integer> id_producto, Set<Integer> numero_pedido);

    //crear
    String crearPedidoQuery = "INSERT INTO infopedidos (numero_pedido, id_producto, fecha, cantidad) VALUES (:numero, :id, :fecha, :cantidad)";

    @Modifying
    @Query(nativeQuery = true, value = crearPedidoQuery)
    void crearPedido(int numero, int id, Date fecha, int cantidad);

    //modificar
    String modificarInfoPedidoNombreQuery = "UPDATE infopedidos SET cantidad = :cantidad WHERE pedidos.numero_pedido = :numero AND pedidos.id_producto = :id";

    @Modifying
    @Query(nativeQuery = true, value = modificarInfoPedidoNombreQuery)
    void modificarPedidoNombrePorId(int cantidad, int numero, int id);

    //borrar
    String borrarPedidoQuery = "DELETE FROM infopedidos WHERE numero_pedido = :numero AND id_producto = :id";

    @Modifying
    @Query(nativeQuery = true, value = borrarPedidoQuery)
    void eliminarPedidoPorId(int numero, int id);
}
