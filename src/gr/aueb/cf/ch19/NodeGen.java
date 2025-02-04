package gr.aueb.cf.ch19;
/*
This is a generic Node like NodeObj but can provide and safety from runtime classCastException errors.
 */
public class NodeGen<T> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
