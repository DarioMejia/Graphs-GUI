package interfaces.graph;

import java.awt.*;

/* Class Draw Node to manage node locations
*/
public class DrawNode<V> {

    /* Data
     */
    private V data;

    /* Coordinates
     */
    private Point point;

    /* Constructor
     */
    DrawNode(V data, Point point) {
        this.data = data;
        this.point = point;
    }

    /* Returns data
     */
    public V getData() {
        return this.data;
    }

    /* Returns point
     */
    public Point getPoint() {
        return this.point;
    }

    /* Sets data
     */
    public void setData(V data) {
        this.data = data;
    }

    /* Sets point
     */
    public void setPoint(Point point) {
        this.point = point;
    }
}
