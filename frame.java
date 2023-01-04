import javax.swing.*;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class frame
{
    public static void main(String args[])
    {
        JFrame window=new JFrame("Hello");
        window.setSize(250,300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton bt=new JButton("Click Here");
        window.setLayout(new FlowLayout());
        window.add(bt);
        ImageIcon icon=new ImageIcon("Sign.jpg");
        
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(bt,"Hello Saket ","Dont Vlick",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        bt.setSize(50,50);
        window.setVisible(true);

    }
}