package admin;
//线性表抽象数据类型的Java接口定义：
public interface List{
 public int size();//求链表的长度
 public boolean isEmpty();//判断链表是否为空
 public Object get(int i) throws Exception;
 public void set(int i,Object obj);//设置元素
 
 public void insert(int i,Object obj) throws Exception;//插入元素
 public Object delete(int i) throws Exception;//删除链表中指定的元素
 
 public void display();//显示链表元素
 public int locate(Object obj);//定位链表元素
 
 public void clear();//清除链表中所有的元素
}
 /*
 public void insert(Object object);
 public Object delete(Object object);
 */


