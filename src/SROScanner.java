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
/*    */ public class SROScanner
/*    */ {
/*    */   public static String GetStringAt(int place, String Data) {
/* 17 */     String[] data = new String[15];
/*    */     
/* 19 */     Scanner scanner = new Scanner(Data);
/* 20 */     scanner.useDelimiter(",");
/* 21 */     for (int i = 0; i < 15; i++) {
/* 22 */       data[i] = scanner.next();
/* 23 */       if (!scanner.hasNext()) {
/* 24 */         i = 16;
/*    */       }
/*    */     } 
/* 27 */     scanner.close();
/* 28 */     String result = data[place];
/* 29 */     data = null;
/* 30 */     return result;
/*    */   }
/*    */   public static int UpdatePort() throws FileNotFoundException {
/* 33 */     String[] LocationData = new String[10];
/* 34 */     String path = System.getProperty("user.dir");
/* 35 */     Scanner sc = new Scanner(new File(path + "\\setting.txt"), "Unicode");
/* 36 */     int port = Integer.parseInt(sc.nextLine());
/* 37 */     sc.close();
/* 38 */     sc = null;
/* 39 */     return port;
/*    */   }
/*    */ }


/* Location:              C:\Users\NhatTM\Downloads\SroBot\SroBot\22585 - 15820\SroBot.jar!\srobot\SROScanner.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */