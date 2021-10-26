package logic;

import java.util.*;

/* Class Graph to manage logical processes with the graph
 */
public class Graph<V, E> {

    /* ArrayList of edges
     */
    private final ArrayList<Edge<E>> edges;

    /*  ArrayList of nodes
     */
    private final ArrayList<Node<V>> nodes;

    /* Constructor
     */
    public Graph() {
        this.edges = new ArrayList<>();
        this.nodes = new ArrayList<>();
    }

    /* Returns the edge at the given index
     */
    public Edge getEdge(int i) {
        return this.edges.get(i);
    }

    /* Returns the node at the given index
     */
    public Node getNode(int i) {
        return this.nodes.get(i);
    }

    /* Returns index of a node in the principal node list
     */
    public int getNodeIndex(Node node) {
        return this.nodes.indexOf(node);
    }

    /* Returns an edge specified by its node endpoints
     */
    public Edge getEdge(Node head, Node tail) {
        Edge foundEdge = null;
        Edge refEdge = new Edge(null, head, tail);
        if (this.edges.contains(refEdge)) {
            int index = this.edges.indexOf(refEdge);
            foundEdge = this.edges.get(index);
        }
        return foundEdge;
    }

    /*  Returns number of edges in edge list
     */
    public int numEdges() {
        return edges.size();
    }

    /* Returns number of nodes in principal node list
     */
    public int numNodes() {
        return nodes.size();
    }

    /* Adds an edge with given data, head, and tail
     */
    public void addEdge(E data, Node head, Node tail) {
        // Only add edge if the head and tail aren't the same
        // and aren't already connected
        if ((!head.equals(tail)) && (!head.isNeighbor(tail))) {
            Edge e = new Edge(data, head, tail);
            this.edges.add(e);
            head.addEdge(e);
            tail.addEdge(e);
        }
    }

    /* Adds a node with given data
     */
    public void addNode(V data) {
        // Updates principal node list
        this.nodes.add(new Node(data));
    }

    /* Removes a specific edge, delete node helper
     */
    public void deleteEdge(Edge edge) {
        // Removes links to the edge
        this.edges.remove(edge);
        edge.getHead().removeEdge(edge);
        edge.getTail().removeEdge(edge);
    }

    /* Removes a specific node
     */
    public void deleteNode(Node<V> node) {
        // Removes principal list link and all edges to the node
        while (!node.getEdgeList().isEmpty()) {
            this.deleteEdge(node.getEdgeList().get(0));
        }
        this.nodes.remove(node);
    }

    /* Breadth first traversal of the graph
     */
    public ArrayList<Node<V>> BFS(Node<V> start) {
        // Queue for traversal
        LinkedList<Node<V>> queue = new LinkedList<>();
        // ArrayList for seen nodes
        ArrayList<Node<V>> seen = new ArrayList<>();
        // Traversal
        seen.add(start);
        queue.add(start);
        while (queue.peek() != null) {
            Node<V> currentNode = queue.remove();
            for (Node<V> n : currentNode.getNeighbors()) {
                if (!seen.contains(n)) {
                    seen.add(n);
                    queue.add(n);
                }
            }
        }
        return seen;
    }

    /* Wrapper method for DFS, for easier access
     */
    public ArrayList<Node<V>> DFS(Node start) {
        ArrayList<Node<V>> seen = new ArrayList<>();
        ArrayList<Node<V>> nodes = DFS(start, seen);
        return nodes;
    }

    /* Depth first traversal of the graph
     */
    public ArrayList<Node<V>> DFS(Node<V> start, ArrayList<Node<V>> seen) {
        if (!seen.contains(start)) {
            seen.add(start);
            for (Node<V> n : start.getNeighbors()) {
                DFS(n, seen);
            }
        }
        return seen;
    }

    /* Dijkstra algorithm with HashMaps and HashSet (which could easily be replaced for an ArrayList). See aproach in:
     * https://www.baeldung.com/java-dijkstra
     */
    public Dijkstra<V, E> shortestPath(Node<V> start) {
        // HashMap for cost
        HashMap<Node<V>, Double> cost = new HashMap<>();
        // HashMap for adjacency
        HashMap<Node<V>, Node<V>> adjacency = new HashMap<>();
        // HashSet for visited
        HashSet<Node<V>> visited = new HashSet<>();
        // HashMap for unvisited
        HashMap<Node<V>, Double> unvisited = new HashMap<>();

        // Add all nodes to cost and unvisited HashMaps with infinite cost 
        // (except start - cost of 0)
        // Add nodes to adjacency HashMap
        for (Node n : this.nodes) {
            if (n.equals(start)) {
                cost.put(n, 0.0);
                unvisited.put(n, 0.0);
            } else {
                cost.put(n, Double.MAX_VALUE);
                unvisited.put(n, Double.MAX_VALUE);
            }
            adjacency.put(n, n);
        }

        // For each unvisited node, take the one with lowest cost
        while (!unvisited.isEmpty()) {
            Node<V> currentNode = null;
            double lowValue = Collections.max(unvisited.values());
            for (Map.Entry<Node<V>, Double> entry : unvisited.entrySet()) {
                if (entry.getValue() == lowValue) {
                    currentNode = entry.getKey();
                }
            }
            unvisited.remove(currentNode);
            visited.add(currentNode);
            // Check if the node's neighbors benefit from going through this node
            for (Node<V> node : currentNode.getNeighbors()) {
                Edge e = currentNode.edgeTo(node);
                double possCost;
                if (e.getData() instanceof Number) {
                    Number n = (Number) e.getData();
                    double data = n.doubleValue();
                    possCost = data + cost.get(currentNode);
                } else {
                    possCost = 1.0 + cost.get(currentNode);
                }
                // If the neighbor does benefit, update its cost and adjacency
                if (possCost < cost.get(node)) {
                    cost.put(node, possCost);
                    unvisited.put(node, possCost);
                    adjacency.put(node, currentNode);
                }
            }
        }
        Dijkstra<V, E> results = new Dijkstra<>(cost, adjacency);
        return results;
    } 
}
