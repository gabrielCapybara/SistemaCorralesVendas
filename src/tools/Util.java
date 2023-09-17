/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author u07875424151
 */
public class Util {
   public static void habilitar(boolean valor, JComponent ... vetComp){
        for(int i = 0; i < vetComp.length; i++){
            vetComp[i].setEnabled(valor);
            //static serve pra nao instanciar a classe
        }  
    }
   
   public static void limparCampos(JComponent ... vetComp){
       for (JComponent jComponent : vetComp) {
           if (jComponent instanceof JTextField){
               ((JTextField)jComponent).setText("");
               }
           
           if (jComponent instanceof JComboBox){
               ((JComboBox)jComponent).setSelectedIndex(-1);
           }
           if (jComponent instanceof JCheckBox){
               ((JCheckBox)jComponent).setSelected(false);
           }
       //instanceof torna os outros componentes em JComponent
       //pega todos os indices do JComponent e joga para o jComponent e vai repetindo pegando tudo
       
            }  
       }
   
   public static void mensagem(String cadeia){
       JOptionPane.showMessageDialog(null, cadeia);
   }
   
   public static boolean perguntar(String cadeia){
       int resp = JOptionPane.showConfirmDialog(null, "Deseja excluir o registro?",
               "Exclusão", JOptionPane.YES_NO_OPTION);
       
       JOptionPane.showConfirmDialog(null, cadeia, "Perguntar", JOptionPane.YES_NO_OPTION);
       return false;
   }
   
   public static int strInt(String cad){
       return Integer.valueOf(cad);
   }
   
   public static String intStr(int num) {
       return String.valueOf(num);
   }
   
   public static double strDouble(String cad){
       return 0;
    }
   
   public static String doubleStr(double num){
       return "";
   }
   
   public static Date strDate(String cad){
       return null;
   }
   
   public static String dateStr(Date num){
       return "";
   }
   

}
     
   
                 

