
package bilgiyakalayici0.pkg1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataB {
    private  Connection cct;
    private String yol = "jdbc:mysql://localhost:3306/bilgiyakalayici?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey";
    private String up = "root"; //sifre kul adi
    private String KodParcasi = "k";
    private Statement stt = null; //ifade etmek 
    private ResultSet rst = null; //sonuc
    public String BeHappy = null;
    String sorbanapismanmiyim = "SELECT bilgimutlu FROM bilgiyakalayici.mutlu WHERE idmutlu='1';";//default için gulen dunya 1. degeri
public int maxuzgunid() throws SQLException{
     int maxiduzgun = Integer.valueOf(setDB("SELECT MAX(iduzgun) FROM bilgiyakalayici.uzgun;"));// max id bulur uzgun tablosunda
     return maxiduzgun;
                                           }
public int maxmutluid() throws SQLException{
     int maxidmutlu = Integer.valueOf(setDB("SELECT MAX(idmutlu) FROM bilgiyakalayici.mutlu;"));// max id bulur uzgun tablosunda
     return maxidmutlu;
                                           }

public int SecilebilirMaxDeger(String nereid, String nere) throws SQLException{
 int SecilebilirMaxDeger = Integer.valueOf(setDB("SELECT MAX("+nereid+") FROM bilgiyakalayici."+nere+";"));
return SecilebilirMaxDeger;
}

public int SecilebilirMinDeger(String nereid, String nere) throws SQLException{
 int SecilebilirMinDeger = Integer.valueOf(setDB("SELECT MIN("+nereid+") FROM bilgiyakalayici."+nere+";"));
return SecilebilirMinDeger;
}

     
public DataB()                                                         {
         try {
                    cct = DriverManager.getConnection(yol,up,up);
                    stt = cct.createStatement();
                    rst = stt.executeQuery(sorbanapismanmiyim);
                        while(rst.next()){
                        }
            } catch (SQLException ex) {System.out.println("Hata: "+ex);}
        
                                                                        }
public String setDB(String aa) throws SQLException {
            sorbanapismanmiyim=aa;
            rst = stt.executeQuery(sorbanapismanmiyim);
            if(rst.next())
            {
             BeHappy = rst.getString(1);
            }
            return BeHappy;
                                                    }

  public boolean BegenKontrolu(String yol, int id) throws SQLException
  { KodParcasi=yol.substring(12,13);
  
    
  
if(KodParcasi.equals("k"))
{
   rst = stt.executeQuery("SELECT sevkara FROM bilgiyakalayici.kara WHERE idkara='"+id+"';");
   if(rst.next())
            {
              if(rst.getString(1).equals("1")){return true;}
            }   
}
else if(KodParcasi.equals("h"))
{
   rst = stt.executeQuery("SELECT sevhava FROM bilgiyakalayici.hava WHERE idhava='"+id+"';");
     if(rst.next())
            {
              if(rst.getString(1).equals("1")){return true;}
            }
}
else{

   rst = stt.executeQuery("SELECT sevdeniz FROM bilgiyakalayici.deniz WHERE iddeniz='"+id+"';");
   if(rst.next())
            {
              if(rst.getString(1).equals("1")){return true;}
            }
}return false;}

  public void BegenmeIslemi(String yol, int id) throws SQLException
  {  KodParcasi=yol.substring(12,13);
if(KodParcasi.equals("k"))
{
   rst = stt.executeQuery("SELECT sevkara FROM bilgiyakalayici.kara WHERE idkara='"+id+"';");
   if(rst.next())
            {
              switch(rst.getString(1)){
                  case "0":  
                       stt.executeUpdate("UPDATE bilgiyakalayici.kara SET sevkara = '1' WHERE (idkara = '"+id+"');");  break;
                  case "1":  stt.executeUpdate("UPDATE bilgiyakalayici.kara SET sevkara = '0' WHERE (idkara = '"+id+"');");  break;
              }
                    }   
}
else if(KodParcasi.equals("h"))
{
   rst = stt.executeQuery("SELECT sevhava FROM bilgiyakalayici.hava WHERE idhava='"+id+"';");
     if(rst.next())
            {
               switch(rst.getString(1)){
                  case "0":  
                       stt.executeUpdate("UPDATE bilgiyakalayici.hava SET sevhava = '1' WHERE (idhava = '"+id+"');");  break;
                  case "1":  stt.executeUpdate("UPDATE bilgiyakalayici.hava SET sevhava = '0' WHERE (idhava = '"+id+"');");  break;
            }
}}
     else if(KodParcasi.equals("d")){
        rst = stt.executeQuery("SELECT sevdeniz FROM bilgiyakalayici.deniz WHERE iddeniz='"+id+"';");
   if(rst.next())
            {
 switch(rst.getString(1)){
                  case "0":  
                       stt.executeUpdate("UPDATE bilgiyakalayici.deniz SET sevdeniz = '1' WHERE (iddeniz = '"+id+"');");  break;
                  case "1":  stt.executeUpdate("UPDATE bilgiyakalayici.deniz SET sevdeniz = '0' WHERE (iddeniz = '"+id+"');");  break;            }
}
  }
                    }
  }