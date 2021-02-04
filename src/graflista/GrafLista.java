
package graflista;
import java.util.ArrayList;
/**
 *
 * @author Dejan
 */

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
            
            void dodajLink(int v, int u){
                    graph.get(v).add(u);
                    graph.get(u).add(v);
            }
            
            void stampajGraf(){
                    for(int i=0;i<V;i++){
                        System.out.print("Node : ");
                        for(int x: graph.get(i)) System.out.println(" -> " + x);
                        
                    }
            }
    }


public class GrafLista {
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
