--Agrega la base principal, procedures, y usuario administrador

create database agrarian;
GO
use agrarian;
GO

create table proveedor ( 
    idProveedor int not null identity,
    fechaReg datetime not null DEFAULT (getdate()),
    nombre varchar(60) not null,
    rfc varchar (13) not null,
    direccion varchar(50) not null,
    telefono varchar (12),
    cp varchar(5) not null,
    municipio varchar(30) not null,
    estado varchar (30) not null,
    correo varchar(50) not null,
    contacto varchar (50),
    primary key (idProveedor));
    GO

  create table empleado (   
    idEmpleado int not null identity,
    fechaReg datetime not null DEFAULT (getdate()),
    nombre varchar(50) not null,
    rfc varchar(13) not null,
    curp varchar(18) not null,
    nss varchar(11) not null,
    departamento varchar(30) not null,
    estatus varchar(15) not null,
    telefono varchar(12) not null,
    direccion varchar(50),
    correo varchar(30) not null,
    primary key (idEmpleado));
    GO
  create table cliente ( 
    idCliente int not null identity,
    password varchar(60),
    nombre varchar(60) not null,
    rfc varchar (13) not null,
    direccion varchar(50) not null,
    telefono varchar (12),
    cp varchar(5) not null,
    municipio varchar(30) not null,
    estado varchar (30) not null,
    correo varchar(30) not null,
    contacto varchar (30),
    fechaReg datetime not null DEFAULT (getdate()),
    fechaMod datetime not null DEFAULT (getdate()),
    primary key (idCliente));
    GO

  create table producto (   
    idProducto int not null identity,
    fechaReg datetime not null DEFAULT (getdate()),
    nombre varchar(20) not null,
    descripcion varchar(40) not null,
    medida varchar(2) not null,
    presentacion varchar(10) not null,
    precioSugerido decimal (10, 2) not null,
    primary key (idProducto));
    GO

  create table almacen (  
    idAlmacen int not null identity,
    fechaReg datetime not null DEFAULT (getdate()),
    nombreA varchar(20) not null,
    direccion varchar(50) not null,
    telefono varchar(12) not null,
    capacidad varchar(15) not null,            
    idEmpleado int not null,
    primary key(idAlmacen),
    foreign key(idEmpleado) references empleado(idEmpleado));
    GO

  create table devolucion (   
    folioDev int not null identity,
    fechaReg datetime not null DEFAULT (getdate()),
    subTotal decimal (10, 2) not null,
    iva decimal (10, 2) not null,
    total decimal (10, 2) not null,
    idAlmacen int not null,
    idCliente int not null,
    estatus varchar(10) not null,
    primary key(folioDev),
    foreign key(idAlmacen) references almacen(idAlmacen),
    foreign key(idCliente) references cliente(idCliente));
    GO

  create table venta (    
    folioVenta int not null identity,
    fechaReg datetime not null DEFAULT (getdate()),
    subTotal decimal (10, 2) not null,
    iva decimal (10, 2) not null,
    total decimal (10, 2) not null,
    idAlmacen int not null,
    idCliente int not null,
    idEmpleado int not null,
    estatus varchar(10) not null,
    primary key(folioVenta),
    foreign key(idAlmacen) references almacen(idAlmacen),
    foreign key(idCliente) references cliente(idCliente),
    foreign key(idEmpleado) references empleado(idEmpleado));
    GO

  create table compra (  
    folioCompra int not null identity,
    fechaReg datetime not null DEFAULT (getdate()),
    subTotal decimal (10, 2) not null,
    iva decimal (10, 2) not null,
    total decimal (10, 2) not null,
    idAlmacen int not null,
    idProveedor int not null,
    idEmpleado int not null,
    estatus varchar(10) not null,
    primary key(folioCompra),
    foreign key(idAlmacen) references almacen(idAlmacen),
    foreign key(idProveedor) references proveedor(idProveedor),
    foreign key(idEmpleado) references empleado(idEmpleado));
    GO
    
  create table factura (
    folioFactura int not null identity,
    folioVenta int not null,
    fechaReg datetime not null DEFAULT (getdate()),
    subTotal decimal (10, 2) not null,
    iva decimal (10, 2) not null,
    total decimal (10, 2) not null,
    estatus varchar(10) not null,
    primary key(folioFactura),
    foreign key(folioVenta) references venta(folioVenta));
    GO

  create table notaCredito (    
    folioNC int not null identity,
    idCliente int not null,
    fechaReg datetime not null DEFAULT (getdate()),
    concepto varchar(50) not null,
    importe decimal (10, 2) not null,
    iva decimal (10, 2) not null,
    total decimal (10, 2) not null,
    estatus varchar(10) not null,
    primary key(folioNC),
    foreign key(idCliente) references cliente(idCliente));
    GO

  create table permiso (          
    idEmpleado int not null,
    usuario varchar(10) not null,
    contraseña varchar(32) not null,
    proveedor int not null,
    producto int not null,
    notaCredito int not null,
    empleado int not null,
    devolucion int not null,
    cliente int not null,
    almacen int not null,
    permisos int not null,
    compra int not null,
    venta int not null,
    mezcla int not null,
    factura int not null,
    pagos int not null,
    traspasos int not null,
    contrasenaBcrypt varchar(60) not null,
    primary key(idEmpleado),
    foreign key(idEmpleado) references empleado(idEmpleado));
    GO

    create table pago_cliente (
    idPagoC int not null identity,
    idCliente int not null,
    monto decimal (10, 2) not null,
    fecha date not null,    --Cambio del tipo de dato a date
    banco varchar(15) not null,
    primary key(idPagoC, idCliente),
    foreign key(idCliente) references cliente(idCliente));
    GO

create table pago_proveedor (
    idPagoP int not null identity,
    idEmpleado int not null,
    monto decimal (10, 2) not null,
    fecha date not null,  --Cambio del tipo de dato a date
    bancoOrigen varchar(15) not null,
    bancoDest varchar(15) not null,
    primary key(idPagoP, idEmpleado),
    foreign key(idEmpleado) references empleado(idEmpleado));
    GO

create table devolucion_producto (
    folioDev int not null,
    idProducto int not null,
    precio decimal (10, 2) not null,
    cantidad decimal (10, 2) not null,
    primary key(folioDev, idProducto),
    foreign key(folioDev) references devolucion(folioDev),
    foreign key(idProducto) references producto(idProducto));
    GO

create table almacen_producto (
    idAlmacen int not null,
    idProducto int not null,
    cantidad decimal (10, 2) not null,
    primary key(idAlmacen, idProducto),
    foreign key(idAlmacen) references almacen(idAlmacen),
    foreign key(idProducto) references producto(idProducto));
    GO

create table venta_producto (
    folioVenta int not null,
    idProducto int not null,
    precio decimal (10, 2) not null,
    cantidad decimal (10, 2) not null,
    primary key(folioVenta, idProducto),
    foreign key(folioVenta) references venta(folioVenta),
    foreign key(idProducto) references producto(idProducto));  
    GO

create table compra_producto (
    folioCompra int not null,
    idProducto int not null,
    precio decimal (10, 2) not null,
    cantidad decimal (10, 2) not null,
    primary key(folioCompra, idProducto),
    foreign key(folioCompra) references compra(folioCompra),
    foreign key(idProducto) references producto(idProducto));
    GO

create table venta_pago_cliente (
    idPagoC int not null,
    idCliente int not null,
    folioVenta int not null,
    primary key(idPagoC, idCliente, folioVenta),
    foreign key(idPagoC, idCliente) references pago_cliente(idPagoC, idCliente),
    foreign key(folioVenta) references venta(folioVenta));
    GO

create table compra_pago_proveedor (
    idPagoP int not null,
    idEmpleado int not null,
    folioCompra int not null,
    primary key(idPagoP, idEmpleado, folioCompra),
    foreign key(idPagoP, idEmpleado) references pago_proveedor(idPagoP, idEmpleado),
    foreign key(folioCompra) references compra(folioCompra));
    GO

create table traspaso (
    idAlmacen int not null,
    idProducto int not null,
    folio int not null,
    fechaReg datetime not null DEFAULT (getdate()),
    cantidad decimal (10, 2) not null,
    destino varchar (25) not null,
    primary key(idAlmacen, IdProducto, folio),
    foreign key(idAlmacen) references almacen(idAlmacen),
    foreign key(idProducto) references producto(idProducto));
    GO

    /*
    *
    *						================= Procedimientos almacenados ==================
	*
	*/

	CREATE PROCEDURE VERIFICAR(
        @user varchar(10),
        @pass varchar(32)
        )
    AS
    BEGIN
        IF EXISTS(SELECT * FROM PERMISO WHERE usuario = @user and contraseña = HASHBYTES('md5',@pass))
            BEGIN
                SELECT p.usuario from permiso p WHERE usuario = @user AND contraseña = HASHBYTES('md5',@pass)
            END
        ELSE
            SELECT 'No encontradó'
    END
    GO
    exec verificar 'user','pass'
    go


    CREATE PROCEDURE ingresa_empleado 
        (@id_emp int,   
        @nombre_emp varchar(50),
        @rfc_emp varchar(13),
        @curp_emp varchar(18),
        @nss_emp varchar (11),
        @departamento_emp varchar (30),
        @estatus_emp varchar (15),
        @telefono_emp varchar (12),
        @direccion_emp varchar (50),
        @correo_emp varchar (30)
        )
    AS
    BEGIN
        SET NOCOUNT ON;
        if exists (select idEmpleado from empleado where idEmpleado=@id_emp) 
        --Actualizacion del registro en la tabla 
            update empleado set nombre  = @nombre_emp, rfc = @rfc_emp, curp = @curp_emp, nss = @nss_emp,
                departamento = @departamento_emp, estatus = @estatus_emp, telefono = @telefono_emp, direccion = @direccion_emp, correo = @correo_emp  
                    where idEmpleado = @id_emp
            else 
        insert into empleado (nombre ,rfc , curp ,nss , departamento, estatus, telefono, direccion, correo) values (
            @nombre_emp, @rfc_emp, @curp_emp, @nss_emp, @departamento_emp, @estatus_emp, @telefono_emp, @direccion_emp, @correo_emp   
        )
    END
    GO



    CREATE PROCEDURE ingresa_proveedor
        (@id_prov int,   
        @nombre_prov varchar(60),
        @rfc_prov varchar(13),
        @direccion_prov varchar (50),
        @telefono_prov varchar (12),
        @cp_prov varchar (5),
        @municipio_prov varchar (30),
        @estado_prov varchar (30),
        @correo_prov varchar (30),
        @contacto_prov varchar (30)
        )
    AS
    BEGIN
        SET NOCOUNT ON;
        if exists (select idProveedor from proveedor where idProveedor=@id_prov) 
        --Actualizacion del registro en la tabla 
            update proveedor set nombre  = @nombre_prov, rfc = @rfc_prov, direccion = @direccion_prov, telefono = @telefono_prov,
                cp = @cp_prov, municipio = @municipio_prov, estado = @estado_prov, correo = @correo_prov, contacto = @contacto_prov  
                    where idProveedor = @id_prov
            else 
        insert into proveedor (nombre ,rfc , direccion ,telefono, cp, municipio, estado, correo, contacto ) values (
            @nombre_prov, @rfc_prov, @direccion_prov, @telefono_prov, @cp_prov, @municipio_prov, @estado_prov, @correo_prov, @contacto_prov   
        )
    END
    GO


    CREATE PROCEDURE ingresa_cliente
        (@id_cliente int,   
        @password_client varchar(60), 
        @nombre_client varchar(60),
        @rfc_client varchar(13),
        @direccion_client varchar (50),
        @telefono_client varchar (12),
        @cp_client varchar (5),
        @municipio_client varchar (30),
        @estado_client varchar (30),
        @correo_client varchar (30),
        @contacto_client varchar (30)
        )
    AS
    BEGIN
        SET NOCOUNT ON;
        if exists (select idCliente from cliente where idCliente=@id_cliente) 
        --Actualizacion del registro en la tabla 
            update cliente set password = HASHBYTES('MD5',@password_client), nombre  = @nombre_client, rfc = @rfc_client, direccion = @direccion_client, telefono = @telefono_client,
                cp = @cp_client, municipio = @municipio_client, estado = @estado_client, correo = @correo_client, contacto = @contacto_client  
                    where idCliente = @id_cliente
            else 
        insert into cliente (password , nombre ,rfc , direccion ,telefono, cp, municipio, estado, correo, contacto ) values (
            HASHBYTES('MD5',@password_client), @nombre_client, @rfc_client, @direccion_client, @telefono_client, @cp_client, @municipio_client, @estado_client, @correo_client, @contacto_client)   
        
        insert into notaCredito (idCliente, concepto, importe, iva, total, estatus) 
            values (@id_cliente,'', 0,0,0,'ACTIVA')         --necesario para que los reportes puedan arrojar un cero en caso de que no haya resultados
        
        insert into devolucion (subTotal, iva, total, idAlmacen, idCliente, estatus ) 
            values (0,0,0,1,@id_cliente,'ACTIVA')           --necesario para que los reportes puedan arrojar un cero en caso de que no haya resultados
        
        insert into venta (subTotal, iva, total, idAlmacen, idCliente, idEmpleado, estatus) 
            values (0,0,0,1,@id_cliente,1,'ACTIVA')         --necesario para que los reportes puedan arrojar un cero en caso de que no haya resultados
        
        insert into pago_cliente (idCliente, monto, fecha, banco)
            values (@id_cliente,0,'','')
    END
    GO

CREATE PROCEDURE ingresa_producto
        (@id_producto int,   
        @nombre_producto varchar(20), 
        @descripcion_producto varchar(40),
        @medida_producto varchar(2),
        @presentacion_producto varchar (10),
        @precio_producto decimal (10, 2)
        )
    AS
    BEGIN
        SET NOCOUNT ON;
        if exists (select idProducto from producto where idProducto=@id_producto) 
        --Actualizacion del registro en la tabla 
            update producto set nombre = @nombre_producto, descripcion  = @descripcion_producto, medida = @medida_producto, presentacion = @presentacion_producto, precioSugerido = @precio_producto 
                where idProducto = @id_producto
            else 
        insert into producto (nombre , descripcion ,medida , presentacion ,precioSugerido ) values (
            @nombre_producto, @descripcion_producto, @medida_producto, @presentacion_producto, @precio_producto  
        )
    END
    GO

CREATE PROCEDURE ingresa_almacen
        (@id_almacen int,   
        @nombre_almacen  varchar(20), 
        @direccion varchar(50),
        @telefono varchar(12),
        @capacidad varchar (15),
        @idEmpleado int
        )
    AS
    BEGIN
        SET NOCOUNT ON;
        if exists (select idAlmacen from almacen where idAlmacen=@id_almacen) 
        --Actualizacion del registro en la tabla 
            update almacen set nombreA = @nombre_almacen, direccion = @direccion , telefono = @telefono, capacidad = @capacidad, idEmpleado = @idEmpleado 
                where idAlmacen = @id_almacen
            else 
        insert into almacen (nombreA , direccion ,telefono , capacidad ,idEmpleado ) values (
            @nombre_almacen, @direccion, @telefono, @capacidad, @idEmpleado  
        )
    END
    GO


/*Procedure para sumar producto a inventario MODULO COMPRA*/ 
    CREATE PROCEDURE altaProdAlmacen
            (@id_almacen int,   
            @id_prod  int, 
            @cantidad_prod decimal(10,2)
            )
        AS
        BEGIN
            SET NOCOUNT ON;
            if exists (select idAlmacen from almacen_producto where idAlmacen=@id_almacen and idProducto = @id_prod )
            --Actualizacion del registro en la tabla 
                update almacen_producto set cantidad = cantidad + @cantidad_prod 
                    where idAlmacen = @id_almacen and idProducto = @id_prod;
                else 
            insert into almacen_producto (idAlmacen , idProducto ,cantidad ) values (
                @id_almacen, @id_prod, @cantidad_prod  
            )
        END
        GO

        /*Procedure para restar producto a inventario MODULO VENTA*/
    CREATE PROCEDURE bajaProdAlmacen
            (@id_almacen int,   
            @id_prod  int, 
            @cantidad_prod decimal(10,2)
            )
        AS
        BEGIN
            SET NOCOUNT ON;
            if exists (select idAlmacen from almacen_producto where idAlmacen=@id_almacen and idProducto = @id_prod )
            --Actualizacion del registro en la tabla 
                update almacen_producto set cantidad = cantidad - @cantidad_prod 
                    where idAlmacen = @id_almacen and idProducto = @id_prod;
                else 
                select 'En almacen no existe producto para restar';
        END
    GO


    /*Procedure para registrar venta_productos */
    CREATE PROCEDURE ventaProd
            (@folio_venta int,   
            @id_prod  int, 
            @precio_prod decimal(10,2),
            @cantidad_prod decimal(10,2)
            )
        AS
        BEGIN
            SET NOCOUNT ON;
            if exists (select folioVenta from venta_producto where folioVenta=@folio_venta and idProducto  = @id_prod) 
            --Actualizacion del registro en la tabla 
                update venta_producto set cantidad = cantidad + @cantidad_prod
                    where folioVenta  = @folio_venta and idProducto = @id_prod
                else 
            insert into venta_producto (folioVenta, idProducto, precio, cantidad) values (
                @folio_venta,@id_prod,@precio_prod,@cantidad_prod  
            )
        END
    GO



    /*Procedure para registrar compra_productos */
    CREATE PROCEDURE compraProd
        (@folio_compra int,   
        @id_prod  int, 
        @precio_prod decimal(10,2),
        @cantidad_prod decimal(10,2)
        )
    AS
    BEGIN
        SET NOCOUNT ON;
        if exists (select folioCompra from compra_producto where folioCompra=@folio_compra and idProducto  = @id_prod) 
        --Actualizacion del registro en la tabla 
            update compra_producto set cantidad = cantidad + @cantidad_prod
                where folioCompra  = @folio_compra and idProducto = @id_prod
            else 
        insert into compra_producto (folioCompra, idProducto, precio, cantidad) values (
            @folio_compra,@id_prod,@precio_prod,@cantidad_prod  
        )
    END
    GO



        CREATE PROCEDURE insertVenta
            (@sub_total decimal(10,2),
            @iva_venta decimal(10,2), 
            @total_venta decimal(10,2),   
            @idAlmacen_ven int, 
            @idCliente_ven int,
            @idEmpleado_ven int,
            @estatus_ven varchar(10)
            )
        AS
        BEGIN
            SET NOCOUNT ON;
            if exists (select idAlmacen from almacen where idAlmacen = @idAlmacen_ven) 
                if exists (select idCliente from cliente where idCliente = @idCliente_ven) 
                    if exists (select idEmpleado from empleado where idEmpleado = @idEmpleado_ven)
                        insert into venta (subTotal, iva, total, idAlmacen, idCliente, idEmpleado, estatus) values (
                        @sub_total,@iva_venta,@total_venta,@idAlmacen_ven, @idCliente_ven, @idEmpleado_ven,  @estatus_ven)
                    else     
                        select 'El empleado no existe'
                else 
                    select 'El cliente no existe'
            else 
                select 'El almacen no existe'
        END
    GO



    CREATE PROCEDURE insertCompra
            (@sub_total decimal(10,2),
            @iva_compra decimal(10,2), 
            @total_compra decimal(10,2),   
            @idAlmacen_compra int, 
            @idProveedor_compra int,
            @idEmpleado_compra int,
            @estatus_compra varchar(10)
            )
        AS
        BEGIN
            SET NOCOUNT ON;
            if exists (select idAlmacen from almacen where idAlmacen = @idAlmacen_compra) 
                if exists (select idProveedor from proveedor where idProveedor = @idProveedor_compra) 
                    if exists (select idEmpleado from empleado where idEmpleado = @idEmpleado_compra)
                        insert into compra (subTotal, iva, total, idAlmacen, idProveedor, idEmpleado, estatus) values (
                        @sub_total,@iva_compra,@total_compra,@idAlmacen_compra, @idProveedor_compra, @idEmpleado_compra, @estatus_compra)
                    else     
                        select 'El empleado no existe'
                else 
                    select 'El proveedor no existe'
            else 
                select 'El almacen no existe'
        END
    GO



        /*Para obtener precio individual {Required view vistaDevoluciones}*/
    
    CREATE PROCEDURE regresarPrecioUnidad 
        (@folio_venta INT,   
        @id_prod INT
        )
    AS
    BEGIN
        SET NOCOUNT ON;
        if exists (select folioVenta from vistaDevoluciones where folioVenta = @folio_venta and idProducto = @id_prod) 
            select precio/cantidad from vistaDevoluciones where folioVenta = @folio_venta and idProducto = @id_prod
            ELSE
            select 'no existe esa entrada';
    END
    GO

            /* =============== PROCEDIMIENTOS AGREGADOS EL 20/03/2017 =============================================*/

    CREATE PROCEDURE consultaVenta( --Recibe folio de venta y id del proveedor
        @folioV int,
        @idCli int
        )
    AS
    BEGIN
        IF EXISTS ( 
            SELECT * from venta v
            JOIN cliente c
            ON c.idCliente = v.idCliente
            where c.idCliente = @idCli AND v.folioVenta = @folioV
        )
            SELECT c.idCliente, c.nombre,v.folioVenta, v.fechaReg, v.subTotal, v.estatus from venta v
            JOIN cliente c
            ON c.idCliente = v.idCliente
            where c.idCliente = @idCli AND v.folioVenta = @folioV
        
    END
    GO

    exec consultaVenta 2, 1
    GO


    CREATE PROCEDURE consultaCompra(  --Recibe Folio de compra y id del proveedor en ese orden
        @folioC int,
        @idEmpleado int
        )
    AS
    BEGIN
        IF EXISTS (
            SELECT * from compra c
            JOIN empleado e
            ON c.idEmpleado = e.idEmpleado
            where c.idProveedor = @idEmpleado AND c.folioCompra = @folioC
        )
            SELECT e.idEmpleado, e.nombre, c.folioCompra,c.fechaReg, c.subTotal, c.estatus from compra c
            JOIN empleado e
             ON c.idEmpleado = e.idEmpleado
            where e.idEmpleado = @idEmpleado AND c.folioCompra = @folioC
        
    END
    GO

    /*El metodo recibe id de cliente, folio de venta, fecha de alta del pago, monto del pago y banco receptor.
     Generará el registro de pago y la asociación venta_pago_cliente */
    -- recibe idCliente, FolioVenta, fechaPago, montoAbonado, bancoReceptor
    CREATE PROCEDURE registrarPagoVenta(
        --IDs y Folios
            @idCliente INT, 
            @folioV INT, 

        --Fechas y Montos
            @fecha DATE,
            @monto DECIMAL(10,2),
        --Banco
            @banco VARCHAR(15)
    )
    AS
    BEGIN   
            
            IF EXISTS(
                SELECT v.* FROM venta v
                WHERE v.folioVenta = @folioV
            )
            BEGIN
                INSERT INTO pago_cliente(idCliente,monto,fecha,banco)
                VALUES(@idCliente,@monto,@fecha,@banco);

                DECLARE @idPago INT
                SET @idPago = (SELECT c.idPagoC FROM pago_cliente c WHERE c.idCliente = @idCliente AND c.fecha = @fecha AND c.monto = @monto);

                INSERT INTO venta_pago_cliente(idPagoC,idCliente,folioVenta)
                VALUES(@idPago,@idCliente,@folioV);
            END
            ELSE
                Select 'Esa venta no está registrada';
            
    END
    GO


    --Recibe idEmpleado,FolioCompra,FechaPago,montoAbonado,bangoOrigen,BancoDestino
    CREATE PROCEDURE registrarPagoCompra(
        --IDs y Folios
            @idEmpleado INT, 
            @folioC INT, 

        --Fechas y Montos
            @fecha DATE,
            @monto DECIMAL(10,2),
        --Banco
            @bancoOrigen VARCHAR(15),
            @bancoDestino VARCHAR(15)       
    )
    AS
    BEGIN   
            
            IF EXISTS(
                SELECT c.* FROM compra c
                WHERE c.folioCompra = @folioC
            )
            BEGIN
                INSERT INTO pago_proveedor(idEmpleado,monto,fecha,bancoOrigen,bancoDest)
                VALUES(@idEmpleado,@monto,@fecha,@bancoOrigen,@bancoDestino);

                DECLARE @idPago INT
                SET @idPago = (SELECT p.idPagoP FROM pago_proveedor p WHERE p.idEmpleado = @idEmpleado AND p.fecha = @fecha AND p.monto = @monto);

                INSERT INTO compra_pago_proveedor(idPagoP,idEmpleado,folioCompra)
                VALUES(@idPago,@idEmpleado,@folioC);
            END
            ELSE
                Select 'Esa venta no está registrada';
    END
    GO


        CREATE PROCEDURE mostrarAbonosCliente(@idV INT)
    AS
    BEGIN
        SELECT pc.idPagoC 'ID Pago',cl.nombre 'Cliente', pc.monto 'Abono', pc.fecha 'Fecha', pc.banco 'Banco destino' From venta v
        JOIN venta_pago_cliente vpc
        ON v.folioVenta = vpc.folioVenta
        JOIN pago_cliente pc
        ON vpc.idPagoC = pc.idPagoC
        JOIN cliente cl
        ON pc.idCliente = cl.idCliente
        WHERE v.folioVenta = @idV
    END
    GO

    CREATE PROCEDURE mostrarAbonoProveedor(@idC INT)
    AS
    BEGIN
        SELECT pp.idPagoP 'ID Pago', e.nombre 'Empleado', pp.monto 'Abono', pp.fecha 'Fecha', pp.bancoOrigen 'Banco origen',pp.bancoDest 'Banco destino' from compra c
        JOIN compra_pago_proveedor cpp
        ON cpp.folioCompra = c.folioCompra
        JOIN pago_proveedor pp
        ON cpp.idPagoP = pp.idPagoP
        JOIN empleado e
        ON e.idEmpleado = pp.idEmpleado
        WHERE c.folioCompra = @idC
    END
    GO

    /**** ===================================== INSERCION DE USUARIO DEL SISTEMA ===================================== *****/
    INSERT INTO empleado (nombre,rfc,curp,nss,departamento,estatus,telefono,direccion,correo)
    VALUES ('Ivan Iñiguez','IIAA260986','IIAA260986HBCXK09','7896524589','Sistemas','activo','3321456989','Isla del wasnor No. 29', 'iiniguez@miau.com.mx')
    GO

    INSERT INTO permiso VALUES (1, 'ainiguez', HASHBYTES('md5','nanami'), 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 'password')
    GO

