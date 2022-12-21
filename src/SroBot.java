/*     */ package srobot;
/*     */ 
/*     */ import java.io.DataInputStream;
/*     */ import java.io.DataOutputStream;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.io.IOException;
/*     */ import java.net.Socket;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class SroBot
/*     */ {
/*  28 */   public static String[] LocationData = new String[4000];
/*  29 */   public static int[] LocationLine = new int[1];
/*  30 */   public static int[] myX = new int[1];
/*  31 */   public static int[] myY = new int[1];
/*  32 */   public static int[] farmX = new int[1];
/*  33 */   public static int[] farmY = new int[1];
/*     */ 
/*     */   
/*  36 */   public static String[] MonsterData = new String[1500];
/*  37 */   public static int[] MonsterLine = new int[1];
/*     */ 
/*     */   
/*  40 */   public static String[] skilldata = new String[10000];
/*  41 */   public static int[] SkillLine = new int[1];
/*  42 */   public static String[] skilllist = new String[150];
/*  43 */   public static String[] skillname = new String[150];
/*  44 */   public static int[] skilllv = new int[150];
/*  45 */   public static String[] skilltype = new String[150];
/*  46 */   public static int[] skilllvlearn = new int[150];
/*     */   
/*  48 */   public static String ID = "";
/*  49 */   public static Gui go = new Gui();
/*  50 */   public static LoadingForm LoadingForm = new LoadingForm();
/*  51 */   public static Socket sock1 = new Socket();
/*  52 */   public static DataOutputStream outbound = new DataOutputStream(null);
/*  53 */   public static String IDFollow = "";
/*  54 */   public static int cHP = 0;
/*  55 */   public static int cMP = 0;
/*  56 */   public static int mHP = 0;
/*  57 */   public static int mMP = 0;
/*  58 */   public static String[][] PTData = new String[150][7];
/*  59 */   public static String[] PTID = new String[150];
/*     */ 
/*     */   
/*  62 */   public static String[] WalkingData = new String[1];
/*     */ 
/*     */   
/*  65 */   public static boolean[] Walking = new boolean[1];
/*  66 */   public static boolean[] Buffing = new boolean[1];
/*  67 */   public static boolean[] Farming = new boolean[1];
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void main(String[] args) {
/*  74 */     LoadingForm.setVisible(true);
/*  75 */     LoadingForm.jProgressBar1.setValue(0);
/*  76 */     Loading.LoadSkillData(skilldata, SkillLine);
/*  77 */     LoadingForm.jProgressBar1.setValue(50);
/*  78 */     Loading.LoadLocationData(LocationData, LocationLine);
/*  79 */     LoadingForm.jProgressBar1.setValue(70);
/*  80 */     Loading.LoadMonsterData(MonsterData, MonsterLine);
/*  81 */     int port1 = 22500;
/*     */     try {
/*  83 */       port1 = SROScanner.UpdatePort();
/*  84 */     } catch (FileNotFoundException ex) {
/*  85 */       Logger.getLogger(SroBot.class.getName()).log(Level.SEVERE, (String)null, ex);
/*     */     } 
/*  87 */     LoadingForm.jProgressBar1.setValue(100);
/*  88 */     LoadingForm.setVisible(false);
/*  89 */     LoadingForm = null;
/*  90 */     Walking[0] = false;
/*     */     
/*  92 */     String addr = "127.0.0.1";
/*  93 */     go.setDefaultCloseOperation(3);
/*  94 */     go.setBounds(100, 100, 735, 695);
/*  95 */     go.setVisible(true);
/*     */     
/*     */     try {
/*  98 */       sock1 = new Socket(addr, port1);
/*     */       
/* 100 */       outbound = new DataOutputStream(sock1.getOutputStream());
/* 101 */       DataInputStream inbound = new DataInputStream(sock1.getInputStream());
/* 102 */       byte[] responseLine = new byte[15000];
/*     */       int len;
/* 104 */       while ((len = inbound.read(responseLine)) != 0) {
/* 105 */         String sData = "";
/* 106 */         for (int i = 0; i < len; i++) {
/* 107 */           sData = sData + Convert.bytetoHex(responseLine[i]);
/*     */         }
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 113 */         PacketParse.packetparse(sData);
/*     */       } 
/* 115 */     } catch (IOException err) {
/*     */       
/* 117 */       System.out.println(err.getMessage());
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\NhatTM\Downloads\SroBot\SroBot\22585 - 15820\SroBot.jar!\srobot\SroBot.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */