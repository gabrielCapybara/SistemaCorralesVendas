/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.GhsProdutos;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u07875424151
 */
public class ProdutosControle extends AbstractTableModel {
    
    private List lista;
    
public void setList(List lista){
    this.lista = lista;
    this.fireTableDataChanged();
    }
    
    public GhsProdutos getBean(int row){
    return (GhsProdutos) lista.get(row);
    
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
       GhsProdutos ghsProdutos =(GhsProdutos) lista.get(rowIndex);
         if (columnIndex == 0 ) {
            return ghsProdutos.getIdghsProdutos();
        }
        if (columnIndex == 1 ) {
            return ghsProdutos.getGhsNome();
        }
        if (columnIndex == 2 ) {
            return ghsProdutos.getGhsPreco();
        }
        if (columnIndex == 3 ) {
            return ghsProdutos.getGhsQuantidade();
        }
        if (columnIndex == 4 ) {
            return ghsProdutos.getGhsValorUnitario();
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
            return "PREÇO";
        }
        
        if(column == 3 ){
            return "QUANTIDADE";
        }
        
        if(column == 4 ){
            return "VALOR_UNI";
        }
        
        return "";
        
    }

}
