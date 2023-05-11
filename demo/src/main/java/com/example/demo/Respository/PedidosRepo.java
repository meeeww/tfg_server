package com.example.demo.Respository;

import com.example.demo.Entity.Pedidos;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface PedidosRepo extends CrudRepository<Pedidos, Integer> {
    //consultar
    String getPedidosQuery = "SELECT * FROM pedidos";

    @Query(nativeQuery = true, value = getPedidosQuery)
    List<Pedidos> getPedidos();

    //buscar
    String getPedidoQuery = "SELECT * FROM pedidos WHERE numero_pedido = :id";
    String getPedidoPorUsuarioQuery = "SELECT * FROM pedidos WHERE id_usuario = :id";
    String getPedidoPorUsuarioEIDQuery = "SELECT * FROM pedidos WHERE id_usuario = :id_usuario AND numero_pedido = :id_pedido";

    @Query(nativeQuery = true, value = getPedidoQuery)
    List<Pedidos> getPedidoPorId(Set<Integer> id);

    @Query(nativeQuery = true, value = getPedidoPorUsuarioQuery)
    List<Pedidos> getPedidoPorUsuario(Set<Integer> id);

    @Query(nativeQuery = true, value = getPedidoPorUsuarioEIDQuery)
    List<Pedidos> getPedido(Set<Integer> id_usuario, Set<Integer> id_pedido);

    //crear
    String crearPedidoQuery = "INSERT INTO pedidos (id_usuario, direccion_envio, estado) VALUES (:id, :direccion, :estado)";

    @Modifying
    @Query(nativeQuery = true, value = crearPedidoQuery)
    void crearPedido(int id, String direccion, int estado);

    //modificar
    String modificarPedidoNombreQuery = "UPDATE pedidos SET estado = :estado WHERE pedidos.numero_pedido = :id";

    @Modifying
    @Query(nativeQuery = true, value = modificarPedidoNombreQuery)
    void modificarPedidoNombrePorId(Integer id, int estado);

    //borrar
    String borrarPedidoQuery = "DELETE FROM pedidos WHERE numero_pedido = :id";

    @Modifying
    @Query(nativeQuery = true, value = borrarPedidoQuery)
    void eliminarPedidoPorId(Integer id);
}
