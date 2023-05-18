/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Grafica;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;


/**
 *
 * @author hoshi
 */
public class JButtonTableCellRenderer extends DefaultTableCellRenderer {
  
    /**
     * Método que obtiene el botón de la tabla y lo setea en una celda específica.
     * @param table parámetro tabla
     * @param value parámetro value
     * @param isSelected parámetro isSelected
     * @param hasFocus parámetro hasFocus
     * @param row parámetro row
     * @param column parámetro column
     * @return regresa un botón dentro de una celda especifica de la tabla
     */
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
       
        if( value instanceof JButton){
            JButton btn = (JButton) value;
            return btn;
        }
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus,row, column);
    }
    
 
}
    

