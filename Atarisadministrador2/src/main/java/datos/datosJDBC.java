package datos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class datosJDBC {
    private Conexion dbconnect;
    private Datos model;
    private Connection connection;
    
    private final String SQL_SELECT="SELECT * FROM empleado";
    private final String SQL_SELECT2="SELECT * FROM clientes";
    private final String SQL_SELECT3="SELECT * FROM citas";
    private DefaultTableModel DT;
    private DefaultTableModel DC;
    private DefaultTableModel DP;
    private ResultSet RS;
   private PreparedStatement PS;
    //private final Cls_Conexion CN;
    
    public datosJDBC(){
        PS= null;
        dbconnect = new Conexion();
        model = new Datos();
    }
    //tabla para empleados
    private DefaultTableModel setTitulos(){
        DT = new DefaultTableModel();
        DT.addColumn("Codigo");
        DT.addColumn("Nombre");
        DT.addColumn("Ape. Pat");
        DT.addColumn("Ape. Mat");
        DT.addColumn("CURP");
        DT.addColumn("Fecha");
        DT.addColumn("Salario");
        DT.addColumn("Edad");
        DT.addColumn("Direc.");
        return DT;
    }
    
    public DefaultTableModel getDatos(){
       PreparedStatement ps;
        try{
           setTitulos();
            PS = dbconnect.getConnection().prepareStatement(SQL_SELECT);
            RS=PS.executeQuery();
            Object[] fila=new Object[9];
            while(RS.next()){
                fila[0]=RS.getInt(1);
                fila[1]=RS.getString(2);
                fila[2]=RS.getString(3);
                fila[3]=RS.getString(4);
                fila[4]=RS.getString(5);
                fila[5]=RS.getString(6);
                fila[6]=RS.getString(7);
                fila[7]=RS.getString(8);
                fila[8]=RS.getString(9);
                DT.addRow(fila);
            }
            
            
          // PS= C
       }catch(SQLException e){
            System.out.println("Error al listar los datos :"+e.getMessage());
       } finally{
            PS= null;
            RS=null;
            //PS.close();
        }
       return DT;
    }
    
    //clientes
    private DefaultTableModel setTitulos2(){
        DC = new DefaultTableModel();
        DC.addColumn("Id");
        DC.addColumn("Nombre");
        DC.addColumn("Ape. Pat");
        DC.addColumn("Ape. Mat");
        DC.addColumn("CURP");
        DC.addColumn("Edad");
        DC.addColumn("Tel");
        DC.addColumn("FechaNac");
        DC.addColumn("Correo");
        DC.addColumn("Contra");
        DC.addColumn("Direc.");
        DC.addColumn("Paq.");
        return DC;
    }
    //6:00
    public DefaultTableModel getDatos2(){
       PreparedStatement ps;
        try{
           setTitulos2();
            PS = dbconnect.getConnection().prepareStatement(SQL_SELECT2);
            RS=PS.executeQuery();
            Object[] fila=new Object[12];
            while(RS.next()){
                fila[0]=RS.getInt(1);
                fila[1]=RS.getString(2);
                fila[2]=RS.getString(3);
                fila[3]=RS.getString(4);
                fila[4]=RS.getString(5);
                fila[5]=RS.getString(6);
                fila[6]=RS.getString(7);
                fila[7]=RS.getString(8);
                fila[8]=RS.getString(9);
                fila[9]=RS.getString(10);
                fila[10]=RS.getString(11);
                fila[11]=RS.getString(12);
                DC.addRow(fila);
            }
          // PS= C
       }catch(SQLException e){
            System.out.println("Error al listar los datos :"+e.getMessage());
       } finally{
            PS= null;
            RS=null;
            //PS.close();
        }
       return DC;
    }
    
    //tabla para empleados
    private DefaultTableModel setTitulos3(){
        DP = new DefaultTableModel();
        DP.addColumn("Codigo Cita");
        DP.addColumn("Fecha Cita");
        DP.addColumn("Hora");
        DP.addColumn("ClienteId");
        DP.addColumn("EmpleadoId");
        return DP;
    }
    //6:00
    public DefaultTableModel getDatos3(){
       PreparedStatement ps;
        try{
           setTitulos3();
            PS = dbconnect.getConnection().prepareStatement(SQL_SELECT3);
            RS=PS.executeQuery();
            Object[] fila=new Object[5];
            while(RS.next()){
                fila[0]=RS.getInt(1);
                fila[1]=RS.getString(2);
                fila[2]=RS.getString(3);
                fila[3]=RS.getInt(4);
                fila[4]=RS.getInt(5);
                DP.addRow(fila);
            }
          // PS= C
       }catch(SQLException e){
            System.out.println("Error al listar los datos :"+e.getMessage());
       } finally{
            PS= null;
            RS=null;
            //PS.close();
        }
       return DP;
    }
    
    public void insertClien(int id,String nom, String aP, String aM, String dni, String ed,String tel,String Fecha,String cor,String con,String dir,String paq){
        PreparedStatement ps;
        String sql;
        model.setClienid(id);
        model.setClienNombre(nom);
        model.setClienApePat(aP);
        model.setClienApeMat(aM);
        model.setClienDni(dni);
        model.setClienEd(ed);
        model.setClienTel(tel);
        model.setClienFech(Fecha);
        model.setClienCorreo(cor);
        model.setClienCon(con);
        model.setCliendirec(dir);
        model.setClienPaq(paq);
        try{
            connection = dbconnect.getConnection();
            CallableStatement stmt = null;
            String textMessage = null;
            sql = "{call insertaClientes  (?,?,?,?,?,?,?,?,?,?,?,?,?)}";
            stmt = connection.prepareCall(sql);
            stmt.setInt(1, id);
            stmt.setString(2, model.getClienNombre());
            stmt.setString(3, model.getClienApePat());
            stmt.setString(4, model.getClienApeMat());
            stmt.setString(5, model.getClienDni());
            stmt.setString(6, model.getClienEd());
            stmt.setString(7, model.getClienTel());
            stmt.setString(8, model.getClienFech());
            stmt.setString(9, model.getClienCorreo());
            stmt.setString(10, model.getClienCon());
            stmt.setString(11,model.getCliendirec());
            stmt.setString(12,model.getClienPaq());
            stmt.registerOutParameter(13, java.sql.Types.VARCHAR);
            stmt.execute();
            textMessage = stmt.getString(13);
            System.out.println("Mensaje" +  " es: " + textMessage);
            JOptionPane.showMessageDialog(null, textMessage);
            stmt.close();
            connection.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());        
        }    
     }  
    
    public void buscarClien(String nombre, String AP, String AM){
        PreparedStatement ps;
        String sql;
        model.setClienNombre(nombre);
        model.setClienApePat(AP);
        model.setClienApeMat(AM);
           
        try{
            connection = dbconnect.getConnection();
            CallableStatement stmt = null;
            String textMessage = null;
            sql = "{call buscaClientes(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
            stmt = connection.prepareCall(sql);
            stmt.setString(1, model.getClienNombre());
            stmt.setString(2, model.getClienApePat());
            stmt.setString(3, model.getClienApeMat());
            stmt.registerOutParameter(4, java.sql.Types.INTEGER);
            stmt.registerOutParameter(5, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(6, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(7, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(8, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(9, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(10, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(11, java.sql.Types.DATE);
            stmt.registerOutParameter(12, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(13, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(14, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(15, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(16, java.sql.Types.VARCHAR);
            
            
            
            stmt.execute();
            
            textMessage = Integer.toString(stmt.getInt(4))+"\n"+stmt.getString(5)+"\n"+stmt.getString(6)+"\n"+stmt.getString(7)+
                          "\n"+stmt.getString(8)+"\n"+stmt.getString(9)+"\n"+stmt.getString(10)+"\n"+stmt.getString(11)+"\n"+stmt.getString(12)+"\n"+stmt.getString(13)+"\n"+stmt.getString(14)+"\n"+stmt.getString(15)+"\n"+stmt.getString(16);
            System.out.println("Mensaje" +  " es " + textMessage);
            JOptionPane.showMessageDialog(null, textMessage);
            
            stmt.close();
            connection.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
    }
    
    public void buscarCodclien(int id){
        PreparedStatement ps;
        String sql;
        model.setClienid(id);
         //13
           
        try{
            connection = dbconnect.getConnection();
            CallableStatement stmt = null;
            String textMessage = null;
            sql = "{call buscarCodigoCliente(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
            stmt = connection.prepareCall(sql);
            stmt.setInt(1, model.getClienid());
            stmt.registerOutParameter(2, java.sql.Types.INTEGER);
            stmt.registerOutParameter(3, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(4, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(5, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(6, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(7, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(8, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(9, java.sql.Types.DATE);
            stmt.registerOutParameter(10, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(11, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(12, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(13, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(14, java.sql.Types.VARCHAR);
            stmt.execute();
            
            textMessage = Integer.toString(stmt.getInt(2))+"\n"+stmt.getString(3)+"\n"+stmt.getString(4)+
                          "\n"+stmt.getString(5)+"\n"+stmt.getString(6)+"\n"+stmt.getString(7)+"\n"+stmt.getString(8)
                    +"\n"+stmt.getString(9)+"\n"+stmt.getString(10)+"\n"+stmt.getString(11)+"\n"+stmt.getString(12)
                    +"\n"+stmt.getString(13);
            System.out.println("Mensaje" +  " es " + textMessage);
            JOptionPane.showMessageDialog(null, textMessage);
            
            stmt.close();
            connection.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
    }
       
     public void eliminarClien(int Id){
        PreparedStatement ps;
        String sql;
        
        model.setClienid(Id);
        
        try{
            connection = dbconnect.getConnection();
            CallableStatement stmt = null;
            String textMessage = null;
            sql = "{call eliminarClientes (?,?)}";
            stmt = connection.prepareCall(sql);
            stmt.setInt(1, model.getClienid());
            stmt.registerOutParameter(2, java.sql.Types.VARCHAR);
            
            stmt.execute();
            
            textMessage = stmt.getString(2);
            System.out.println("Mensaje" +  " es " + textMessage);
            JOptionPane.showMessageDialog(null, textMessage);
            stmt.close();
            connection.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
    }
     
     
    
    
    //insert into Empleado (Codigo, Nombre, ApellidoPaterno, ApellidoMaterno, DNI, Fecha, Salario, Departamento,Edad,Direccion)  
	//values (matricula, nombreEmp, apellidoP, apellidoM, id, fechaIngreso, sueldo, nombreDept,ed,dir);
        public void insertEmpleados(int id, String nom, String AP, String AM, String dni, String Fecha, float sala,double ed,String dir){
        PreparedStatement ps;
        String sql;
        
        
        model.setEmpid(id);
        model.setEmpNombre(nom);
        model.setEmpApellidoPat( AP);
        model.setEmpApellidoMat(AM);
        model.setEmpDni(dni);
        model.setEmpFech(Fecha);
        model.setEmpSalario(sala);
        model.setEmpedad(ed);
        model.setEmpdirec(dir);
        
        try{
            connection = dbconnect.getConnection();
            CallableStatement stmt = null;
            String textMessage = null;
            sql = "{call insertaEmpleado(?,?,?,?,?,?,?,?,?,?)}";
            stmt = connection.prepareCall(sql);
            stmt.setInt(1, model.getEmpid());
            stmt.setString(2, model.getEmpNombre());
            stmt.setString(3, model.getEmpApellidoPat());
            stmt.setString(4, model.getEmpApellidoMat());
            stmt.setString(5, model.getEmpDni());
            stmt.setString(6, model.getEmpFech());
            stmt.setFloat(7, model.getEmpSalario());
            stmt.setDouble(8, model.getEmpedad());
            stmt.setString(9, model.getEmpdirec());
            stmt.registerOutParameter(10, java.sql.Types.VARCHAR);
            stmt.execute();
            textMessage = stmt.getString(10);
            System.out.println("Mensaje" +  " es: " + textMessage);
            JOptionPane.showMessageDialog(null, textMessage);
            stmt.close();
            connection.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
    }
    
    
    public void eliminarEmpleado(int Id){
        PreparedStatement ps;
        String sql;
        
        model.setEmpid(Id);
        
        try{
            connection = dbconnect.getConnection();
            CallableStatement stmt = null;
            String textMessage = null;
            sql = "{call eliminarEmpleado(?,?)}";
            stmt = connection.prepareCall(sql);
            stmt.setInt(1, model.getEmpid());
            stmt.registerOutParameter(2, java.sql.Types.VARCHAR);
            
            stmt.execute();
            
            textMessage = stmt.getString(2);
            System.out.println("Mensaje" +  " es " + textMessage);
            JOptionPane.showMessageDialog(null, textMessage);
            stmt.close();
            connection.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
    }
    
    public void buscarEmpleado(String nombre, String AP, String AM){
        PreparedStatement ps;
        String sql;
        
        model.setNombre(nombre);
        model.setApellidoPat(AP);
        model.setApellidoMat(AM);
        
        try{
            connection = dbconnect.getConnection();
            CallableStatement stmt = null;
            String textMessage = null;
            sql = "{call buscaEmpleado(?,?,?,?,?,?,?,?,?,?,?,?,?)}";
            stmt = connection.prepareCall(sql);
            stmt.setString(1, model.getNombre());
            stmt.setString(2, model.getApellidoPat());
            stmt.setString(3, model.getApellidoMat());
            stmt.registerOutParameter(4, java.sql.Types.INTEGER);
            stmt.registerOutParameter(5, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(6, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(7, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(8, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(9, java.sql.Types.DATE);
            stmt.registerOutParameter(10, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(11, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(12, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(13, java.sql.Types.VARCHAR);
            
            
            stmt.execute();
            
            textMessage = Integer.toString(stmt.getInt(4))+"\n"+stmt.getString(5)+"\n"+stmt.getString(6)+"\n"+stmt.getString(7)+
                          "\n"+stmt.getString(8)+"\n"+stmt.getString(9)+"\n"+stmt.getString(10)+"\n"+stmt.getString(11)+"\n"+stmt.getString(12);
            System.out.println("Mensaje" +  " es " + textMessage);
            JOptionPane.showMessageDialog(null, textMessage);
            
            stmt.close();
            connection.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
    }
    
    // buscarCodigoEmpleado
    public void buscarCodigoEmpleado(int Id){
        PreparedStatement ps;
        String sql;
        model.setEmpid(Id);
        
        
        try{
            connection = dbconnect.getConnection();
            CallableStatement stmt = null;
            String textMessage = null;
            sql = "{call buscarCodigoEmpleado(?,?,?,?,?,?,?,?,?,?,?)}";
            stmt = connection.prepareCall(sql);
            stmt.setInt(1, model.getEmpid());
            stmt.registerOutParameter(2, java.sql.Types.INTEGER);
            stmt.registerOutParameter(3, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(4, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(5, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(6, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(7, java.sql.Types.DATE);
            stmt.registerOutParameter(8, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(9, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(10, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(11, java.sql.Types.VARCHAR);
            
            stmt.execute();
            
            textMessage = Integer.toString(stmt.getInt(2))+"\n"+stmt.getString(3)+"\n"+stmt.getString(4)+"\n"+stmt.getString(5)+
                          "\n"+stmt.getString(6)+"\n"+stmt.getString(7)+"\n"+stmt.getString(8)+"\n"+stmt.getString(9)+"\n"+stmt.getString(10);
            System.out.println("Mensaje" +  " es " + textMessage);
            JOptionPane.showMessageDialog(null, textMessage);
            
            stmt.close();
            connection.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
    }
    
    public void buscarCodigoDep(String nombre){
        PreparedStatement ps;
        String sql;
        
         model.setDepNombre(nombre);
        try{
            connection = dbconnect.getConnection();
            CallableStatement stmt = null;
            String textMessage = null;
            sql = "{call buscarCodigoEmpleado(?,?,?,?,?,?,?,?,?,?)}";
            stmt = connection.prepareCall(sql);
            stmt.setString(1, model.getDepNombre());
            stmt.registerOutParameter(2, java.sql.Types.INTEGER);
            stmt.registerOutParameter(3, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(4, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(5, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(6, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(7, java.sql.Types.DATE);
            stmt.registerOutParameter(8, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(9, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(10, java.sql.Types.VARCHAR);
            
            stmt.execute();
            
            textMessage = Integer.toString(stmt.getInt(2))+"\n"+stmt.getString(3)+"\n"+stmt.getString(4)+"\n"+stmt.getString(5)+
                          "\n"+stmt.getString(6)+"\n"+stmt.getString(7)+"\n"+stmt.getString(8)+"\n"+stmt.getString(9)+"\n";
            System.out.println("Mensaje" +  " es " + textMessage);
            JOptionPane.showMessageDialog(null, textMessage);
            
            stmt.close();
            connection.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
    }
    
    //--------------------------Codigo Citas-------------------------------------------------
    
     public void insertCitas(int idci,String cife,String ciho,int idcli,int idemp){
        PreparedStatement ps;
        String sql;
       
        model.setCitaId(idci);
        model.setCitaFecha(cife);
        model.setCitaHora(ciho);
        model.setCitaClienteID(idcli);
        model.setCitaEmpleadoID(idemp);
            try{
            connection = dbconnect.getConnection();
            CallableStatement stmt = null;
            String textMessage = null;
            sql = "{call insertarCita(?,?,?,?,?,?)}";
            stmt = connection.prepareCall(sql);
            stmt.setInt(1, model.getCitaId());
            stmt.setString(2, model.getCitaFecha());
            stmt.setString(3, model.getCitaHora());
            stmt.setInt(4, model.getCitaClienteID());
            stmt.setInt(5, model.getCitaEmpleadoID());
            stmt.registerOutParameter(6, java.sql.Types.VARCHAR);
            stmt.execute();
            textMessage = stmt.getString(6);
            System.out.println("Mensaje" +  " es: " + textMessage);
            JOptionPane.showMessageDialog(null, textMessage);
            stmt.close();
            connection.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());        
        }    
     }  
    
    public void buscarCitas(int id){
        PreparedStatement ps;
        String sql;
        model.setCitaId(id);
        
           
        try{
            connection = dbconnect.getConnection();
            CallableStatement stmt = null;
            String textMessage = null;
            sql = "{call buscarCodigoCita(?,?,?,?,?,?)}";
            stmt = connection.prepareCall(sql);
            stmt.setInt(1, model.getCitaId());
            stmt.registerOutParameter(2, java.sql.Types.INTEGER);
            stmt.registerOutParameter(3, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(4, java.sql.Types.VARCHAR);
            stmt.registerOutParameter(5, java.sql.Types.INTEGER);
            stmt.registerOutParameter(6, java.sql.Types.VARCHAR);
            stmt.execute();
            
            textMessage = Integer.toString(stmt.getInt(2))+"\n"+stmt.getString(3)+"\n"+stmt.getString(4)+
                          "\n"+stmt.getInt(5)+"\n"+stmt.getString(6);
            System.out.println("Mensaje" +  " es " + textMessage);
            JOptionPane.showMessageDialog(null, textMessage);
            
            stmt.close();
            connection.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
    }
    
     public void eliminarCitas(int Id){
        PreparedStatement ps;
        String sql;
        model.setCitaId(Id);
     
        
        try{
            connection = dbconnect.getConnection();
            CallableStatement stmt = null;
            String textMessage = null;
            sql = "{call eliminarCita(?,?)}";
            stmt = connection.prepareCall(sql);
            stmt.setInt(1, model.getCitaId());
            stmt.registerOutParameter(2, java.sql.Types.VARCHAR);
            
            stmt.execute();
            
            textMessage = stmt.getString(2);
            System.out.println("Mensaje" +  " es " + textMessage);
            JOptionPane.showMessageDialog(null, textMessage);
            stmt.close();
            connection.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
        }
    }
     
  
     
     
     
    
      
}
