package code401challenges.graph;



import java.util.List;
//method that determines if a flight path is possiple
public class GetEdges {
    public static String possibleTrip(Graph graph, Node[] cities){
        int tripTotal=0;
        for(int i=0; i < cities.length-2; i++){
            List<Edge> neighbs = graph.getNeighbors(cities[i]);
            for (Edge neighb : neighbs) {
                if (neighb.nodePointingTo == cities[i + 1]) {
                    tripTotal += neighb.weight;
                } else {
                    tripTotal=0;
                    return "False, $"+tripTotal;
                }
            }
        }
        return "True, $"+tripTotal;
    }
}
