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
	System.out.println("�������Ƿ�Ϊ��:"+bitree.isEmpty());
	System.out.println("p����Ƿ�ΪҶ�ӽ��:"+p.isLeaf());
	System.out.println("�������н��ĸ���Ϊ:"+bitree.size());
	System.out.println("��������Ҷ�ӽڵ�ĸ���Ϊ:"+bitree.yezi());
	System.out.println("�������е�Ҷ�ӽ��Ϊ:"+bitree.yezinode());
	System.out.println("�������ĸ߶�Ϊ:"+bitree.height());
	System.out.println("���������ȸ��������:");
	bitree.preorder();
   }
}
