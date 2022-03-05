package test;

public class NodeC implements GNode {

	@Override
	public String getName() {
		return "C";
	}

	@Override
	public GNode[] getChildren() {
		GNode[] gn=new GNode[3];//ghi
		gn[0]= new NodeG();
	    gn[1]=new NodeH();
	    gn[2]=new NodeI();
		return gn;
	}
}
