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
/*    */ public class GetSkillText
/*    */ {
/*    */   public static void ScanLine(String Line, String[] skilldata) {
/* 15 */     Scanner scanner = new Scanner(Line);
/* 16 */     scanner.useDelimiter(",");
/* 17 */     for (int i = 0; i < 10; i++) {
/* 18 */       skilldata[i] = scanner.next();
/*    */       
/* 20 */       if (!scanner.hasNext()) {
/* 21 */         i = 10;
/*    */       }
/*    */     } 
/* 24 */     scanner.close();
/* 25 */     scanner = null;
/*    */   }
/*    */   public static int UpdateSkillData(String[] SkillData) throws FileNotFoundException {
/* 28 */     String path = System.getProperty("user.dir");
/* 29 */     Scanner sc = new Scanner(new File(path + "\\data\\skillnew.txt"), "Unicode");
/*    */     int i;
/* 31 */     for (i = 0; sc.hasNextLine(); i++) {
/* 32 */       SkillData[i] = sc.nextLine();
/*    */     }
/* 34 */     sc.close();
/* 35 */     sc = null;
/* 36 */     return i;
/*    */   }
/*    */ }


/* Location:              C:\Users\NhatTM\Downloads\SroBot\SroBot\22585 - 15820\SroBot.jar!\srobot\GetSkillText.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */