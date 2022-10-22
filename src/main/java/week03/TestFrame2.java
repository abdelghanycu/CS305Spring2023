package week03;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class TestFrame2 extends JFrame {


  public TestFrame2() {

    JButton button = new JButton("click here");

    //    JFrame f = new JFrame();
    this.add(button);
    this.setSize(700, 700);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    setVisible(true);
  }

  public static void main(String[] args) {
//    new TestFrame2();

    new Week03Frame2();
  }
}
