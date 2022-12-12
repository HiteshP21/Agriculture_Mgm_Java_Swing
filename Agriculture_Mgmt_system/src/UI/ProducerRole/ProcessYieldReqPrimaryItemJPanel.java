
package UI.ProducerRole;


import Model.WorkQueue.YieldRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Hitesh
 */
public class ProcessYieldReqPrimaryItemJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    YieldRequest request;
       /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
    public ProcessYieldReqPrimaryItemJPanel(JPanel userProcessContainer, YieldRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SBTJButton = new javax.swing.JButton();
        jLabel132 = new javax.swing.JLabel();
        rsltText = new javax.swing.JTextField();
        bkJButton = new javax.swing.JButton();
        jLabel2343 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SBTJButton.setBackground(new java.awt.Color(255, 102, 102));
        SBTJButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SBTJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CMsubmit.png"))); // NOI18N
        SBTJButton.setText("Submit Result");
        SBTJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SBTJButtonActionPerformed(evt);
            }
        });
        add(SBTJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 240, -1));

        jLabel132.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel132.setText("Raw Material Result");
        add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, 30));

        rsltText.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        add(rsltText, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 200, -1));

        bkJButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        bkJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CMback.png"))); // NOI18N
        bkJButton.setText("Back");
        bkJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkJButtonActionPerformed(evt);
            }
        });
        add(bkJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 50));

        jLabel2343.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2343.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2343.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CMraw_material.jpg"))); // NOI18N
        jLabel2343.setText("Raw Material Result");
        add(jLabel2343, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 335, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CMwallpaper2.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 800));
    }// </editor-fold>//GEN-END:initComponents

    private void bkJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManurerProducerJPanel rwers = (ManurerProducerJPanel) component;
        rwers.populateSuppRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_bkJButtonActionPerformed

    private void SBTJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SBTJButtonActionPerformed
        if (rsltText.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Kindly repsond before entering");
        }
        else
        {
            
            //else block
            
               /**
     * 
     * /*submit the inputs and wait the output

creates new panel for new role in the organization

data to be defined.

data passed in the function.

*/
        request.setTestingOutput(rsltText.getText());
        request.setStatus("Completed");
        }
        rsltText.setText("");
    }//GEN-LAST:event_SBTJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SBTJButton;
    private javax.swing.JButton bkJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel2343;
    private javax.swing.JTextField rsltText;
    // End of variables declaration//GEN-END:variables
}
