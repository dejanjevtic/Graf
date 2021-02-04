
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
                        System.out.print("Node : "+ i);
                        for(int x: graph.get(i)) System.out.print(" -> " + x);
                        System.out.println();
                    }
            }
    }


public class GrafLista {
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Graph g = new Graph(5);
        g.dodajLink(0,1);
        g.dodajLink(3,2);
        g.dodajLink(2,4);
        g.dodajLink(1,4);
        g.dodajLink(3,1);
        g.dodajLink(2,0);
        g.stampajGraf();
        
    }
    
}
