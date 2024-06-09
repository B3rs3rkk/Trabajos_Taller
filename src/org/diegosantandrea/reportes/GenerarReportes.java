/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.diegosantandrea.reportes;

import java.io.InputStream;
import java.util.Map;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.diegosantandrea.db.Conexion;

/**
 *
 * @author User
 */
public class GenerarReportes {
    public static void mostrarReportes(String nombreReporte, String titulo, Map parametros){
        InputStream reporte = GenerarReportes.class.getResourceAsStream(nombreReporte);
        try{
            JasperReport ReporteClientes2 = (JasperReport) JRLoader.loadObject(reporte);
            JasperPrint reporteimpreso = JasperFillManager.fillReport(ReporteClientes2, parametros, Conexion.getInstance().getConexion());
            JasperViewer visor = new JasperViewer(reporteimpreso, false);
            visor.setTitle(titulo);
            visor.setVisible(true);
        }catch (Exception e){
                e.printStackTrace();
        }
    }
    
}

/*
 HasMap es uno de los objeptos que implementa un conjunfo de key-value
tienen un cosntrictor sin parametros new hasMap() y su finalidad suele 
referise para afripar inforamcion en un unco objeto. 

Tiene cierta similitud con la coleccion de objetos (ArrayList) peor con 
la diferencia que estos no tiene orden. 

Hash hace referencia a una tecnica de orfanizacion de archios, Hasing 
(abierto-cerrado)en la uqe se almacena registros en una direccion que es 
generada por uan funcion de aplica 
a la lalve del. 

en java el HasNao oisee un esoacio dememoria y cuandos e afurada un objeto en
dicho espacio se deremina si direccion aplicando que le idiquemos. 
cada objeto se identifica mediante algun identificador directo 
*/
