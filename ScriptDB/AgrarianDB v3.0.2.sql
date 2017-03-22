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

