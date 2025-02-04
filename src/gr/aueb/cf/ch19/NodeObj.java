package gr.aueb.cf.ch19;
/*
Here the problem is that class take int, strings everything and can create ClassCastException
 */
public class NodeObj {
    private Object item;

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }
}
