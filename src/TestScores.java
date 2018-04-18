import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
String answer = JOptionPane.showInputDialog("What is your test score?");
		 double testScore = Double.parseDouble (answer);
		  if (testScore >= 90.00) {
			  JOptionPane.showMessageDialog(null, "Good job!");
		  }
		  else {
			  JOptionPane.showMessageDialog(null, "Study harder!");
		  }
}
}
