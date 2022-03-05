package test;

public class NodeB implements GNode {

	@Override
	public String getName() {
		return "B";
	}

	@Override
	public GNode[] getChildren() {
		GNode[] gn=new GNode[2];//ef
		gn[0]= new NodeE();
	    gn[1]=new NodeF();
		
		return gn;
	}
}
