/* Love Calculator Personal Assignment by Mark Liu
Algorithm that used by this program to calculate love between two people is as follows:

1) Take the names of the two people (e.g. Jimmy and Jennifer).
2) Convert the letters to all uppercase characters (e.g. JIMMY and JENNIFER).
3) Eliminate any repetitive letters that occur in each name. So, for example, JIMMY would be changed to JIMY. JENNIFER to JENIFR.
4) Concatenate the two names (e.g. JIMYJENIFR).
5) Convert each letter in the concatenated names to an int (i.e. ASCII values). So, the letter A for example would be 65, B equals 66, etc.
6) Add together all the ASCII values for each character and calculate the remainder when dividing by 101.
7) The remainder is the love percentage.
8) Be sure to deal with the situation where the user enters numbers instead of letters.

 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Love_Calculator extends JFrame { //Love_Calculator inherits everything from JFrame.

    public JPanel panel; //Creates public JPanel variable called panel.
    public JLabel title; //Creates public JLabel variable called title.
    public JLabel name1; //Creates public JLabel variable called name1.
    public JLabel name2; //Creates public JLabel variable called name2.
    public JLabel percent; //Creates public JLabel variable called percent.
    public JLabel error; //Creates public JLabel variable called error.
    public JLabel percentName; //Creates public JLabel variable called percentName.
    public JButton clear; //Creates public JButton variable called clear.
    public JButton submit; //Creates public JButton variable called submit.
    public JTextField x_name; //Creates public JTextField called x_name.
    public JTextField y_name; //Creates public JTextField called y_name.


    public static void main(String[] args) {
        new Love_Calculator();
    }
    public Love_Calculator() {

        int num = 0;
        //Creates an integer variable called num. This is the initial percent before any names are submitted.

        panel = new JPanel();
        //Creates a JPanel object called panel.
        panel.setLayout(null);
        panel.setBackground(Color.PINK);
        //Sets panel colour to pink.

        title = new JLabel("LOVE CALCULATOR");
        //Creates a JLabel object called title. Sets the text that will be displayed in title.
        title.setBounds(210, 5, 374, 69);
        //Sets location of title and its dimensions.
        title.setOpaque(true);
        title.setBackground(Color.YELLOW);
        //Sets title background colour.
        title.setBorder(BorderFactory.createLineBorder(Color.ORANGE, 6));
        //Gives title a border.
        title.setHorizontalAlignment(JLabel.CENTER);
        //Horizontally centres the text in title.
        title.setVerticalAlignment(JLabel.CENTER);
        //Vertically centres the text in title.

        name1 = new JLabel("Enter Name 1");
        //Creates a JLabel object called name1. Sets the text that will be displayed in name1.
        name1.setBounds(50, 274, 198, 28);
        //Sets location of name1 and its dimensions.
        name1.setOpaque(true);
        name1.setBackground(Color.YELLOW);
        //Sets name1 background colour.
        name1.setBorder(BorderFactory.createLineBorder(Color.ORANGE, 4));
        //Gives name1 a border.
        name1.setHorizontalAlignment(JLabel.CENTER);
        //Horizontally centres the text in name1.
        name1.setVerticalAlignment(JLabel.CENTER);
        //Vertically centres the text in name1.

        name2 = new JLabel("Enter Name 2");
        //Creates a JLabel object called name2. Sets the text that will be displayed in name2.
        name2.setBounds(550, 274, 198, 28);
        //Sets location of name2 and its dimensions.
        name2.setOpaque(true);
        name2.setBackground(Color.YELLOW);
        //Sets name2 background colour.
        name2.setBorder(BorderFactory.createLineBorder(Color.ORANGE, 4));
        //Gives name2 a border.
        name2.setHorizontalAlignment(JLabel.CENTER);
        //Horizontally centres the text in name2.
        name2.setVerticalAlignment(JLabel.CENTER);
        //Vertically centres the text in name2.

        percent = new JLabel(num + "%");
        //Creates a JLabel object called percent. Sets the text that will be displayed in percent.
        percent.setBounds(300, 135, 198, 198);
        //Sets location of percent and its dimensions.
        percent.setOpaque(true);
        percent.setBackground(Color.YELLOW);
        //Sets percent background colour.
        percent.setBorder(BorderFactory.createLineBorder(Color.ORANGE, 4));
        //Gives percent a border.
        percent.setHorizontalAlignment(JLabel.CENTER);
        //Horizontally centres the text in percent.
        percent.setVerticalAlignment(JLabel.CENTER);
        //Vertically centres the text in percent.

        percentName = new JLabel("Love Compatibility Percentage");
        //Creates a JLabel object called percentName. Sets the text that will be displayed in percentName.
        percentName.setBounds(300, 100, 198, 28);
        //Sets location of percentName and its dimensions.
        percentName.setOpaque(true);
        percentName.setBackground(Color.YELLOW);
        //Sets percentName background colour.
        percentName.setBorder(BorderFactory.createLineBorder(Color.ORANGE, 4));
        //Gives percentName a border.
        percentName.setHorizontalAlignment(JLabel.CENTER);
        //Horizontally centres the text in percentName.
        percentName.setVerticalAlignment(JLabel.CENTER);
        //Vertically centres the text in percentName.

        error = new JLabel("");
        //Creates a JLabel object called error. Sets the text that will be displayed in error.
        error.setBounds(550, 340, 200, 25);
        //Sets location of error and its dimensions.
        error.setOpaque(true);
        error.setBackground(Color.YELLOW);
        //Sets error background colour.
        error.setBorder(BorderFactory.createLineBorder(Color.ORANGE, 4));
        //Gives error a border.
        error.setHorizontalAlignment(JLabel.CENTER);
        //Horizontally centres the text in error.
        error.setVerticalAlignment(JLabel.CENTER);
        //Vertically centres the text in error.

        clear = new JButton("Clear");
        //Creates a JButton object called clear. Sets the text that will be displayed in clear.
        clear.addActionListener(new ButtonListener());
        clear.setBounds(300, 370, 200, 25);
        //Sets location of clear and its dimensions.
        clear.setToolTipText("This will clear both names.");
        //Sets the text that will be displayed when mouse is hovered over clear.

        submit = new JButton("Calculate love");
        //Creates a JButton object called submit. Sets the text that will be displayed in submit.
        submit.addActionListener(new ButtonListener());
        submit.setBounds(300, 340, 200, 25);
        //Sets location of submit and its dimensions.
        submit.setToolTipText("This will submit both names into the love calculator.");
        //Sets the text that will be displayed when mouse is hovered over submit.

        x_name = new JTextField("", 20);
        x_name.setBounds(50, 309, 200, 25);
        //Sets location of x_name and its dimensions.

        y_name = new JTextField("", 20);
        y_name.setBounds(550, 309, 200, 25);
        //Sets location of y_name and its dimensions.

        Font font1 = new Font("TimesRoman", Font.ITALIC, 30);
        //Creates font variable called font1.
        Font font2 = new Font("Sabon", Font.ITALIC, 76);
        //Creates font variable called font2.

        title.setFont(font1);
        //Assigns title to use font1.
        percent.setFont(font2);
        //Assigns percent to use font2.



        panel.add(title);
        //Adds title to panel.
        panel.add(name1);
        //Adds name1 to panel.
        panel.add(name2);
        //Adds name2 to panel.
        panel.add(percent);
        //Adds percent to panel.
        panel.add(error);
        //Adds error to panel.
        panel.add(percentName);
        //Adds percentName to panel.
        panel.add(clear);
        //Adds clear to panel.
        panel.add(submit);
        //Adds submit to panel.
        panel.add(x_name);
        //Adds x_name to panel.
        panel.add(y_name);
        //Adds y_name to panel.



        //Sets the properties of the panel
        setContentPane(panel);
        //Setting panel to the content page.
        setSize(800, 450);
        //Sets dimensions of panel.
        setTitle("LOVE CALCULATOR");
        //Sets title of panel.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Action that will happen by default when user clicks CLOSE button(exit).
        setVisible(true);
        //Shows panel.
        setResizable(true);
        //sets the panel able to be resized.
    }



    public class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == submit) { //If submit button is activated.

                //Checks if name is valid.
                //Trim checks for empty space.
                if (x_name.getText().trim().equals("") || y_name.getText().trim().equals("")) {
                    //If one or both name slots are empty.
                    error.setText("Please provide a name");
                    //Error message.

                } else if (!(isValidName(x_name.getText()) &&
                             isValidName(y_name.getText()))) {
                    //If not letters in name slots.
                    error.setText("Please provide valid names");
                    //Error message.

                } else {
                    //If names are valid.
                    error.setText("");
                    percent.setText(Integer.toString(getLoveAlgorithm(x_name.getText(),
                                                                      y_name.getText())) + "%");
                }
            }

            //If clear is activated, percent, x_name, y_name, and error message will return to original values.
            if (e.getSource() == clear) {
                percent.setText("0%");
                x_name.setText("");
                y_name.setText("");
                error.setText("");
            }
        }
    }

    //Checks if the string contains a number.
    public static boolean isValidName(String str) {
        if (str.matches(".*\\d.*")) {
            return false;
        } else {
            return true;
        }
    }



    //Method to get love algorithm
    public static int getLoveAlgorithm(String name1, String name2) {
        int result = 0;

        result = getTotalAsciiValue(getUniqueLetter(name1) +
                getTotalAsciiValue(getUniqueLetter(name2))) % 101;

        return result;
    }



    //Method to get unique uppercase letters from name  (Steps 1-3 from the algorithm)
    private static String getUniqueLetter(String name) {
        String uniqueLetter = "";

        name = name.toUpperCase();
        //Changes all letters in name to uppercase.

        for (int i = 0; i < name.length(); i++) {

            if (!uniqueLetter.contains(String.valueOf(name.charAt(i)))) {
                uniqueLetter = uniqueLetter + name.charAt(i);
                //Removes duplicate/repeating letters in names.
            }
        }
        return uniqueLetter;
    }



    //Method to get total ASCII value from name (Steps 5-6 from the algorithm)
    private static int getTotalAsciiValue(String name) {
        int total = 0;

        for (int i = 0; i < name.length(); i++) {
            total = total + (int) name.charAt(i);
            //Converts to char sequence.
        }
        return total;
    }
}