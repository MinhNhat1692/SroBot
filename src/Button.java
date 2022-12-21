/*     */ package srobot;
/*     */ 
/*     */ import javax.swing.DefaultComboBoxModel;
/*     */ import javax.swing.DefaultListModel;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Button
/*     */ {
/*     */   public static void HPupdate() {
/*  17 */     Gui.jLabel20.setText(SroBot.cHP + "/" + SroBot.mHP);
/*     */   }
/*     */   public static void MPupdate() {
/*  20 */     Gui.jLabel21.setText(SroBot.cMP + "/" + SroBot.mMP);
/*     */   }
/*     */   public static void jButton29() {
/*     */     boolean ShareExp, ShareItem, Invite, Hunt;
/*  24 */     if (Gui.jRadioButton9.isSelected()) {
/*  25 */       ShareExp = true;
/*     */     } else {
/*  27 */       ShareExp = false;
/*     */     } 
/*     */     
/*  30 */     if (Gui.jRadioButton11.isSelected()) {
/*  31 */       ShareItem = true;
/*     */     } else {
/*  33 */       ShareItem = false;
/*     */     } 
/*     */     
/*  36 */     if (Gui.jCheckBox6.isSelected()) {
/*  37 */       Invite = true;
/*     */     } else {
/*  39 */       Invite = false;
/*     */     } 
/*     */     
/*  42 */     if (Gui.jRadioButton3.isSelected()) {
/*  43 */       Hunt = true;
/*     */     } else {
/*  45 */       Hunt = false;
/*     */     } 
/*  47 */     int lvMin = Integer.parseInt(Gui.jTextField16.getText());
/*  48 */     int lvMax = Integer.parseInt(Gui.jTextField17.getText());
/*  49 */     String name = Gui.jTextField15.getText();
/*  50 */     Party.PacketParty(ShareExp, ShareItem, Invite, Hunt, lvMin, lvMax, name);
/*     */   }
/*     */   public static void jButton31() {
/*  53 */     int i = Gui.jList12.getSelectedIndex();
/*  54 */     Gui.jTextField18.setText(SroBot.PTID[i]);
/*  55 */     Party.SendRequestJointParty(SroBot.PTID[i]);
/*     */   }
/*     */   
/*     */   public static void AddSkillBuff(String SkillData, DefaultListModel<String> ListSkillName, DefaultComboBoxModel<String> SkillNameTarget, DefaultListModel IDSkillNoTarget, DefaultListModel IDPlayer, DefaultListModel TimeMax, DefaultListModel TimeLeft, DefaultListModel ListIDSkill) {
/*  59 */     if (Skill.BuffChecker(SkillData)) {
/*  60 */       ListSkillName.addElement(Skill.SkillName(SkillData));
/*     */       
/*  62 */       if (Skill.TargetChecker(SkillData)) {
/*  63 */         SkillNameTarget.addElement(Skill.SkillName(SkillData));
/*     */       } else {
/*  65 */         Buffing.AddSkillBuff(SkillData, SroBot.ID, IDSkillNoTarget, IDPlayer, TimeMax, TimeLeft, ListIDSkill);
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void RemoveSkillBuff(boolean Target, String SkillData, String Player, DefaultListModel<E> IDSkill, DefaultListModel<E> IDPlayer, DefaultListModel<E> NamePlayer, DefaultListModel TimeMax, DefaultListModel TimeLeft, DefaultListModel SkillID) {
/*  71 */     int MaxSize = IDSkill.getSize();
/*  72 */     if (Target) {
/*  73 */       for (int i = 0; i < MaxSize; i++) {
/*  74 */         if (IDSkill.getElementAt(i).equals(Skill.SkillID(SkillData)) && NamePlayer.getElementAt(i).equals(Player)) {
/*  75 */           IDSkill.removeElementAt(i);
/*  76 */           IDPlayer.removeElementAt(i);
/*  77 */           NamePlayer.removeElementAt(i);
/*  78 */           TimeMax.removeElementAt(i);
/*  79 */           TimeLeft.removeElementAt(i);
/*  80 */           SkillID.removeElementAt(i);
/*  81 */           i = MaxSize;
/*     */         } 
/*     */       } 
/*     */     } else {
/*  85 */       for (int i = 0; i < MaxSize; i++) {
/*  86 */         if (IDSkill.getElementAt(i).equals(Skill.SkillID(SkillData)) && IDPlayer.getElementAt(i).equals(Player)) {
/*  87 */           IDSkill.removeElementAt(i);
/*  88 */           IDPlayer.removeElementAt(i);
/*     */           
/*  90 */           TimeMax.removeElementAt(i);
/*  91 */           TimeLeft.removeElementAt(i);
/*  92 */           SkillID.removeElementAt(i);
/*  93 */           i = MaxSize;
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */   public static void FollowUpdate(String Name, DefaultListModel PlayerList, DefaultListModel IDList) {
/*  99 */     int Mi = PlayerList.getSize();
/* 100 */     for (int i = 0; i < Mi; i++) {
/* 101 */       if (Name.equals((new StringBuilder()).append(PlayerList.getElementAt(i)).append("").toString()))
/* 102 */         SroBot.IDFollow = (new StringBuilder()).append(IDList.getElementAt(i)).append("").toString(); 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\NhatTM\Downloads\SroBot\SroBot\22585 - 15820\SroBot.jar!\srobot\Button.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */