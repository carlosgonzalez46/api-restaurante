package com.miapp.restaurante.mapper;

import com.miapp.restaurante.model.DetallePedido;
import com.miapp.restaurante.model.Pedido;
import com.miapp.restaurante.model.Platillo;
import com.miapp.restaurante.model.dto.ActualizarDetallePedidoDto;
import com.miapp.restaurante.model.dto.CrearDetallePedidoDto;
import com.miapp.restaurante.model.dto.MostrarDetallePedidoDto;
import org.springframework.stereotype.Component;

@Component
public class DetallePedidoMapper {
    public MostrarDetallePedidoDto toMostrarDetallePedido(DetallePedido detallePedido){
        MostrarDetallePedidoDto mostrarDetallePedidoDto = new MostrarDetallePedidoDto();
        mostrarDetallePedidoDto.setIdDetallePedido(detallePedido.getIdDetallePedido());
        mostrarDetallePedidoDto.setCantidad(detallePedido.getCantidad());
        mostrarDetallePedidoDto.setPrecioUnitario(detallePedido.getPrecioUnitario());
        mostrarDetallePedidoDto.setIdPedido(detallePedido.getPedido().getIdPedido());
        mostrarDetallePedidoDto.setFechaPedido(detallePedido.getPedido().getFechaPedido());
        mostrarDetallePedidoDto.setIdPlatillo(detallePedido.getPlatillo_detalle().getIdPlatillo());
        mostrarDetallePedidoDto.setNombrePlatillo(detallePedido.getPlatillo_detalle().getNombrePlatillo());
        return mostrarDetallePedidoDto;
    }

    public DetallePedido crearDetallePedido(CrearDetallePedidoDto crearDetallePedidoDto){
        DetallePedido detallePedido = new DetallePedido();
        Pedido pedido = new Pedido();
        Platillo platillo = new Platillo();
        detallePedido.setCantidad(crearDetallePedidoDto.getCantidad());
        detallePedido.setPrecioUnitario(crearDetallePedidoDto.getPrecioUnitario());
        pedido.setIdPedido(crearDetallePedidoDto.getIdPedido());
        platillo.setIdPlatillo(crearDetallePedidoDto.getIdPlatillo());
        detallePedido.setPedido(pedido);
        detallePedido.setPlatillo_detalle(platillo);
        return detallePedido;
    }

    public DetallePedido actualizarDetallePedido(ActualizarDetallePedidoDto actualizarDetallePedidoDto, DetallePedido detallePedido){
        Pedido pedido = new Pedido();
        Platillo platillo = new Platillo();
        detallePedido.setCantidad(actualizarDetallePedidoDto.getCantidad());
        detallePedido.setPrecioUnitario(actualizarDetallePedidoDto.getPrecioUnitario());
        pedido.setIdPedido(actualizarDetallePedidoDto.getIdPedido());
        platillo.setIdPlatillo(actualizarDetallePedidoDto.getIdPlatillo());
        detallePedido.setPedido(pedido);
        detallePedido.setPlatillo_detalle(platillo);
        return detallePedido;
    }
}
