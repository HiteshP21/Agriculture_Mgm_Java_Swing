
package UI.FarmerRole;


import Model.WorkQueue.YieldRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author Hitesh
 */
public class ProcessYieldReqJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    YieldRequest request;
    
    /**
     * Creates new form ProcessProduceRequestJPanel
     */
    public ProcessYieldReqJPanel(JPanel userProcessContainer, YieldRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        populateStatusCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        statusCombo = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submitJButton.setBackground(new java.awt.Color(255, 102, 102));
        submitJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        submitJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CMsubmit.png"))); // NOI18N
        submitJButton.setText("Submit Result");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Yield Result");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, -1, 30));

        backJButton.setBackground(new java.awt.Color(204, 255, 204));
        backJButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CMback.png"))); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 50));

        statusCombo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        statusCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusComboActionPerformed(evt);
            }
        });
        add(statusCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 210, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CMcrop.jpg"))); // NOI18N
        jLabel2.setText("Yield Results");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 347, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CMwallpaper2.jpg"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -6, 1000, 810));
    }// </editor-fold>//GEN-END:initComponents
    private void populateStatusCombo(){
        
        statusCombo.addItem("Request fulfilled");
    }
    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        FarmerWorkAreaJPanel fwjp = (FarmerWorkAreaJPanel) component;
        fwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        String status = (String) statusCombo.getSelectedItem();
        request.setStatus(status);
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void statusComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusComboActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox statusCombo;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
