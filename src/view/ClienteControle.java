/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.GhsCliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u07875424151
 */
public class ClienteControle extends AbstractTableModel {

    private List lista;
    public void setList(List lista){
    this.lista = lista;
    this.fireTableDataChanged();
    }
    
    public GhsCliente getBean(int row){
    return (GhsCliente) lista.get(row);
    
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
         GhsCliente clientes =(GhsCliente) lista.get(rowIndex);
         if (columnIndex == 0 ) {
            return clientes.getIdgbsCliente();
        }
        if (columnIndex == 1 ) {
            return clientes.getGhsNome();
        }
        if (columnIndex == 2 ) {
            return clientes.getGhsCpf();
        }
        if (columnIndex == 3 ) {
            return clientes.getGbsRg();
        }
        if (columnIndex == 4 ) {
            return clientes.getGbsIdade();
        }
         return "";
    }
    
    public String getColumnName(int column){
        
        if(column == 0 ){
            return "ID";
        }
        
        if(column == 1 ){
            return "Nome";
        }
        
        if(column == 2 ){
            return "CPF";
        }
        
        if(column == 3 ){
            return "RG";
        }
        
        if(column == 4 ){
            return "Idade";
        }
        
        return "";
        
    }
}
    

