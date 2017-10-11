
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author root
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioButtonGroup = new javax.swing.ButtonGroup();
        checkBoxGroup = new javax.swing.ButtonGroup();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        picture1 = new javax.swing.JRadioButton();
        picture2 = new javax.swing.JRadioButton();
        picture3 = new javax.swing.JRadioButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        lusterBox = new javax.swing.JCheckBox();
        smoothBox = new javax.swing.JCheckBox();
        normalBox = new javax.swing.JCheckBox();
        pictureTitle = new javax.swing.JLabel();
        filterTitle = new javax.swing.JLabel();
        imagePanel = new ImagePanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Image Editor");

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLayeredPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        radioButtonGroup.add(picture1);
        picture1.setSelected(true);
        picture1.setText("Nyan Cat");
        picture1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                picture1MouseClicked(evt);
            }
        });

        radioButtonGroup.add(picture2);
        picture2.setText("Moon");
        picture2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                picture2MouseClicked(evt);
            }
        });

        radioButtonGroup.add(picture3);
        picture3.setText("Dog");
        picture3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                picture3MouseClicked(evt);
            }
        });

        jLayeredPane1.setLayer(picture1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(picture2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(picture3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(picture1)
                    .addComponent(picture3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(picture2, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(picture1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(picture2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(picture3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        checkBoxGroup.add(lusterBox);
        lusterBox.setText("Luster");
        lusterBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lusterBoxMouseClicked(evt);
            }
        });

        checkBoxGroup.add(smoothBox);
        smoothBox.setText("Smooth");
        smoothBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                smoothBoxMouseClicked(evt);
            }
        });

        checkBoxGroup.add(normalBox);
        normalBox.setText("No filter");
        normalBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                normalBoxMouseClicked(evt);
            }
        });

        jLayeredPane2.setLayer(lusterBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(smoothBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(normalBox, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(smoothBox)
                    .addComponent(lusterBox)
                    .addComponent(normalBox))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(smoothBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lusterBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(normalBox)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pictureTitle.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        pictureTitle.setText("Picture : ");

        filterTitle.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        filterTitle.setText("Image filter : ");

        imagePanel.setCheckBox(checkBoxGroup);
        imagePanel.setRadioButton(radioButtonGroup);

        javax.swing.GroupLayout imagePanelLayout = new javax.swing.GroupLayout(imagePanel);
        imagePanel.setLayout(imagePanelLayout);
        imagePanelLayout.setHorizontalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        imagePanelLayout.setVerticalGroup(
            imagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 225, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 12)); // NOI18N
        jLabel1.setText("David Medina & Geraldo Rodrígues 2017");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pictureTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filterTitle)
                    .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(filterTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pictureTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(imagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void picture1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_picture1MouseClicked
        imagePanel.setCheckBox(checkBoxGroup);
        imagePanel.setRadioButton(radioButtonGroup);
        imagePanel.paintComponent(imagePanel.getGraphics());
    }//GEN-LAST:event_picture1MouseClicked

    private void picture2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_picture2MouseClicked
        imagePanel.setCheckBox(checkBoxGroup);
        imagePanel.setRadioButton(radioButtonGroup);
        imagePanel.paintComponent(imagePanel.getGraphics());
    }//GEN-LAST:event_picture2MouseClicked

    private void picture3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_picture3MouseClicked
        imagePanel.setCheckBox(checkBoxGroup);
        imagePanel.setRadioButton(radioButtonGroup);
        imagePanel.paintComponent(imagePanel.getGraphics());
    }//GEN-LAST:event_picture3MouseClicked

    private void lusterBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lusterBoxMouseClicked
        imagePanel.setCheckBox(checkBoxGroup);
        imagePanel.setRadioButton(radioButtonGroup);
        imagePanel.paintComponent(imagePanel.getGraphics());
    }//GEN-LAST:event_lusterBoxMouseClicked

    private void smoothBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_smoothBoxMouseClicked
        imagePanel.setCheckBox(checkBoxGroup);
        imagePanel.setRadioButton(radioButtonGroup);
        imagePanel.paintComponent(imagePanel.getGraphics());
    }//GEN-LAST:event_smoothBoxMouseClicked

    private void normalBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_normalBoxMouseClicked
        imagePanel.setCheckBox(checkBoxGroup);
        imagePanel.setRadioButton(radioButtonGroup);
        imagePanel.paintComponent(imagePanel.getGraphics());
    }//GEN-LAST:event_normalBoxMouseClicked

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup checkBoxGroup;
    private javax.swing.JLabel filterTitle;
    private ImagePanel imagePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JCheckBox lusterBox;
    private javax.swing.JCheckBox normalBox;
    private javax.swing.JRadioButton picture1;
    private javax.swing.JRadioButton picture2;
    private javax.swing.JRadioButton picture3;
    private javax.swing.JLabel pictureTitle;
    private javax.swing.ButtonGroup radioButtonGroup;
    private javax.swing.JCheckBox smoothBox;
    // End of variables declaration//GEN-END:variables
}
