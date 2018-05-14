/* Hildana. M
 * CDCollections_A4_U3.java
 * This program allows teh user to add and remove songs from the cd collection 
 * May/11/2018
 */

/**
 *
 * @author himel9675
 */
import java.util.*;
public class FrameCDCollection_A4_U3 extends javax.swing.JFrame {
    
    ArrayList <String> song = new ArrayList();

    /**
     * Creates new form FrameCDCollection_A4_U3
     */
    public FrameCDCollection_A4_U3() {
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

        jPanel1 = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        labelSongTitle = new javax.swing.JLabel();
        textAddSong = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaDisplay = new javax.swing.JTextArea();
        buttonDisplay = new javax.swing.JButton();
        buttonInitialize = new javax.swing.JButton();
        buttonAdd = new javax.swing.JButton();
        buttonRemove = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        menuItemExit = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitle.setFont(new java.awt.Font("Trajan Pro", 0, 24)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(0, 0, 255));
        labelTitle.setText("CD Collection");

        labelSongTitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelSongTitle.setText("Title - Artist:");

        textAddSong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        textAreaDisplay.setEditable(false);
        textAreaDisplay.setColumns(20);
        textAreaDisplay.setLineWrap(true);
        textAreaDisplay.setRows(5);
        textAreaDisplay.setWrapStyleWord(true);
        jScrollPane1.setViewportView(textAreaDisplay);

        buttonDisplay.setText("Display");
        buttonDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDisplayActionPerformed(evt);
            }
        });

        buttonInitialize.setText("Initialize");
        buttonInitialize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInitializeActionPerformed(evt);
            }
        });

        buttonAdd.setText("Add");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        buttonRemove.setText("Remove");
        buttonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(labelTitle)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelSongTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textAddSong))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonDisplay)
                        .addGap(38, 38, 38)
                        .addComponent(buttonInitialize)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                        .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonRemove)
                        .addGap(17, 17, 17)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSongTitle)
                    .addComponent(textAddSong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonDisplay)
                    .addComponent(buttonInitialize)
                    .addComponent(buttonAdd)
                    .addComponent(buttonRemove))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        menuItemExit.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuItemExit.add(jMenuItem1);

        menuBar.add(menuItemExit);

        jMenu2.setText("Edit");
        menuBar.add(jMenu2);

        setJMenuBar(menuBar);

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
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
         System.exit(0); //alows to exit the program 
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void buttonDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDisplayActionPerformed
     textAreaDisplay.setText("Original Song Order\n");
     
     for (int i = 0; i < song.size(); i++)
     {
      textAreaDisplay.setText(textAreaDisplay.getText() + song.get(i) + "\n");
         
     }
      textAreaDisplay.setText(textAreaDisplay.getText() + "\nSorted Order\n");
      Collections.sort(song);
     
     for (int i = 0; i < song.size(); i++)
     {
         textAreaDisplay.setText(textAreaDisplay.getText() + song.get(i) + "\n");
     }
       
    }//GEN-LAST:event_buttonDisplayActionPerformed

    private void buttonInitializeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInitializeActionPerformed
        
       //collect the songs added 
       song.add( "Elton John - Madman Across The water");
       song.add( "David Bowie - Space Oddity");
       song.add( "Bruce Springsteen - Born To Run");
       song.add( "Tracy Chapman - Fast Car");
       
       //to not initialize twice
       buttonInitialize.setEnabled(false);
       
    }//GEN-LAST:event_buttonInitializeActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
      //when you press the add button,add the song to your cd collection 
      song.add (textAddSong.getText());
    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoveActionPerformed
   
    int index = 0;
    
    //search songs from the list that has been typed by the user
    index = Collections.binarySearch(song,textAddSong.getText());
    
    //if the search goes beyond the boundaries (less than zero)
    if (index == -1)
    {
        //display message 
        System.out.println("The song is not in the list");
    }
    else 
    {
       //remove the song that has been typed in by the user 
        song.remove(textAddSong.getText());
    }
        
    }//GEN-LAST:event_buttonRemoveActionPerformed

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
            java.util.logging.Logger.getLogger(FrameCDCollection_A4_U3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameCDCollection_A4_U3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameCDCollection_A4_U3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameCDCollection_A4_U3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameCDCollection_A4_U3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonDisplay;
    private javax.swing.JButton buttonInitialize;
    private javax.swing.JButton buttonRemove;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelSongTitle;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuItemExit;
    private javax.swing.JTextField textAddSong;
    private javax.swing.JTextArea textAreaDisplay;
    // End of variables declaration//GEN-END:variables
}
