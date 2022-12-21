/*    */ package srobot;
/*    */ 
/*    */ import java.io.FileNotFoundException;
/*    */ import java.util.logging.Level;
/*    */ import java.util.logging.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Loading
/*    */ {
/*    */   public static void LoadSkillData(String[] SkillData, int[] SkillLine) {
/*    */     try {
/* 19 */       SkillLine[0] = GetSkillText.UpdateSkillData(SkillData);
/* 20 */     } catch (FileNotFoundException ex) {
/* 21 */       Logger.getLogger(Loading.class.getName()).log(Level.SEVERE, (String)null, ex);
/*    */     } 
/*    */   }
/*    */   public static void LoadLocationData(String[] LocationData, int[] LocationLine) {
/*    */     try {
/* 26 */       LocationLine[0] = GetLocationText.UpdateLocationData(LocationData);
/* 27 */     } catch (FileNotFoundException ex) {
/* 28 */       Logger.getLogger(Loading.class.getName()).log(Level.SEVERE, (String)null, ex);
/*    */     } 
/*    */   }
/*    */   public static void LoadMonsterData(String[] MonsterData, int[] MonsterLine) {
/*    */     try {
/* 33 */       MonsterLine[0] = Monster.UpdateMonsterData(MonsterData);
/* 34 */     } catch (FileNotFoundException ex) {
/* 35 */       Logger.getLogger(Loading.class.getName()).log(Level.SEVERE, (String)null, ex);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\NhatTM\Downloads\SroBot\SroBot\22585 - 15820\SroBot.jar!\srobot\Loading.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */