package graph;

public class graph1 {
	 class Edge {
	        String src, dest;
	    }

	    int vertices, edges;

	   
	    Edge[] edge;

	    graph1(int vertices, int edges) {
	        this.vertices = vertices;
	        this.edges = edges;

	        
	        edge = new Edge[edges];
	        for (int i = 0; i < edges; i++) {

	         
	            edge[i] = new Edge();
	        }
	    }

	    public static void main(String[] args) {

	        // create an object of Graph class
	        int noVertices = 12;
	        int noEdges = 12;
	        graph1 myGraph = new graph1(noVertices, noEdges);

	      
	        myGraph.edge[0].src = "Stan";
	        myGraph.edge[0].dest = "kurt";

	        myGraph.edge[1].src = "Stan";
	        myGraph.edge[1].dest = "Chey";

	        myGraph.edge[2].src = "Stan";
	        myGraph.edge[2].dest = "Max";

	        myGraph.edge[3].src = "Stan";
	        myGraph.edge[3].dest = "Johann";
	        
	        myGraph.edge[4].src = "Stan";
	        myGraph.edge[4].dest = "Jasmine";
	        
	        myGraph.edge[5].src = "Stan";
	        myGraph.edge[5].dest = "Louie";
	        
	        myGraph.edge[6].src = "Stan";
	        myGraph.edge[6].dest = "Thea";
	        
	        myGraph.edge[7].src = "Stan";
	        myGraph.edge[7].dest = "Luis";
	        
	        myGraph.edge[8].src = "Stan";
	        myGraph.edge[8].dest = "Jap";
	        
	        myGraph.edge[9].src = "Stan";
	        myGraph.edge[9].dest = "Winna pang8";
	        
	        myGraph.edge[10].src = "Kurt";
	        myGraph.edge[10].dest = "Max";
	        
	        myGraph.edge[11].src = "Chey";
	        myGraph.edge[11].dest = "Dom";


	        for (int i = 0; i < noEdges; i++) {
	            System.out.println(myGraph.edge[i].src + " - " + myGraph.edge[i].dest);
	        }

	    }

}
