public class Vertex {
	Vertex Link[]=new Vertex[10000000];
	int id;
	String color;
	int d;
	Vertex parent;
	public Vertex()
	{
		d=100000000;
		color="white";
		parent=null;
	}

}
