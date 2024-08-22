package dsjavatraining;
import javax.swing.*;
import java.awt.*;

public class GUIjavaProgramswing {
    public static void main(String[] args) {
        // to create a frame using swing in java


        JFrame frame = new JFrame("BMI Calculator");

        JLabel HeightLabel= new JLabel("Enter your Height");
        JLabel WeightLabel = new JLabel("Enter your Weight");
        JLabel bmiLabel=new JLabel();

        JTextField weightField = new JTextField();
        JTextField heightField = new JTextField();

        JButton bmiButton = new JButton("Calculator BMI ");
        // to set the size and position if UI Components
        HeightLabel.setBounds ( 50,50, 120,40);
        heightField.setBounds(150,30,50,40);
        WeightLabel.setBounds(60,80,120,40);
        weightField.setBounds( 150,80,50,40);
        bmiButton.setBounds(50,120,150,80);
        bmiLabel.setBounds(50,60,30,80);


        // to attach the file to frame
        frame.add(heightField);
        frame.add(weightField);



//        //to build the default  layout
        frame.setLayout(null);

        //to set  the size of frame
        frame.setSize(300,250);

        //to visible the frame on scanner
        frame.setVisible(true);


    }

}
