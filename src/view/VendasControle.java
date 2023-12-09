/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import bean.GhsVendas;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u07875424151
 */
public class VendasControle extends AbstractTableModel {

    private List lista;
    public void setList(List lista){
    this.lista = lista;
    this.fireTableDataChanged();
    }
    
    public GhsVendas getBean(int row){
    return (GhsVendas) lista.get(row);
    
    }
    
    @Override
    public int getRowCount() {
         return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         GhsVendas vendas =(GhsVendas) lista.get(rowIndex);
         if (columnIndex == 0 ) {
            return vendas.getIdghsVendas();
        }
        if (columnIndex == 1 ) {
            return vendas.getGhsDataVenda();
        }
        if (columnIndex == 2 ) {
            return vendas.getGhsValorTotal();
        }
        
         if (columnIndex == 3 ) {
            return vendas.getGhsFormaPagamento();
        }
         
          if (columnIndex == 4 ) {
            return vendas.getGhsDataVenda();
        }
          
           if (columnIndex == 5 ) {
            return vendas.getGhsCliente();
        }
           
            if (columnIndex == 6 ) {
            return vendas.getGhsVendedor();
        }
            
           if (columnIndex == 7 ) {
           return vendas.getGhsStatusVenda();
        }
        
         return "";
    }
    
    public String getColumnName(int column){
        
        if(column == 0 ){
            return "VENDAS";
        }
        
        if(column == 1 ){
            return "DATA";
        }
        
        if(column == 2 ){
            return "TOTAL";
        }
        
        if(column == 3 ){
            return "FORMA_PAGAMENTO";
        }
        
        if(column == 4 ){
            return "DATA_VENDA";
        }
        
        if(column == 5 ){
            return "CLIENTES";
        }
        
        if(column == 6 ){
            return "VENDEDORES";
        }
        
        if(column == 7 ){
            return "STATUS_VENDA";
        }
        
        return "";
        
    }
}
    

