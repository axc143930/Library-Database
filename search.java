
package libraryapp;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static libraryapp.DB_Connection.conn;


public class search extends javax.swing.JFrame {
      DefaultTableModel model;

    
    public search() {
        initComponents();
         model=(DefaultTableModel) jTable1.getModel();
    }

    
    
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bid = new javax.swing.JTextField();
        title = new javax.swing.JTextField();
        author = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18));
        jLabel1.setText(" Book_id:");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18));
        jLabel2.setText("Title:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); 
        jLabel3.setText("Author:");

        title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleActionPerformed(evt);
            }
        });

        search.setFont(new java.awt.Font("Times New Roman", 1, 18));
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("Times New Roman", 1, 18));
        reset.setForeground(new java.awt.Color(51, 51, 51));
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book_ID", "title", "Branch_id", "Number of copies", "Copies Available"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel1)))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(author, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                            .addComponent(title)
                            .addComponent(bid)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)))
                .addGap(473, 473, 473)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2085, 2085, 2085))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bid, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addComponent(author, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        pack();
    }

    private void titleActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {
     
        try 
      {
        
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarynew?user=root&password=chintu007");
        Statement stmt=conn.createStatement();
         String t=title.getText();
        String a=author.getText();
        String b=bid.getText();
        ResultSet rs,rs1,rs2,rs3,rs4,rs5,rs6;
        if("".equals(t) && "".equals(a) && "".equals(b))
        {
        JOptionPane.showMessageDialog(null,"Please enter any field");
        }
        else if("".equals(t) && "".equals(a))
        {
         String st=bid.getText();
         String val= "select temp.book_id as book_id,temp.title as title, temp.branch_id as branch_id, no_of_copies as total,no_of_copies-count(book_loans.book_id) as available from book_loans right join (select book.title,book.book_id,branch_id,no_of_copies from book_copies natural join book left join book_authors on book.book_id=book_authors.book_id where book.book_id like '%"+st+"%' group by branch_id,book_id) as temp on book_loans.book_id=temp.book_id and book_loans.branch_id=temp.branch_id group by temp.book_id,temp.branch_id,no_of_copies";
         rs=stmt.executeQuery(val);
        
        while(rs.next()){
          
            model.insertRow(model.getRowCount(), new Object[]{rs.getString("Book_Id"),rs.getString("Title"),rs.getString("Branch_Id"),rs.getString("Total"),rs.getString("Available")} );
             
            
        
        } 
        } 
        else if("".equals(b) && "".equals(a)){
            String tit=title.getText();
            String val6= "select temp.book_id as book_id,temp.title as title, temp.branch_id as branch_id, no_of_copies as total,no_of_copies-count(book_loans.book_id) as available from book_loans right join (select book.title,book.book_id,branch_id,no_of_copies from book_copies natural join book left join book_authors on book.book_id=book_authors.book_id where book.title like '%"+tit+"%' group by branch_id,book_id) as temp on book_loans.book_id=temp.book_id and book_loans.branch_id=temp.branch_id group by temp.book_id,temp.branch_id,no_of_copies;";
            rs5=stmt.executeQuery(val6);
           
        while(rs5.next()){
            
            model.insertRow(model.getRowCount(), new Object[]{rs5.getString("Book_Id"),rs5.getString("Title"),rs5.getString("Branch_Id"),rs5.getString("Total"),rs5.getString("Available")} );
            
        }
        
        }
        else if("".equals(b) && "".equals(t)){
            String auth=author.getText();
            String val7= "select temp.book_id as book_id,temp.title as title, temp.branch_id as branch_id, no_of_copies as total,no_of_copies-count(book_loans.book_id) as available from book_loans right join (select book.title,book.book_id,branch_id,no_of_copies from book_copies natural join book left join book_authors on book.book_id=book_authors.book_id where book_authors.author_name like '%"+auth+"%' group by branch_id,book_id) as temp on book_loans.book_id=temp.book_id and book_loans.branch_id=temp.branch_id group by temp.book_id,temp.branch_id,no_of_copies";
            rs6=stmt.executeQuery(val7);
            
        while(rs6.next()){
            
            model.insertRow(model.getRowCount(), new Object[]{rs6.getString("Book_Id"),rs6.getString("Title"),rs6.getString("Branch_Id"),rs6.getString("Total"),rs6.getString("Available")} );
            
        }
            
        }
        else if("".equals(t)){
            String bk=bid.getText();
            String auth=author.getText();
            String val4="select temp.book_id as book_id,temp.title, temp.branch_id, no_of_copies as total,no_of_copies-count(book_loans.book_id) as available from book_loans right join (select book.title,book.book_id,branch_id,no_of_copies from book_copies natural join book left join book_authors on book.book_id=book_authors.book_id where author_name like '%"+auth+"%' and book.book_id like '%"+bk+"%' group by branch_id,book_id) as temp on book_loans.book_id=temp.book_id and book_loans.branch_id=temp.branch_id group by temp.book_id,temp.branch_id,no_of_copies";
            rs1=stmt.executeQuery(val4);
            while(rs1.next())
            {
           
            model.insertRow(model.getRowCount(), new Object[]{rs1.getString("Book_Id"),rs1.getString("Title"),rs1.getString("Branch_Id"),rs1.getString("Total"),rs1.getString("Available")} );
            
            }
}
        else if("".equals(b)){
             String tit=title.getText();
             String auth=author.getText();
             String val3="select temp.book_id as book_id,temp.title as title, temp.branch_id as branch_id, no_of_copies as total,no_of_copies-count(book_loans.book_id) as available from book_loans right join (select book.title,book.book_id,branch_id,no_of_copies from book_copies natural join book left join book_authors on book.book_id=book_authors.book_id where author_name like '%"+auth+"%' and title like '%"+tit+"%' group by branch_id,book_id) as temp on book_loans.book_id=temp.book_id and book_loans.branch_id=temp.branch_id group by temp.book_id,temp.branch_id,no_of_copies";
            rs2=stmt.executeQuery(val3);
            
            while(rs2.next())
            {
           
            model.insertRow(model.getRowCount(), new Object[]{rs2.getString("Book_Id"),rs2.getString("Title"),rs2.getString("Branch_Id"),rs2.getString("Total"),rs2.getString("Available")} );
            
            }
            
        }
        else if("".equals(a)){
            String tit=title.getText();
            String bk=bid.getText();
            String val2="select temp.book_id as book_id,temp.title as title, temp.branch_id as branch_id, no_of_copies as total,no_of_copies-count(book_loans.book_id) as available from book_loans right join (select book.title,book.book_id,branch_id,no_of_copies from book_copies natural join book left join book_authors  on book.book_id=book_authors.book_id where title like '%"+tit+"%' and book.book_id like '%"+bk+"%' group by branch_id,book_id) as temp on book_loans.book_id=temp.book_id and book_loans.branch_id=temp.branch_id group by temp.book_id,temp.branch_id,no_of_copies";
            rs3=stmt.executeQuery(val2);
            
            while(rs3.next())
            {
                
                model.insertRow(model.getRowCount(), new Object[]{rs3.getString("Book_Id"),rs3.getString("Title"),rs3.getString("Branch_Id"),rs3.getString("Total"),rs3.getString("Available")} );
               
            }
        }
          else
          {
            String tit=title.getText();
            String auth=author.getText();
            String bk1=bid.getText();
            String val5="select temp.book_id as book_id,temp.title as title, temp.branch_id as branch_id, no_of_copies as total,no_of_copies-count(book_loans.book_id) as available from book_loans right join (select book.title,book.book_id,branch_id,no_of_copies from book_copies natural join book left join book_authors on book.book_id=book_authors.book_id where author_name like '%"+auth+"%' and title like '%"+tit+"%' and book.book_id like '%"+bk1+"%' group by branch_id) as temp on book_loans.book_id=temp.book_id and book_loans.branch_id=temp.branch_id group by temp.book_id,temp.branch_id,no_of_copies";
            rs4=stmt.executeQuery(val5);
            
            while(rs4.next()){
              
                model.insertRow(model.getRowCount(), new Object[]{rs4.getString("Book_Id"),rs4.getString("Title"),rs4.getString("Branch_Id"),rs4.getString("Total"),rs4.getString("Available")} );
                  
          }
     }
        conn.close();  
      }
      
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex);
	}
    }

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {
        author.setText("");
        bid.setText("");
        title.setText("");
         model.setRowCount(0);
    }
    public void close()
    {
    WindowEvent winclosingevent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winclosingevent);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
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
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new search().setVisible(true);
            }
        });
    }

    
    private javax.swing.JTextField author;
    private javax.swing.JTextField bid;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton reset;
    private javax.swing.JButton search;
    private javax.swing.JTextField title;
    
}
