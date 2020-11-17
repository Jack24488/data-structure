package admin;

public class BinaryNode<T> {
	public T data;           //����Ԫ��
    public BinaryNode<T> left, right;  //�ֱ�ָ�����Һ���		
	public BinaryNode<T> root;	
    public BinaryNode(T data,BinaryNode<T> left, BinaryNode<T> right){ 
            this.data=data;
            this.left=left;
            this.right=right;
    }
    public BinaryNode(T data){   //����Ԫ��Ϊdata��Ҷ�ӽ��
            this(data,null,null);
    }
    public String toString(){    //���ؽ��������������ַ���
           return this.data.toString();
    }
    public boolean isLeaf(){
    	return isLeaf(this.root);
    }
    public boolean isLeaf(BinaryNode<T> root){     //�ж��Ƿ���Ҷ�ӽ��
           return this.left==null && this.right==null;
    }
    public String toGenListString(){
    	return "�������Ĺ�����ʾ:"+toGenListString(this.root);
    }
     public String toGenListString(BinaryNode<T> p){
    	 if (p==null)
    		 return "^";
    	 if(p.left==null&&p.right==null)    		
    	 return p.data.toString();
    	 return p.data.toString()+"("+toGenListString(p.left)+","+toGenListString(p.right)+")";
     }
} 
