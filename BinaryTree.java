package admin;

public class BinaryTree<T> {
	
	public BinaryNode<String> root;//������ڵ�
    public BinaryTree(){      //����ն�����
        this.root=null;
    }
    public boolean isEmpty(){    //�ж϶������Ƿ��
        return this.root==null;
    }
    public void preorder(){
       preorder(this.root); //�ȸ����������root���Ϊ���Ķ�����
    }    
    //�ȸ����������p���Ϊ�����������ݹ鷽��
   public void preorder(BinaryNode<String> p){
        if(p!=null){                     //������������
           System.out.print(p.data.toString()+"");    //�ȷ��ʸ�
           preorder(p.left);          //����p�����������ݹ����
           preorder(p.right);       //����p�����������ݹ����
        }
    }

    public String toGenListString(){
    	return "�������Ĺ�����ʾ:"+toGenListString(this.root);
    }
     public String toGenListString(BinaryNode<String> root){
    	 if (root==null)
    		 return "^";
    	 if(root.left==null&&root.right==null)    		
    	 return root.data.toString();
    	 return root.data.toString()+"("+toGenListString(root.left)+","+toGenListString(root.right)+")";
     }
     public int height(){     //���ض������ĸ߶�
         return height(this.root);
   }
     public int height(BinaryNode<String> p){
         if(p==null)
             return 0;
         int lh=height(p.left);        //�����������ĸ߶�
         int rh=height(p.right);    //�����������ĸ߶�
         return (lh>=rh)?lh+1:rh+1;      
   }

     public int size(){       //���ض������Ľ����
         return size(this.root); 
 }
     public int size(BinaryNode<String> p){  //������p���Ϊ���������Ľ����
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
    	
    

