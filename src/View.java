import javax.swing.*;
import java.awt .*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class View {
    private JFrame frame;
    private JButton btFirstName, btLastName, btCity, btEmail, btID, btUpdateSalary, btGetInsight;
    private JPanel panelBot, panelTop;
    private JTextField tfFirstName, tfLastName, tfCity, tfEmail, tfID;

    public View(){
        frame = new JFrame("Project Name");
        btID = new JButton("ID:");
        tfFirstName = new JTextField(10);
        btFirstName = new JButton("Firs name:");
        tfLastName = new JTextField(10);
        btLastName = new JButton("Last name:");
        btCity = new JButton("City");
        btEmail = new JButton("Email:");
        tfID = new JTextField(10);
        tfCity = new JTextField(10);
        tfEmail = new JTextField(10);
        btUpdateSalary = new JButton("Update salary");
        btGetInsight = new JButton("Get insight");

        panelTop = new JPanel();
        panelBot = new JPanel();
        //getting frame content pane
        Container container = frame.getContentPane();

//assigning layout managers for each one of the containers
        panelBot.setLayout(new FlowLayout());
        panelTop.setLayout(new FlowLayout());
        container.setLayout(new GridLayout(2,1 ));

//placing the components above the containers
        panelTop.add(btFirstName);
        panelTop.add(tfFirstName);
        panelTop.add(btLastName);
        panelTop.add(tfLastName);
        panelTop.add(btID);
        panelTop.add(tfID);
        panelTop.add(btCity);
        panelTop.add(tfCity);
        panelTop.add(btEmail);
        panelTop.add(tfEmail);
        panelBot.add(btGetInsight);
        panelBot.add(btUpdateSalary);
        container.add(panelBot);
        container.add(panelTop);

        //Handling "update salary data button".
        ActionListener listener = new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
                if(event.getSource() == btUpdateSalary) { // what "update salary" does
                    String firstname = tfFirstName.getText();
                    String lastname = tfLastName.getText();
                    String city = tfCity.getText();
                    String email = tfEmail.getText();
                    String ID = tfID.getText();
                    user usr = new user(ID, firstname, lastname, email, city);
                    usr.ShowUser();
                }
                else if (event.getSource()== btGetInsight) // what "get insight" does
                {
                    JFrame frame2 = new JFrame("clicked");
                    frame2.setVisible(true);
                    frame2.setSize(200,200);
                    JLabel label2 = new JLabel( "ive been clicked");
                    JPanel panel2 = new JPanel();
                    panel2.add(label2);
                }
            }
        };

        btUpdateSalary.addActionListener(listener);
        btGetInsight.addActionListener(listener);


        //handling frame closing event
        frame.addWindowListener(new WindowAdapter()
                                {
                                    public void windowClosing(WindowEvent event)
                                    {
                                        frame.setVisible(false);
                                        frame.dispose();
                                        System.exit(0);
                                    }
                                }
        );

    }

    public void go()
    {
        frame.setSize(1000,1000);
        frame.setVisible(true);
    }

  /*  public static void main(String args[])
    {
        View demo = new View();
        demo.go();
    }*/
}