/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.GhsVendasProdutos;
import bean.GhsVendedor;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u07875424151
 */
public class VendasProdutosControle extends AbstractTableModel {
    
    private List lista;
    
public void setList(List lista){
    this.lista = lista;
    this.fireTableDataChanged();
    }
    
    public GhsVendasProdutos getBean(int row){
    return (GhsVendasProdutos) lista.get(row);

    }
    
    public void addBean(GhsVendasProdutos ghsVendasProdutos){
        lista.add(ghsVendasProdutos);
        this.fireTableDataChanged();
    }
    
    public void removeBean (int index){
        lista.remove(index);
        this.fireTableDataChanged();
    }
    
    
    public void updateBean(int index, GhsVendasProdutos ghsVendasProdutos ){
        lista.set(index, ghsVendasProdutos);
        this.fireTableDataChanged();
        
    
    }
    
  
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       GhsVendasProdutos vendasProdutos =(GhsVendasProdutos) lista.get(rowIndex);
         if (columnIndex == 0 ) {
            return vendasProdutos.getIdghsVendasProdutos();
        }
        if (columnIndex == 1 ) {
            return vendasProdutos.getGhsProdutos();
        }
        if (columnIndex == 2 ) {
            return vendasProdutos.getGhsQuantidade();
        }
        if (columnIndex == 3 ) {
            return vendasProdutos.getGhsValorUnitario();
        }
         return "";
    }
    
     public String getColumnName(int column){
        
        if(column == 0 ){
            return "ID";
        }
        
        if(column == 1 ){
            return "PRODUTOS";
        }
        
        if(column == 2 ){
            return "QUANTIDADE";
        }
        
        if(column == 3 ){
            return "VALOR_UNITARIO";
        }
        
        return "";
        
    }

}
