import javax.swing.*;

public class MainClass {
    public static void main(String[] args) {
        JFrame obj=new JFrame();
        Gameplay gameplay =new Gameplay();
        obj.setBounds(20,20,700,700);
        obj.setTitle("Brick Breaker Game");
        obj.setResizable(False);
        obj.setVisible(True);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gameplay);

    }
}
