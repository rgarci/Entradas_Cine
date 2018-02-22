/*
@authors: LIS
Couoh, Eliezer
Cruz, Hilda
Garcilazo, Rosaura
*/

package App;

import Modulo.*;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class FUNCION extends javax.swing.JFrame {
    public static Funcion sele;
    public static Funcion seleAux;
    public static ArrayList<Funcion> pels = new ArrayList();
    public static ArrayList<Butaca> buts = new ArrayList();
    public static int cant; 
    public static int aux;
    public static char tipo;
    public static int cuenta=0;
    public static String matr;
    Asiento[][] botones = new Asiento[5][7];
    /**
     * Creates new form FUNCION
     */
    public FUNCION() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainBLCKpanel = new javax.swing.JPanel();
        bluePanel = new javax.swing.JPanel();
        ChbInvEsp = new javax.swing.JCheckBox();
        lbboletos = new javax.swing.JLabel();
        cbhorario = new javax.swing.JComboBox<>();
        lbhora = new javax.swing.JLabel();
        lbedad = new javax.swing.JLabel();
        cbpelicula = new javax.swing.JComboBox<>();
        lbpelicula = new javax.swing.JLabel();
        lbtipoSala = new javax.swing.JLabel();
        cbtsala = new javax.swing.JComboBox<>();
        tfnumcuenta = new javax.swing.JTextField();
        spboletos = new javax.swing.JSpinner();
        lbtaquilla = new javax.swing.JLabel();
        btnCANCEL = new javax.swing.JButton();
        btnNEXT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setIconImages(getIconImages());
        setUndecorated(true);

        mainBLCKpanel.setBackground(new java.awt.Color(0, 0, 0));

        bluePanel.setBackground(new java.awt.Color(51, 153, 255));

        ChbInvEsp.setText("Cuenta de invitado especial");

        lbboletos.setForeground(new java.awt.Color(255, 255, 255));
        lbboletos.setText("Cantidad ");

        cbhorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "13:00", "15:00", "16:20", "17:00", "20:00" }));

        lbhora.setForeground(new java.awt.Color(255, 255, 255));
        lbhora.setText("Seleccione un horario:");

        lbedad.setForeground(new java.awt.Color(255, 255, 255));
        lbedad.setText("Seleccione la cantidad de boletos:");

        cbpelicula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "COCO", "IT", "Selena", " " }));

        lbpelicula.setForeground(new java.awt.Color(255, 255, 255));
        lbpelicula.setText("Seleccione una película:");

        lbtipoSala.setForeground(new java.awt.Color(255, 255, 255));
        lbtipoSala.setText("Seleccione un tipo de sala:");

        cbtsala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Tradicional", "3D", "4D" }));

        tfnumcuenta.setText("Matrícula");

        spboletos.setModel(new javax.swing.SpinnerNumberModel(0, 0, 35, 1));

        javax.swing.GroupLayout bluePanelLayout = new javax.swing.GroupLayout(bluePanel);
        bluePanel.setLayout(bluePanelLayout);
        bluePanelLayout.setHorizontalGroup(
            bluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bluePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbedad)
                    .addGroup(bluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(ChbInvEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(bluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbhora)
                            .addComponent(cbhorario, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bluePanelLayout.createSequentialGroup()
                        .addComponent(lbboletos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spboletos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addGroup(bluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(bluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbpelicula)
                        .addComponent(cbpelicula, 0, 210, Short.MAX_VALUE)
                        .addComponent(lbtipoSala)
                        .addComponent(cbtsala, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(tfnumcuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bluePanelLayout.setVerticalGroup(
            bluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bluePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bluePanelLayout.createSequentialGroup()
                        .addComponent(lbpelicula)
                        .addGap(19, 19, 19)
                        .addComponent(cbpelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(bluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbtipoSala)
                            .addComponent(lbhora))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbtsala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbhorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bluePanelLayout.createSequentialGroup()
                        .addComponent(lbedad)
                        .addGap(18, 18, 18)
                        .addGroup(bluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbboletos)
                            .addComponent(spboletos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(bluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChbInvEsp)
                    .addComponent(tfnumcuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );

        lbtaquilla.setBackground(new java.awt.Color(247, 236, 147));
        lbtaquilla.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        lbtaquilla.setForeground(new java.awt.Color(182, 29, 69));
        lbtaquilla.setText("TAQUILLA");

        btnCANCEL.setBackground(new java.awt.Color(182, 29, 69));
        btnCANCEL.setForeground(new java.awt.Color(255, 255, 255));
        btnCANCEL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/if_Close_1891023.png"))); // NOI18N
        btnCANCEL.setText("Cancelar Compra");
        btnCANCEL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCANCELMouseClicked(evt);
            }
        });
        btnCANCEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCANCELActionPerformed(evt);
            }
        });

        btnNEXT.setBackground(new java.awt.Color(182, 29, 69));
        btnNEXT.setForeground(new java.awt.Color(255, 255, 255));
        btnNEXT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icono/if_Chapter_controls_forward_play_music_player_video_player_next_1886542.png"))); // NOI18N
        btnNEXT.setText("Siguiente");
        btnNEXT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNEXTMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mainBLCKpanelLayout = new javax.swing.GroupLayout(mainBLCKpanel);
        mainBLCKpanel.setLayout(mainBLCKpanelLayout);
        mainBLCKpanelLayout.setHorizontalGroup(
            mainBLCKpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainBLCKpanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnCANCEL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(mainBLCKpanelLayout.createSequentialGroup()
                .addGroup(mainBLCKpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainBLCKpanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bluePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainBLCKpanelLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(lbtaquilla)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainBLCKpanelLayout.setVerticalGroup(
            mainBLCKpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainBLCKpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbtaquilla)
                .addGap(12, 12, 12)
                .addComponent(bluePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(mainBLCKpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNEXT)
                    .addComponent(btnCANCEL))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainBLCKpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainBLCKpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNEXTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNEXTMouseClicked
        String pelicula = String.valueOf(cbpelicula.getSelectedItem());
        String hora = String.valueOf(cbhorario.getSelectedItem());
        tipo =  String.valueOf(cbtsala.getSelectedItem()).charAt(0);
        int cantidad = Integer.parseInt(String.valueOf(spboletos.getValue()));
        cant = cantidad;
        aux=cantidad;
        
        int ban =0;
        try{
           if(ChbInvEsp.isSelected()){
                cuenta=1;
                matr=String.valueOf(tfnumcuenta.getText());
                BoletoEspecial esp = new BoletoEspecial();
                if(esp.comprobar(matr)==0){
                    throw new NotFoundMatrException("La cuenta no existe");
                }
            }else{
               cuenta=0;
           }
           FileInputStream fis = new FileInputStream("funciones.txt");
           ObjectInputStream ois = new ObjectInputStream(fis);
           
           pels = (ArrayList<Funcion>) ois.readObject();
           for(int i=0; i<pels.size();i++){
               if (pels.get(i).getPelicula().equals(pelicula)){
                   if(pels.get(i).getHora().equals(hora)){
                       switch(tipo){
                           case 'T':
                               if(pels.get(i) instanceof FuncionNormal){
                                   sele = pels.get(i);
                                   seleAux = pels.get(i);
                                   new BUTACAS().setVisible(true);
                                   ban=1;
                               }
                               break;
                           case '3':
                               if(pels.get(i) instanceof Funcion3D){
                                   sele = pels.get(i);
                                   seleAux = pels.get(i);
                                   new BUTACAS().setVisible(true);
                                   ban=1;
                               }
                               break;
                           case '4':
                               if(pels.get(i) instanceof Funcion4D){
                                   sele = pels.get(i);
                                   seleAux = pels.get(i);
                                   new BUTACAS().setVisible(true);
                                   ban=1;
                                }
                               break;
                        }
                   }
               }
           }
           if(ban==0){
               throw new NotFoundFuncionException("La función solicitada no existe, por favor consulte los horarios y tipos de sala disponibles");
           }
           ois.close();
           
            this.dispose();
        }
        catch(FileNotFoundException e1){
            JOptionPane.showMessageDialog(null, e1.getMessage());
        }
        catch(IOException e2){
            JOptionPane.showMessageDialog(null, e2.getMessage());
        }
        catch(ClassNotFoundException e3){
            JOptionPane.showMessageDialog(null, e3.getMessage());
        }
        catch(NotFoundFuncionException e4){
            JOptionPane.showMessageDialog(null, e4.getMessage());
        }
        catch(NotFoundMatrException e5){
            JOptionPane.showMessageDialog(null, e5.getMessage());
            
        }
    }//GEN-LAST:event_btnNEXTMouseClicked

    private void btnCANCELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCANCELActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCANCELActionPerformed

    private void btnCANCELMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCANCELMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_btnCANCELMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FUNCION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FUNCION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FUNCION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FUNCION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FUNCION().setVisible(true);
            }
        });
    }
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                
                getImage(ClassLoader.getSystemResource("Icono/Lee+co.png"));
                


        return retValue;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ChbInvEsp;
    private javax.swing.JPanel bluePanel;
    private javax.swing.JButton btnCANCEL;
    private javax.swing.JButton btnNEXT;
    private javax.swing.JComboBox<String> cbhorario;
    private javax.swing.JComboBox<String> cbpelicula;
    private javax.swing.JComboBox<String> cbtsala;
    private javax.swing.JLabel lbboletos;
    private javax.swing.JLabel lbedad;
    private javax.swing.JLabel lbhora;
    private javax.swing.JLabel lbpelicula;
    private javax.swing.JLabel lbtaquilla;
    private javax.swing.JLabel lbtipoSala;
    private javax.swing.JPanel mainBLCKpanel;
    private javax.swing.JSpinner spboletos;
    private javax.swing.JTextField tfnumcuenta;
    // End of variables declaration//GEN-END:variables
}
