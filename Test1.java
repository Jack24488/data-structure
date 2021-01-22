package admin;
import java.awt.Color;                                    //������󴰿ڹ��߰�
import java.awt.Font;             //����
import java.awt.event.ActionEvent;         //�¼� 
import java.awt.event.ActionListener;
import javax.swing.JButton;        //��ť         //���뿪��javaӦ�ó����û�����Ŀ������߰�
import javax.swing.JFrame;                 
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
	public class Test1{	                                  //����ͼ���û�����
		private static JFrame frame = null;
	    private static JTextArea resultText;
	    private static JTextField carIdText;    
	    private static ParkingLot parkingLot = new ParkingLot(5);
	    private static Path path = new Path(100);
	    public static void main(String[] args) {
	        frame = new JFrame("Parking Lot ");
	        frame.setBounds(800, 300, 350, 300);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setResizable(false);           //���ɵĴ��ڲ������ɸı��С
	        JPanel panel = new JPanel();
	        panel.setBackground(Color.lightGray);
	        frame.add(panel);
	        placeComponents(panel);
	        frame.setVisible(true);
	    }
	    private static void placeComponents(JPanel panel) {     //���ó������
	        panel.setLayout(null);
	        JLabel carLabel = new JLabel("Car ID:");
	        carLabel.setBounds(10, 20, 80, 25);
	        panel.add(carLabel);
	        carIdText = new JTextField(20);
	        carIdText.setBounds(100, 20, 165, 25);
	        panel.add(carIdText);
	        JLabel resultLabel = new JLabel("Result:");
	        resultLabel.setBounds(10, 150, 80, 50);
	        panel.add(resultLabel);
	        resultText = new JTextArea(5, 1);
	        resultText.setEditable(false);
	        resultText.setBounds(80, 130, 200, 100);
	        resultText.setLineWrap(true);
	        Font font1 = new Font("����", Font.BOLD, 15);
	        resultText.setFont(font1);
	        panel.add(resultText);
	        JButton arriveButton = new JButton("Arrive");
	        arriveButton.setBackground(Color.orange);
	        arriveButton.setBounds(50, 50, 80, 25);
	        panel.add(arriveButton);
	        arriveButton.addActionListener (new ActionListener() {	        
	            public void actionPerformed(ActionEvent e) {
	                arrive();
	            }
	        });
	        JLabel authorLabel = new JLabel();
	        Font font = new Font("����", Font.ITALIC, 15);
	        authorLabel.setFont(font);
	        authorLabel.setBounds(120, 230, 150, 25);
	        panel.add(authorLabel);
	        JButton leaveButton = new JButton("Leave");
	        leaveButton.setBounds(200, 50, 80, 25);
	        leaveButton.setBackground(Color.pink);   //���ð�ť��ɫ
	        panel.add(leaveButton);
	        leaveButton.addActionListener(new ActionListener() {
	            
	            public void actionPerformed(ActionEvent e) {
	                leave();
	            }
	        });
	        JButton showButton = new JButton("Show");
	        showButton.setBounds(50, 80, 80, 25);
	        panel.add(showButton);
	        showButton.setBackground(Color.green);
	        showButton.addActionListener(new ActionListener() {
	           
	            public void actionPerformed(ActionEvent e) {
	                show();
	            }
	        });
	        JButton exitButton = new JButton("Exit");
	        exitButton.setBounds(200, 80, 80, 25);
	        panel.add(exitButton);
	        exitButton.addActionListener(new ActionListener() {                   
	            public void actionPerformed(ActionEvent e) {
	                System.exit(0);
	            }
	        });
	    }	   
	    protected static void show() {
	        resultText.setText("����ͣ������:" + parkingLot.getSize() + "����\n��·����:" + path.length() + "����");
	        carIdText.setText("");
	    }	   
	    protected static void leave() {
	        Car car = new Car();
	        String id = carIdText.getText();
	        if (id.isEmpty()) {
	            resultText.setText("�����복�ƺ�");
	            return;
	        } else {
	            // ���ⲻ��ֱ��ɾ����
	            if (!parkingLot.isFull()) {
	                Car[] cars;
	                Car[] resultCars = new Car[parkingLot.getSize()];
	                ParkingLot newParkingLot;
	                car = parkingLot.getCar(id);	                
	                if (car != null) {
	                	car.setLeaveTime(System.currentTimeMillis());
	                    long time = car.getLeaveTime() - car.getReachTime();
	                    resultText.setText("����:" + car.getId() + "\n�뿪��\nͣ��ʱ��:"+time+"����");
	                    cars = parkingLot.getCars();
	                    int index = 0;
	                    for (int i = 0; i < parkingLot.getSize(); i++) {
	                        if (!cars[i].getId().equals(id)) {
	                            resultCars[index++] = cars[i];
	                        }
	                    }
	                    newParkingLot = new ParkingLot(10);
	                    for (int i = 0; i < index; i++) {
	                        newParkingLot.push(resultCars[i]);
	                    }
	                    parkingLot = newParkingLot;
	                } else {
	                    resultText.setText("ͣ������û��������\n����:" + carIdText.getText());
	                    return;
	                }
	            }
	            // ��������ͨ���³�����
	            else {
	                Car[] cars;
	                Car[] resultCars = new Car[parkingLot.getSize()];
	                car = parkingLot.getCar(id);
	                ParkingLot newParkingLot;
	                if (car != null) {
	                	car.setLeaveTime(System.currentTimeMillis());
	                    long time = car.getLeaveTime() - car.getReachTime();
	                    resultText.setText("����:" + car.getId() + "\n�뿪��\nͣ��ʱ��:"+time+"����");
	                    cars = parkingLot.getCars();
	                    parkingLot.pop();
	                    int index = 0;
	                    for (int i = 0; i < parkingLot.getSize(); i++) {
	                        if (!cars[i].getId().equals(id)) {
	                            resultCars[index++] = cars[i];
	                        }
	                    }
	                    newParkingLot = new ParkingLot(10);
	                    for (int i = 0; i < index; i++) {
	                        newParkingLot.push(resultCars[i]);
	                    }
	                    if (!path.isEmpty()) {
	                        Car temp = path.getCars()[path.getFront()];
	                        newParkingLot.push(temp);
	                        temp.setReachTime(System.currentTimeMillis());
	                    }
	                } else {
	                    resultText.setText("ͣ�����в�����\n����:" + carIdText.getText());
	                    return;
	                }
	            }
	        }
	    }
	    public static void arrive() {
	        Car car = new Car();
	        String id = carIdText.getText();
	        if (!id.isEmpty()) {
	            car.setId(id);
	            // �ж�ͣ�����Ƿ���
	            if (!parkingLot.isFull()) {
	                car.setReachTime(System.currentTimeMillis());
	                parkingLot.push(car);
	                resultText.setText("����:" + id + "\nͣ���ɹ�");
	                carIdText.setText("");
	            } else {
	                path.add(car);
	                resultText.setText("ͣ��������\n����:" + car.getId() + "\nͣ�ڵ�·��");
	                carIdText.setText("");
	            }
	        } else {
	            resultText.setText("�����복�ƺ�");
	            carIdText.setText("");
	            return;
	        }
	    }
	}


