/*     */ package srobot;
/*     */ 
/*     */ import java.util.Scanner;
/*     */ import javax.swing.JLabel;
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
/*     */ public class Location
/*     */ {
/*     */   public static String LocationXY(String LocationData) {
/*  18 */     String[] skilldata = new String[4];
/*     */     
/*  20 */     Scanner scanner = new Scanner(LocationData);
/*  21 */     scanner.useDelimiter(",");
/*  22 */     for (int i = 0; i < 4; i++) {
/*  23 */       skilldata[i] = scanner.next();
/*  24 */       if (!scanner.hasNext()) {
/*  25 */         i = 4;
/*     */       }
/*     */     } 
/*  28 */     scanner.close();
/*  29 */     String XY = skilldata[0];
/*  30 */     skilldata = null;
/*  31 */     scanner = null;
/*  32 */     return XY;
/*     */   }
/*     */   public static String LocationName(String LocationData) {
/*  35 */     String[] skilldata = new String[4];
/*     */     
/*  37 */     Scanner scanner = new Scanner(LocationData);
/*  38 */     scanner.useDelimiter(",");
/*  39 */     for (int i = 0; i < 4; i++) {
/*  40 */       skilldata[i] = scanner.next();
/*  41 */       if (!scanner.hasNext()) {
/*  42 */         i = 4;
/*     */       }
/*     */     } 
/*  45 */     scanner.close();
/*  46 */     String name = skilldata[2];
/*  47 */     skilldata = null;
/*  48 */     scanner = null;
/*  49 */     return name;
/*     */   }
/*     */   public static void UpdataLocationName(JLabel Name, String XY, String[] LocationData, int LocationLine) {
/*  52 */     for (int i = 0; i < LocationLine; i++) {
/*  53 */       if (XY.equals(LocationXY(LocationData[i]))) {
/*  54 */         Name.setText(LocationName(LocationData[i]));
/*     */         return;
/*     */       } 
/*     */     } 
/*  58 */     Name.setText("Unknown");
/*     */   }
/*     */   public static int CalculateLocation(String XYsec, String XYcoord, boolean X, boolean length4) {
/*  61 */     int XY = 0;
/*  62 */     if (X) {
/*  63 */       if (length4) {
/*  64 */         XY = (Integer.parseInt(XYsec, 16) - 135) * 192 + Integer.parseInt(Convert.revertString(XYcoord), 16) / 10;
/*     */       } else {
/*  66 */         XY = (Integer.parseInt(XYsec, 16) - 135) * 192 + Convert.LongHex(Convert.revertString(XYcoord)) / 100;
/*     */       }
/*     */     
/*  69 */     } else if (length4) {
/*  70 */       XY = (Integer.parseInt(XYsec, 16) - 92) * 192 + Integer.parseInt(Convert.revertString(XYcoord), 16) / 10;
/*     */     } else {
/*  72 */       XY = (Integer.parseInt(XYsec, 16) - 92) * 192 + Convert.LongHex(Convert.revertString(XYcoord)) / 100;
/*     */     } 
/*     */     
/*  75 */     return XY;
/*     */   }
/*     */   public static int CalculateLocationSpecial(String XYsec, String XYcoord, boolean X) {
/*  78 */     int XY = 0;
/*  79 */     if (X) {
/*  80 */       XY = (Integer.parseInt(XYsec, 16) - 135) * 192 + Convert.LongHex(Convert.revertString(XYcoord)) / 10;
/*     */     } else {
/*  82 */       XY = (Integer.parseInt(XYsec, 16) - 92) * 192 + Convert.LongHex(Convert.revertString(XYcoord)) / 10;
/*     */     } 
/*  84 */     return XY;
/*     */   }
/*     */   
/*     */   public static int CalculateLocationFor3015(String XYsec, String XYcoord, boolean X) {
/*  88 */     int XY = 0;
/*  89 */     if (X) {
/*  90 */       XY = (int)(((Integer.parseInt(XYsec, 16) - 135) * 192) + Convert.HextoFloat(Convert.revertString(XYcoord)) / 10.0D);
/*     */     } else {
/*  92 */       XY = (int)(((Integer.parseInt(XYsec, 16) - 92) * 192) + Convert.HextoFloat(Convert.revertString(XYcoord)) / 10.0D);
/*     */     } 
/*  94 */     return XY;
/*     */   }
/*     */   
/*     */   public static int Distance(int X1, int Y1, int X2, int Y2) {
/*  98 */     int distance = 0;
/*  99 */     int x = 0;
/* 100 */     int y = 0;
/* 101 */     if (X1 < X2) {
/* 102 */       x = X2 - X1;
/*     */     } else {
/* 104 */       x = X1 - X2;
/*     */     } 
/* 106 */     if (Y1 < Y2) {
/* 107 */       y = Y2 - Y1;
/*     */     } else {
/* 109 */       y = Y1 - Y2;
/*     */     } 
/* 111 */     distance = (int)Math.sqrt((x * x + y * y));
/* 112 */     return distance;
/*     */   }
/*     */ }


/* Location:              C:\Users\NhatTM\Downloads\SroBot\SroBot\22585 - 15820\SroBot.jar!\srobot\Location.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */