
package lab_02;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;



public class Home extends javax.swing.JFrame {


    public Home() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaHome = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmNew = new javax.swing.JMenuItem();
        jmSave = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jmSaveAs = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textAreaHome.setColumns(20);
        textAreaHome.setRows(5);
        jScrollPane1.setViewportView(textAreaHome);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 204));
        jLabel1.setText("MY WORD");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 62, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu1.setText("File");

        jmNew.setText("New");
        jmNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmNewActionPerformed(evt);
            }
        });
        jMenu1.add(jmNew);

        jmSave.setText("Save");
        jmSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSaveActionPerformed(evt);
            }
        });
        jMenu1.add(jmSave);

        jMenuItem1.setText("Open");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jmSaveAs.setText("Save as");
        jmSaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSaveAsActionPerformed(evt);
            }
        });
        jMenu1.add(jmSaveAs);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmNewActionPerformed
        // item new :zz
        textAreaHome.setText("");
    }//GEN-LAST:event_jmNewActionPerformed

    private void jmSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSaveActionPerformed
        // item save :
        String text = textAreaHome.getText();
        int option = JOptionPane.showConfirmDialog(this, "Save File");
        if(option == 0){
            Controller.SavaFile(text);
        }else{
            
        }
                
    }//GEN-LAST:event_jmSaveActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // item open :
        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter text = new FileNameExtensionFilter("text","txt","text");
        jfc.setFileFilter(text);
        jfc.setMultiSelectionEnabled(false);
       
        int x = jfc.showDialog(this,"Open");
        if(x == JFileChooser.APPROVE_OPTION){
            textAreaHome.setText(Controller.openFile(jfc.getSelectedFile().getPath()));
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jmSaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSaveAsActionPerformed
        // item sava as:
        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter text = new FileNameExtensionFilter("text", "all");
        jfc.setFileFilter(text);
        jfc.setMultiSelectionEnabled(false);
        int x = jfc.showDialog(this, "Save");
        if(x == JFileChooser.APPROVE_OPTION){
            
            Controller.saveAs(jfc.getSelectedFile().getPath(), textAreaHome.getText());
        }
    }//GEN-LAST:event_jmSaveAsActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem jmNew;
    private javax.swing.JMenuItem jmSave;
    private javax.swing.JMenuItem jmSaveAs;
    private javax.swing.JTextArea textAreaHome;
    // End of variables declaration//GEN-END:variables
}
