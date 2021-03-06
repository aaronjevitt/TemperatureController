/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperaturecontroller;

import java.awt.Color;
import javax.swing.JLabel;
import variables.variables;


/**
 *
 * @author ajevi
 */
public class ui extends javax.swing.JFrame {

    /**
     * Creates new form tempui
     */
    public ui() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    public void initComponents() {

        settemp1 = new javax.swing.JTextField();
        actualtemp1 = new javax.swing.JTextField();
        relay1up = new javax.swing.JButton();
        relay1down = new javax.swing.JButton();
        process1 = new javax.swing.JToggleButton();
        LED1 = new javax.swing.JLabel();
        relay2down = new javax.swing.JButton();
        process2 = new javax.swing.JToggleButton();
        settemp2 = new javax.swing.JTextField();
        actualtemp2 = new javax.swing.JTextField();
        LED2 = new javax.swing.JLabel();
        relay2up = new javax.swing.JButton();
        relay3down = new javax.swing.JButton();
        process3 = new javax.swing.JToggleButton();
        settemp3 = new javax.swing.JTextField();
        actualtemp3 = new javax.swing.JTextField();
        LED3 = new javax.swing.JLabel();
        relay3up = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        settemp1.setText(Integer.toString(variables.loop1time));
        settemp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                settemp1MousePressed(evt);
            }
        });
        settemp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settemp1ActionPerformed(evt);
            }
        });

        actualtemp1.setText("130");
        actualtemp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualtemp1ActionPerformed(evt);
            }
        });

        relay1up.setText("+");
        relay1up.setToolTipText("");
        relay1up.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                relay1upMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                relay1upMouseReleased(evt);
            }
        });
        relay1up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relay1upActionPerformed(evt);
            }
        });

        relay1down.setText("-");

        process1.setText("ON/OFF");
        process1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                process1ItemStateChanged(evt);
            }
        });
        process1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                process1StateChanged(evt);
            }
        });
        process1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                process1ActionPerformed(evt);
            }
        });

        LED1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        LED1.setText("●");

        relay2down.setText("-");

        process2.setText("ON/OFF");

        settemp2.setText("180");

        actualtemp2.setText("130");
        actualtemp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualtemp2ActionPerformed(evt);
            }
        });

        LED2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        LED2.setForeground(new java.awt.Color(255, 102, 102));
        LED2.setText("●");

        relay2up.setText("+");
        relay2up.setToolTipText("");
        relay2up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relay2upActionPerformed(evt);
            }
        });

        relay3down.setText("-");

        process3.setText("ON/OFF");

        settemp3.setText("180");

        actualtemp3.setText("130");
        actualtemp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualtemp3ActionPerformed(evt);
            }
        });

        LED3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        LED3.setText("●");

        relay3up.setText("+");
        relay3up.setToolTipText("");
        relay3up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relay3upActionPerformed(evt);
            }
        });

        jLabel4.setText("Relay 1");

        jLabel5.setText("Relay 2");

        jLabel6.setText("Relay 3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(process1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(LED1)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(settemp1)
                                .addComponent(actualtemp1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(relay1up)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(relay1down)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(LED2)
                            .addGap(18, 18, 18)
                            .addComponent(settemp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(process2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(actualtemp2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(relay2up)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(relay2down)))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(LED3)
                            .addGap(18, 18, 18)
                            .addComponent(settemp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(process3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(actualtemp3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(relay3up)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(relay3down)))
                .addGap(84, 84, 84))
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel4)
                .addGap(117, 117, 117)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(105, 105, 105))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(settemp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LED1))
                        .addGap(6, 6, 6)
                        .addComponent(actualtemp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(relay1up)
                            .addComponent(relay1down))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(process1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(settemp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LED2))
                        .addGap(6, 6, 6)
                        .addComponent(actualtemp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(relay2up)
                            .addComponent(relay2down))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(process2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(settemp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LED3))
                        .addGap(6, 6, 6)
                        .addComponent(actualtemp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(relay3up)
                            .addComponent(relay3down))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(process3)))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void relay1upActionPerformed(java.awt.event.ActionEvent evt) {                                         
          variables.stopflag = 0;
    }                                        

    private void actualtemp1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void actualtemp2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void relay2upActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void actualtemp3ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void relay3upActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void settemp1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        settemp1.setText(Integer.toString(Keypad3.entervalue()));
    }                                        

    private void process1StateChanged(javax.swing.event.ChangeEvent evt) {                                      
  
  



//        if (evt.getValue() = 1)
//  LED1.setForeground(new java.awt.Color(255, 102, 102));
//
//} else {
//    LED1.setForeground(new java.awt.Color(255, 255, 102));
//}
        
    }                                     

    private void process1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    
    }                                        

    private void process1ItemStateChanged(java.awt.event.ItemEvent evt) {                                          
        Object source = evt.getStateChange();
        //System.out.println(source);
        if(source.equals(2))
        {
            LED1.setForeground(new java.awt.Color(255, 102, 102));
            variables.stopflag = 2;

        }
 else {
            LED1.setForeground(new java.awt.Color(255, 255, 102));
            variables.stopflag = 3;
        }
    }                                         

    private void relay1upMousePressed(java.awt.event.MouseEvent evt) {                                      

        variables.loop1time++;
        settemp1.setText(String.valueOf(variables.loop1time));
        variables.stopflag = 2;
    }                                     

    private void relay1upMouseReleased(java.awt.event.MouseEvent evt) {                                       

    }                                      

    private void settemp1MousePressed(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    /**
     * @param args the command line arguments
     */
    public static void GUI() {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ui().setVisible(true);
            }
        });
    }

    public JLabel getLED1() {
        return LED1;
    }

    public static void setLED1red() {
        LED1.setForeground(Color.red);
    }
    public static void setLED1gray() {
        LED1.setForeground(Color.gray);
    }

    // Variables declaration - do not modify                     
    public static javax.swing.JLabel LED1;
    private javax.swing.JLabel LED2;
    private javax.swing.JLabel LED3;
    private javax.swing.JTextField actualtemp1;
    private javax.swing.JTextField actualtemp2;
    private javax.swing.JTextField actualtemp3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JToggleButton process1;
    private javax.swing.JToggleButton process2;
    private javax.swing.JToggleButton process3;
    private javax.swing.JButton relay1down;
    private javax.swing.JButton relay1up;
    private javax.swing.JButton relay2down;
    private javax.swing.JButton relay2up;
    private javax.swing.JButton relay3down;
    private javax.swing.JButton relay3up;
    private javax.swing.JTextField settemp1;
    private javax.swing.JTextField settemp2;
    private javax.swing.JTextField settemp3;
    // End of variables declaration                   
}
