package admin;
//���Ա�����������͵�Java�ӿڶ��壺
public interface List{
 public int size();//������ĳ���
 public boolean isEmpty();//�ж������Ƿ�Ϊ��
 public Object get(int i) throws Exception;
 public void set(int i,Object obj);//����Ԫ��
 
 public void insert(int i,Object obj) throws Exception;//����Ԫ��
 public Object delete(int i) throws Exception;//ɾ��������ָ����Ԫ��
 
 public void display();//��ʾ����Ԫ��
 public int locate(Object obj);//��λ����Ԫ��
 
 public void clear();//������������е�Ԫ��
}
 /*
 public void insert(Object object);
 public Object delete(Object object);
 */


