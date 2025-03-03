package co.edu.uptc;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
//import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
//import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class view_componentes extends JFrame{
    private JRadioButton btnradio1,btnradio2;

    public view_componentes(){
        super("Componentes swing");
        setSize(1000,800);
        setLayout(null);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.GRAY);
        //JPasswordField password=new JPasswordField();
       // password.setEchoChar('*');
        //JCheckBox opt1=new JCheckBox("OPCION 1");
        //JCheckBox opt2=new JCheckBox("opcion 2");
        //opt1.setSelected(true);
        //opt1.setBounds(690,190,100, 500);
        JPanel panel=new JPanel();
        panel.setBounds(50,50,900,600
        );
        ButtonGroup modalidad=new ButtonGroup();
        panel.setLayout(null);
        panel.add(createLabel("FORMULARIO DE INSCRIPCIÓN"));
        panel.add(createLabel2("Identificación"));
        panel.add(createLabel3("Nombres"));
        panel.add(createLabel4JLabel("Dirección"));
        panel.add(createTextField());
        panel.add(createTextField2());
        panel.add(createTextField3());
        panel.add(createLabelChekbox("Seleccione areas de interes"));
        panel.add(createCheckBox());
        panel.add(createCheckBox1());
        panel.add(createCheckBox2());
        btnradio1=(createRadioButton("Nocturna",modalidad));
        btnradio2=(createRadioButton2("Diurna",modalidad));
        panel.add(btnradio1);
        panel.add(btnradio2);
        
       // panel.add(createButton("Guardar"));
       // panel.add(createTextField());
        //panel.add(password);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().add(panel);
        setVisible(true);

                

    }
    
    private JLabel createLabel(String labelText){
        JLabel label=new JLabel(labelText);
        label.setBounds(320, 70, 300,100);
        label.setFont(new Font ("arial",Font.BOLD,16));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setHorizontalTextPosition(SwingConstants.CENTER);
         return label;
    }
    private JLabel createLabel2(String labelText){
        JLabel label=new JLabel(labelText);
        label.setBounds(200, 150, 100,20);
        label.setHorizontalAlignment(SwingConstants.LEFT);
        label.setHorizontalTextPosition(SwingConstants.LEFT);
         return label;
    }
    private JTextField createTextField(){
        JTextField textField =new JTextField();
        textField.setFont(new Font ("arial",Font.ITALIC,14));
        textField.setBounds(400, 150, 300, 20);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        return textField;
    }
    private JLabel createLabel3(String labelText){
        JLabel label=new JLabel(labelText);
        label.setBounds(200, 180, 100,20);
        label.setHorizontalAlignment(SwingConstants.LEFT);
        label.setHorizontalTextPosition(SwingConstants.LEFT);
         return label;
    }
    private JTextField createTextField2(){
        JTextField textField =new JTextField();
        textField.setFont(new Font ("arial",Font.ITALIC,14));
        textField.setBounds(400, 180, 300, 20);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        return textField;
    }
    private JLabel createLabel4JLabel(String labelText){
        JLabel label=new JLabel(labelText);
        label.setBounds(200, 210, 100,20);
        label.setHorizontalAlignment(SwingConstants.LEFT);
        label.setHorizontalTextPosition(SwingConstants.LEFT);
         return label;
    }
    private JTextField createTextField3(){
        JTextField textField =new JTextField();
        textField.setFont(new Font ("arial",Font.ITALIC,14));
        textField.setBounds(400, 210, 300, 20);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        return textField;
    }
    private JLabel createLabelChekbox(String labelText){
        JLabel label=new JLabel(labelText);
        label.setBounds(200, 270, 200,20);
        label.setHorizontalAlignment(SwingConstants.LEFT);
        label.setHorizontalTextPosition(SwingConstants.LEFT);
         return label;
    }
    private JCheckBox createCheckBox(){
        JCheckBox checkBox=new JCheckBox();
        checkBox.setText("Ingenieria");
        checkBox.setSelected(false);
        checkBox.setBounds(400, 270, 100, 20);
        return checkBox;

    }
    private JCheckBox createCheckBox1(){
        JCheckBox checkBox=new JCheckBox();
        checkBox.setText("Artes");
        checkBox.setSelected(false);
        checkBox.setBounds(500, 270, 100, 20);
        return checkBox;

    }
    private JCheckBox createCheckBox2(){
        JCheckBox checkBox=new JCheckBox();
        checkBox.setText("Educación");
        checkBox.setSelected(false);
        checkBox.setBounds(600, 270, 100, 20);
        return checkBox;

    }
    private JRadioButton createRadioButton(String btnradio,ButtonGroup modalidad){
        JRadioButton btnrad=new JRadioButton(btnradio);
        btnrad.setBounds(400, 320, 100, 20);
        modalidad.add(btnrad);
        return btnrad;

    }
    private JRadioButton createRadioButton2(String btnradio,ButtonGroup modalidad){
        JRadioButton btnrad=new JRadioButton(btnradio);
        btnrad.setBounds(500, 320, 100, 20);
        modalidad.add(btnrad);
        return btnrad;

    }
   /*private JButton createButton(String btnTxt){
        JButton button1=new JButton(btnTxt);
        button1.setBounds(150, 50, 300, 100);
        return button1;
    }
    /* 
    
    */


}
