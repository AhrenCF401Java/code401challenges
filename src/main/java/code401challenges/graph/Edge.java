package code401challenges.graph;

class Edge<E> {
    int weight;
    Node<E> nodePointingTo;

    public Edge(int weight, Node<E> nodePointingTo) {
        this.weight = weight;
        this.nodePointingTo = nodePointingTo;
    }
}
