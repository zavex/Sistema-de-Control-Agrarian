USE AGRARIAN
	GO

	INSERT INTO empleado (nombre,rfc,curp,nss,departamento,estatus,telefono,direccion,correo)
    VALUES ('Ivan Iñiguez','IIAA260986','IIAA260986HBCXK09','7896524589','Sistemas','activo','3321456989','Isla del wasnor No. 29', 'iiniguez@miau.com.mx')
    GO

    INSERT INTO permiso VALUES (1, 'ainiguez', HASHBYTES('md5','nanami'), 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 'password')
    GO

--cambiar las longitudes de estos varchars 
ALTER TABLE almacen ALTER COLUMN direccion varchar(100)
ALTER TABLE producto ALTER COLUMN nombre varchar(100)


--comando para reiniciar el identity por si tienen datos borrarlos y reiniciar cont
--DBCC CHECKIDENT (nombreTabla, RESEED,0)


--Productos Registrados
exec ingresa_producto 1,'Urea','Urea 46-00-00','TM','Granel',5500
exec ingresa_producto 2,'DAP','DAP 18-46-00','TM','Granel',8500
exec ingresa_producto 3,'MAP','MAP 10-50-00','TM','Granel',22000
exec ingresa_producto 4,'KCL','KCL 00-00-60','TM','Granel',7500
exec ingresa_producto 5,'KMG','KMG 00-00-22-11-22','TM','Granel',6500
exec ingresa_producto 6,'Fosfonitrato','Fosfonitrato 33-00-00','TM','Granel',6500
exec ingresa_producto 7,'S. de Potasio','S. de Potasio 00-00-50','TM','Granel',14500
exec ingresa_producto 8,'S. de Amonio','S. de Amonio 22-00-00-24','TM','Granel',4100


--Almacenes Registrados
exec ingresa_almacen 1,'Oficinas C','Don Bosco #6, Col. Don Bosco Vallarta, CP. 45049, Zapopan, Jalisco','013336960824','100',1
exec ingresa_almacen 2,'Autlan','Guadalupe Victoria #788, Autlan de Navarro, Jalisco.','013173821150','100',1
exec ingresa_almacen 3,'La Huerta','Carretera 80 Autlan - Barra de Navidad, La Huerta, Jalisco.','013573840075','100',1
exec ingresa_almacen 4,'El Zapote','Alfonso Reyes #403, Zapote del Valle, Tlajomulco de Zúñiga, Jalisco.','013336960824','100',1
exec ingresa_almacen 5,'El Grullo','Prolongación Hidalgo #500, El Grullo, Jalisco.','013331008707','100',1


--Productos registrados en almacen 1 (registar productos en todos los almacenes)
exec altaProdAlmacen 1,1,100
exec altaProdAlmacen 1,2,80
exec altaProdAlmacen 1,3,120
exec altaProdAlmacen 1,4,70
exec altaProdAlmacen 1,5,50
exec altaProdAlmacen 1,6,20
exec altaProdAlmacen 1,7,75
exec altaProdAlmacen 1,8,60


--Proveedores Registrados
exec ingresa_proveedor 1, 'Francisco Lopez', 'FALO800818','Miraflores #865','3312346557','45600','Zapopan','Jalisco','fco.lopez@gmail.com','Francisco Lopez'
exec ingresa_proveedor 2, 'Javier y Asociados S.C.', 'JAOR700512','Obregon #65','3321344334','44370','Guadalajara','Jalisco','javi.ortiz@gmail.com','Javier Manuel Lopez'
exec ingresa_proveedor 3, 'Margarita Suarez', 'MASU780218','Pablo Valdez #122','3323766690','44200','Guadalajara','Jalisco','magii@hotmail.com','Margarita Suarez'

--Clientes Registrados 
exec ingresa_cliente 1,1234, 'Alfredo Garcia', 'ALGA920618','Constitucion 166','3331784606','45600','Zapopan','Jalisco','alfred.gar@gmail.com','Alfredo Garcia'
exec ingresa_cliente 2,1234, 'Marisela Lopez', 'MALO880118','Morelos #345','3325609099','44360','Guadalajara','Jalisco','marisela.lopez@gmail.com','Marisela Lopez'
exec ingresa_cliente 3,1234, 'Raul Ortiz', 'RAOR720912','Juarez #6785','3315764846','47300','Zapopan','Jalisco','raul.ortiz@hotmail.com','Raul Ortiz'
exec ingresa_cliente 4,1234, 'Jorge Gómez del Mazo', 'GODJ8209240X7','Av. Siempre viva #123','3333428211','45050','Guadalajara','Jalisco','jorge@gmail.com','Jorge Gómez'


--Registro devolucion a cliente 1
insert into devolucion (subTotal, iva, total, idAlmacen, idCliente, estatus ) values (500,80,580,1,1,'ACTIVA')

--Registro Venta a cliente 1
exec insertVenta 6700,1072,7772,1,1,1,'ACTIVA'

--Registro nota de credito a cliente 1
insert into notaCredito (idCliente, concepto, importe, iva, total, estatus) values (1,'Promocion Marzo', 100,16,116,'ACTIVA')

--Registro a pago_cliente y a venta_pago_cliente
exec registrarPagoVenta 1,1,'2017/03/27',1500,'Banamex'

--Registro Compra a Proveedor 1 
exec insertCompra 8500,1360,9860,1,1,1,'ACTIVA'

--Registro a pago_cliente y a venta_pago_cliente
exec registrarPagoCompra 1,1,'2017/03/17',1350,'Banamex','Bancomer'

--Registro a devolucion_producto de devolucion 1 a cliente 1
insert into devolucion_producto (folioDev,idProducto,precio,cantidad) values (1,1,500,6)

--Registro a venta_producto de venta 1
exec ventaProd 1,1,6700,5 

--Registro a compra_producto de compra 1
exec compraProd 1,1,8500,7



