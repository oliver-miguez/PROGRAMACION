import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcoAplicacion extends JFrame {
    private JTextField cadroTexto;

    //CONSTRUCTOR
    public EcoAplicacion(){
        super();
        //super {"Primeira aplicación con Swing"}
        setTitle("Primeira aplicación con Swing");

        //Disintos bloques
        JComponent botoneira = creaBotons();
        JComponent panelCadroTexto = creaPanelCadroTexto();
        //inicializa cadro texto transformando panel cadro texto a un JTExField
        cadroTexto = (JTextField) panelCadroTexto;

        //panel principal
        JSplitPane panelPrincipal = new JSplitPane(JSplitPane.VERTICAL_SPLIT,botoneira , panelCadroTexto );
        //Añade el panel para que sea visible
        getContentPane().add(panelPrincipal);
        //redimensiona a pantalla según as cousas que teña dentro
        pack();
        //hace posible visualizar la ventana
        setVisible(true);
    }//end constructor

    private JComponent creaBotons(){
        //JPanel es un panel no visible que permite añadirle controles
        JPanel botoneira = new JPanel();
        //JButton es un botón
        JButton btnHola  = new JButton("Di ola !");

        //si queremos que nuestra aplicacion tenga controles
        btnHola.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        //cada vez que se pulsa el boton mostrará el siguiente texto
                        cadroTexto.setText("Ola a todos ! ");
                    }
                }
        );

        //Fin principal de Jpanel es tener cosas
        botoneira.add(btnHola);

        return botoneira;
    }//end creaBotons


    private JComponent creaPanelCadroTexto(){
        //entradas de una linea para escribir un texto
      JTextField txtCadro = new JTextField();
      return txtCadro;

    }//end creaPanelCadroTexto

}//end class
