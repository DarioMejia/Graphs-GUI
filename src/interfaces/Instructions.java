package interfaces;

/* Instructions class to manage instructions view
 */
public class Instructions extends javax.swing.JPanel {

    private MainActions mainActions;

    public Instructions(MainActions menuActions) {
        initComponents();

        this.mainActions = menuActions;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        instructions_content_layout = new javax.swing.JPanel();
        return_button = new javax.swing.JButton();
        instructions_title_label = new javax.swing.JLabel();
        tip_2_label = new javax.swing.JLabel();
        tip_1_label = new javax.swing.JLabel();
        tip_1_label1 = new javax.swing.JLabel();

        instructions_content_layout.setBackground(new java.awt.Color(204, 255, 255));
        instructions_content_layout.setPreferredSize(new java.awt.Dimension(700, 338));

        return_button.setBackground(new java.awt.Color(4, 30, 130));
        return_button.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        return_button.setForeground(new java.awt.Color(255, 255, 255));
        return_button.setText("Return");
        return_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        return_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        return_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                return_buttonActionPerformed(evt);
            }
        });

        instructions_title_label.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        instructions_title_label.setText("Just some tips:");

        tip_2_label.setBackground(new java.awt.Color(255, 255, 255));
        tip_2_label.setFont(new java.awt.Font("Sylfaen", 0, 16)); // NOI18N
        tip_2_label.setText("- Use the buttons carefully!");

        tip_1_label.setBackground(new java.awt.Color(255, 255, 255));
        tip_1_label.setFont(new java.awt.Font("Sylfaen", 0, 16)); // NOI18N
        tip_1_label.setText("- Pay attention to the little instructive sentences!");

        tip_1_label1.setBackground(new java.awt.Color(255, 255, 255));
        tip_1_label1.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        tip_1_label1.setText("Our program is really easy to use, all the necessary instructions will be given in due time.");

        javax.swing.GroupLayout instructions_content_layoutLayout = new javax.swing.GroupLayout(instructions_content_layout);
        instructions_content_layout.setLayout(instructions_content_layoutLayout);
        instructions_content_layoutLayout.setHorizontalGroup(
            instructions_content_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(instructions_content_layoutLayout.createSequentialGroup()
                .addGroup(instructions_content_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(instructions_content_layoutLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(instructions_content_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tip_1_label)
                            .addComponent(tip_2_label)))
                    .addGroup(instructions_content_layoutLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(instructions_content_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(instructions_title_label)
                            .addComponent(tip_1_label1)
                            .addComponent(return_button, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        instructions_content_layoutLayout.setVerticalGroup(
            instructions_content_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, instructions_content_layoutLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(tip_1_label1)
                .addGap(18, 18, 18)
                .addComponent(instructions_title_label)
                .addGap(18, 18, 18)
                .addComponent(tip_1_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tip_2_label)
                .addGap(69, 69, 69)
                .addComponent(return_button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(instructions_content_layout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(instructions_content_layout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void return_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return_buttonActionPerformed
        mainActions.setStartView();
    }//GEN-LAST:event_return_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel instructions_content_layout;
    private javax.swing.JLabel instructions_title_label;
    private javax.swing.JButton return_button;
    private javax.swing.JLabel tip_1_label;
    private javax.swing.JLabel tip_1_label1;
    private javax.swing.JLabel tip_2_label;
    // End of variables declaration//GEN-END:variables
}
