/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.GhsUsuarios;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u07875424151
 */
public class UsuarioControle extends AbstractTableModel {
    
    private List lista;
    
    
public void setList(List lista){
    this.lista = lista;
    this.fireTableDataChanged();
    }
    
    public GhsUsuarios getBean(int row){
    return (GhsUsuarios) lista.get(row);
    
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       GhsUsuarios ghsUsuarios =(GhsUsuarios) lista.get(rowIndex);
         if (columnIndex == 0 ) {
            return ghsUsuarios.getIdgbsUsuarios();
        }
        if (columnIndex == 1 ) {
            return ghsUsuarios.getGbsNome();
        }
        if (columnIndex == 2 ) {
            return ghsUsuarios.getGbsApelido();
        }
        if (columnIndex == 3 ) {
            return ghsUsuarios.getGbsCpf();
        }
        if (columnIndex == 4 ) {
            return ghsUsuarios.getGbsSenha();
        }
         return "";
    }
    
     public String getColumnName(int column){
        
        if(column == 0 ){
            return "ID";
        }
        
        if(column == 1 ){
            return "NOME";
        }
        
        if(column == 2 ){
            return "APELIDO";
        }
        
        if(column == 3 ){
            return "CPF";
        }
        
        if(column == 4 ){
            return "SENHA";
        }
        
        return "";
        
    }

}
