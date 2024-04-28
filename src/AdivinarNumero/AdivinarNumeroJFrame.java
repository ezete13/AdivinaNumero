package AdivinarNumero;

/**
 *
 * @author Ezequiel Tello
 */

import java.util.Random;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class AdivinarNumeroJFrame extends javax.swing.JFrame implements KeyListener {
    Random random = new Random();   
    int numeroAdivinar = random.nextInt(100) + 1;
    int intentos = 0;
        
    public AdivinarNumeroJFrame() {
        initComponents();
        field_number.addKeyListener(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Backgraund = new javax.swing.JPanel();
        label_titulo = new javax.swing.JLabel();
        label_text = new javax.swing.JLabel();
        button_check = new javax.swing.JButton();
        label_result = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        field_number = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        label_intentos2 = new javax.swing.JLabel();
        label_intentos = new javax.swing.JLabel();
        button_reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 102));

        Backgraund.setBackground(new java.awt.Color(5, 44, 69));

        label_titulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        label_titulo.setForeground(new java.awt.Color(251, 254, 215));
        label_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_titulo.setText("¡Adivina el Número!");

        label_text.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_text.setForeground(new java.awt.Color(251, 254, 215));
        label_text.setText("Estoy pensando en un número entre 1 y 100 ¡Intenta adivinarlo!");

        button_check.setBackground(new java.awt.Color(26, 192, 136));
        button_check.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button_check.setForeground(new java.awt.Color(251, 254, 215));
        button_check.setText("ADIVINAR");
        button_check.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(251, 254, 215)));
        button_check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_checkActionPerformed(evt);
            }
        });

        label_result.setBackground(new java.awt.Color(56, 80, 118));
        label_result.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        label_result.setForeground(new java.awt.Color(26, 192, 136));
        label_result.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_result.setToolTipText("");

        jPanel1.setBackground(new java.awt.Color(56, 80, 118));

        field_number.setBackground(new java.awt.Color(56, 80, 118));
        field_number.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        field_number.setForeground(new java.awt.Color(251, 254, 215));
        field_number.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        field_number.setToolTipText("Numero");
        field_number.setBorder(null);
        field_number.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        field_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                field_numberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(field_number, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(field_number, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        jSeparator1.setBackground(new java.awt.Color(26, 192, 136));

        jPanel4.setBackground(new java.awt.Color(56, 80, 118));

        label_intentos2.setBackground(new java.awt.Color(0, 255, 0));
        label_intentos2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        label_intentos2.setForeground(new java.awt.Color(251, 254, 215));
        label_intentos2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_intentos2.setText("INTENTOS");

        label_intentos.setBackground(new java.awt.Color(0, 255, 0));
        label_intentos.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        label_intentos.setForeground(new java.awt.Color(251, 254, 215));
        label_intentos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(label_intentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(label_intentos2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(label_intentos2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_intentos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        button_reset.setBackground(new java.awt.Color(56, 80, 118));
        button_reset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button_reset.setForeground(new java.awt.Color(251, 254, 215));
        button_reset.setText("REINICIAR");
        button_reset.setToolTipText("");
        button_reset.setBorder(null);
        button_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackgraundLayout = new javax.swing.GroupLayout(Backgraund);
        Backgraund.setLayout(BackgraundLayout);
        BackgraundLayout.setHorizontalGroup(
            BackgraundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BackgraundLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(BackgraundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgraundLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(label_text, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BackgraundLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button_check, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(BackgraundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(BackgraundLayout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(BackgraundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BackgraundLayout.createSequentialGroup()
                        .addComponent(label_result, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(BackgraundLayout.createSequentialGroup()
                        .addComponent(button_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        BackgraundLayout.setVerticalGroup(
            BackgraundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgraundLayout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(label_titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_text)
                .addGap(19, 19, 19)
                .addGroup(BackgraundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BackgraundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(button_check, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(label_result, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Backgraund, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Backgraund, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void field_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_field_numberActionPerformed
        
        
    }//GEN-LAST:event_field_numberActionPerformed

    private void button_checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_checkActionPerformed
        
        String captura = field_number.getText();
        int intentoUsuario = Integer.parseInt(captura);
        
        if (intentoUsuario == numeroAdivinar){
            label_result.setText("¡Felicidades! Adivinaste el número en " + intentos + " intentos.");
            intentos = 0;

        } else if (intentoUsuario < numeroAdivinar) {
            label_result.setText("Demasiado bajo. Intenta de nuevo.");
            intentos++;

        } else if (intentoUsuario > numeroAdivinar){
            label_result.setText("Demasiado alto. Intenta de nuevo.");
            intentos++;
        } 
                
       label_intentos.setText(""+ intentos);
       field_number.setText("");
       
       
    }//GEN-LAST:event_button_checkActionPerformed

    private void button_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_resetActionPerformed
        // Generar un nuevo número aleatorio
        numeroAdivinar = random.nextInt(100) + 1;
    
        // Reiniciar el contador de intentos
        intentos = 0;
    
        // Actualizar el texto de la etiqueta de intentos
        label_intentos.setText("" + intentos);
    
        // Limpiar el campo de texto
        field_number.setText("");
    
        // Limpiar el texto de la etiqueta de resultado
        label_result.setText("");
    }//GEN-LAST:event_button_resetActionPerformed

    // Métodos de KeyListener
    @Override
    public void keyTyped(KeyEvent e) {
      
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            // Ejecutar la misma acción que hacer clic en el botón "INTENTAR"
            button_checkActionPerformed(null);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
    
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(AdivinarNumeroJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdivinarNumeroJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdivinarNumeroJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdivinarNumeroJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdivinarNumeroJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Backgraund;
    private javax.swing.JButton button_check;
    private javax.swing.JButton button_reset;
    private javax.swing.JTextField field_number;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel label_intentos;
    private javax.swing.JLabel label_intentos2;
    private javax.swing.JLabel label_result;
    private javax.swing.JLabel label_text;
    private javax.swing.JLabel label_titulo;
    // End of variables declaration//GEN-END:variables
}
