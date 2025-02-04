package gr.aueb.cf.ch19;
/*
Class cast Exception error at run time and no at compile time.
 */
public class Main {
    public static void main(String[] args){
        NodeObj nodeObj = new NodeObj();
        nodeObj.setItem("Coding");

        int item = (int) nodeObj.getItem(); //Here because try to make the string as integer create the problem
        System.out.println(item);

    }
}
