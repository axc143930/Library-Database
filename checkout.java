

package libraryapp;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static libraryapp.DB_Connection.conn;


public class checkout extends javax.swing.JFrame {

    
    public checkout() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bookid = new javax.swing.JTextField();
        branchid = new javax.swing.JTextField();
        cardno = new javax.swing.JTextField();
        bid = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        jLabel1.setText("CHECK-OUT");

        jLabel2.setText("Book ID");

        jLabel3.setText("Branch ID");

        jLabel4.setText("Card no");

        jLabel5.setText("Book Issue Date");

        jLabel6.setText("Book Due Date");
        
        bookid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookidActionPerformed(evt);
            }
        });

        branchid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                branchidActionPerformed(evt);
            }
        });

        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel6.setText("(YYYY-MM-DD)");
        jLabel6.setText("(YYYY-MM-DD)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(bookid, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(branchid, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bid, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel6))
                                    .addComponent(cardno, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(submit)
                        .addGap(32, 32, 32)
                        .addComponent(cancel)
                        .addGap(38, 38, 38)
                        .addComponent(back)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(branchid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cardno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel)
                    .addComponent(back)
                    .addComponent(submit))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }

    private void bookidActionPerformed(java.awt.event.ActionEvent evt) {
     
    }

    private void branchidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_branchidActionPerformed
      
    }

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        
         try
		{
		
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarynew?user=root&password=chintu007");
		
                        Statement stmt = conn.createStatement();
                        String cno=cardno.getText();
                        String bkid=bookid.getText();
                        String brid=branchid.getText();
                        int b=Integer.parseInt(brid);
                        String outdate=bid.getText();
                        String output;
                        int bc = 0;
                        try{
                            bc=Integer.parseInt(cno);
                        }
                        catch(NumberFormatException e){
                            String st="Enter Correct Format of Number";
                            JOptionPane.showMessageDialog(null,st); 
                        }
                        String book_count="select count(*) from Book_loans where Card_no="+bc+";";
                        ResultSet rs;
                        String n1 = null;
                        rs=stmt.executeQuery(book_count);
                        while(rs.next()){
                        n1=rs.getString("count(*)");
                        }
                        
                        int count = Integer.parseInt(n1);
                        if(count<3){
                        try {
                            
                            SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd");
                            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                            Date date = parser.parse(outdate);
                            Date duedate=addDays(date,14);
                            output=formatter.format(duedate);
                            String add= "insert into Book_Loans values('"+bkid+"',"+b+",'"+cno+"','"+outdate+"','"+output+"');";
                            stmt.executeUpdate(add);
                            JOptionPane.showMessageDialog(null,"Succesfull");
                        cardno.setText("");
                        bookid.setText("");
                        branchid.setText("");
                        bid.setText("");
                         } 
                        catch (ParseException ex) {
                                Logger.getLogger(checkout.class.getName()).log(Level.SEVERE, null, ex);
                         }
                    }
                    else{
                            String st="Cannot loan books beyond limit";
                            JOptionPane.showMessageDialog(null,st);    
                    }
                        conn.close();
                }
                        
                catch(SQLException ex)
		{
		JOptionPane.showMessageDialog(null,ex);
                } 
    }
public static Date addDays(Date d,int days)
{
d.setTime(d.getTime() + days * 1000 * 60 * 60 * 24);
return d;
}
    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {
     
        bookid.setText("");
        branchid.setText("");
        cardno.setText("");
        bid.setText("");
    }
public void close()
{
WindowEvent winclosingevent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winclosingevent);
}   
    private void backActionPerformed(java.awt.event.ActionEvent evt) {
        close();
        HomePage hp=new HomePage();
        hp.setVisible(true);
    }

    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new checkout().setVisible(true);
            }
        });
    }

    
    private javax.swing.JButton back;
    private javax.swing.JTextField bid;
    private javax.swing.JTextField bookid;
    private javax.swing.JTextField branchid;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField cardno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton submit;
  
}
