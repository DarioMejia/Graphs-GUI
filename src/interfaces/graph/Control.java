package interfaces.graph;

import interfaces.Main;
import java.awt.*;
import javax.swing.*;

/* Control class to manage the buttons of the graph interface
 */
public class Control extends javax.swing.JFrame {

    /* Initializating variables
     */
    private static final Color BLUE = new Color(5, 34, 137);

    /* Constructor
     */
    public Control() {
        initComponents();
        // Set logo for the jFrame window   
        setIconImage(new ImageIcon(getClass().getResource("/images/Logo.png")).getImage());
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        general_panel = new javax.swing.JPanel();
        bfs_button = new javax.swing.JButton();
        add_edge_button = new javax.swing.JButton();
        add_node_button = new javax.swing.JButton();
        delete_node_button = new javax.swing.JButton();
        shortest_path_button = new javax.swing.JButton();
        terminal_scrollpane = new javax.swing.JScrollPane();
        output_textarea = new javax.swing.JTextArea();
        control_logo_label = new javax.swing.JLabel();
        instructions_label = new javax.swing.JLabel();
        return_button = new javax.swing.JButton();
        draw_panel = new interfaces.graph.DrawPanel();
        dfs_button = new javax.swing.JButton();
        mst_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        general_panel.setBackground(new java.awt.Color(214, 254, 254));

        bfs_button.setBackground(new java.awt.Color(5, 34, 137));
        bfs_button.setFont(new java.awt.Font("Sylfaen", 0, 16)); // NOI18N
        bfs_button.setForeground(new java.awt.Color(255, 255, 255));
        bfs_button.setText("BFS");
        bfs_button.setBorder(new javax.swing.border.MatteBorder(null));
        bfs_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bfs_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bfs_buttonActionPerformed(evt);
            }
        });

        add_edge_button.setBackground(new java.awt.Color(5, 34, 137));
        add_edge_button.setFont(new java.awt.Font("Sylfaen", 0, 16)); // NOI18N
        add_edge_button.setForeground(new java.awt.Color(255, 255, 255));
        add_edge_button.setText("Add Wire");
        add_edge_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        add_edge_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_edge_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_edge_buttonActionPerformed(evt);
            }
        });

        add_node_button.setBackground(new java.awt.Color(5, 34, 137));
        add_node_button.setFont(new java.awt.Font("Sylfaen", 0, 16)); // NOI18N
        add_node_button.setForeground(new java.awt.Color(255, 255, 255));
        add_node_button.setText("Add Tower");
        add_node_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        add_node_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_node_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_node_buttonActionPerformed(evt);
            }
        });

        delete_node_button.setBackground(new java.awt.Color(5, 34, 137));
        delete_node_button.setFont(new java.awt.Font("Sylfaen", 0, 16)); // NOI18N
        delete_node_button.setForeground(new java.awt.Color(255, 255, 255));
        delete_node_button.setText("Delete Tower");
        delete_node_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        delete_node_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete_node_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_node_buttonActionPerformed(evt);
            }
        });

        shortest_path_button.setBackground(new java.awt.Color(5, 34, 137));
        shortest_path_button.setFont(new java.awt.Font("Sylfaen", 0, 16)); // NOI18N
        shortest_path_button.setForeground(new java.awt.Color(255, 255, 255));
        shortest_path_button.setText("Shortest Path");
        shortest_path_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        shortest_path_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        shortest_path_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shortest_path_buttonActionPerformed(evt);
            }
        });

        output_textarea.setEditable(false);
        output_textarea.setColumns(20);
        output_textarea.setLineWrap(true);
        output_textarea.setRows(5);
        output_textarea.setWrapStyleWord(true);
        terminal_scrollpane.setViewportView(output_textarea);

        control_logo_label.setBackground(new java.awt.Color(0, 51, 255));
        control_logo_label.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        control_logo_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        control_logo_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ControlPanel.png"))); // NOI18N
        control_logo_label.setText("Control Panel");
        control_logo_label.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        control_logo_label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        control_logo_label.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        instructions_label.setFont(new java.awt.Font("Sylfaen", 2, 14)); // NOI18N
        instructions_label.setText("Continue using the buttons!");

        return_button.setBackground(new java.awt.Color(4, 30, 130));
        return_button.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        return_button.setForeground(new java.awt.Color(255, 255, 255));
        return_button.setText("Return");
        return_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        return_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        return_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                return_buttonActionPerformed(evt);
            }
        });

        draw_panel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                draw_panelMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                draw_panelMouseMoved(evt);
            }
        });
        draw_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                draw_panelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                draw_panelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                draw_panelMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout draw_panelLayout = new javax.swing.GroupLayout(draw_panel);
        draw_panel.setLayout(draw_panelLayout);
        draw_panelLayout.setHorizontalGroup(
            draw_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 954, Short.MAX_VALUE)
        );
        draw_panelLayout.setVerticalGroup(
            draw_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        dfs_button.setBackground(new java.awt.Color(5, 34, 137));
        dfs_button.setFont(new java.awt.Font("Sylfaen", 0, 16)); // NOI18N
        dfs_button.setForeground(new java.awt.Color(255, 255, 255));
        dfs_button.setText("DFS");
        dfs_button.setBorder(new javax.swing.border.MatteBorder(null));
        dfs_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dfs_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dfs_buttonActionPerformed(evt);
            }
        });

        mst_button.setBackground(new java.awt.Color(5, 34, 137));
        mst_button.setFont(new java.awt.Font("Sylfaen", 0, 16)); // NOI18N
        mst_button.setForeground(new java.awt.Color(255, 255, 255));
        mst_button.setText("MST");
        mst_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        mst_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mst_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mst_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout general_panelLayout = new javax.swing.GroupLayout(general_panel);
        general_panel.setLayout(general_panelLayout);
        general_panelLayout.setHorizontalGroup(
            general_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(general_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(return_button, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(general_panelLayout.createSequentialGroup()
                .addGroup(general_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(general_panelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(general_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(general_panelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(control_logo_label)
                                .addGap(146, 146, 146))
                            .addGroup(general_panelLayout.createSequentialGroup()
                                .addComponent(instructions_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, general_panelLayout.createSequentialGroup()
                                .addGroup(general_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(general_panelLayout.createSequentialGroup()
                                        .addComponent(shortest_path_button, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(mst_button, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(terminal_scrollpane, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(general_panelLayout.createSequentialGroup()
                                        .addComponent(bfs_button, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                        .addComponent(dfs_button, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(general_panelLayout.createSequentialGroup()
                                        .addComponent(add_node_button, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(add_edge_button, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18))))
                    .addGroup(general_panelLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(delete_node_button, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(draw_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        general_panelLayout.setVerticalGroup(
            general_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(general_panelLayout.createSequentialGroup()
                .addGroup(general_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, general_panelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(control_logo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(instructions_label)
                        .addGap(31, 31, 31)
                        .addGroup(general_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add_node_button, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add_edge_button, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(delete_node_button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(general_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dfs_button, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bfs_button, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(general_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(shortest_path_button, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mst_button, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(terminal_scrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(return_button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(general_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(draw_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(general_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(general_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bfs_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bfs_buttonActionPerformed
        // Void to manage BFS button
        draw_panel.inputMode = draw_panel.inputMode == InputMode.BFS ? InputMode.NONE : InputMode.BFS;
        add_node_button.setBackground(BLUE);
        add_edge_button.setBackground(BLUE);
        delete_node_button.setBackground(BLUE);
        dfs_button.setBackground(BLUE);
        shortest_path_button.setBackground(BLUE);
        mst_button.setBackground(BLUE);
        if (draw_panel.inputMode == InputMode.BFS) {
            instructions_label.setText("Click on the initial Tower.");
            bfs_button.setBackground(Color.red);
        } else {
            bfs_button.setBackground(BLUE);
            instructions_label.setText("Continue by using the buttons!");
        }
    }//GEN-LAST:event_bfs_buttonActionPerformed

    private void add_edge_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_edge_buttonActionPerformed
        // Void to manage Add Wire button
        draw_panel.inputMode = draw_panel.inputMode == InputMode.ADD_EDGE ? InputMode.NONE : InputMode.ADD_EDGE;
        add_node_button.setBackground(BLUE);
        delete_node_button.setBackground(BLUE);
        bfs_button.setBackground(BLUE);
        dfs_button.setBackground(BLUE);
        shortest_path_button.setBackground(BLUE);
        mst_button.setBackground(BLUE);
        if (draw_panel.inputMode == InputMode.ADD_EDGE) {
            instructions_label.setText("Click on the towers to add a wire.");
            add_edge_button.setBackground(Color.red);
        } else {
            add_edge_button.setBackground(BLUE);
            instructions_label.setText("Continue by using the buttons!");

        }

        if (draw_panel.nodeClicked != null) {
            draw_panel.nodeClicked = null;
            draw_panel.longHighlightNode = null;
            draw_panel.longHighlight = false;
        }
    }//GEN-LAST:event_add_edge_buttonActionPerformed

    private void add_node_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_node_buttonActionPerformed
        // Void to manage Add Tower button
        draw_panel.inputMode = draw_panel.inputMode == InputMode.ADD_NODE ? InputMode.NONE : InputMode.ADD_NODE;
        add_edge_button.setBackground(BLUE);
        delete_node_button.setBackground(BLUE);
        bfs_button.setBackground(BLUE);
        dfs_button.setBackground(BLUE);
        shortest_path_button.setBackground(BLUE);
        mst_button.setBackground(BLUE);
        if (draw_panel.inputMode == InputMode.ADD_NODE) {
            instructions_label.setText("Click on the map to add a tower. Also, try to move'em!");
            add_node_button.setBackground(Color.red);
        } else {
            add_node_button.setBackground(BLUE);
            instructions_label.setText("Continue by using the buttons!");
        }

        if (draw_panel.nodeClicked != null) {
            draw_panel.nodeClicked = null;
            draw_panel.longHighlightNode = null;
            draw_panel.longHighlight = false;
        }
    }//GEN-LAST:event_add_node_buttonActionPerformed

    private void delete_node_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_node_buttonActionPerformed
        // Void to manage Delete Tower button
        draw_panel.inputMode = draw_panel.inputMode == InputMode.DEL_NODE ? InputMode.NONE : InputMode.DEL_NODE;
        add_node_button.setBackground(BLUE);
        add_edge_button.setBackground(BLUE);
        bfs_button.setBackground(BLUE);
        dfs_button.setBackground(BLUE);
        shortest_path_button.setBackground(BLUE);
        mst_button.setBackground(BLUE);
        if (draw_panel.inputMode == InputMode.DEL_NODE) {
            instructions_label.setText("Click on a tower to remove it.");
            delete_node_button.setBackground(Color.red);
        } else {
            delete_node_button.setBackground(BLUE);
            instructions_label.setText("Continue by using the buttons!");
        }

        if (draw_panel.nodeClicked != null) {
            draw_panel.nodeClicked = null;
            draw_panel.longHighlightNode = null;
            draw_panel.longHighlight = false;
        }
    }//GEN-LAST:event_delete_node_buttonActionPerformed

    private void shortest_path_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shortest_path_buttonActionPerformed
        // Void to manage Shortest Path button
        draw_panel.inputMode = draw_panel.inputMode == InputMode.SHORT_PATH ? InputMode.NONE : InputMode.SHORT_PATH;
        add_node_button.setBackground(BLUE);
        add_edge_button.setBackground(BLUE);
        delete_node_button.setBackground(BLUE);
        bfs_button.setBackground(BLUE);
        dfs_button.setBackground(BLUE);
        mst_button.setBackground(BLUE);
        if (draw_panel.inputMode == InputMode.SHORT_PATH) {
            instructions_label.setText("Click on the towers to find the minimum cost.");
            shortest_path_button.setBackground(Color.red);
        } else {
            shortest_path_button.setBackground(BLUE);
            instructions_label.setText("Continue by using the buttons!");
        }
    }//GEN-LAST:event_shortest_path_buttonActionPerformed

    private void return_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_return_buttonActionPerformed
        // Close graphs and go back to main interface
        Main main = new Main();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_return_buttonActionPerformed

    private void draw_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_draw_panelMouseClicked

    }//GEN-LAST:event_draw_panelMouseClicked

    private void draw_panelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_draw_panelMousePressed

    }//GEN-LAST:event_draw_panelMousePressed

    private void draw_panelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_draw_panelMouseReleased

    }//GEN-LAST:event_draw_panelMouseReleased

    private void draw_panelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_draw_panelMouseDragged

    }//GEN-LAST:event_draw_panelMouseDragged

    private void draw_panelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_draw_panelMouseMoved

    }//GEN-LAST:event_draw_panelMouseMoved

    private void dfs_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dfs_buttonActionPerformed
        // Void to manage BFS button
        draw_panel.inputMode = draw_panel.inputMode == InputMode.DFS ? InputMode.NONE : InputMode.DFS;
        add_node_button.setBackground(BLUE);
        add_edge_button.setBackground(BLUE);
        delete_node_button.setBackground(BLUE);
        bfs_button.setBackground(BLUE);
        shortest_path_button.setBackground(BLUE);
        mst_button.setBackground(BLUE);
        if (draw_panel.inputMode == InputMode.DFS) {
            instructions_label.setText("Click on the initial Tower.");
            dfs_button.setBackground(Color.red);
        } else {
            dfs_button.setBackground(BLUE);
            instructions_label.setText("Continue by using the buttons!");
        }
    }//GEN-LAST:event_dfs_buttonActionPerformed

    private void mst_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mst_buttonActionPerformed
        // Void to manage MST button
        draw_panel.inputMode = draw_panel.inputMode == InputMode.MST ? InputMode.NONE : InputMode.MST;
        add_node_button.setBackground(BLUE);
        add_edge_button.setBackground(BLUE);
        delete_node_button.setBackground(BLUE);
        bfs_button.setBackground(BLUE);
        dfs_button.setBackground(BLUE);
        shortest_path_button.setBackground(BLUE);
        if (draw_panel.inputMode == InputMode.MST) {
            instructions_label.setText("Click on the main tower.");
            mst_button.setBackground(Color.red);
        } else {
            mst_button.setBackground(BLUE);
            instructions_label.setText("Continue by using the buttons!");
        }
    }//GEN-LAST:event_mst_buttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_edge_button;
    private javax.swing.JButton add_node_button;
    private javax.swing.JButton bfs_button;
    private javax.swing.JLabel control_logo_label;
    private javax.swing.JButton delete_node_button;
    private javax.swing.JButton dfs_button;
    public static interfaces.graph.DrawPanel draw_panel;
    private javax.swing.JPanel general_panel;
    private javax.swing.JLabel instructions_label;
    private javax.swing.JButton mst_button;
    public static javax.swing.JTextArea output_textarea;
    private javax.swing.JButton return_button;
    private javax.swing.JButton shortest_path_button;
    private javax.swing.JScrollPane terminal_scrollpane;
    // End of variables declaration//GEN-END:variables
}
