package week03;

import java.awt.Dimension;

import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Week03Frame extends JFrame {

  private JButton jButton1 = new JButton();
  private JLabel jLabel1 = new JLabel();
  private JTextField jTextField1 = new JTextField();
  private JTextField jTextField2 = new JTextField();
//  private JTextField jTextField3 = new JTextField();
  private JTextField jTextField4 = new JTextField();
  private JLabel jLabel2 = new JLabel();
  private JLabel jLabel4 = new JLabel();

  public Week03Frame() {
    try {
      jbInit();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private void jbInit() throws Exception {
    this.getContentPane().setLayout(null);
    this.setSize(new Dimension(400, 300));
    jButton1.setText("jButton1");
    jButton1.setBounds(new Rectangle(135, 210, 85, 30));
    jButton1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton1_actionPerformed(e);
      }
    });
    jLabel1.setText("Name");
    jLabel1.setBounds(new Rectangle(55, 35, 70, 35));
    jTextField1.setBounds(new Rectangle(190, 30, 125, 30));
    jTextField2.setBounds(new Rectangle(190, 95, 110, 40));
//    jTextField3.setBounds(new Rectangle(190, 95, 110, 40));
    jTextField4.setBounds(new Rectangle(185, 155, 105, 35));
    jLabel2.setText("Age");
    jLabel2.setBounds(new Rectangle(45, 105, 85, 25));
    jLabel4.setText("Salary");
    jLabel4.setBounds(new Rectangle(40, 160, 95, 30));
    this.getContentPane().add(jLabel4, null);
    this.getContentPane().add(jLabel2, null);
    this.getContentPane().add(jTextField4, null);
//    this.getContentPane().add(jTextField3, null);
    this.getContentPane().add(jTextField2, null);
    this.getContentPane().add(jTextField1, null);
    this.getContentPane().add(jLabel1, null);
    this.getContentPane().add(jButton1, null);

    this.setVisible(true);
    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    setLocationRelativeTo(null);
  }

  private void jButton1_actionPerformed(ActionEvent e) {
    System.out.println("name is " + jTextField1.getText());
    System.out.println("age is " + jTextField2.getText());
    System.out.println("salary is " + jTextField4.getText());
  }
}
