

package libraryapp;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static libraryapp.DB_Connection.conn;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class checkin extends javax.swing.JFrame {

	 DefaultTableModel model;
	
	 
	javax.swing.JTable jTable1;
	javax.swing.JScrollPane jScrollPane1;
    public checkin() {
        initComponents();
        model=(DefaultTableModel) jTable1.getModel();
        
    }

    
	  
    private void initComponents() {
	// Initialize UI parameters
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bookid = new javax.swing.JTextField();
        Borrower_Name = new javax.swing.JTextField();
        cardno = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        dateout = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
       
        
		        
        jTable1 = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("CHECK-IN");

        jLabel2.setText("Book ID");

       jLabel3.setText("Borrower_Name");

        jLabel4.setText("Card no");

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

        jLabel6.setText("Datein");

        dateout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateoutActionPerformed(evt);
            }
        });

        jLabel7.setText("(YYYY-MM-DD)");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "SL.No", "Book_ID", "Borrower_Name", "Card Number"
                }
            ));
        jScrollPane1.setViewportView(jTable1);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(submit)
                        .addGap(40, 40, 40)
                        .addComponent(cancel)
                        .addGap(43, 43, 43)
                        .addComponent(back)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bookid, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(Borrower_Name)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(24, 24, 24)
                        
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cardno, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateout, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(jLabel7)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(bookid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(Borrower_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cardno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    )
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit)
                    .addComponent(back) 
                    .addComponent(cancel)
                    )
                    
                .addGap(40, 40, 40))
        );

        pack();
    }

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {
        bookid.setText("");
        Borrower_Name.setText("");
        cardno.setText("");
        dateout.setText("");
    }

    private void dateoutActionPerformed(java.awt.event.ActionEvent evt) {
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

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {
                try
		{
		
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarynew?user=root&password=chintu007");

                        Statement stmt = conn.createStatement();
                        String cno=cardno.getText();
                        String bkid=bookid.getText();
                        String brid=Borrower_Name.getText();
                       
                        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                        Date date = new Date();
                        ResultSet rs,rs1,rs2,rs3,rs4,rs5,rs6,rs7;
                        if("".equals(cno) && "".equals(bkid) && "".equals(brid))
                        {
                        JOptionPane.showMessageDialog(null,"Please enter any field");
                        }
                        else if("".equals(cno) && "".equals(bkid))
                        {
                         String bname =Borrower_Name.getText();
                         String val= "select temp.book_id as book_id,temp1.Fname as Borrower_name, temp.Card_no as Card_Number from BOOK_LOANS as temp, BORROWER as temp1 where BORROWER.Fname like '%"+bname+"%' AND BORROWER.Card_no = BOOK_LOANS.Card_no";
                         
                         rs=stmt.executeQuery(val);
                         String book_id = rs.getString("Book_Id");
                        
                         while(rs.next()){
                          
                            model.insertRow(model.getRowCount(), new Object[]{rs.getString("Book_Id"),rs.getString("Borrower_name"),rs.getString("Card_Number")} );
                             
                            
                        
                        }
                         String val2 = "UPDATE BOOK_LOANS SET Date_in = "+dateFormat.format(date)+" WHERE Book_id = '"+book_id+"'";
                         rs7=stmt.executeQuery(val2);
                        } 
                        else if("".equals(cno) && "".equals(brid)){
                            bookid.getText();
                            String val6= "select temp.book_id as book_id,temp1.Fname as Borrower_name, temp.Card_no as Card_Number from BOOK_LOANS as temp, BORROWER as temp1 where BOOK_LOANS.Book_id like '%"+bkid+"%' AND BORROWER.Card_no = BOOK_LOANS.Card_no ";
                            rs5=stmt.executeQuery(val6);
                            
                        while(rs5.next()){
                            
                        	 model.insertRow(model.getRowCount(), new Object[]{rs5.getString("Book_Id"),rs5.getString("Borrower_name"),rs5.getString("Card_Number")} );
                            
                        }
                        
                        }
                        else if("".equals(bkid) && "".equals(brid)){
                            cardno.getText();
                            String val7= "select temp.book_id as book_id,temp1.Fname as Borrower_name, temp.Card_no as Card_Number from BOOK_LOANS as temp, BORROWER as temp1 where BOOK_LOANS.Card_no like '%"+Integer.parseInt(cno)+"%' AND BORROWER.Card_no = BOOK_LOANS.Card_no ";
                            rs6=stmt.executeQuery(val7);
                            
                        while(rs6.next()){
                            
                        	 model.insertRow(model.getRowCount(), new Object[]{rs6.getString("Book_Id"),rs6.getString("Borrower_name"),rs6.getString("Card_Number")} );
                            
                        }
                        String book_id = rs6.getString("Book_Id");
                        String val2 = "UPDATE BOOK_LOANS SET Date_in = "+dateFormat.format(date)+" WHERE Book_id = '"+book_id+"'";
                        rs7=stmt.executeQuery(val2);    
                        }
                        else if("".equals(bkid)){
                            Borrower_Name.getText();
                            cardno.getText();
                            String val4="select temp.book_id as book_id,temp1.Fname as Borrower_name, temp.Card_no as Card_Number from BOOK_LOANS as temp, BORROWER as temp1 where BORROWER.Fname like '%"+brid+"%' AND BOOK_LOANS.Card_no like '%"+Integer.parseInt(cno)+"%' AND BORROWER.Card_no = BOOK_LOANS.Card_no ";
                            rs1=stmt.executeQuery(val4);
                            while(rs1.next())
                            {
                           
                            	 model.insertRow(model.getRowCount(), new Object[]{rs1.getString("Book_Id"),rs1.getString("Borrower_name"),rs1.getString("Card_Number")} );
                            
                            }
                            String book_id = rs1.getString("Book_Id");
                            String val2 = "UPDATE BOOK_LOANS SET Date_in = "+dateFormat.format(date)+" WHERE Book_id = '"+book_id+"'";
                            rs7=stmt.executeQuery(val2);
                        }
                        else if("".equals(brid)){
                             cardno.getText();
                             bookid.getText();
                             String val3="select temp.book_id as book_id,temp1.Fname as Borrower_name, temp.Card_no as Card_Number from BOOK_LOANS as temp, BORROWER as temp1 where BOOK_LOANS.Book_id like '%"+bkid+"%' AND BOOK_LOANS.Card_no like '%"+Integer.parseInt(cno)+"%' AND BORROWER.Card_no = BOOK_LOANS.Card_no ";
                            rs2=stmt.executeQuery(val3);
                            
                            while(rs2.next())
                            {
                           
                            	 model.insertRow(model.getRowCount(), new Object[]{rs2.getString("Book_Id"),rs2.getString("Borrower_name"),rs2.getString("Card_Number")} );
                            
                            }
                            String book_id = rs2.getString("Book_Id");
                            String val2 = "UPDATE BOOK_LOANS SET Date_in = "+dateFormat.format(date)+" WHERE Book_id = '"+book_id+"'";
                            rs7=stmt.executeQuery(val2);
                        }
                        else if("".equals(cno)){
                            Borrower_Name.getText();
                            bookid.getText();
                            String val2="select temp.book_id as book_id,temp1.Fname as Borrower_name, temp.Card_no as Card_Number from BOOK_LOANS as temp, BORROWER as temp1 where BOOK_LOANS.Book_id like '%"+bkid+"%' AND BORROWER.Fname like '%"+brid+"%' AND BORROWER.Card_no = BOOK_LOANS.Card_no "; 
                            rs3=stmt.executeQuery(val2);
                            while(rs3.next())
                            {
                                
                            	 model.insertRow(model.getRowCount(), new Object[]{rs3.getString("Book_Id"),rs3.getString("Borrower_name"),rs3.getString("Card_Number")} );
                             
                            }
                            String book_id = rs3.getString("Book_Id");
                            String val3 = "UPDATE BOOK_LOANS SET Date_in = "+dateFormat.format(date)+" WHERE Book_id = '"+book_id+"'";
                            rs7=stmt.executeQuery(val3);
                        }
                          else
                          {
                             Borrower_Name.getText();
                            cardno.getText();
                            bookid.getText();
                            String val5="select temp.book_id as book_id,temp1.Fname as Borrower_name, temp.Card_no as Card_Number from BOOK_LOANS as temp, BORROWER as temp1 where BOOK_LOANS.Book_id like '%"+bkid+"%' AND BOOK_LOANS.Card_no like '%"+Integer.parseInt(cno)+"%' AND BORROWER.Fname like '%"+brid+"%'  AND BORROWER.Card_no = BOOK_LOANS.Card_no ";
                            rs4=stmt.executeQuery(val5);
                            
                            while(rs4.next()){
                              
                            	 model.insertRow(model.getRowCount(), new Object[]{rs4.getString("Book_Id"),rs4.getString("Borrower_name"),rs4.getString("Card_Number")} );
                                  
                          }
                            String book_id = rs4.getString("Book_Id");
                            String val2 = "UPDATE BOOK_LOANS SET Date_in = "+dateFormat.format(date)+" WHERE Book_id = '"+book_id+"'";
                            rs7=stmt.executeQuery(val2);
                          }
                        
                        conn.close();
                       
                        
                     
                        cardno.setText("");
                        bookid.setText("");
                        Borrower_Name.setText("");
                        dateout.setText(dateFormat.format(date));
                        
                        conn.close();
                }
                catch(SQLException ex)
		{
		JOptionPane.showMessageDialog(null,ex);
                }
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
            java.util.logging.Logger.getLogger(checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(checkin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new checkin().setVisible(true);
            }
        });
    }

    
    private javax.swing.JButton back;
    private javax.swing.JTextField bookid;
    private javax.swing.JTextField Borrower_Name;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField cardno;
    private javax.swing.JTextField dateout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton submit;
    
}
