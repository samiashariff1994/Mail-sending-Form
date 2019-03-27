
package mailapp;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MailApp extends JFrame implements ActionListener {
    
    JLabel sendToLabel = new JLabel("Send To:");
    JLabel subjectLabel = new JLabel("Subject:");
    JLabel msgLabel = new JLabel("Message:");
    JLabel library = new JLabel("Email Form");
    
    JTextField sendText = new JTextField(15);
    JTextField subjectText = new JTextField(15);
    JTextField messageText = new JTextField(10);
        
    JButton sendBtn = new JButton("Send");
    JButton clearBtn = new JButton("Clear");
    JButton Backbtn = new JButton("Go Back");
      
    JPanel panel = new JPanel();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    
    
        public MailApp(){
            setTitle("Mail Form");
            setSize(400,350);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new FlowLayout());
            setVisible(true);
            
            sendBtn.setBackground(Color.WHITE);
            Backbtn.setBackground(Color.WHITE);
            clearBtn.setBackground(Color.WHITE);
            
            sendToLabel.setForeground(Color.WHITE);
            subjectLabel.setForeground(Color.WHITE);
            msgLabel.setForeground(Color.WHITE);
            library.setForeground(Color.WHITE);
            panel.add(library);
            
            panel1.add(sendToLabel);
            panel1.add(sendText);
            
            panel2.add(subjectLabel);
            panel2.add(subjectText);
            
            panel3.add(msgLabel);
        //    panel3.add(new JLabel("           "));
            panel3.add(messageText);
            
            panel4.add(sendBtn);
            panel4.add(clearBtn);
            panel4.add(Backbtn);
            
        //    sendToLabel.setForeground(Color.WHITE);
           // panel.add(sendToLabel);
            
            panel.setPreferredSize(new Dimension(300, 50));
        Color blue3 = new Color(62,96,111);
        panel.setBackground(blue3);
        
        Color blue2 = new Color(145,170,180);
        panel1.setPreferredSize(new Dimension(300, 50));
        panel1.setBackground(blue2);
        
      //  Color blue1 = new Color(145,170,180);
        panel2.setPreferredSize(new Dimension(300, 50));
        panel2.setBackground(blue2);
        
        panel3.setPreferredSize(new Dimension(300, 50));
        panel3.setBackground(blue2);
        
        panel4.setPreferredSize(new Dimension(300, 50));
        panel4.setBackground(blue3);
        
        
        add(panel);
        add(panel1);
        add(panel2);
        add(panel3);
        add(panel4);
        
         this.getContentPane().setBackground(blue3);
        
            
            
            
            Backbtn.addActionListener(this);
            sendBtn.addActionListener(this);
            clearBtn.addActionListener(this);
            
            
        }


//    public static void main(String[] args) {
//        MailApp f1 = new MailApp();
//        
//        
//        
//    }
      
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==sendBtn)
        {
            String to = "janahajj187@gmail.com";
          //  String to = sendText.getText();
       //     String subject = subjectText.getText();
            String message = messageText.getText().toString();
          //  String user = "aizaz319@gmail.com";
          //  String pass = "aizazalishah100";
           
            sendMail.sendMail("aizaz319@gmail.com", "aizazalishah100", message, to);
           // sendMail.send(to, subject, message, user, pass);
          //  sendMail.send(to, user, pass, user, pass);
            
            
            
            
            
//            String msg;
//           
//                msg = this.message.getText().toString();
//             if(msg.length()<=0){
//                JOptionPane.showMessageDialog(null, "You didn't enter anything"); 
//            }
//             else
//            JOptionPane.showMessageDialog(null, "Message sent successfully");
        }
    
        else if(e.getSource()==clearBtn){
            sendText.setText("");
            subjectText.setText("");
            messageText.setText("");
            
        }
        else if(e.getSource()==Backbtn){
            new Login();
            this.dispose();
        }

    }

}

