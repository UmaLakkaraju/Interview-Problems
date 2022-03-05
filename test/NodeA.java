package test;

public class NodeA implements GNode {

	@Override
	public String getName() {
		return "A";
	}

	@Override
	public GNode[] getChildren() {
		GNode[] gn=new GNode[3];//bcd
		gn[0]=new NodeB();
		gn[1]=new NodeC();
		gn[2]=new NodeD();
		return gn;
	}

}
