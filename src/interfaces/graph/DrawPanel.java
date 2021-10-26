package interfaces.graph;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import logic.*;

/* Class DrawPanel to manage all the graph drawing processes
 */
public class DrawPanel extends javax.swing.JPanel {

    /*  The graph to be drawn on this canvas
     */
    Graph<DrawNode<String>, Double> graph;

    /* The input mode for switching modes
     */
    InputMode inputMode = InputMode.NONE;

    /* Remembers node where last mousedown event occurred
     */
    Node<DrawNode<String>> nodeUnderMouse;

    /* Remembers node where last mouse click occurred
     */
    Node<DrawNode<String>> nodeClicked;

    /* Coordinates of mouse for line animation
     */
    Point mousePoint;

    /* Node to be used for line animation
     */
    Node<DrawNode<String>> startNode;

    /* Boolean field to determine if animated line should be drawn
     */
    boolean drawLine;

    /* Boolean field to determine if point should be highlighted
     */
    boolean highlight;

    /* Boolean field to determine if point should be semi-permanently
     * highlighted
     */
    boolean longHighlight;

    /* Node to be highlighted
     */
    Node<DrawNode<String>> highlightNode;

    /* Node to be semi-permanently highlighted
     */
    Node<DrawNode<String>> longHighlightNode;

    /* Dijkstra nodes to be highlighted
     */
    HashSet<Node<DrawNode<String>>> dijkstraNodes;

    /* Dijkstra edges to be highlighted
     */
    HashSet<Edge<Double>> dijkstraEdges;

    /*  Boolean to determine whether to highlight Dijkstra path
     */
    boolean highlightPath;

    /* Constructor
     */
    public DrawPanel() {
        initComponents();
        graph = new Graph<>();
        mousePoint = null;
        startNode = null;
        drawLine = false;
        highlight = false;
        longHighlight = false;
        highlightNode = null;
        longHighlightNode = null;
        dijkstraNodes = new HashSet<>();
        dijkstraEdges = new HashSet<>();
    }

    /* Returns a node found within the drawing radius of the given location,
       or null if none
     */
    private Node<DrawNode<String>> findNearbyNode(int x, int y) {
        Node<DrawNode<String>> nearby = null;
        for (int i = 0; i < graph.numNodes(); i++) {
            Node<DrawNode<String>> n = graph.getNode(i);
            if (n.getData().getPoint().distance(x, y) < 20) {
                nearby = n;
            }
        }
        return nearby;
    }

    /* Paints a red circle 40 pixels in diameter at each node, with a smaller one for the label. Paints a line
       between points for each edge, with a small black circle for edges data (distance)
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(new ImageIcon(getClass().getResource("/images/Map.jpg")).getImage(), 0, 0, null);
        // Draw the nodes and node data
        for (int i = 0; i < graph.numNodes(); i++) {
            Node<DrawNode<String>> node = graph.getNode(i);
            DrawNode<String> dispData = (DrawNode<String>) node.getData();
            int x = (int) dispData.getPoint().getX() - 20;
            int y = (int) dispData.getPoint().getY() - 20;
            //Default black border
            g2.fillOval((x - 2), (y - 2), 44, 44);
            g2.fillOval(x - 8, y - 16, 24, 24);
            // Highlight node if necessary
            if ((highlight) && (highlightNode.equals(node))) {
                g2.setColor(Color.BLUE);
                g2.fillOval((x - 2), (y - 2), 44, 44);
                g2.fillOval(x - 8, y - 16, 24, 24);
            }
            // Semi permanently highlight node if necessary
            if ((longHighlight) && (longHighlightNode.equals(node))) {
                g2.setColor(Color.BLUE);
                g2.fillOval((x - 2), (y - 2), 44, 44);
                g2.fillOval(x - 8, y - 16, 24, 24);
            }
            if ((highlightPath) && (dijkstraNodes.contains(node))) {
                g2.setColor(Color.BLUE);
                g2.fillOval((x - 2), (y - 2), 44, 44);
                g2.fillOval(x - 8, y - 16, 24, 24);
                g2.setColor(Color.CYAN);
            } else {
                g2.setColor(Color.RED);
            }
            g2.fillOval(x, y, 40, 40);

            // Draw node's data(label)
            g2.setFont(new Font("Sylfaen", Font.BOLD, 14));
            g2.setColor(Color.WHITE);
            g2.fillOval(x - 6, y - 14, 20, 20);
            g2.setColor(Color.BLACK);
            g2.drawString(node.getData().getData(), x, y);
        }
        // Draw the edges
        for (int i = 0; i < graph.numEdges(); i++) {
            Edge<Double> edge = graph.getEdge(i);
            DrawNode<String> headData = (DrawNode<String>) edge.getHead().getData();
            DrawNode<String> tailData = (DrawNode<String>) edge.getTail().getData();
            int x1 = (int) headData.getPoint().getX();
            int y1 = (int) headData.getPoint().getY();
            int x2 = (int) tailData.getPoint().getX();
            int y2 = (int) tailData.getPoint().getY();
            // Condition for to color of the edges and edges's circles
            if ((highlightPath) && (dijkstraEdges.contains(edge))) {
                g2.setColor(Color.BLUE);
            } else {
                g2.setColor(Color.BLACK);
            }
            g2.setFont(new Font("Sylfaen", Font.PLAIN, 10));
            g2.setStroke(new BasicStroke(2));
            g2.drawLine(x1, y1, x2, y2);
            // Draw edge's data(distance) circles
            g2.fillOval(((x1 + x2) / 2) - 15, ((y1 + y2) / 2) - 15, 25, 25);
            // Draw edge's data(distance)
            g2.setColor(Color.WHITE);
            g2.drawString(edge.getData().toString(), ((x1 + x2) / 2) - 10, ((y1 + y2) / 2));
        }
        // Draw line if drawLine is true
        if (drawLine) {
            g2.setColor(Color.BLACK);
            g2.setStroke(new BasicStroke(2));
            int x = (int) startNode.getData().getPoint().getX();
            int y = (int) startNode.getData().getPoint().getY();
            g2.drawLine(x, y, (int) mousePoint.getX(), (int) mousePoint.getY());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 452, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // Void to manage all clicks, switching the input mode
        switch (inputMode) {
            case NONE:
                // Emit a beep
                Toolkit.getDefaultToolkit().beep();
                break;
            case ADD_NODE:
                if (findNearbyNode(evt.getX(), evt.getY()) == null) {
                    Point p = new Point(evt.getX(), evt.getY());
                    // Pop up dialog box to name node
                    try {
                        String s = (String) JOptionPane.showInputDialog(this, "Please label this Tower:", "LABEL", JOptionPane.PLAIN_MESSAGE);
                        // Add new node with the input data
                        while (s != null && s.matches("") || s.charAt(0) == ' ') {
                            JOptionPane.showMessageDialog(this, "The label is empty.", "Dialog", JOptionPane.ERROR_MESSAGE);
                            s = (String) JOptionPane.showInputDialog(this, "Please label this Tower:", "LABEL", JOptionPane.PLAIN_MESSAGE);
                        }
                        graph.addNode(new DrawNode<>(s, p));

                    } catch (NullPointerException e) {
                    }
                } else {
                    // Otherwise, emit a beep
                    Toolkit.getDefaultToolkit().beep();
                }
                break;
            case DEL_NODE:
                if (findNearbyNode(evt.getX(), evt.getY()) != null) {
                    // Remove from canvas
                    graph.deleteNode(findNearbyNode(evt.getX(), evt.getY()));
                } else {
                    // Otherwise, emit a beep
                    Toolkit.getDefaultToolkit().beep();
                }
                break;
            case ADD_EDGE:
                // If no node is clicked
                Toolkit.getDefaultToolkit().beep();
                break;
            case BFS:
                // If there's a node nearby, record it and highlight it
                if ((findNearbyNode(evt.getX(), evt.getY()) != null) && (nodeClicked == null)) {
                    nodeClicked = findNearbyNode(evt.getX(), evt.getY());
                    longHighlightNode = nodeClicked;
                    longHighlight = true;
                    // Method in Graph returns HashSet with the BFS nodes
                    ArrayList<Node<DrawNode<String>>> bfs = graph.BFS(nodeClicked);
                    // Write down the nodes data to the output_textarea
                    // ArrayList to store the node's data of the traversal
                    ArrayList<String> bfsData = new ArrayList<>();
                    for (int i = 0; i < bfs.size(); i++) {
                        bfsData.add(bfs.get(i).getData().getData());
                    }
                    // Write down the node's data to the output_textarea
                    Control.output_textarea.append("BFS from " + nodeClicked.getData().getData() + " is: " + bfsData + "\n");

                    JOptionPane.showMessageDialog(this, "Done. See results in the output textarea. ", "BFS", JOptionPane.PLAIN_MESSAGE);

                    // Reset all path-highlighting related variables
                    nodeClicked = null;
                    longHighlightNode = null;
                    longHighlight = false;
                    highlightPath = false;
                }
                break;
            case DFS:
                // If there's a node nearby, record it and highlight it
                if ((findNearbyNode(evt.getX(), evt.getY()) != null)) {
                    nodeClicked = findNearbyNode(evt.getX(), evt.getY());
                    longHighlightNode = nodeClicked;
                    longHighlight = true;
                    // Method in Graph returns arrayList with the DFS nodes
                    ArrayList<Node<DrawNode<String>>> dfs = graph.DFS(nodeClicked);
                    // ArrayList to store the node's data of the traversal
                    ArrayList<String> dfsData = new ArrayList<>();
                    for (int i = 0; i < dfs.size(); i++) {
                        dfsData.add(dfs.get(i).getData().getData());
                    }
                    // Write down the node's data to the output_textarea
                    Control.output_textarea.append("DFS from " + nodeClicked.getData().getData() + " is: " + dfsData + "\n");

                    JOptionPane.showMessageDialog(this, "Done. See results in the output textarea. ", "DFS", JOptionPane.PLAIN_MESSAGE);

                    // Reset all path-highlighting related variables
                    nodeClicked = null;
                    longHighlightNode = null;
                    longHighlight = false;
                    highlightPath = false;
                }
                break;
            case MST:
                // If there's a node nearby, record it and highlight it
                if ((findNearbyNode(evt.getX(), evt.getY()) != null)) {
                    nodeClicked = findNearbyNode(evt.getX(), evt.getY());
                    longHighlightNode = nodeClicked;
                    longHighlight = true;
                    // Djkstra shortest path
                    Dijkstra<DrawNode<String>, Double> distInfo = graph.shortestPath(findNearbyNode(evt.getX(), evt.getY()));

                    // Loop for to highlight a path
                    for (int i = 0; i < graph.numNodes(); i++) {
                        Node<DrawNode<String>> curr = graph.getNode(i);
                        // Recursive method in Dijkstra returns ordered nodes list
                        ArrayList<Node<DrawNode<String>>> orderedNodes = distInfo.order(curr);

                        // Loop over ordered array and add each node and edge to canvas
                        for (int j = 0; j < orderedNodes.size(); j++) {
                            dijkstraNodes.add(orderedNodes.get(j));
                            if (j < orderedNodes.size() - 1) {
                                dijkstraEdges.add(orderedNodes.get(j).edgeTo(orderedNodes.get(j + 1)));
                            }
                        }
                        highlightPath = true;
                    }
                    JOptionPane.showMessageDialog(this, "Done. The Minimun Spanning Tree is highlited. ", "DIRECTIONS", JOptionPane.PLAIN_MESSAGE);
                    // Reset all path-highlighting related variables
                    nodeClicked = null;
                    longHighlightNode = null;
                    longHighlight = false;
                    highlightPath = false;
                    dijkstraNodes.clear();
                    dijkstraEdges.clear();
                }
                break;
            case SHORT_PATH:
                // If there's a node nearby and no node recorded, record it and highlight it
                if ((findNearbyNode(evt.getX(), evt.getY()) != null) && (nodeClicked == null)) {
                    nodeClicked = findNearbyNode(evt.getX(), evt.getY());
                    longHighlightNode = nodeClicked;
                    longHighlight = true;

                } // If there's a node nearby and a node recorded, find shortest path between recorded node and current node
                else if ((findNearbyNode(evt.getX(), evt.getY()) != null) && (nodeClicked != null)) {
                    // Djkstra shortest path
                    Dijkstra<DrawNode<String>, Double> distInfo = graph.shortestPath(findNearbyNode(evt.getX(), evt.getY()));
                    // Recursive method in Dijkstra returns ordered nodes list
                    ArrayList<Node<DrawNode<String>>> orderedNodes = distInfo.order(nodeClicked);

                    // Make new string array
                    ArrayList<String> nodeNames = new ArrayList<>();

                    // Loop over ordered array and add each node and edge to canvas
                    for (int i = 0; i < orderedNodes.size(); i++) {
                        dijkstraNodes.add(orderedNodes.get(i));
                        nodeNames.add(orderedNodes.get(i).getData().getData());
                        if (i < orderedNodes.size() - 1) {
                            dijkstraEdges.add(orderedNodes.get(i).edgeTo(orderedNodes.get(i + 1)));
                        }
                    }
                    highlightPath = true;

                    // Build directions message
                    String directions = "Travel from " + nodeClicked.getData().getData();
                    for (int i = 1; i < nodeNames.size(); i++) {
                        String nodeName = nodeNames.get(i);
                        directions = directions + " to " + nodeName;
                    }

                    // Pop up box to tell you the shortest distance and directions
                    Double dist = distInfo.getCosts().get(nodeClicked);
                    if (dist == Double.MAX_VALUE) {
                        Control.output_textarea.append("Theere is no shortest distance between these points.");
                    } else {
                        Control.output_textarea.append("The shortest distance between these points is " + dist + " \n" + directions + "\n");
                    }
                    JOptionPane.showMessageDialog(this, "Done. See results in the output textarea. ", "DIRECTIONS", JOptionPane.PLAIN_MESSAGE);

                    // Reset all path-highlighting related variables
                    nodeClicked = null;
                    longHighlightNode = null;
                    longHighlight = false;
                    highlightPath = false;
                    dijkstraNodes.clear();
                    dijkstraEdges.clear();
                }
                break;
        }
        repaint();
    }//GEN-LAST:event_formMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // Record node under mouse, if any
        nodeUnderMouse = findNearbyNode(evt.getX(), evt.getY());
    }//GEN-LAST:event_formMousePressed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        // Manage mouse releases for checking Add Node and Add Edge buttons
        switch (inputMode) {
            case ADD_NODE:
                // Clear record of node under mouse, if any
                if (nodeUnderMouse != null) {
                    nodeUnderMouse = null;
                }
                break;
            case ADD_EDGE:
                // If canvas is currently drawing a line, stop drawing that line
                if (drawLine == true) {
                    drawLine = false;
                }
                // If node under mouse and node at release point, add edge
                if ((nodeUnderMouse != null) && (findNearbyNode(evt.getX(), evt.getY()) != null) && (!nodeUnderMouse.equals(findNearbyNode(evt.getX(), evt.getY())) && (!nodeUnderMouse.isNeighbor(findNearbyNode(evt.getX(), evt.getY()))))) {
                    // Pop up dialog box to name node
                    try {
                        Double d = Double.parseDouble(JOptionPane.showInputDialog(this, "Please set cost for this Wire:", "COST", JOptionPane.PLAIN_MESSAGE));
                        while (d <= 0 || d > 9999) {
                            if (d > 9999) {
                                JOptionPane.showMessageDialog(this, "Try a lower number.", "Dialog", JOptionPane.ERROR_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(this, "The cost must be a positive number.", "Dialog", JOptionPane.ERROR_MESSAGE);
                            }
                            d = Double.parseDouble(JOptionPane.showInputDialog(this, "Please set cost for this Wire:", "COST", JOptionPane.PLAIN_MESSAGE));
                        }
                        graph.addEdge(d, nodeUnderMouse, findNearbyNode(evt.getX(), evt.getY()));
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this, "The cost must be a number.", "Error", JOptionPane.ERROR_MESSAGE);
                        Toolkit.getDefaultToolkit().beep();
                    } catch (NullPointerException e) {
                    }
                }
        }
        repaint();
    }//GEN-LAST:event_formMouseReleased

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // Manage mouse dragged, for moving the nodes and adding edges
        switch (inputMode) {
            case ADD_NODE:
                // if there is a node under the mouse, change coordinates to current mouse coordinates and update display
                if (nodeUnderMouse != null) {
                    nodeUnderMouse.getData().setPoint(new Point(evt.getX(), evt.getY()));
                }
                break;
            case ADD_EDGE:
                // if there is a node under the mouse, create a line from the node to the mouse
                if (nodeUnderMouse != null) {
                    startNode = nodeUnderMouse;
                    mousePoint = new Point(evt.getX(), evt.getY());
                    drawLine = true;
                }
        }
        repaint();
    }//GEN-LAST:event_formMouseDragged

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // if there is a nearby node, highlight it
        if (findNearbyNode(evt.getX(), evt.getY()) != null) {
            highlightNode = findNearbyNode(evt.getX(), evt.getY());
            highlight = true;
        } else if ((findNearbyNode(evt.getX(), evt.getY()) == null) && (highlight == true)) {
            highlight = false;
        }
        repaint();
    }//GEN-LAST:event_formMouseMoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
