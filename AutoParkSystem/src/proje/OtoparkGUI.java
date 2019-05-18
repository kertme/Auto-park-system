package proje;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import java.awt.Font;

public class OtoparkGUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtUsePlate;
	private JTextField txtGiris;
	private JTextField txtCikis;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private AutoPark otopark = new AutoPark(10,10);
	private ArrayList<String> splates = new ArrayList<String>();
	private ArrayList<String> allPlates = new ArrayList<String>();
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OtoparkGUI window = new OtoparkGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OtoparkGUI() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame("Otopark Sistemi");
		frame.setBounds(100, 100, 730, 489);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	
		textField = new JTextField();
		textField.setBounds(138, 31, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("Plaka");
		lblName.setBounds(65, 31, 46, 20);
		frame.getContentPane().add(lblName);
		
		JLabel lblPhone = new JLabel("Ba\u015Flang\u0131\u00E7");
		lblPhone.setBounds(65, 84, 60, 20);
		frame.getContentPane().add(lblPhone);
		
		textField_1 = new JTextField();
		textField_1.setBounds(137, 83, 20, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEmailId = new JLabel("Biti\u015F");
		lblEmailId.setBounds(65, 117, 46, 20);
		frame.getContentPane().add(lblEmailId);
		
		textField_2 = new JTextField();
		textField_2.setBounds(138, 116, 20, 22);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblAddress = new JLabel("Plaka");
		lblAddress.setBounds(356, 31, 62, 20);
		frame.getContentPane().add(lblAddress);
		
		
		
		JButton btnClear = new JButton("Temizle");
		
		btnClear.setBounds(190, 387, 86, 22);
		frame.getContentPane().add(btnClear);
		
		JLabel lblSex = new JLabel("Ara\u00E7 T\u00FCr\u00FC");
		lblSex.setBounds(356, 156, 67, 14);
		frame.getContentPane().add(lblSex);
		
		JLabel lblMale = new JLabel("Resmi");
		lblMale.setBounds(435, 156, 46, 17);
		frame.getContentPane().add(lblMale);
		
		JRadioButton radioButton_1 = new JRadioButton("");
		radioButton_1.setBounds(475, 155, 28, 23);
		frame.getContentPane().add(radioButton_1);
		
		
		JButton btnSubmit = new JButton("Abone ekle");
		
		btnSubmit.setBackground(Color.BLUE);
		btnSubmit.setForeground(Color.MAGENTA);
		btnSubmit.setBounds(65, 387, 98, 23);
		frame.getContentPane().add(btnSubmit);
		
		JLabel lblAboneOlutur = new JLabel("Abone olu\u015Ftur");
		lblAboneOlutur.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAboneOlutur.setVerticalAlignment(SwingConstants.TOP);
		lblAboneOlutur.setBounds(70, 0, 173, 23);
		frame.getContentPane().add(lblAboneOlutur);
		
		JLabel lblAraGirii = new JLabel("Otopark giri\u015F-\u00E7\u0131k\u0131\u015F");
		lblAraGirii.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAraGirii.setBounds(399, 2, 155, 21);
		frame.getContentPane().add(lblAraGirii);
		
		txtUsePlate = new JTextField();
		txtUsePlate.setBounds(438, 30, 116, 22);
		frame.getContentPane().add(txtUsePlate);
		txtUsePlate.setColumns(10);
		
		txtGiris = new JTextField();
		txtGiris.setBounds(438, 83, 28, 22);
		frame.getContentPane().add(txtGiris);
		txtGiris.setColumns(10);
		
		txtCikis = new JTextField();
		txtCikis.setBounds(438, 116, 28, 22);
		frame.getContentPane().add(txtCikis);
		txtCikis.setColumns(10);
		
		JLabel lblGiri = new JLabel("Giri\u015F");
		lblGiri.setBounds(356, 84, 56, 20);
		frame.getContentPane().add(lblGiri);
		
		JLabel lblk = new JLabel("\u00C7\u0131k\u0131\u015F");
		lblk.setBounds(356, 117, 56, 20);
		frame.getContentPane().add(lblk);
		
		JLabel lblGn = new JLabel("G\u00FCn");
		lblGn.setBounds(135, 64, 28, 16);
		frame.getContentPane().add(lblGn);
		
		JLabel lblAy = new JLabel("Ay");
		lblAy.setBounds(170, 64, 21, 16);
		frame.getContentPane().add(lblAy);
		
		JLabel lblYl = new JLabel("Y\u0131l");
		lblYl.setBounds(203, 64, 21, 16);
		frame.getContentPane().add(lblYl);
		
		textField_3 = new JTextField();
		textField_3.setBounds(170, 83, 20, 22);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(203, 83, 40, 22);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(170, 116, 20, 22);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(203, 116, 40, 22);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblSaat = new JLabel("Saat");
		lblSaat.setBounds(438, 60, 33, 16);
		frame.getContentPane().add(lblSaat);
		
		JLabel lblDakika = new JLabel("Dakika");
		lblDakika.setBounds(478, 60, 40, 16);
		frame.getContentPane().add(lblDakika);
		
		textField_7 = new JTextField();
		textField_7.setBounds(478, 83, 28, 22);
		frame.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(478, 116, 28, 22);
		frame.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(475, 219, 189, 157);
		frame.getContentPane().add(textArea);
		
		JButton btn1 = new JButton("Ara\u00E7 Giri\u015Fi");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(txtUsePlate.getText().isEmpty()||(txtGiris.getText().isEmpty())||(textField_7.getText().isEmpty()))
					JOptionPane.showMessageDialog(null, "Araç giriþi için gerekli\n"
							+ "kýsýmlarý doldurun.");
				else {
					
					if (txtGiris.getText().matches("[0-9]+") == false || textField_7.getText().matches("[0-9]+") == false) 
						JOptionPane.showMessageDialog(null, "Giriþ saati ve dakikasý için\n"
								+ "sadece sayý girmelisiniz.");
					else {
						Time enter = new Time(Integer.parseInt(txtGiris.getText()), Integer.parseInt(textField_7.getText()));
						boolean isOfficial = radioButton_1.isSelected();
						String plate = txtUsePlate.getText();
						plate= plate.trim();
						
						if (allPlates.contains(plate) == true)
							JOptionPane.showMessageDialog(null, "Araç giriþi baþarýsýz.\n"
									+ "Bu plakalý araç otoparkta park halinde");
						else {
							boolean test = otopark.vehicleEnters(plate, enter, isOfficial);
							if (test == true) {
								allPlates.add(plate);
								JOptionPane.showMessageDialog(null, "Araç baþarýyla giriþ yaptý.");
								String guncel = Integer.toString(otopark.getGuncel());
								textField_9.setText(guncel);
								textArea.append(plate+" - Giriþ Zamaný= "+enter.getHour()+":"+enter.getMinute()+"\n");
								
							}	
							else
								JOptionPane.showMessageDialog(null, "Araç giriþi baþarýsýz.Otopark dolu");
						}
					}			
				}	
			}
		});
		btn1.setBounds(308, 386, 97, 25);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("Ara\u00E7 \u00E7\u0131k\u0131\u015F\u0131");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtUsePlate.getText().isEmpty()||(txtCikis.getText().isEmpty())||(textField_8.getText().isEmpty()))
					JOptionPane.showMessageDialog(null, "Araç çýkýþý için gerekli\n"
							+ "kýsýmlarý doldurun.");
				else {
					String temp1 = txtCikis.getText();
					String temp2 = textField_8.getText();
					String plate = txtUsePlate.getText();
					if (temp2.matches("[0-9]+") == false || temp1.matches("[0-9]+") == false) 
						JOptionPane.showMessageDialog(null, "Çýkýþ saati ve dakikasý için\n"
								+ "sadece sayý girmelisiniz.");
					else {
						int hour = Integer.parseInt(temp1);
						int minute = Integer.parseInt(temp2);
						Time exit = new Time(hour, minute);
						
						plate= plate.trim();

						boolean test = otopark.vehicleExits(plate, exit);
						if (test == true) {
							allPlates.remove(plate);
							JOptionPane.showMessageDialog(null, plate+" plakalý araç otoparktan ayrýldý.\n"
									+ "Ödenmesi gereken miktar:"+otopark.getUcret());
							String total = Double.toString(otopark.getIncomeDaily());
							textField_10.setText(total);
							textField_9.setText(Integer.toString(otopark.getGuncel()));
							
							String s = "";
							for(int i=0; i < allPlates.size(); i++) {
								Time temp = otopark.searchParkRecord(allPlates.get(i)).getEnterTime();
								s += allPlates.get(i)+" - Giriþ Zamaný= "+temp.getHour()+":"+temp.getMinute()+"\n";
							}
								
							textArea.setText(s);
						}	
						else 
							JOptionPane.showMessageDialog(null, plate+" plakalý araç bulunamadý.\n");
						
					}
						
				}
			}
		});
		btn2.setBounds(417, 386, 97, 25);
		frame.getContentPane().add(btn2);
		
		JButton btnNewButton_2 = new JButton("Ayarla");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String textCapacity = textField_11.getText();
				if (textCapacity.matches("[0-9]+") == false) 
					JOptionPane.showMessageDialog(null, "Sadece sayý girmelisiniz.");
				else {
					int newCapacity = Integer.parseInt(textCapacity);
					if (newCapacity == otopark.getCapacity())
						JOptionPane.showMessageDialog(null, "Mevcut kapasiteyle ayný deðeri girdiniz.");
					else if (newCapacity > otopark.getGuncel()) {
						otopark.setCapacity(newCapacity);
						JOptionPane.showMessageDialog(null, "Kapasite güncellendi.");
						textField_11.setText(textCapacity);
					}	
					else
						JOptionPane.showMessageDialog(null, "Yeni kapasite anlýk araç sayýsýndan küçük olamaz");
				}
			}
		});
		btnNewButton_2.setBounds(289, 191, 97, 25);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel lblDurum = new JLabel("Durum");
		lblDurum.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDurum.setBounds(106, 150, 86, 31);
		frame.getContentPane().add(lblDurum);
		
		JLabel lblAnlkAraSays = new JLabel("Anl\u0131k Ara\u00E7 Say\u0131s\u0131");
		lblAnlkAraSays.setBounds(12, 275, 98, 16);
		frame.getContentPane().add(lblAnlkAraSays);
		
		textField_9 = new JTextField();
		textField_9.setBounds(151, 272, 116, 22);
		frame.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		textField_9.setText("0");
		
		JLabel lblGnlkKazan = new JLabel("G\u00FCnl\u00FCk Kazan\u00E7");
		lblGnlkKazan.setBounds(12, 304, 99, 16);
		frame.getContentPane().add(lblGnlkKazan);
		
		textField_10 = new JTextField();
		textField_10.setBounds(151, 301, 116, 22);
		frame.getContentPane().add(textField_10);
		textField_10.setColumns(10);
		textField_10.setText("0");
		
		JLabel lblMaksimumKapasite = new JLabel("Maksimum Kapasite");
		lblMaksimumKapasite.setBounds(12, 195, 121, 16);
		frame.getContentPane().add(lblMaksimumKapasite);
		
		textField_11 = new JTextField();
		textField_11.setBounds(151, 193, 116, 22);
		frame.getContentPane().add(textField_11);
		textField_11.setColumns(10);
		textField_11.setText("10");
		
		JLabel lblSaatlikcret = new JLabel("Saatlik \u00DCcret");
		lblSaatlikcret.setBounds(12, 232, 113, 16);
		frame.getContentPane().add(lblSaatlikcret);
		
		textField_12 = new JTextField();
		textField_12.setBounds(151, 230, 116, 22);
		frame.getContentPane().add(textField_12);
		textField_12.setColumns(10);
		textField_12.setText("10");
		
		JButton btnAyarla = new JButton("Ayarla");
		btnAyarla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String textFee = textField_12.getText();

				if (textFee.matches("[0-9]+") == false) 
					JOptionPane.showMessageDialog(null, "Sadece sayý girmelisiniz.");
				
				else {
					double newFee = Double.parseDouble(textFee);
					if (newFee == otopark.getHourlyFee())
						JOptionPane.showMessageDialog(null, "Mevcut saatlik ücret ile ayný deðeri girdiniz.");
					else if (newFee >= 0) {
						otopark.setHourlyFee(newFee);
						textField_12.setText(textFee);
						JOptionPane.showMessageDialog(null, "Saatlik ücret deðiþtirildi.");
					}		
					else
						JOptionPane.showMessageDialog(null, "Saatlik ücret negatif deðer olamaz.");
				}
			}
		});
		btnAyarla.setBounds(289, 229, 97, 25);
		frame.getContentPane().add(btnAyarla);
		
		JLabel lblOtoparktakiAralar = new JLabel("Otoparktaki Ara\u00E7lar");
		lblOtoparktakiAralar.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblOtoparktakiAralar.setBounds(485, 187, 189, 19);
		frame.getContentPane().add(lblOtoparktakiAralar);		
		
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(textField.getText().isEmpty()||(textField_1.getText().isEmpty())||(textField_2.getText().isEmpty())||(textField_3.getText().isEmpty())||(textField_4.getText().isEmpty())||(textField_5.getText().isEmpty())||(textField_6.getText().isEmpty()))
					JOptionPane.showMessageDialog(null, "Abone Oluþtur'un tüm alanlarýný doldurunuz.");
				else {
					if (textField_1.getText().matches("[0-9]+") == false || textField_3.getText().matches("[0-9]+") == false || textField_4.getText().matches("[0-9]+") == false || 
							textField_2.getText().matches("[0-9]+") == false || textField_5.getText().matches("[0-9]+") == false || textField_6.getText().matches("[0-9]+") == false) 
						JOptionPane.showMessageDialog(null, "Sadece sayý girmelisiniz.");
					else {
						Date begin = new Date(Integer.parseInt(textField_1.getText()),Integer.parseInt(textField_3.getText()),Integer.parseInt(textField_4.getText()));
						Date end = new Date(Integer.parseInt(textField_2.getText()),Integer.parseInt(textField_5.getText()),Integer.parseInt(textField_6.getText()));
						String plaka1 = textField.getText();
						if (splates.contains(plaka1) == true)
							JOptionPane.showMessageDialog(null, "Bu plaka otoparka zaten kayýtlý.");
						else {
							splates.add(plaka1);
							Subscription s1 = new Subscription(begin,end,plaka1);					
							s1.getVehicle().setSubscription(s1);
							boolean eklendiMi = otopark.addVehicle(s1.getVehicle());
							if (eklendiMi==true)
								JOptionPane.showMessageDialog(null, "Abone eklendi.");
						}
					}
				}
			}
		});
		
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField.setText(null);
				txtUsePlate.setText(null);
				txtGiris.setText(null);
				txtCikis.setText(null);
				textField_3.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				radioButton_1.setSelected(false);
				
				
			}
		});
		
	}
}
