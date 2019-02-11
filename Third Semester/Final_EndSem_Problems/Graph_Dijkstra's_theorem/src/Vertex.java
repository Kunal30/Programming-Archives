public class Vertex {
	Vertex Link[]=new Vertex[10000000];
	int id;
	String color;
	int d,f;
	int weight;
	Vertex parent;
	public Vertex()
	{
		d=999999999;
		color="white";
		parent=null;
	}

}
