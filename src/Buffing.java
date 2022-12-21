/*     */ package srobot;
/*     */ 
/*     */ import javax.swing.DefaultListModel;
/*     */ import javax.swing.JCheckBox;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Buffing
/*     */ {
/*     */   public static void buffing(JCheckBox Buff, boolean Walking, boolean Target, DefaultListModel IDSkill, DefaultListModel IDPlayer, DefaultListModel TimeMax, DefaultListModel<Integer> TimeLeft, DefaultListModel SkillID) {
/*  16 */     if (Buff.isSelected() && !Walking) {
/*  17 */       int MaxSize = IDSkill.getSize(); int i;
/*  18 */       for (i = 0; i < MaxSize; i++) {
/*  19 */         if (Integer.parseInt((new StringBuilder()).append(TimeLeft.elementAt(i)).append("").toString()) < 800) {
/*  20 */           TimeLeft.setElementAt(Integer.valueOf(0), i);
/*     */         } else {
/*  22 */           TimeLeft.setElementAt(Integer.valueOf(Integer.parseInt((new StringBuilder()).append(TimeLeft.elementAt(i)).append("").toString()) - 800), i);
/*     */         } 
/*     */       } 
/*  25 */       for (i = 0; i < MaxSize; i++) {
/*  26 */         if (TimeLeft.elementAt(i).equals(Integer.valueOf(0)) && (new StringBuilder()).append(IDPlayer.getElementAt(i)).append("").toString().length() == 8) {
/*  27 */           if (Target) {
/*  28 */             InjectPacket.CastSkillBuffTarget((new StringBuilder()).append(IDSkill.elementAt(i)).append("").toString(), (new StringBuilder()).append(IDPlayer.elementAt(i)).append("").toString());
/*     */             
/*     */             return;
/*     */           } 
/*  32 */           InjectPacket.CastSkillBuffNoTarget((new StringBuilder()).append(IDSkill.elementAt(i)).append("").toString());
/*     */           return;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static void AddSkillBuff(String SkillData, String PlayerID, DefaultListModel<String> IDSkillList, DefaultListModel<String> IDPlayer, DefaultListModel<Integer> TimeMax, DefaultListModel<Integer> TimeLeft, DefaultListModel<String> ListIDSkill) {
/*  42 */     IDSkillList.addElement(Skill.SkillID(SkillData));
/*  43 */     IDPlayer.addElement(PlayerID);
/*  44 */     TimeMax.addElement(Integer.valueOf(Skill.SkillTimeMax(SkillData)));
/*  45 */     TimeLeft.addElement(Integer.valueOf(0));
/*  46 */     ListIDSkill.addElement("Not Active");
/*     */   }
/*     */   public static boolean UpdateBuffStatus(String sData, DefaultListModel<E> IDSkill, DefaultListModel<E> IDPlayer, DefaultListModel TimeMax, DefaultListModel TimeLeft, DefaultListModel<String> SkillID) {
/*  49 */     String player = sData.substring(0, 8);
/*  50 */     String Skill = sData.substring(8, 16);
/*  51 */     String skillID = sData.substring(16);
/*  52 */     int MaxSize = IDSkill.getSize();
/*  53 */     for (int i = 0; i < MaxSize; i++) {
/*  54 */       if (IDSkill.getElementAt(i).equals(Skill) && IDPlayer.getElementAt(i).equals(player)) {
/*  55 */         SkillID.setElementAt(skillID, i);
/*  56 */         TimeLeft.setElementAt(TimeMax.getElementAt(i), i);
/*  57 */         return true;
/*     */       } 
/*     */     } 
/*  60 */     return false;
/*     */   }
/*     */   public static boolean UpdateBuffEnd(String sData, DefaultListModel IDSkill, DefaultListModel IDPlayer, DefaultListModel TimeMax, DefaultListModel<Integer> TimeLeft, DefaultListModel<String> SkillID) {
/*  63 */     String skillID = sData.substring(2);
/*  64 */     int MaxSize = IDSkill.getSize();
/*  65 */     for (int i = 0; i < MaxSize; i++) {
/*  66 */       if (skillID.equals(SkillID.getElementAt(i))) {
/*  67 */         TimeLeft.setElementAt(Integer.valueOf(0), i);
/*  68 */         SkillID.setElementAt("Not Active", i);
/*  69 */         return true;
/*     */       } 
/*     */     } 
/*  72 */     return false;
/*     */   }
/*     */   
/*     */   public static void DeactiveBuffAll(DefaultListModel<Integer> TimeLeft) {
/*  76 */     int MaxSize = TimeLeft.getSize();
/*  77 */     for (int i = 0; i < MaxSize; i++)
/*  78 */       TimeLeft.setElementAt(Integer.valueOf(0), i); 
/*     */   }
/*     */   
/*     */   public static void UpdateStatus(String sData, DefaultListModel ID, DefaultListModel<String> Status, DefaultListModel IDTarget, DefaultListModel<Integer> TimeLeft) {
/*  82 */     if (sData.length() == 12) {
/*  83 */       String IDPlayer = sData.substring(0, 8);
/*  84 */       String Type = sData.substring(8, 12);
/*  85 */       int size = ID.getSize();
/*  86 */       if (Type.equals("0001")) {
/*  87 */         for (int i = 0; i < size; i++) {
/*  88 */           if (IDPlayer.equals(ID.getElementAt(i))) {
/*  89 */             Status.setElementAt("Alive", i);
/*     */           }
/*     */         } 
/*     */       }
/*  93 */       if (Type.equals("0002"))
/*  94 */         for (int i = 0; i < size; i++) {
/*  95 */           if (IDPlayer.equals(ID.getElementAt(i))) {
/*  96 */             Status.setElementAt("Death", i);
/*  97 */             int MaxIndex = IDTarget.getSize();
/*  98 */             for (int k = 0; k < MaxIndex; k++) {
/*  99 */               if (IDPlayer.equals((new StringBuilder()).append(IDTarget.getElementAt(k)).append("").toString())) {
/* 100 */                 TimeLeft.setElementAt(Integer.valueOf(0), k);
/*     */               }
/*     */             } 
/*     */           } 
/*     */         }  
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void Revive(String IDSkill, DefaultListModel ID, DefaultListModel<E> Status) {
/* 109 */     int MaxIndex = ID.getSize();
/* 110 */     for (int i = 0; i < MaxIndex; i++) {
/* 111 */       if (Status.getElementAt(i).equals("Death")) {
/* 112 */         InjectPacket.CastSkillBuffTarget(IDSkill, (new StringBuilder()).append(ID.getElementAt(i)).append("").toString());
/*     */       }
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void AutoAcceptRevive(String sData, boolean hs) {
/* 118 */     if (hs) {
/* 119 */       InjectPacket.Injectpacket("3080", "0101", true, false);
/*     */     }
/*     */   }
/*     */   
/*     */   public static void UpdateIDnoTarget(DefaultListModel<Integer> TimeLeft, DefaultListModel<String> IDList, String ID) {
/* 124 */     int Mi = IDList.getSize();
/* 125 */     for (int i = 0; i < Mi; i++) {
/* 126 */       IDList.setElementAt(ID, i);
/* 127 */       TimeLeft.setElementAt(Integer.valueOf(0), i);
/*     */     } 
/*     */   }
/*     */   public static void UpdateIDTargetAll(String ID, DefaultListModel<String> IDList, DefaultListModel<Integer> TimeLeft) {
/* 131 */     int Mi = IDList.getSize();
/* 132 */     for (int i = 0; i < Mi; i++) {
/* 133 */       IDList.setElementAt(ID, i);
/* 134 */       TimeLeft.setElementAt(Integer.valueOf(0), i);
/*     */     } 
/*     */   }
/*     */   public static void SetIDTarget(String Name, String ID, DefaultListModel NameList, DefaultListModel<String> IDList, DefaultListModel TimeLeft) {
/* 138 */     int Mi = NameList.getSize();
/* 139 */     for (int i = 0; i < Mi; i++) {
/* 140 */       if (Name.equals((new StringBuilder()).append(NameList.getElementAt(i)).append("").toString()))
/* 141 */         IDList.setElementAt(ID, i); 
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void UpdateIDTarget(String IDnew, String ID, DefaultListModel<String> IDList) {
/* 146 */     int Mi = IDList.getSize();
/*     */     
/* 148 */     for (int i = 0; i < Mi; i++) {
/*     */       
/* 150 */       if (ID.equals((new StringBuilder()).append(IDList.getElementAt(i)).append("").toString()))
/*     */       {
/* 152 */         IDList.setElementAt(IDnew, i); } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void UpdateTargetfor3015(DefaultListModel<E> IDTarget, DefaultListModel NamePlayerTarget, DefaultListModel NameList, DefaultListModel IDList, DefaultListModel<Integer> TimeLeft) {
/* 157 */     int Mi1 = IDTarget.getSize();
/* 158 */     int Mi2 = NameList.getSize();
/* 159 */     for (int i = 0; i < Mi1; i++) {
/* 160 */       if (IDTarget.getElementAt(i).equals("noID")) {
/* 161 */         String name = (new StringBuilder()).append(NamePlayerTarget.getElementAt(i)).append("").toString();
/* 162 */         for (int j = 0; j < Mi2; j++) {
/* 163 */           if (name.equals((new StringBuilder()).append(NameList.getElementAt(j)).append("").toString())) {
/* 164 */             IDTarget.setElementAt((E)(new StringBuilder()).append(IDList.getElementAt(j)).append("").toString(), i);
/* 165 */             TimeLeft.setElementAt(Integer.valueOf(0), i);
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\NhatTM\Downloads\SroBot\SroBot\22585 - 15820\SroBot.jar!\srobot\Buffing.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */