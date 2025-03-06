import java.awt.*;
import java.awt.event.*;
public class ChessBoard{
public static void main(String[] args){
Frame frame = new Frame("=ChessBoard=");
frame.setSize(800, 800);
frame.setLayout(new GridLayout(8,8));
Button[][] button = new Button[8][8];
for(int r = 0; r <= 7; r ++){
for(int c = 0; c <= 7; c ++){
button[r][c] = new Button("");
button[r][c].setBackground((r + c) % 2 == 0 ? Color.WHITE : Color.BLACK);
button[r][c].setForeground((r + c) % 2 == 0 ? Color.BLACK : Color.WHITE);
button[r][c].addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
System.out.println("Performed");
}
}
);
frame.add(button[r][c]);
}
}
frame.setVisible(true);
frame.addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent e){
frame.dispose();
}
}
);
}
}


