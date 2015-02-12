package edu.grinnell.glimmer.mist.Evaluator;

import javax.swing.tree.TreeNode;
import MistParser.*;


public class Evaluator
{
	

  
	/**
	 * Evaluation takes the top node and evaluates the function tree 
	 * using inputted x, y, and time variables. 
	 * 
	 * @param treeNode
	 * @param x
	 * @param y
	 * @param time
	 * @return
	 * 		Should return a double value (ideally -1
	 */
	public double evaluation(TreeNode treeNode, double x, double y, double time)
	{
		double value = 0;
	
		//start the evaluating of the node
		if(treeNode.equals('x'))
		{
			return x;
		} //if the current thing is a number
		else 
			if (treeNode.equals("multi")) {
				Function.multi(getChildren(treeNode)); //this predicts that the multi funcitons are using arrays. 
		}
		
		return value;
	}
	
	/**
	 * getChildren gets all the arguments available for children and
	 *  puts them in an array. 
	 * 
	 * @param treeNode
	 * @return
	 */
	public String[] getChildren(TreeNode treeNode){
		String[] children=null;
		
		for(int i=0; i < treeNode.getChildCount(); i++)
		{
			children[i] = treeNode.getChildAt(i).toString();
		};
		return children;
	}
	
	
}
