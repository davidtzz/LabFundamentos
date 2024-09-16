package com.udea.concesionariolab.com.udea.concesionariolab.entity;

import com.udea.concesionariolab.com.udea.concesionariolab.entity.TipoVehiculo;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-09-16T06:46:30")
@StaticMetamodel(Vehiculo.class)
public class Vehiculo_ { 

    public static volatile SingularAttribute<Vehiculo, String> marca;
    public static volatile SingularAttribute<Vehiculo, Double> precio;
    public static volatile SingularAttribute<Vehiculo, byte[]> foto;
    public static volatile SingularAttribute<Vehiculo, Integer> cantidad_disponible;
    public static volatile SingularAttribute<Vehiculo, Long> id;
    public static volatile SingularAttribute<Vehiculo, TipoVehiculo> tipoVehiculo;
    public static volatile SingularAttribute<Vehiculo, Date> fecha_ingreso;
    public static volatile SingularAttribute<Vehiculo, String> nombre;
    public static volatile SingularAttribute<Vehiculo, String> modelo;

}