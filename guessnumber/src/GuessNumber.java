import javax.swing.JOptionPane;

public class GuessNumber {
    void Guess() {
  ;
    JOptionPane.showMessageDialog(null, "Guess the number between one and one hundred"); //prompts user

        int num = (int) (Math.random()*100); //creates random number

        while(true) {
            int guess = Integer.parseInt(JOptionPane.showInputDialog("your guess:")); //gathers user input
            if (guess > num) {
                JOptionPane.showMessageDialog(null, "The number is less than your guess"); 
                }
            else if (guess < num){
            JOptionPane.showMessageDialog(null, "The number is more than your guess");
            }
            else {
                JOptionPane.showMessageDialog(null, "correct guess🎉");
                break; //ends program upon correct guess
            }
        }
    }
}