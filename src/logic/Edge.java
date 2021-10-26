
package logic;


/* Class for graph edges
     */
    public class Edge<E> {

        /* Data of the edge
         */
        private E data;

        /* Edge's head
         */
        private Node head;

        /* Edge's tail
         */
        private Node tail;

        /* Constructor
         */
        Edge(E data, Node head, Node tail) {
            this.data = data;
            this.head = head;
            this.tail = tail;
        }

        /* Returns edge data
         */
        public E getData() {
            return this.data;
        }

        /* Returns head
         */
        public Node getHead() {
            return this.head;
        }

        /* Returns tail
         */
        public Node getTail() {
            return this.tail;
        }

        /* Sets edge data
         */
        public void setData(E data) {
            this.data = data;
        }

        /* Sets head
         */
        public void setHead(Node head) {
            this.head = head;
        }

        /* Sets tail
         */
        public void setTail(Node tail) {
            this.tail = tail;
        }

    }
