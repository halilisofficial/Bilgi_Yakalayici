
package bilgiyakalayici0.pkg1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JFrame extends javax.swing.JFrame {
JButton jb = new JButton();
JPanel jp = new JPanel();
JButton jb1 = new JButton();
JPanel jp1 = new JPanel();
DataB db = new DataB();
//ImageIcon ic = new ImageIcon("image\\MyBeaitifulLogoForBilgi_yakalayıcı.jpg");
String yol="image\\happy.jpg";//image diye yeni dosya oluşturuldu dosya pakette old. için tam yol istemiyor
  static int saysay=0;
  int iduzgundunya = 1,idmutludunya = 1;
  String SecilebilirBilgininYolu="SELECT bilgikara FROM bilgiyakalayici.kara WHERE idkara=";
  String SecilebilirId="idkara";
    String SecilebilirYer="kara";
  int SecilebilirBilgiIcinSayac=1;
 
    public JFrame(){
        short a=347,b=189,c=874,d=532;
        setTitle("Bilgi yakalayıcı");
        getContentPane().setBackground(Color.getHSBColor(212, 175, 55));// varsayılan arkaplan rengi(altın)
        setBounds(a,b,c,d);//frame konum + boyut
        setResizable(false);//cerceve hareket onler
        setLayout(null);//duzenleme
        initComponents();//bilesenler ekler
        setVisible(true);//cerceve gorunur kılar
      //  setIconImage(ic.getImage());//ImageIcon ic = new ImageIcon("image\\MyBeaitifulLogoForBilgi_yakalayıcı.jpg"); ile birliktelogoyu duzenler        
             //dunya için
        jb.setIcon(new ImageIcon(yol));
        jp.add(jb);
        jp.setBounds(c+166,0, 124, 124);
        add(jp);
        validate();
        //Dünya resmine tıklayınca resmin değişmesini sağlar
              jb.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent arg0) {
                      ++saysay;
            if(saysay%2==0){yol="image\\happy.jpg";
                          try {
            if(idmutludunya == db.maxmutluid()){idmutludunya = 1;}
                              dunyabilgi.setText(db.setDB("SELECT bilgimutlu FROM bilgiyakalayici.mutlu WHERE idmutlu='"+idmutludunya+"';"));
                          } catch (SQLException ex) {
                              System.err.println("Hata: "+ex);
                          }
                                   jb.setIcon(new ImageIcon(yol));
         idmutludunya++; }
            else{yol="image\\mad.jpg";
                    try {
                        if(iduzgundunya == db.maxuzgunid()){iduzgundunya = 1;}
    dunyabilgi.setText(db.setDB("SELECT bilgiuzgun FROM bilgiyakalayici.uzgun WHERE iduzgun='"+iduzgundunya+"';"));////// saysay a baglama inrteger degerv ver baska bir tane
                    } catch (SQLException ex) {
    System.err.println("Hata: "+ex);
                          }
    jb.setIcon(new ImageIcon(yol));
            iduzgundunya++;} } });
       }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")//bozukluk cıkarsa yorumdan kaldır
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
     private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        secilebilirBilgi = new javax.swing.JTextField();
        onceki = new javax.swing.JButton();
        sonraki = new javax.swing.JButton();
        rastgele = new javax.swing.JButton();
        begendim = new javax.swing.JButton();
        dunyabilgi = new javax.swing.JTextField();
    JTextField jTextField2 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

          dunyabilgi.setEditable(false);
         secilebilirBilgi.setEditable(false);
         
        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(207, 181, 59));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Beyaz  ");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Cyan   ");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Kırmızı");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Magenta");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("Mavi      ");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setText("Pembe  ");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton7);
        jRadioButton7.setText("Sarı");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton8);
        jRadioButton8.setText("Siyah");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton9);
        jRadioButton9.setText("Yeşil");
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });

        secilebilirBilgi.setText("Bilgi yakalayıcıya hoşgeldin :) sol üst köşeden kategoriyi değiştirebilirsin");
        secilebilirBilgi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secilebilirBilgiActionPerformed(evt);
            }
        });

        onceki.setText("Önceki");
        onceki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    oncekiActionPerformed(evt);
                } catch (SQLException ex) {
                    Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        sonraki.setText("Sonraki");
        sonraki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
  
                try {
                    sonrakiActionPerformed(evt);
                } catch (SQLException ex) {
                    Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
        rastgele.setText("Rastgele");
           rastgele.setText("Rastgele");
        rastgele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    rastgeleActionPerformed(evt);
                } catch (SQLException ex) {
                    Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        begendim.setText("Beğendim");
        begendim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    begendimActionPerformed(evt);
                } catch (SQLException ex) {
                    Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        dunyabilgi.setText("Hello Humman! :)");
        dunyabilgi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dunyabilgiActionPerformed(evt);
            }
        });

        jTextField2.setText("Arkaplan rengini değiştirmek ister misin?");
        jTextField2.setEditable(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }

            private void jTextField2ActionPerformed(ActionEvent evt) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

        jMenu1.setText("Bilgiler");

        jMenuItem1.setText("Havada uçan bilgiler");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
             SecilebilirId="idhava";
             SecilebilirYer = "hava";
                          SecilebilirBilgiIcinSayac=1;
                try {
  SecilebilirBilgininYolu=  "SELECT bilgihava FROM bilgiyakalayici.hava WHERE idhava=";                          
      secilebilirBilgi.setText(db.setDB("SELECT bilgihava FROM bilgiyakalayici.hava WHERE idhava='1';"));    
      if(db.BegenKontrolu(SecilebilirBilgininYolu, 1)){begendim.setForeground(Color.GREEN);}
      else{begendim.setForeground(Color.red);}
                } catch (SQLException ex) {
                    Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Karada kaçan bilgiler");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               SecilebilirId="idkara";
             SecilebilirYer = "kara";
                          SecilebilirBilgiIcinSayac=1;
                try {
                     SecilebilirBilgininYolu = "SELECT bilgikara FROM bilgiyakalayici.kara WHERE idkara=" ;
      secilebilirBilgi.setText(db.setDB("SELECT bilgikara FROM bilgiyakalayici.kara WHERE idkara='1';"));
      if(db.BegenKontrolu(SecilebilirBilgininYolu, 1)){begendim.setForeground(Color.GREEN);}
      else{begendim.setForeground(Color.red);}
                } catch (SQLException ex) {
                    Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
         jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecilebilirId="iddeniz";
             SecilebilirYer = "deniz";
             SecilebilirBilgiIcinSayac=1;
                try {
                      SecilebilirBilgininYolu = "SELECT bilgideniz FROM bilgiyakalayici.deniz WHERE iddeniz=" ;
      secilebilirBilgi.setText(db.setDB("SELECT bilgideniz FROM bilgiyakalayici.deniz WHERE iddeniz='1';"));
      if(db.BegenKontrolu(SecilebilirBilgininYolu, 1)){begendim.setForeground(Color.GREEN);}
      else{begendim.setForeground(Color.red);}
                } catch (SQLException ex) {
                    Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Denize dalan bilgiler");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("<= Bu taraftan");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(secilebilirBilgi, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(onceki, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sonraki, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rastgele, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(begendim, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                                .addComponent(dunyabilgi, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jRadioButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jRadioButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(secilebilirBilgi, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(onceki, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sonraki, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rastgele, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(begendim, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(dunyabilgi, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 285, Short.MAX_VALUE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton4)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton8)
                    .addComponent(jRadioButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton9))
                .addGap(25, 25, 25))
        );

        pack();
    }
     
      //arkaplan ayarlama radio butonları
    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {    this.getContentPane().setBackground(Color.CYAN); }                                             
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {this.getContentPane().setBackground(Color.WHITE);}  
    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {this.getContentPane().setBackground(Color.RED);}                                             
    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {    this.getContentPane().setBackground(Color.MAGENTA); }            
    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {    this.getContentPane().setBackground(Color.PINK);  }        
    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {         this.getContentPane().setBackground(Color.BLUE); }     
    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {    this.getContentPane().setBackground(Color.YELLOW); }  
    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {   this.getContentPane().setBackground(Color.BLACK);   }         
    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {        this.getContentPane().setBackground(Color.GREEN);  }     
   private void secilebilirBilgiActionPerformed(java.awt.event.ActionEvent evt) {   }                                                

    private void oncekiActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {                                       
 SecilebilirBilgiIcinSayac--;
   if(SecilebilirBilgiIcinSayac < db.SecilebilirMinDeger(SecilebilirId, SecilebilirYer))
   {
   SecilebilirBilgiIcinSayac=db.SecilebilirMaxDeger(SecilebilirId, SecilebilirYer);
   }
   secilebilirBilgi.setText(db.setDB(SecilebilirBilgininYolu+"'"+SecilebilirBilgiIcinSayac+"';"));
      if(db.BegenKontrolu(SecilebilirBilgininYolu, SecilebilirBilgiIcinSayac)){begendim.setForeground(Color.GREEN);}
      else{begendim.setForeground(Color.red);}
     }  
    
    private void sonrakiActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {                                       
   SecilebilirBilgiIcinSayac++;
   if(SecilebilirBilgiIcinSayac > db.SecilebilirMaxDeger(SecilebilirId, SecilebilirYer))
   {
   SecilebilirBilgiIcinSayac=1;
   }
   secilebilirBilgi.setText(db.setDB(SecilebilirBilgininYolu+"'"+SecilebilirBilgiIcinSayac+"';"));
    if(db.BegenKontrolu(SecilebilirBilgininYolu, SecilebilirBilgiIcinSayac)){begendim.setForeground(Color.GREEN);}
      else{begendim.setForeground(Color.red);}
    }                                      

      private void rastgeleActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {                                         
          SecilebilirBilgiIcinSayac=rd.nextInt(db.SecilebilirMaxDeger(SecilebilirId, SecilebilirYer))+1;
         secilebilirBilgi.setText(db.setDB(SecilebilirBilgininYolu+"'"+SecilebilirBilgiIcinSayac+"';"));
          if(db.BegenKontrolu(SecilebilirBilgininYolu, SecilebilirBilgiIcinSayac)){begendim.setForeground(Color.GREEN);}
      else{begendim.setForeground(Color.red);}
      } 

    private void begendimActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {                                         
db.BegenmeIslemi(SecilebilirBilgininYolu,SecilebilirBilgiIcinSayac);
     if(db.BegenKontrolu(SecilebilirBilgininYolu, SecilebilirBilgiIcinSayac)){begendim.setForeground(Color.GREEN);}
      else{begendim.setForeground(Color.red);}
    }                                        

    private void dunyabilgiActionPerformed(java.awt.event.ActionEvent evt) {          }                                          
 
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() { public void run() {
            new JFrame().setVisible(true);
            
 }   });
    }
                  Random rd = new Random();
                  int rast=1;
    private javax.swing.JButton begendim;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField dunyabilgi;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton onceki;
    private javax.swing.JButton rastgele;
    private javax.swing.JTextField secilebilirBilgi;
    private javax.swing.JButton sonraki;
 }