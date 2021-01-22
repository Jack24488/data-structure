package admin;
import java.awt.Color;                                    //导入抽象窗口工具包
import java.awt.Font;             //字体
import java.awt.event.ActionEvent;         //事件 
import java.awt.event.ActionListener;
import javax.swing.JButton;        //按钮         //导入开发java应用程序用户界面的开发工具包
import javax.swing.JFrame;                 
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
	public class Test1{	                                  //设置图形用户界面
		private static JFrame frame = null;
	    private static JTextArea resultText;
	    private static JTextField carIdText;    
	    private static ParkingLot parkingLot = new ParkingLot(5);
	    private static Path path = new Path(100);
	    public static void main(String[] args) {
	        frame = new JFrame("Parking Lot ");
	        frame.setBounds(800, 300, 350, 300);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setResizable(false);           //生成的窗口不可自由改变大小
	        JPanel panel = new JPanel();
	        panel.setBackground(Color.lightGray);
	        frame.add(panel);
	        placeComponents(panel);
	        frame.setVisible(true);
	    }
	    private static void placeComponents(JPanel panel) {     //设置程序界面
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
	        Font font1 = new Font("宋体", Font.BOLD, 15);
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
	        Font font = new Font("宋体", Font.ITALIC, 15);
	        authorLabel.setFont(font);
	        authorLabel.setBounds(120, 230, 150, 25);
	        panel.add(authorLabel);
	        JButton leaveButton = new JButton("Leave");
	        leaveButton.setBounds(200, 50, 80, 25);
	        leaveButton.setBackground(Color.pink);   //设置按钮颜色
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
	        resultText.setText("现在停车场有:" + parkingLot.getSize() + "辆车\n道路上有:" + path.length() + "辆车");
	        carIdText.setText("");
	    }	   
	    protected static void leave() {
	        Car car = new Car();
	        String id = carIdText.getText();
	        if (id.isEmpty()) {
	            resultText.setText("请输入车牌号");
	            return;
	        } else {
	            // 车库不满直接删除车
	            if (!parkingLot.isFull()) {
	                Car[] cars;
	                Car[] resultCars = new Car[parkingLot.getSize()];
	                ParkingLot newParkingLot;
	                car = parkingLot.getCar(id);	                
	                if (car != null) {
	                	car.setLeaveTime(System.currentTimeMillis());
	                    long time = car.getLeaveTime() - car.getReachTime();
	                    resultText.setText("车辆:" + car.getId() + "\n离开了\n停车时间:"+time+"毫秒");
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
	                    resultText.setText("停车场内没有这辆车\n车辆:" + carIdText.getText());
	                    return;
	                }
	            }
	            // 车库满了通道新车进入
	            else {
	                Car[] cars;
	                Car[] resultCars = new Car[parkingLot.getSize()];
	                car = parkingLot.getCar(id);
	                ParkingLot newParkingLot;
	                if (car != null) {
	                	car.setLeaveTime(System.currentTimeMillis());
	                    long time = car.getLeaveTime() - car.getReachTime();
	                    resultText.setText("车辆:" + car.getId() + "\n离开了\n停车时间:"+time+"毫秒");
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
	                    resultText.setText("停车场中不存在\n车辆:" + carIdText.getText());
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
	            // 判断停车场是否满
	            if (!parkingLot.isFull()) {
	                car.setReachTime(System.currentTimeMillis());
	                parkingLot.push(car);
	                resultText.setText("车辆:" + id + "\n停车成功");
	                carIdText.setText("");
	            } else {
	                path.add(car);
	                resultText.setText("停车场满了\n车辆:" + car.getId() + "\n停在道路上");
	                carIdText.setText("");
	            }
	        } else {
	            resultText.setText("请输入车牌号");
	            carIdText.setText("");
	            return;
	        }
	    }
	}


