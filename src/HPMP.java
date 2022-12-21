/*    */ package srobot;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class HPMP
/*    */ {
/*    */   public static void UpdateHPMP(String sData) {
/* 13 */     if (sData.length() > 21) {
/* 14 */       String ID = sData.substring(0, 8);
/* 15 */       if (ID.equals(SroBot.ID)) {
/* 16 */         int Type = Integer.parseInt(sData.substring(12, 14), 16);
/* 17 */         switch (Type) {
/*    */           case 1:
/* 19 */             SroBot.cHP = Integer.parseInt(Convert.revertString(sData.substring(14, 22)), 16);
/* 20 */             Button.HPupdate();
/*    */             return;
/*    */           case 2:
/* 23 */             SroBot.cMP = Integer.parseInt(Convert.revertString(sData.substring(14, 22)), 16);
/* 24 */             Button.MPupdate();
/*    */             return;
/*    */           case 3:
/* 27 */             SroBot.cHP = Integer.parseInt(Convert.revertString(sData.substring(14, 22)), 16);
/* 28 */             SroBot.cMP = Integer.parseInt(Convert.revertString(sData.substring(22, 30)), 16);
/* 29 */             Button.HPupdate();
/* 30 */             Button.MPupdate();
/*    */             return;
/*    */         } 
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\NhatTM\Downloads\SroBot\SroBot\22585 - 15820\SroBot.jar!\srobot\HPMP.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */