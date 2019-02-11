import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		BST bst = new BST();
		bst.insert(5);
		bst.insert(4);
		bst.insert(3);
		bst.insert(2);
        System.out.println("Average depth="+bst.computeAverageDepthOfTree());
        double avg=bst.computeAverageDepthOfTree();
        bst.rightRotate(bst,bst.root.left);
        System.out.println("New Average depth after rotation="+bst.computeAverageDepthOfTree());
        double avgnew=bst.computeAverageDepthOfTree();
        System.out.println("The Difference between the averages="+Math.abs(avgnew-avg));
	}
}
