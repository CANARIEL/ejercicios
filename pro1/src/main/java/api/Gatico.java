package api;

import javax.swing.Action;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;

import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

public class Gatico {
    /**
     * aprende hacer ordenado el codigo de bajo si funciona pero es un desastre 
     */
    public static  void main(String[] args) {


            JFrame marco  = new  JFrame();
            marco.setDefaultCloseOperation(marco.EXIT_ON_CLOSE);
            marco.setSize(700, 750);
            JPanel panel = new JPanel(new BorderLayout());
            JTextArea area = new JTextArea();
            JScrollPane scrollPane = new JScrollPane(area);

            area.setText("Bienvenido");


            JButton boton = new JButton("inicio");
            
            // panel.add(scrollPane, BorderLayout.CENTER);
            panel.add(boton , BorderLayout.SOUTH);



                  boton.addActionListener( new ActionListener(){
                    

                @Override
                public void actionPerformed(ActionEvent e){

                    if (e.getSource()  ==  boton) {
                    
                        boton.setEnabled(false);
                        panel.remove(boton);



                       
                        JPanel  derecha = new JPanel();
                        derecha.setLayout(new BoxLayout(derecha,  BoxLayout.Y_AXIS));
                        derecha.add(new JButton("Gaticos api"));
                        derecha.add(new JButton("Archivo JSON"));


                        JPanel izquierdo = new JPanel();

                        izquierdo.setLayout(new BoxLayout(izquierdo, BoxLayout.X_AXIS));
                        izquierdo.setLayout(new BoxLayout(izquierdo, BoxLayout.X_AXIS));
                        izquierdo.add(new JButton("salir"));



                        panel.add(derecha, BorderLayout.CENTER);
                        panel.add(izquierdo, BorderLayout.WEST);
                        panel.add(new JScrollPane(derecha), BorderLayout.LINE_START);
                        panel.add(new JScrollPane(izquierdo), BorderLayout.SOUTH);



                        panel.revalidate();
                        panel.repaint();

                
            } else {
                System.out.println("hey111");

            }
        }

      });

        // marco.add(boton);
        marco.add(panel);
        marco.setVisible(true);


                                
        









//     }
// }


            
    }

}





//         JFrame marco = new JFrame();
//         marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         marco.setSize(700, 750);


//         JFrame frame = new JFrame();        
//         JPanel panel = new JPanel();
//         JTextArea  area = new JTextArea();


//         area.setText("Bienvenido a nuestra primera interfaz virtual y uso de las api");

//         JButton boton = new JButton("inicio");
//         panel.add(area);
//         panel.add(new JScrollPane(area), BorderLayout.CENTER);
//         panel.add(boton, BorderLayout.SOUTH);
//         panel.revalidate(); 
//         panel.repaint(); 
//         frame.add(panel);




//       boton.addActionListener( new ActionListener(){

//         @Override
//         public void actionPerformed(ActionEvent e){

//             if (e.getSource()  ==  boton) {

//                     boton.setEnabled(false);
//                 JButton boton1 = new JButton("1.- Menu principal  2.- salir");

                

//                 panel.add(boton1);
//                 panel.add(boton,BorderLayout.LINE_END );
//                 panel.revalidate();
//                 panel.repaint();

                
//             } else {
//                 System.out.println("hey111");

//             }
//         }

//       });
//         panel.add(boton);
//         marco.add(panel);
//         marco.setVisible(true);


                                
        









//     }
// }