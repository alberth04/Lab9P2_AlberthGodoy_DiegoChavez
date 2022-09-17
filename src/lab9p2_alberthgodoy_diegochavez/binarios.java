/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9p2_alberthgodoy_diegochavez;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;


public class binarios {
    private String query;

    public binarios(String query) {
        this.query = query;
    }

    public binarios() {
    }
        public void escribir() {
        java.io.File xc = new java.io.File("./queryx/" + query + ".mb"); 
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(xc);
            bw = new ObjectOutputStream(fw);

            bw.writeObject(xc);

            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }

    }
    public java.io.File fc() {
        JFileChooser fc = new JFileChooser();
        FileFilter filtro = new FileNameExtensionFilter("Queries",
                "mb");
        fc.setFileFilter(filtro);
        java.io.File archivo=null;
        int op = fc.showOpenDialog(null);
        if (op == JFileChooser.APPROVE_OPTION) {
            archivo = fc.getSelectedFile();
        }
        return archivo;
        
    }// fin de fc
    
    
}
