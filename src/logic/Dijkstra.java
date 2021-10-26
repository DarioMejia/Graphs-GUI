package logic;

import java.util.*;

/* Class to hold Dijkstra shortest path information
 */
public class Dijkstra<V, E> {

    /* HashtMap of nodes to costs
     */
    private final HashMap<Node<V>, Double> cost;

    /* HashMap of nodes ajdcacencies
     */
    private final HashMap<Node<V>, Node<V>> adjacency;

    /* Constructor
     */
    Dijkstra(HashMap<Node<V>, Double> cost, HashMap<Node<V>, Node<V>> adjacency) {
        this.cost = cost;
        this.adjacency = adjacency;
    }

    /* Returns cost HashMap
     */
    public HashMap<Node<V>, Double> getCosts() {
        return this.cost;
    }

    /* Returns adjacency HashMap
     */
    public HashMap<Node<V>, Node<V>> getAdjacency() {
        return this.adjacency;
    }

    /* Wrapper for order method, for easier access
     */
    public ArrayList<Node<V>> order(Node<V> node) {
        ArrayList<Node<V>> orderedNodes = new ArrayList<>();
        ArrayList<Node<V>> nodes = Dijkstra.this.order(node, orderedNodes);
        return nodes;
    }

    /* Recursive method to put nodes in order
     */
    public ArrayList<Node<V>> order(Node<V> node, ArrayList<Node<V>> orderedNodes) {
        // Stop condition: when node cost == 0 (because that's the end node)
        if (!adjacency.get(node).equals(node)) {
            orderedNodes.add(node);
            Dijkstra.this.order(adjacency.get(node), orderedNodes);
        } else {
            orderedNodes.add(node);
        }
        return orderedNodes;
    }
}
