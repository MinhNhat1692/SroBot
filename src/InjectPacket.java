/*    */ package srobot;
/*    */ 
/*    */ import java.io.IOException;
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
/*    */ 
/*    */ 
/*    */ public class InjectPacket
/*    */ {
/*    */   public static void Injectpacket(String sOpcode, String sData, boolean CtoS, boolean Encrypted) {
/* 20 */     String sPacket = "";
/* 21 */     String sLen = Convert.revertString(Convert.toHexfull(Convert.chialaynguyen(sData.length(), 2), 4));
/* 22 */     String Opcode = Convert.revertString(sOpcode);
/* 23 */     if (Encrypted) {
/* 24 */       if (CtoS) {
/* 25 */         sPacket = sLen + Opcode + "0300" + sData;
/*    */       } else {
/* 27 */         sPacket = sLen + Opcode + "0400" + sData;
/*    */       }
/*    */     
/* 30 */     } else if (CtoS) {
/* 31 */       sPacket = sLen + Opcode + "0100" + sData;
/*    */     } else {
/* 33 */       sPacket = sLen + Opcode + "0200" + sData;
/*    */     } 
/*    */     
/* 36 */     sPacket = Convert.HexToString(sPacket);
/*    */     try {
/* 38 */       SroBot.outbound.writeBytes(sPacket);
/* 39 */       SroBot.outbound.flush();
/* 40 */     } catch (IOException ex) {
/* 41 */       Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, (String)null, ex);
/*    */     } 
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public static void CastSkillBuffTarget(String SkillID, String PlayerID) {
/* 48 */     String sData = "0104" + SkillID + "01" + PlayerID;
/* 49 */     Injectpacket("7074", sData, true, false);
/*    */   }
/*    */   
/*    */   public static void CastSkillBuffNoTarget(String skill) {
/* 53 */     String sData = "0104" + skill + "00";
/* 54 */     Injectpacket("7074", sData, true, false);
/*    */   }
/*    */   
/*    */   public static void CastSkillTarget(String SkillID, String ObjectID) {
/* 58 */     String sData = "0104" + SkillID + "01" + ObjectID;
/* 59 */     Injectpacket("7074", sData, true, false);
/*    */   }
/*    */ }


/* Location:              C:\Users\NhatTM\Downloads\SroBot\SroBot\22585 - 15820\SroBot.jar!\srobot\InjectPacket.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */