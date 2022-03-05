package test;

public class NodeD implements GNode {

	@Override
	public String getName() {
		return "D";
	}

	@Override
	public GNode[] getChildren() {
		GNode[] gn=new GNode[1];//j
		gn[0]=new NodeJ();
		return gn;
	}
}
