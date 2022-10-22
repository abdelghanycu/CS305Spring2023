package week03;

import java.awt.Dimension;

import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Week03Frame2 extends JFrame {

  private JLabel jLabel1 = new JLabel();
  private JLabel jLabel2 = new JLabel();
  private JLabel jLabel3 = new JLabel();
  private JButton jButton1 = new JButton();
  private JTextField jTextField1 = new JTextField();
  private JTextField jTextField2 = new JTextField();
  private JTextField jTextField3 = new JTextField();

  public Week03Frame2() {
    try {
      jbInit();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private void jbInit() throws Exception {
    this.getContentPane().setLayout(null);
    this.setSize(new Dimension(466, 411));
    jLabel1.setText("name");
    jLabel1.setBounds(new Rectangle(55, 45, 100, 40));
    jLabel2.setText("address");
    jLabel2.setBounds(new Rectangle(55, 105, 100, 40));
    jLabel3.setText("email");
    jLabel3.setBounds(new Rectangle(55, 185, 100, 40));
    jButton1.setText("click");
    jButton1.setBounds(new Rectangle(170, 320, 75, 21));
    jButton1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButton1_actionPerformed(e);
      }
    });
    jTextField1.setBounds(new Rectangle(255, 50, 120, 30));
    jTextField2.setBounds(new Rectangle(250, 120, 120, 30));
    jTextField3.setBounds(new Rectangle(250, 185, 120, 30));
    this.getContentPane().add(jTextField3, null);
    this.getContentPane().add(jTextField2, null);
    this.getContentPane().add(jTextField1, null);
    this.getContentPane().add(jButton1, null);
    this.getContentPane().add(jLabel3, null);
    this.getContentPane().add(jLabel2, null);
    this.getContentPane().add(jLabel1, null);
    this.setVisible(true);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
  }

  private void jButton1_actionPerformed(ActionEvent e) {
    String name = jTextField1.getText();
    String address = jTextField2.getText();
    String email = jTextField3.getText();

    System.out.println("name is " + name);
    System.out.println("address is " + address);
    System.out.println("email is " + email);


    XYSeries series = new XYSeries("XYGraph");
    for(int i = 0; i < 10; i++) {
      int len = 9 + (int)(Math.random() * 10);
      int time = 5 + (int)(Math.random() * 12);
      series.add(len, time);
    }
    XYSeriesCollection dataset = new XYSeriesCollection();
    dataset.addSeries(series);
    JFreeChart chart = ChartFactory.createXYLineChart(
        "here is the title",                // Title
        "length of ....",                  // x-axis Label
        "the Time of ...",                  // y-axis Label
        dataset,                   // Dataset
        PlotOrientation.VERTICAL,  // Plot Orientation
        true,                      // Show Legend
        true,                      // Use tooltips
        false                      // Configure chart to generate URLs?
    );

    ChartPanel chartPanel = new ChartPanel(chart);
    // default size
    chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));


    JFrame plotFrame = new JFrame("Plot");
    plotFrame.setContentPane(chartPanel);
    plotFrame.setSize(500, 500);
    plotFrame.setVisible(true);
  }
}