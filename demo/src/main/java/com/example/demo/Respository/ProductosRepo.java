package com.example.demo.Respository;

import com.example.demo.Entity.Productos;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ProductosRepo extends CrudRepository<Productos, Integer> {
    //consultar
    String getProductosQuery = "SELECT * FROM productos ORDER BY id_producto ASC";

    @Query(nativeQuery = true, value = getProductosQuery)
    List<Productos> getProductos();

    //buscar
    String getProductoQuery = "SELECT * FROM productos WHERE id_producto = :id";

    @Query(nativeQuery = true, value = getProductoQuery)
    List<Productos> getProductoPorId(Set<Integer> id);

    //crear
    String crearProductoQuery = "INSERT INTO productos (nombre_producto, descripcion_producto, foto_producto, coste_base, stock, id_categoria, id_caracteristica, ventas) VALUES (:nombre, :descripcion, :foto, :coste, :stock, :categoria, :caracteristica, 0)";

    @Modifying
    @Query(nativeQuery = true, value = crearProductoQuery)
    void crearProducto(String nombre, String descripcion, String foto, double coste, int stock, int categoria, int caracteristica);

    //modificar
    String modificarProductoQuery = "UPDATE productos SET nombre_producto = :nombre, descripcion_producto = :descripcion, foto_producto = :foto, coste_base = :coste, stock = :stock, id_categoria = :categoria, id_caracteristica = :caracteristica WHERE productos.id_producto = :id";
    String modificarProductoNombreQuery = "UPDATE productos SET nombre_producto = :nombre WHERE productos.id_producto = :id";
    String modificarProductoDescripcionQuery = "UPDATE productos SET descripcion_producto = :descripcion WHERE productos.id_producto = :id";
    String modificarProductoFotoQuery = "UPDATE productos SET foto_producto = :foto WHERE productos.id_producto = :id";
    String modificarProductoCosteQuery = "UPDATE productos SET coste_base = :coste WHERE productos.id_producto = :id";
    String modificarProductoStockQuery = "UPDATE productos SET stock = :stock WHERE productos.id_producto = :id";
    String modificarProductoCategoriaQuery = "UPDATE productos SET id_categoria = :categoria WHERE productos.id_producto = :id";
    String modificarProductoCaracteristicaQuery = "UPDATE productos SET id_caracteristica = :caracteristica WHERE productos.id_producto = :id";
    String modificarProductoVentasQuery = "UPDATE productos SET ventas = :ventas WHERE productos.id_producto = :id";

    @Modifying
    @Query(nativeQuery = true, value = modificarProductoQuery)
    void modificarProductoPorId(Integer id, String nombre, String descripcion, String foto, double coste, int stock, int categoria, int caracteristica);

    @Modifying
    @Query(nativeQuery = true, value = modificarProductoNombreQuery)
    void modificarProductoNombrePorId(Integer id, String nombre);

    @Modifying
    @Query(nativeQuery = true, value = modificarProductoDescripcionQuery)
    void modificarProductoDescripcionPorId(Integer id, String descripcion);

    @Modifying
    @Query(nativeQuery = true, value = modificarProductoFotoQuery)
    void modificarProductoFotoPorId(Integer id, String foto);

    @Modifying
    @Query(nativeQuery = true, value = modificarProductoCosteQuery)
    void modificarProductoCostePorId(Integer id, double coste);

    @Modifying
    @Query(nativeQuery = true, value = modificarProductoStockQuery)
    void modificarProductoStockPorId(Integer id, int stock);

    @Modifying
    @Query(nativeQuery = true, value = modificarProductoCategoriaQuery)
    void modificarProductoCategoriaPorId(Integer id, int categoria);

    @Modifying
    @Query(nativeQuery = true, value = modificarProductoCaracteristicaQuery)
    void modificarProductoCaracteristicaPorId(Integer id, int caracteristica);

    @Modifying
    @Query(nativeQuery = true, value = modificarProductoVentasQuery)
    void modificarProductoVentaPorId(Integer id, int ventas);

    //borrar
    String borrarProductoQuery = "DELETE FROM productos WHERE id_producto = :id";

    @Modifying
    @Query(nativeQuery = true, value = borrarProductoQuery)
    void eliminarProductoPorId(Integer id);
}
