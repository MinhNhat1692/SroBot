/*    */ package srobot;
/*    */ 
/*    */ import javax.swing.DefaultListModel;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class JListFunction
/*    */ {
/*    */   public static void AddDataRow(DefaultListModel<String> model, String[] DataColumn, int[] ColumnSpace, int Column) {
/* 16 */     String Output = "";
/* 17 */     for (int i = 0; i < Column - 1; i++) {
/* 18 */       Output = Output + DataColumn(DataColumn[i], ColumnSpace[i]);
/*    */     }
/* 20 */     Output = Output + DataColumn[Column - 1];
/* 21 */     model.addElement(Output);
/*    */   }
/*    */   public static String DataColumn(String Data, int space) {
/* 24 */     String OutputString = "";
/* 25 */     if (Data.length() < space) {
/* 26 */       OutputString = Data;
/* 27 */       for (int i = 0; i < space - Data.length(); i++) {
/* 28 */         OutputString = OutputString + " ";
/*    */       }
/*    */     } else {
/* 31 */       OutputString = Data.substring(0, space - 5) + "... ";
/*    */     } 
/* 33 */     return OutputString;
/*    */   }
/*    */   public static String DataColumnTab(String Data, int space) {
/* 36 */     String OutputString = "";
/* 37 */     if (Data.length() < space) {
/* 38 */       OutputString = Data + "\t";
/*    */     } else {
/* 40 */       OutputString = Data.substring(0, space - 5) + "...\t";
/*    */     } 
/* 42 */     return OutputString;
/*    */   }
/*    */ }


/* Location:              C:\Users\NhatTM\Downloads\SroBot\SroBot\22585 - 15820\SroBot.jar!\srobot\JListFunction.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */