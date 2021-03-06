/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoDatos;


import Modelo.*;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author Moises
 */
public class OrdenCompraDA {
    public ArrayList<OrdenCompra> devolverLista(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://200.16.7.96/inf282g6","inf282g6","ta1RQx6flDXdiTpr" );
            System.out.println("Se conecto correctamente");
            ArrayList<OrdenCompra> lista = new ArrayList<>();
            Statement sentencia= con.createStatement();
            
            //String instruccion = "Select * from Usuario where idTipoUsuario not in ("+2+","+5+") and "+"nombreUsuario='"+nombreUsuario+"' and "+"contraseña='"+contrasena+"'";
            String instruccion = "select * from OrdenCompra order by estadoOrdenCompra DESC";
            //System.out.println(instruccion);
            ResultSet rs = sentencia.executeQuery(instruccion);
            
            
            while (rs.next( )){
                OrdenCompra oc = new OrdenCompra();
                oc.setIdOrdenCompra(rs.getInt("idOrdenCompra"));
                oc.setEstadoOrdenCompra(rs.getInt("estadoOrdenCompra"));
                oc.setFechaOrdenCompra(rs.getDate("fechaOrdenCompra"));
                oc.setCantidadTotalProducto(rs.getInt("CantidadTotalProducto"));
                
                
                
                Statement sentencia2 = con.createStatement();
                String instruccion2 = "select * from DetalleOrdenCompra as d inner join Producto as p on d.idOrdenCompra = "+oc.getIdOrdenCompra()+ " and p.idProducto=d.idProducto;";//
                ResultSet rs2 = sentencia2.executeQuery(instruccion2);
                while (rs2.next()){
                    DetalleOrdenCompra d = new DetalleOrdenCompra();
                    Producto p = new Producto();
                    d.setCantidad(rs2.getInt("cantidad"));
                    
                    
                    p.setIdProducto(rs2.getInt("idProducto"));
                    p.setDescripcion(rs2.getString("descripcion"));
                    p.setNombre(rs2.getString("nombre"));
                    p.setPeso(rs2.getDouble("peso"));
                    p.setPrecioUnitario(rs2.getDouble("precioUnitario"));
                    p.setStock(rs2.getInt("stock"));
                    d.setProducto(p);
                    oc.getDetalleOrdenCompra().add(d);
                }
                rs2.close();
                lista.add(oc);
            }
            con.close();
            return lista;
        }catch(Exception ex){
            return null;
        }
    }
    public boolean registrarOrden(OrdenCompra oc,Usuario us){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://200.16.7.96/inf282g6","inf282g6","ta1RQx6flDXdiTpr" );
            System.out.println("Se conecto correctamente");
            //String instruccion = "insert into OrdenCompra  values";
            CallableStatement cStmt = con.prepareCall("{call insertarOrdenCompra(?,?,?,?)}");
            //(_cantidadTotalProducto,_fechaOrdenCompra,_idResponsableLogistica)
            cStmt.registerOutParameter("_id",java.sql.Types.INTEGER );
            cStmt.setInt("_cantidadTotalProducto",oc.getCantidadTotalProducto());
            

            SimpleDateFormat  sdf;
            String            s;
            sdf = new SimpleDateFormat("yyyy-MM-dd");  // Or whatever format you need
            s = sdf.format(oc.getFechaOrdenCompra()); 
            
            
            DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            java.util.Date fd =   formatter.parse(s);
            java.sql.Date sqlDate = new java.sql.Date(fd.getTime());
            
            cStmt.setDate("_fechaOrdenCompra",sqlDate);
            cStmt.setInt("_idResponsableLogistica",us.getIdUsuario());
            cStmt.execute();
            int id=cStmt.getInt("_id");
            System.out.println("Insertando orden compra");
            
            for (int i=0; i< oc.getDetalleOrdenCompra().size();i++){
                CallableStatement cStmt2 = con.prepareCall("{call insertarDetalleCompra(?,?,?)}");
                cStmt2.setInt("_id",id);
                cStmt2.setInt("_idProducto", oc.getDetalleOrdenCompra().get(i).getProducto().getIdProducto());
                cStmt2.setInt("_cantidad", oc.getDetalleOrdenCompra().get(i).getCantidad());
                
                cStmt2.execute();
                System.out.println("Insertando detalle compra");
                
            }
            cStmt.close();
            con.close();
            return true;
        }catch(Exception ex){
            return false;
        }
        
    }
    public boolean actualizarOrden(OrdenCompra oc , Usuario us){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://200.16.7.96/inf282g6","inf282g6","ta1RQx6flDXdiTpr" );
            System.out.println("Se conecto correctamente");
            CallableStatement cStmt = con.prepareCall("{call actualizarOrdenCompra(?)}");
            cStmt.setInt("_id",oc.getIdOrdenCompra());
            cStmt.execute();
            
            CallableStatement cStmt2 = con.prepareCall("{call actualizarStock(?)}");
            cStmt2.setInt("_id", oc.getIdOrdenCompra());
            cStmt2.execute();   
            con.close();
            return true;
        }catch(Exception ex){
            return true;
        }   

    }
    public OrdenCompra devolverOrden(int cod){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://200.16.7.96/inf282g6","inf282g6","ta1RQx6flDXdiTpr" );
            System.out.println("Se conecto correctamente");
            Statement sentencia= con.createStatement();
            
            //String instruccion = "Select * from Usuario where idTipoUsuario not in ("+2+","+5+") and "+"nombreUsuario='"+nombreUsuario+"' and "+"contraseña='"+contrasena+"'";
            String instruccion = "select * from OrdenCompra where idOrdenCompra="+cod;
            //System.out.println(instruccion);
            ResultSet rs = sentencia.executeQuery(instruccion);
            
            
            while (rs.next( )){
                OrdenCompra oc = new OrdenCompra();
                oc.setIdOrdenCompra(rs.getInt("idOrdenCompra"));
                oc.setEstadoOrdenCompra(rs.getInt("estadoOrdenCompra"));
                oc.setFechaOrdenCompra(rs.getDate("fechaOrdenCompra"));
                oc.setCantidadTotalProducto(rs.getInt("CantidadTotalProducto"));
                
                
                
                Statement sentencia2 = con.createStatement();
                String instruccion2 = "select * from DetalleOrdenCompra as d inner join Producto as p on d.idOrdenCompra = "+oc.getIdOrdenCompra()+ " and p.idProducto=d.idProducto;";//
                ResultSet rs2 = sentencia2.executeQuery(instruccion2);
                while (rs2.next()){
                    DetalleOrdenCompra d = new DetalleOrdenCompra();
                    Producto p = new Producto();
                    d.setCantidad(rs2.getInt("cantidad"));
                    
                    
                    p.setIdProducto(rs2.getInt("idProducto"));
                    p.setDescripcion(rs2.getString("descripcion"));
                    p.setNombre(rs2.getString("nombre"));
                    p.setPeso(rs2.getDouble("peso"));
                    p.setPrecioUnitario(rs2.getDouble("precioUnitario"));
                    p.setStock(rs2.getInt("stock"));
                    d.setProducto(p);
                    oc.getDetalleOrdenCompra().add(d);
                }
                rs2.close();
                con.close();
                return oc;
            }
            
        }catch(Exception ex){
            return null;
        } 
        return null;
    }

}
