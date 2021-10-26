package interfaces;

import interfaces.graph.Control;

/* Start class to manage start view (the first one)
 */
public class Start extends javax.swing.JPanel {
    
    /* To show control interface
    */
    Control control;
    private final MainActions mainActions;

    public Start(MainActions mainActions) {
        control = new Control();
        this.mainActions = mainActions;

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        start_content_layout = new javax.swing.JPanel();
        continue_button = new javax.swing.JButton();
        instructions_button = new javax.swing.JButton();
        about_us_button = new javax.swing.JButton();
        logo = new javax.swing.JLabel();

        start_content_layout.setBackground(new java.awt.Color(204, 255, 255));
        start_content_layout.setPreferredSize(new java.awt.Dimension(700, 338));

        continue_button.setBackground(new java.awt.Color(5, 34, 137));
        continue_button.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        continue_button.setForeground(new java.awt.Color(255, 255, 255));
        continue_button.setText("Continue");
        continue_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        continue_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        continue_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continue_buttonActionPerformed(evt);
            }
        });

        instructions_button.setBackground(new java.awt.Color(5, 34, 137));
        instructions_button.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        instructions_button.setForeground(new java.awt.Color(255, 255, 255));
        instructions_button.setText("Instructions");
        instructions_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        instructions_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        instructions_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instructions_buttonActionPerformed(evt);
            }
        });

        about_us_button.setBackground(new java.awt.Color(4, 30, 130));
        about_us_button.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        about_us_button.setForeground(new java.awt.Color(255, 255, 255));
        about_us_button.setText("About Us");
        about_us_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        about_us_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        about_us_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                about_us_buttonActionPerformed(evt);
            }
        });

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo.png"))); // NOI18N

        javax.swing.GroupLayout start_content_layoutLayout = new javax.swing.GroupLayout(start_content_layout);
        start_content_layout.setLayout(start_content_layoutLayout);
        start_content_layoutLayout.setHorizontalGroup(
            start_content_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(start_content_layoutLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(about_us_button, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(start_content_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(start_content_layoutLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(start_content_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logo)
                            .addComponent(continue_button, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(292, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, start_content_layoutLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(instructions_button, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        start_content_layoutLayout.setVerticalGroup(
            start_content_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, start_content_layoutLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(continue_button, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(start_content_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(about_us_button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(instructions_button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(start_content_layout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(start_content_layout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void continue_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continue_buttonActionPerformed
        //Close main page of the program and go to graphs
        control.setVisible(true);
        mainActions.closeMain();
    }//GEN-LAST:event_continue_buttonActionPerformed

    private void instructions_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instructions_buttonActionPerformed
        mainActions.setInstructionsView();
    }//GEN-LAST:event_instructions_buttonActionPerformed

    private void about_us_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_about_us_buttonActionPerformed
        mainActions.setAboutUsView();
    }//GEN-LAST:event_about_us_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton about_us_button;
    private javax.swing.JButton continue_button;
    private javax.swing.JButton instructions_button;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel start_content_layout;
    // End of variables declaration//GEN-END:variables
}
