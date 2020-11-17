package admin;

public class BinaryTree<T> {
	
	public BinaryNode<String> root;//构造根节点
    public BinaryTree(){      //构造空二叉树
        this.root=null;
    }
    public boolean isEmpty(){    //判断二叉树是否空
        return this.root==null;
    }
    public void preorder(){
       preorder(this.root); //先根次序遍历以root结点为根的二叉树
    }    
    //先根次序遍历以p结点为根的子树，递归方法
   public void preorder(BinaryNode<String> p){
        if(p!=null){                     //若二叉树不空
           System.out.print(p.data.toString()+"");    //先访问根
           preorder(p.left);          //遍历p的左子树，递归调用
           preorder(p.right);       //遍历p的右子树，递归调用
        }
    }

    public String toGenListString(){
    	return "二叉树的广义表表示:"+toGenListString(this.root);
    }
     public String toGenListString(BinaryNode<String> root){
    	 if (root==null)
    		 return "^";
    	 if(root.left==null&&root.right==null)    		
    	 return root.data.toString();
    	 return root.data.toString()+"("+toGenListString(root.left)+","+toGenListString(root.right)+")";
     }
     public int height(){     //返回二叉树的高度
         return height(this.root);
   }
     public int height(BinaryNode<String> p){
         if(p==null)
             return 0;
         int lh=height(p.left);        //返回左子树的高度
         int rh=height(p.right);    //返回右子树的高度
         return (lh>=rh)?lh+1:rh+1;      
   }

     public int size(){       //返回二叉树的结点数
         return size(this.root); 
 }
     public int size(BinaryNode<String> p){  //返回以p结点为根的子树的结点数
         if(p==null)
             return 0;
         return 1+size(p.left)+size(p.right);
     }
     public int yezi(){
    	 return yezi(this.root);
     }
     public int yezi(BinaryNode<String> p){
    	 if(p==null)
    		 return 0;
    	 if(p.left==null&&p.right==null){
    	     return 1;
    	 }
    	     return yezi(p.left)+yezi(p.right); 	 
     }
     public String yezinode(){
    	return yezinode(this.root);
     }
     public String yezinode(BinaryNode<String> p){
    	 if(p==null)
    		 return "";
    	 if(p.left==null&&p.right==null)
    		 return p.data.toString();
    	 else
        return yezinode(p.left)+yezinode(p.right);
  }
}   	  
    	
    

