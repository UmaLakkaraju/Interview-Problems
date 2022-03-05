package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {

	public static void main(String[] args) {
		NodeA n=new NodeA();
		
		
		//walkGraph
		System.out.println("All Nodes of graph");
		ArrayList<GNode> nodes= walkGraph(n);
        for(GNode node:nodes) {
        	System.out.println(node.getName());
        }
        
        
        //paths
        System.out.println("All Paths of graph");
        ArrayList<ArrayList<GNode>> paths=paths(n);
        for(int i=0;i<paths.size();i++) {
        	ArrayList<GNode> currpath=paths.get(i);
        	for(GNode node: currpath) {
        		System.out.print(node.getName()+"->");
        	}
        	System.out.println();
        }
        
	}

	
	
	
	public static ArrayList<GNode> walkGraph(GNode node){
		ArrayList<GNode> resultLst=new ArrayList<>();
		Queue<GNode> q=new LinkedList<>();
		q.add(node);
		while(!q.isEmpty()) {
		   int n=q.size();	
			while(n>0) {
			  GNode currnode=q.peek();
			  q.remove();
			  if(!resultLst.contains(currnode))
				  resultLst.add(currnode);
			  GNode[] children=currnode.getChildren();
			  if(children!=null) {
			  for(int i=0 ;i<children.length;i++) {
				  q.add(children[i]);
			  }
			  }
				n--;
			}
			
		}
		return resultLst;
	}
	
	public static ArrayList<ArrayList<GNode>> paths(GNode node){
		ArrayList<ArrayList<GNode>> paths= new ArrayList<>();
        ArrayList<GNode> slate=new ArrayList<>();
        paths(node,slate,paths);
        return paths;
	}




	private static void paths(GNode node, ArrayList<GNode> slate, ArrayList<ArrayList<GNode>> paths) {
		 slate.add(node);
		    if(node.getChildren()==null){
		        paths.add(new ArrayList<GNode>(slate));
		        slate.remove(slate.size()-1);
		        return;
		    }   
		      if(node.getChildren()!=null) {
		      for(GNode cnode:node.getChildren()) {
		        paths(cnode,slate,paths);
		      }
		      slate.remove(slate.size()-1);
		      }
	}
	
	
}
