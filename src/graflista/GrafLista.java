
package graflista;
import java.util.ArrayList;
/**
 *
 * @author Dejan
 */
public class GrafLista {
    class Graph{
            ArrayList<ArrayList<Integer>> graph;
            int V;
            Graph(int nodes){
                V = nodes;
                graph = new ArrayList<ArrayList<Integer>>();
                for(int i=0;i<V;i++){
                        graph.add(new ArrayList<Integer>());
                }
            }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
