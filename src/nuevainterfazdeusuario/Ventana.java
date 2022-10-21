package nuevainterfazdeusuario;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame {
    JLabel etiqueta;
    JTextField campoDeTexto;
    JPanel panel1;
    JTextArea textArea;
    JButton boton1;
    JScrollPane scrollPane;
    ImageIcon imagen;
    JLabel labelImagen;
    
    Ventana(){
        crearVentana();
        agregarElementosAVentana();
    }
    
    private void crearVentana(){
        // setVisible(true); // Es necesario hacer que sea visible. Llevarlo por fuera, luego de que se instancia Ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Indicar comportamiento cuando se pide cerrar la ventana
        
        setSize(640, 480); // ANCHO y ALTO de la ventana en PIXELES
        //setLocation(450, 150); // Posición en coordenadas x, y (horizontal y vertical)
        //setBounds(450, 150, 640, 480); // Método que resume los dos anteriores
        setLocationRelativeTo(null); // Esto sirve para centrar la ventana en la pantalla
        
        setResizable(true); // Definir si el usuario puede o no modificar el tamaño de la ventana
        setMinimumSize(new Dimension(320, 240)); // Defino el tamaño más chico posible
        // setMaximumSize(new Dimension(800, 600)); // Defino el tamaño más grande posible
        
        //setMaximizedBounds(new Rectangle(800, 600)); // Defino el tamaño máximo maximizado
        
        //this.getContentPane().setBackground(Color.red); // Pinto el color de fondo. Para eso 
                                    // Necesito invocar a .getContentPane().
                                    
        panel1 = new JPanel();
        panel1.setLayout(null);
        add(panel1);
    }
    
    private void agregarElementosAVentana(){
        etiqueta = new JLabel("Soy un label");
        etiqueta.setBounds(10, 10, 200, 100);
        
        panel1.add(etiqueta);
        
        campoDeTexto = new JTextField();
//        campoDeTexto.setText("Campo de texto de una sola línea");
        campoDeTexto.setBounds(10, 80, 300, 50);
        
        panel1.add(campoDeTexto);
        
        textArea = new JTextArea(); // Como vamos a embeberlo dentro de un JScrollPane no es necesario definirle el tamaño
        //textArea.setBounds(10, 150, 300, 150);
        
        // Para agregar scroll al JTextArea hay que embeberlo dentro de un JScrollPane
        scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(10, 150, 300, 150);
        
        panel1.add(scrollPane);
        
        boton1 = new JButton();
        boton1.setText("Hacer click sobrel el botón");
        boton1.setBounds(10, 310, 300, 30);
        
        panel1.add(boton1);
        
        ActionListener accionDeBoton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Recupero el texto contenido en el campo de texto
                String texto = campoDeTexto.getText();
                
                // Agrego el texto al textarea y un salto de línea
                textArea.append(texto + "\n");
            }
        };
        
        // Agrego el ActionListener al botón
        boton1.addActionListener(accionDeBoton);
        
        imagen = new ImageIcon("spidermeme.jpg");
        labelImagen = new JLabel(imagen);
        labelImagen.setBounds(310, 20, 400, 400);
        
        panel1.add(labelImagen);
    }
}
