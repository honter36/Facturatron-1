/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FacturaObservacionesDialog.java
 *
 * Created on 17/01/2011, 08:10:47 PM
 */

package facturatron.facturacion;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

/**
 *
 * @author Jach
 */
public class AddTicketRangoDialog extends javax.swing.JDialog {

    boolean   cancelar  = false;
    ActionMap actionMap = getRootPane().getActionMap();
    InputMap  inputMap  = getRootPane().getInputMap();

    /** Creates new form FacturaObservacionesDialog */
    public AddTicketRangoDialog(java.awt.Frame parent) {
        super(parent, true);
        initComponents();
        setLocationRelativeTo(null);
        setActions();
        getTxtIdInicial().getKeymap().addActionForKeyStroke(KeyStroke.getKeyStroke("ENTER") , actionMap.get("ACEPTAR" ));
        getTxtIdFinal().getKeymap().addActionForKeyStroke(KeyStroke.getKeyStroke("ESCAPE"), actionMap.get("CANCELAR"));
    }

    public int[] lanzar() {
        setVisible(true);
        if(cancelar) {
            return null;
        } else {
            int[] rango;
            rango = new int [2];
            rango[0] = Integer.parseInt(getTxtIdInicial().getText());
            rango[1] = Integer.parseInt(getTxtIdFinal().getText());
            return rango;
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAceptar = new org.jdesktop.swingx.JXButton();
        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        btnCancelar = new org.jdesktop.swingx.JXButton();
        txtIdInicial = new javax.swing.JTextField();
        txtIdFinal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Añadir ticket");

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jXLabel1.setText("ID Ticket Inicial:");
        jXLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtIdInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdInicialActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("ID Ticket Final:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdFinal)
                            .addComponent(txtIdInicial, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jXLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        cancelar = true;
        setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtIdInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdInicialActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXButton btnAceptar;
    private org.jdesktop.swingx.JXButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private javax.swing.JTextField txtIdFinal;
    public javax.swing.JTextField txtIdInicial;
    // End of variables declaration//GEN-END:variables

    public JTextField getTxtIdFinal() {
        return txtIdFinal;
    }

    public void setTxtIdFinal(JTextField txtIdFinal) {
        this.txtIdFinal = txtIdFinal;
    }
    
    // End of variables declaration

    /**
     * @return the btnAceptar
     */
    public org.jdesktop.swingx.JXButton getBtnAceptar() {
        return btnAceptar;
    }

    /**
     * @return the btnCancelar
     */
    public org.jdesktop.swingx.JXButton getBtnCancelar() {
        return btnCancelar;
    }

    /**
     * @return the txtId
     */
    public javax.swing.JTextField getTxtIdInicial() {
        return txtIdInicial;
    }

    /**
     * @param txtId the txtId to set
     */
    public void setTxtIdInicial(javax.swing.JTextField txtId) {
        this.txtIdInicial = txtIdInicial;
    }


    private void setActions() {
        getRootPane().getActionMap().put("CANCELAR", new AbstractAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnCancelar.doClick();
            }
        });
        getRootPane().getActionMap().put("ACEPTAR", new AbstractAction() {

            @Override
            public void actionPerformed(ActionEvent e) {
                btnAceptar.doClick();
            }
        });
    }

}