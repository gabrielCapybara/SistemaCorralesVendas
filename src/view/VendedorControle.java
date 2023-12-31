/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.GhsVendedor;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u07875424151
 */
public class VendedorControle extends AbstractTableModel {
    
    private List lista;
    
public void setList(List lista){
    this.lista = lista;
    this.fireTableDataChanged();
    }
    
    public GhsVendedor getBean(int row){
    return (GhsVendedor) lista.get(row);
    
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
       GhsVendedor vendedor =(GhsVendedor) lista.get(rowIndex);
         if (columnIndex == 0 ) {
            return vendedor.getIdghsVendedor();
        }
        if (columnIndex == 1 ) {
            return vendedor.getGhsNome();
        }
        if (columnIndex == 2 ) {
            return vendedor.getGhsEmail();
        }
        if (columnIndex == 3 ) {
            return vendedor.getGhsCpf();
        }
        if (columnIndex == 4 ) {
            return vendedor.getGhsDataNascimento();
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
            return "DATA";
        }
        
        return "";
        
    }

}
