package admin;

public class BinaryTrees {
    private static int i=0;
    public static BinaryTree<String> creatByGenList(String genlist){
    	BinaryTree<String> bitree = new BinaryTree<String>();
    	i=0;
    	bitree.root = create(genlist);
    	return bitree;
    }
    public static BinaryNode<String> create (String genlist){
    	BinaryNode<String> p=null;
    	if(i<genlist.length()){
    		char ch = genlist.charAt(i);
    		i++;
    		if(ch=='^')
    			return null;
    		p=new BinaryNode<String>(ch+"");
    		if(i<genlist.length()&& genlist.charAt(i)=='('){
    			i++;
    			p.left = create(genlist);
    			i++;
    			p.right = create(genlist);
    			i++;
    		}   		
    	}
		    return p;  	  	  	
    }
       public static void main(String args[]){
	String genlist="A(B(D(^,G),^),C(E,F(H,^)))";
	BinaryTree<String> bitree= BinaryTrees.creatByGenList(genlist);
	BinaryNode<String> p = new BinaryNode<String>(genlist);
	System.out.println(bitree.toGenListString());
	System.out.println("二叉树是否为空:"+bitree.isEmpty());
	System.out.println("p结点是否为叶子结点:"+p.isLeaf());
	System.out.println("二叉树中结点的个数为:"+bitree.size());
	System.out.println("二叉树中叶子节点的个数为:"+bitree.yezi());
	System.out.println("二叉树中的叶子结点为:"+bitree.yezinode());
	System.out.println("二叉树的高度为:"+bitree.height());
	System.out.println("二叉树以先根次序遍历:");
	bitree.preorder();
   }
}
