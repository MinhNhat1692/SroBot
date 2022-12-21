/*     */ package srobot;
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
/*     */ public class PacketParse
/*     */ {
/*     */   public static void packetparse(String sData) {
/*  18 */     String leng = sData.substring(2, 4) + sData.substring(0, 2);
/*  19 */     String sNext = "";
/*  20 */     int len = Integer.valueOf(leng, 16).intValue();
/*  21 */     if (len * 2 + 12 < sData.length()) {
/*  22 */       sNext = sData.substring(len * 2 + 12);
/*  23 */       String sHex = sData.substring(0, len * 2 + 12);
/*  24 */       String sOpcode = sHex.substring(6, 8) + sHex.substring(4, 6);
/*  25 */       String CilenttoJoymax = sHex.substring(8, 10);
/*  26 */       if (Integer.valueOf(CilenttoJoymax, 16).intValue() == 1) {
/*  27 */         CilenttoJoymax = "C -> J";
/*     */       } else {
/*  29 */         CilenttoJoymax = "J -> C";
/*     */       } 
/*  31 */       String sCode = sHex.substring(12);
/*  32 */       analyzer(sOpcode, sCode);
/*     */     } else {
/*  34 */       String sHex = sData;
/*  35 */       String sOpcode = sHex.substring(6, 8) + sHex.substring(4, 6);
/*  36 */       String CilenttoJoymax = sHex.substring(8, 10);
/*  37 */       if (Integer.valueOf(CilenttoJoymax, 16).intValue() == 1) {
/*  38 */         CilenttoJoymax = "C -> J";
/*     */       } else {
/*  40 */         CilenttoJoymax = "J -> C";
/*     */       } 
/*  42 */       String sCode = sHex.substring(12);
/*  43 */       analyzer(sOpcode, sCode);
/*     */     } 
/*  45 */     if (sNext != "")
/*  46 */       packetparse(sNext); 
/*     */   } public static void analyzer(String sOpcode, String sData) {
/*     */     String model, Dta1, DataOut;
/*     */     boolean check;
/*  50 */     int Opcode = Integer.valueOf(sOpcode, 16).intValue();
/*  51 */     switch (Opcode) {
/*     */       case 45245:
/*  53 */         if (!Buffing.UpdateBuffStatus(sData, Gui.IDSkillNoTarget, Gui.IDPlayerNoTarget, Gui.TimeMaxNoTarget, Gui.TimeLeftNoTarget, Gui.ListIDSkillNoTarget))
/*     */         {
/*  55 */           Buffing.UpdateBuffStatus(sData, Gui.IDSkillTarget, Gui.IDPlayerTarget, Gui.TimeMaxTarget, Gui.TimeLeftTarget, Gui.ListIDSkillTarget);
/*     */         }
/*     */         return;
/*     */       case 45170:
/*  59 */         if (!Buffing.UpdateBuffEnd(sData, Gui.IDSkillNoTarget, Gui.IDPlayerNoTarget, Gui.TimeMaxNoTarget, Gui.TimeLeftNoTarget, Gui.ListIDSkillNoTarget))
/*     */         {
/*  61 */           Buffing.UpdateBuffEnd(sData, Gui.IDSkillTarget, Gui.IDPlayerTarget, Gui.TimeMaxTarget, Gui.TimeLeftTarget, Gui.ListIDSkillTarget);
/*     */         }
/*     */         return;
/*     */       case 12307:
/*  65 */         Character.CharUpdate(SroBot.skilllist, sData, Gui.ListAllSkillName);
/*  66 */         Gui.IDList.removeAllElements();
/*  67 */         Gui.PlayerList.removeAllElements();
/*  68 */         Buffing.UpdateIDTargetAll("noID", Gui.IDPlayerTarget, Gui.TimeLeftTarget);
/*  69 */         SroBot.IDFollow = "noID";
/*     */         return;
/*     */       
/*     */       case 28741:
/*  73 */         Character.IDplayerUpdate(sData);
/*     */         return;
/*     */       case 45125:
/*  76 */         Monster.MonsterStatus(sData, Gui.IDMonsterList, Gui.CurrentHPMonsterList);
/*     */         return;
/*     */       
/*     */       case 28788:
/*     */         return;
/*     */       
/*     */       case 12320:
/*  83 */         SroBot.ID = sData.substring(0, 8);
/*  84 */         Gui.jLabel24.setText(SroBot.ID);
/*  85 */         Buffing.UpdateIDnoTarget(Gui.TimeLeftNoTarget, Gui.IDPlayerNoTarget, SroBot.ID);
/*  86 */         Gui.IDList.addElement(SroBot.ID);
/*  87 */         Gui.PlayerList.addElement(Gui.jLabel4.getText());
/*  88 */         Buffing.UpdateTargetfor3015(Gui.IDPlayerTarget, Gui.NamePlayerTarget, Gui.PlayerList, Gui.IDList, Gui.TimeLeftTarget);
/*     */         return;
/*     */       case 12349:
/*  91 */         Character.CharInfo(sData);
/*     */         return;
/*     */       case 45089:
/*  94 */         Walking.UpdateStatusWalking(sData, SroBot.ID, SroBot.IDFollow, SroBot.myX, SroBot.myY, Gui.jLabel11, Gui.jLabel5, Gui.jLabel43, SroBot.farmX, SroBot.farmY, SroBot.LocationData, SroBot.LocationLine[0], Gui.IDMonsterList, Gui.MonsterXList, Gui.MonsterYList, Gui.DistanceMonsterList);
/*     */         return;
/*     */       case 12375:
/*  97 */         HPMP.UpdateHPMP(sData);
/*     */         return;
/*     */       case 12416:
/* 100 */         switch (sData.length()) {
/*     */           case 12:
/* 102 */             Party.UpdatePartyRequest(sData);
/*     */             return;
/*     */           case 10:
/* 105 */             Buffing.AutoAcceptRevive(sData, Gui.jCheckBox9.isSelected());
/*     */             return;
/*     */         } 
/*     */         
/*     */         return;
/*     */       case 45164:
/* 111 */         Party.UpdatePartyList(sData, SroBot.PTData, SroBot.PTID, Gui.model6);
/*     */         return;
/*     */       case 12309:
/* 114 */         Character.CharacterSpawn(sData, Gui.IDList, Gui.PlayerList);
/* 115 */         model = sData.substring(0, 8);
/*     */         
/* 117 */         if ((Integer.parseInt(Convert.revertString(model), 16) < 1933 && Integer.parseInt(Convert.revertString(model), 16) > 1906) || (Integer.parseInt(Convert.revertString(model), 16) > 14874 && Integer.parseInt(Convert.revertString(model), 16) < 14901)) {
/* 118 */           Buffing.UpdateTargetfor3015(Gui.IDPlayerTarget, Gui.NamePlayerTarget, Gui.PlayerList, Gui.IDList, Gui.TimeLeftTarget);
/* 119 */           Button.FollowUpdate(Gui.jTextField5.getText(), Gui.PlayerList, Gui.IDList);
/*     */         } 
/*     */         return;
/*     */       
/*     */       case 12313:
/* 124 */         Dta1 = sData;
/* 125 */         DataOut = "";
/* 126 */         check = false;
/* 127 */         while (!check) {
/* 128 */           DataOut = Character.CharacterGroupSpawn(Dta1, Gui.IDList, Gui.PlayerList);
/*     */ 
/*     */           
/* 131 */           if (DataOut.equals(Dta1)) {
/* 132 */             check = true; continue;
/*     */           } 
/* 134 */           Dta1 = DataOut;
/* 135 */           Buffing.UpdateTargetfor3015(Gui.IDPlayerTarget, Gui.NamePlayerTarget, Gui.PlayerList, Gui.IDList, Gui.TimeLeftTarget);
/* 136 */           Button.FollowUpdate(Gui.jTextField5.getText(), Gui.PlayerList, Gui.IDList);
/*     */         } 
/*     */         return;
/*     */       
/*     */       case 12310:
/* 141 */         Character.CharacterRemove(sData, Gui.IDList, Gui.PlayerList);
/* 142 */         Buffing.UpdateIDTarget("noID", sData.substring(0, 8), Gui.IDPlayerTarget);
/* 143 */         if (SroBot.IDFollow.equals(sData.substring(0, 8))) {
/* 144 */           SroBot.IDFollow = "noID";
/*     */         }
/*     */         return;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       case 28705:
/* 156 */         SroBot.WalkingData[0] = sData;
/*     */         return;
/*     */       
/*     */       case 12479:
/* 160 */         Buffing.UpdateStatus(sData, Gui.IDTarget, Gui.Status, Gui.IDPlayerTarget, Gui.TimeLeftTarget);
/* 161 */         if (sData.equals(SroBot.ID + "0002")) {
/* 162 */           Buffing.DeactiveBuffAll(Gui.TimeLeftNoTarget);
/* 163 */           Buffing.DeactiveBuffAll(Gui.TimeLeftTarget);
/* 164 */           if (Gui.BuffCheck) {
/* 165 */             Gui.Buff.stop();
/* 166 */             if (Gui.ReviveCheck) {
/* 167 */               Gui.Revive.stop();
/*     */             }
/*     */           } 
/* 170 */           if (Gui.ComeBackCheck) {
/* 171 */             Gui.ComeBack.stop();
/*     */           }
/* 173 */           if (Gui.LureCheck) {
/* 174 */             Gui.Lure.stop();
/*     */           }
/* 176 */           if (Gui.FollowCheck) {
/* 177 */             Gui.Follow.stop();
/*     */           }
/*     */         }
/* 180 */         else if (sData.equals(SroBot.ID + "0001")) {
/* 181 */           if (Gui.BuffCheck) {
/* 182 */             Gui.Buff.start();
/* 183 */             if (Gui.ReviveCheck) {
/* 184 */               Gui.Revive.start();
/*     */             }
/*     */           } 
/* 187 */           if (Gui.ComeBackCheck) {
/* 188 */             Gui.ComeBack.start();
/*     */           }
/* 190 */           if (Gui.LureCheck) {
/* 191 */             Gui.Lure.start();
/*     */           }
/* 193 */           if (Gui.FollowCheck)
/* 194 */             Gui.Follow.stop(); 
/*     */         } 
/*     */         return;
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\NhatTM\Downloads\SroBot\SroBot\22585 - 15820\SroBot.jar!\srobot\PacketParse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */