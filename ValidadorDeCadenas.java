/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ValidadorDeCadenas extends JFrame implements ActionListener {
    private JTextField campoTexto;
    private JButton boton;
    private JLabel etiqueta;
    
    public ValidadorDeCadenas() {
        // Configuramos el JFrame
        setTitle("Validador de Cadenas de letra *a* ");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        // Creamos los componentes
        campoTexto = new JTextField(20);
        boton = new JButton("Validar");
        etiqueta = new JLabel("Introduzca una cadena de texto:");
        
        // Agregamos los componentes al JFrame
        add(etiqueta);
        add(campoTexto);
        add(boton);
        
        // Agregamos el ActionListener al botón
        boton.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e) {
        String cadena = campoTexto.getText();
        boolean esValida = valido(cadena);
        String mensaje = esValida ? "La cadena es válida" : "La cadena no es válida";
        JOptionPane.showMessageDialog(this, mensaje);
    }
    
    public static boolean valido(String a){
        boolean validez = true;
       
        if(a.length() % 2 == 0) {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != 'a') {
                    validez = true;
                }
            }
        } else {
            validez = false;
        }
       
        return validez;
    }
    
    public static void main(String[] args) {
        ValidadorDeCadenas ventana = new ValidadorDeCadenas();
        ventana.setVisible(true);
    }
}
