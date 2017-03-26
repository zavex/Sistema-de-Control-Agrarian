    /**** ===================================== INSERCION DE USUARIO DEL SISTEMA ===================================== *****/
    USE AGRARIAN
	GO

	INSERT INTO empleado (nombre,rfc,curp,nss,departamento,estatus,telefono,direccion,correo)
    VALUES ('Ivan Iñiguez','IIAA260986','IIAA260986HBCXK09','7896524589','Sistemas','activo','3321456989','Isla del wasnor No. 29', 'iiniguez@miau.com.mx')
    GO

    INSERT INTO permiso VALUES (1, 'ainiguez', HASHBYTES('md5','nanami'), 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 'password')
    GO


/*==============INSERCIONES ====================================================================================================================*/

    exec ingresa_cliente 1,savesave, 'SAVERIO SOTO', 'SOSA900918','ESTEBAN ALATORRE #667','3331784606','44360','GDL','JALISCO','javiersoto.mars@gmail.com','SAVERIO SOTO'
    GO

    exec ingresa_proveedor 1, 'SAVERIO SOTO CALOCA', 'SOSA900918','ESTEBAN ALATORRE #667','3331784606','44360','GDL','JALISCO','javiersoto.mars@gmail.com','SAVERIO SOTO'
    GO

    insert into notaCredito (idCliente, concepto, importe, iva, total, estatus)
            values (1,'PROMOCION MARZO', 50,8,58,'ACTIVA')
    GO

    
    insert into devolucion (subTotal, iva, total, idAlmacen, idCliente, estatus ) 
        values (50,8,58,1,1,'ACTIVA')
    GO

    insert into pago_cliente (idCliente, monto, fecha, banco) 
        values (1,50,'30/09/2016','BANAMEX')
    GO

    insert into venta_pago_cliente (idPagoC, idCliente, folioVenta)
        values (1,1,1)
    GO

    exec ingresa_producto 2,'SULFATOS OMEGA','POLVO','TN','SACOS',100
    GO

    exec ingresa_almacen 3,'Autlan','Guadalupe Victoria #788, Autlan de Navarro, Jalisco.','013173821150','100',1
    GO

    exec altaProdAlmacen 1,2,15
    GO

    exec bajaProdAlmacen 1,1,15
    GO

    exec ventaProd 2,1,10,2
    GO

    exec compraProd 3,1,10,10
    GO

    exec insertVenta 50,10,60,1,1,1,'ACTIVA'
    GO

    exec insertCompra 50,10,60,1,1,1,'ACTIVA'
    GO





/*==============CONSULTAS DE REPORTES JASPER ====================================================================================================================*/


/*Ver productos por almacen*/
select p.idProducto as "IdProducto", p.nombre as "Producto", p.descripcion as "Descripcion", p.medida as "Medida", p.presentacion as "Presentacion", p.precioSugerido as "Precio", al.nombreA as "Almacen", ap.cantidad as "Cantidad" from producto p
    join almacen_producto ap 
    on p.idProducto=ap.idProducto
    join almacen al 
    on ap.idAlmacen=al.idAlmacen;

/*   NUEVOS REPORTES */
    /*Detalle de ventas*/

        select c.nombre as nombreC, v.fechaReg, v.folioVenta, v.total, p.nombre as nombreP, vp.cantidad
        from cliente c join venta v on c.idCliente = v.idCliente
        join venta_producto vp on vp.folioVenta = v.folioVenta
        join producto p on p.idProducto = vp.idProducto where c.idCliente = 1


    /* Estados de cuenta, se necesitan las 4 vistas*/

    create view notaC as
        select distinct nc.idCliente, sum(nc.importe) as 'montoNotaCredito' from notaCredito nc
        where nc.estatus = 'ACTIVA' group by nc.idCliente

    create view devC as
        select distinct d.idCliente , sum(d.subTotal) as 'montoDevolucion' from devolucion d group by d.idCliente

    create view venC as
        select distinct v.idCliente, sum(v.total) as 'montoVenta' from venta v group by v.idCliente
        
    create view pagoC as
        select distinct pc.idCliente, sum(pc.monto) as 'montoPago' from pago_cliente pc group by pc.idCliente


    select c.nombre,c.rfc, c.telefono, c.direccion, c.municipio, c.cp, c.estado, notaC.montoNotaCredito, devC.montoDevolucion, pagoC.montoPago, venC.montoVenta, 
        (venC.montoVenta-(notaC.montoNotaCredito + devC.montoDevolucion + pagoC.montoPago)) as 'TOTAL' from
        cliente c join notaC on c.idCliente = notaC.idCliente
         join devC on c.idCliente = devC.idCliente
         join venC on c.idCliente = venC.idCliente
         join pagoC on c.idCliente = pagoC.idCliente
        where c.idCliente = 1





