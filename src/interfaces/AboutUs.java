package interfaces;

/* About class to manage about view
*/
public class AboutUs extends javax.swing.JPanel {

    private MainActions mainActions;

    public AboutUs(MainActions menuActions) {
        initComponents();

        this.mainActions = menuActions;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        about_content_layout = new javax.swing.JPanel();
        dev = new javax.swing.JLabel();
        dev_title = new javax.swing.JLabel();
        return_button = new javax.swing.JButton();
        slogan_pane = new javax.swing.JScrollPane();
        slogan = new javax.swing.JTextArea();

        about_content_layout.setBackground(new java.awt.Color(204, 255, 255));
        about_content_layout.setPreferredSize(new java.awt.Dimension(700, 338));

        dev.setBackground(new java.awt.Color(255, 255, 255));
        dev.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        dev.setText("Dario Mejía");

        dev_title.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        dev_title.setText("Developed by");

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

        slogan.setEditable(false);
        slogan.setBackground(new java.awt.Color(204, 255, 255));
        slogan.setColumns(20);
        slogan.setFont(new java.awt.Font("Sylfaen", 2, 18)); // NOI18N
        slogan.setLineWrap(true);
        slogan.setRows(2);
        slogan.setText("We build efficient internet networks, we build connections, we build the future.");
        slogan.setWrapStyleWord(true);
        slogan.setBorder(null);
        slogan.setFocusable(false);
        slogan.setHighlighter(null);
        slogan_pane.setViewportView(slogan);

        javax.swing.GroupLayout about_content_layoutLayout = new javax.swing.GroupLayout(about_content_layout);
        about_content_layout.setLayout(about_content_layoutLayout);
        about_content_layoutLayout.setHorizontalGroup(
            about_content_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(about_content_layoutLayout.createSequentialGroup()
                .addGroup(about_content_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(about_content_layoutLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(return_button, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(about_content_layoutLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(dev_title))
                    .addGroup(about_content_layoutLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(dev))
                    .addGroup(about_content_layoutLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(slogan_pane, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        about_content_layoutLayout.setVerticalGroup(
            about_content_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, about_content_layoutLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(slogan_pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(dev_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dev)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(return_button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(about_content_layout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 338, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(about_content_layout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void return_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return_buttonActionPerformed
        mainActions.setStartView();
    }//GEN-LAST:event_return_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel about_content_layout;
    private javax.swing.JLabel dev;
    private javax.swing.JLabel dev_title;
    private javax.swing.JButton return_button;
    private javax.swing.JTextArea slogan;
    private javax.swing.JScrollPane slogan_pane;
    // End of variables declaration//GEN-END:variables
}
