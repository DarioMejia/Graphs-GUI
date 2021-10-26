package logic;

import java.util.ArrayList;

/*  Class for graph nodes
 */
public class Node<V> {

    /* Data of the node
     */
    private V data;

    /* List of the node's edges
     */
    private final ArrayList<Edge> edgeList;

    /* Constructor
     */
    Node(V data) {
        this.data = data;
        this.edgeList = new ArrayList<>();
    }

    /* Returns data
     */
    public V getData() {
        return this.data;
    }

    /* Sets data
     */
    public void setData(V data) {
        this.data = data;
    }

    /* Returns edge list
     */
    public ArrayList<Edge> getEdgeList() {
        return this.edgeList;
    }

    /*  Returns list of all this node's neighbors
     */
    public ArrayList<Node<V>> getNeighbors() {
        ArrayList<Node<V>> neighbors = new ArrayList<>();
        // Go through edge list and get the node on the other side of each edge
        for (Edge e : edgeList) {
            if ((e.getHead().equals(this)) && (!neighbors.contains(e.getTail()))) {
                neighbors.add(e.getTail());
            } else if ((e.getTail().equals(this)) && (!neighbors.contains(e.getHead()))) {
                neighbors.add(e.getHead());
            }
        }
        return neighbors;
    }

    /* Adds an edge to the edge list
     */
    public void addEdge(Edge edge) {
        this.edgeList.add(edge);
    }

    /* Removes an edge from the edge list
     */
    public void removeEdge(Edge edge) {
        this.edgeList.remove(edge);
    }

    /* Returns true if the given node is this node's neighbor
     */
    public boolean isNeighbor(Node<V> node) {
        boolean isneighbor = false;
        for (Edge edge : this.edgeList) {
            if ((edge.getHead().equals(node)) || (edge.getTail().equals(node))) {
                isneighbor = true;
            }
        }
        return isneighbor;
    }

    /* Returns the edge from this node to the given one, or null if none
     */
    public Edge edgeTo(Node<V> node) {
        Edge e = null;
        for (Edge edge : this.edgeList) {
            if ((edge.getHead().equals(node)) || (edge.getTail().equals(node))) {
                e = edge;
            }
        }
        return e;
    }
}
