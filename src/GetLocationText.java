/*    */ package srobot;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.FileNotFoundException;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class GetLocationText
/*    */ {
/*    */   public static void Updatelocation(String YX) throws FileNotFoundException {
/* 18 */     String[] LocationData = new String[10];
/* 19 */     String path = System.getProperty("user.dir");
/*    */     
/* 21 */     Scanner sc = new Scanner(new File(path + "\\data\\zone.txt"), "Unicode");
/*    */     
/*    */     int i;
/* 24 */     for (i = 0; i < 1; ) {
/* 25 */       if (!sc.hasNextLine()) {
/* 26 */         Gui.jLabel11.setText("Unknow");
/* 27 */         i = 1; continue;
/*    */       } 
/* 29 */       ScanLine(sc.nextLine(), LocationData);
/*    */       
/* 31 */       if (Integer.parseInt(YX, 16) == Integer.parseInt(LocationData[0])) {
/* 32 */         Gui.jLabel11.setText(LocationData[2]);
/* 33 */         i = 1;
/*    */       } 
/*    */     } 
/*    */     
/* 37 */     sc.close();
/* 38 */     sc = null;
/*    */   }
/*    */   public static void ScanLine(String Line, String[] LocationData) {
/* 41 */     Scanner scanner = new Scanner(Line);
/* 42 */     scanner.useDelimiter(",");
/* 43 */     for (int i = 0; i < 10; i++) {
/* 44 */       LocationData[i] = scanner.next();
/*    */       
/* 46 */       if (!scanner.hasNext()) {
/* 47 */         i = 10;
/*    */       }
/*    */     } 
/* 50 */     scanner.close();
/* 51 */     scanner = null;
/*    */   }
/*    */   public static int UpdateLocationData(String[] LocationData) throws FileNotFoundException {
/* 54 */     String path = System.getProperty("user.dir");
/* 55 */     Scanner sc = new Scanner(new File(path + "\\data\\zone.txt"), "Unicode");
/*    */     int i;
/* 57 */     for (i = 0; sc.hasNextLine(); i++) {
/* 58 */       LocationData[i] = sc.nextLine();
/*    */     }
/* 60 */     sc.close();
/* 61 */     sc = null;
/* 62 */     return i;
/*    */   }
/*    */ }


/* Location:              C:\Users\NhatTM\Downloads\SroBot\SroBot\22585 - 15820\SroBot.jar!\srobot\GetLocationText.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */