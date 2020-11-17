package admin;

public class BinaryNode<T> {
	public T data;           //数据元素
    public BinaryNode<T> left, right;  //分别指向左、右孩子		
	public BinaryNode<T> root;	
    public BinaryNode(T data,BinaryNode<T> left, BinaryNode<T> right){ 
            this.data=data;
            this.left=left;
            this.right=right;
    }
    public BinaryNode(T data){   //构造元素为data的叶子结点
            this(data,null,null);
    }
    public String toString(){    //返回结点数据域的描述字符串
           return this.data.toString();
    }
    public boolean isLeaf(){
    	return isLeaf(this.root);
    }
    public boolean isLeaf(BinaryNode<T> root){     //判断是否是叶子结点
           return this.left==null && this.right==null;
    }
    public String toGenListString(){
    	return "二叉树的广义表表示:"+toGenListString(this.root);
    }
     public String toGenListString(BinaryNode<T> p){
    	 if (p==null)
    		 return "^";
    	 if(p.left==null&&p.right==null)    		
    	 return p.data.toString();
    	 return p.data.toString()+"("+toGenListString(p.left)+","+toGenListString(p.right)+")";
     }
} 
