/*    */ package srobot;
/*    */ import java.awt.Color;
/*    */ import java.awt.Font;
/*    */ import java.awt.LayoutManager;
/*    */ import java.awt.Rectangle;
/*    */ import javax.swing.BorderFactory;
/*    */ import javax.swing.GroupLayout;
/*    */ import javax.swing.JFrame;
/*    */ import javax.swing.JLabel;
/*    */ import javax.swing.JPanel;
/*    */ import javax.swing.JProgressBar;
/*    */ import org.netbeans.lib.awtextra.AbsoluteConstraints;
/*    */ import org.netbeans.lib.awtextra.AbsoluteLayout;
/*    */ 
/*    */ public class LoadingForm extends JFrame {
/*    */   public LoadingForm() {
/* 17 */     initComponents();
/*    */   }
/*    */ 
/*    */   
/*    */   private JLabel jLabel1;
/*    */   
/*    */   private JLabel jLabel2;
/*    */   
/*    */   private JPanel jPanel1;
/*    */   public static JProgressBar jProgressBar1;
/*    */   
/*    */   private void initComponents() {
/* 29 */     this.jPanel1 = new JPanel();
/* 30 */     jProgressBar1 = new JProgressBar();
/* 31 */     this.jLabel1 = new JLabel();
/* 32 */     this.jLabel2 = new JLabel();
/*    */     
/* 34 */     setDefaultCloseOperation(0);
/* 35 */     setBounds(new Rectangle(0, 0, 0, 0));
/* 36 */     setCursor(new Cursor(0));
/* 37 */     setModalExclusionType(null);
/*    */     
/* 39 */     this.jPanel1.setBackground(new Color(0, 0, 0));
/* 40 */     this.jPanel1.setBorder(BorderFactory.createLineBorder(new Color(51, 255, 51)));
/* 41 */     this.jPanel1.setForeground(new Color(255, 255, 0));
/* 42 */     this.jPanel1.setLayout((LayoutManager)new AbsoluteLayout());
/* 43 */     this.jPanel1.add(jProgressBar1, new AbsoluteConstraints(20, 120, 120, -1));
/*    */     
/* 45 */     this.jLabel1.setFont(new Font("Tahoma", 1, 60));
/* 46 */     this.jLabel1.setForeground(new Color(255, 255, 0));
/* 47 */     this.jLabel1.setText("SroBot");
/* 48 */     this.jPanel1.add(this.jLabel1, new AbsoluteConstraints(150, 10, 325, 112));
/*    */     
/* 50 */     this.jLabel2.setForeground(new Color(255, 255, 0));
/* 51 */     this.jLabel2.setText("For VSRO - cdtl.ongame.vn - BETA");
/* 52 */     this.jPanel1.add(this.jLabel2, new AbsoluteConstraints(290, 130, 170, -1));
/*    */     
/* 54 */     GroupLayout layout = new GroupLayout(getContentPane());
/* 55 */     getContentPane().setLayout(layout);
/* 56 */     layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(this.jPanel1, -1, 485, 32767).addContainerGap()));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 62 */     layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel1, -1, 166, 32767));
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 67 */     pack();
/*    */   }
/*    */ }


/* Location:              C:\Users\NhatTM\Downloads\SroBot\SroBot\22585 - 15820\SroBot.jar!\srobot\LoadingForm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */