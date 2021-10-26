 package interfaces;

import java.awt.*;
import javax.swing.ImageIcon;

/* Main class of the program
*/
public class Main extends javax.swing.JFrame implements MainActions {

    /* Variable declarations for the different views (pages)
     */
    private CardLayout contentCardLayout;
    private Start startView;
    private Instructions instructionsView;
    private AboutUs aboutUsView;

    public Main() {
        initComponents();
        /* Set logo for the jFrame window      
         */
        setIconImage(new ImageIcon(getClass().getResource("/images/Logo.png")).getImage());
        setResizable(false);
        setLocationRelativeTo(null);
        initCardLayout();
    }

    private void initCardLayout() {
        /*Initiate the different views
         */
        startView = new Start(this);
        instructionsView = new Instructions(this);
        aboutUsView = new AboutUs(this);

        contentCardLayout = (CardLayout) (card_content_layout.getLayout());

        card_content_layout.add(startView, "startView");
        card_content_layout.add(instructionsView, "instructionsView");
        card_content_layout.add(aboutUsView, "aboutUsView");

        //The home view is the first view to be render
        contentCardLayout.show(card_content_layout, "startView");
    }

    @Override
    public void setStartView() {
        contentCardLayout.show(card_content_layout, "startView");
        header_title.setText("Internet Services");
    }

    @Override
    public void setInstructionsView() {
        contentCardLayout.show(card_content_layout, "instructionsView");
        header_title.setText("Instructions");
    }

    @Override
    public void setAboutUsView() {
        contentCardLayout.show(card_content_layout, "aboutUsView");
        header_title.setText("About Us");
    }

    @Override
    public void closeMain() {
        this.dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        header_title = new javax.swing.JLabel();
        card_content_layout = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));
        setPreferredSize(new java.awt.Dimension(699, 450));

        background.setBackground(new java.awt.Color(204, 255, 255));
        background.setPreferredSize(new java.awt.Dimension(700, 409));

        header.setBackground(new java.awt.Color(5, 34, 137));
        header.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        header.setMinimumSize(new java.awt.Dimension(710, 75));
        header.setPreferredSize(new java.awt.Dimension(710, 75));
        header.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 25, 24));

        header_title.setBackground(new java.awt.Color(255, 255, 255));
        header_title.setFont(new java.awt.Font("Sylfaen", 3, 24)); // NOI18N
        header_title.setForeground(new java.awt.Color(255, 255, 255));
        header_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header_title.setText("Internet Services");
        header_title.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        header_title.setIconTextGap(10);
        header.add(header_title);

        card_content_layout.setBackground(new java.awt.Color(204, 255, 255));
        card_content_layout.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(card_content_layout, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(card_content_layout, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel card_content_layout;
    private javax.swing.JPanel header;
    private javax.swing.JLabel header_title;
    // End of variables declaration//GEN-END:variables
}
