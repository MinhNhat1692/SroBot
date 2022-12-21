/*     */ package srobot;
/*     */ 
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
/*     */ 
/*     */ public class Character
/*     */ {
/*     */   public static void IDplayerUpdate(String sData) {}
/*     */   
/*     */   public static void CharInfo(String sData) {
/*  19 */     int DamPhyMin = Integer.parseInt(Convert.revertString(sData.substring(0, 8)), 16);
/*  20 */     int DamPhyMax = Integer.parseInt(Convert.revertString(sData.substring(8, 16)), 16);
/*  21 */     int DamMagMin = Integer.parseInt(Convert.revertString(sData.substring(16, 24)), 16);
/*  22 */     int DamMagMax = Integer.parseInt(Convert.revertString(sData.substring(24, 32)), 16);
/*  23 */     int DefPhy = Integer.parseInt(Convert.revertString(sData.substring(32, 36)), 16);
/*  24 */     int DefMag = Integer.parseInt(Convert.revertString(sData.substring(36, 40)), 16);
/*  25 */     int AtkRate = Integer.parseInt(Convert.revertString(sData.substring(40, 44)), 16);
/*  26 */     int DefRate = Integer.parseInt(Convert.revertString(sData.substring(44, 48)), 16);
/*  27 */     int MaxHP = Integer.parseInt(Convert.revertString(sData.substring(48, 56)), 16);
/*  28 */     int MaxMP = Integer.parseInt(Convert.revertString(sData.substring(56, 64)), 16);
/*  29 */     int Str = Integer.parseInt(Convert.revertString(sData.substring(64, 68)), 16);
/*  30 */     int Int = Integer.parseInt(Convert.revertString(sData.substring(68, 72)), 16);
/*  31 */     Gui.jLabel28.setText(DamPhyMin + "~" + DamPhyMax);
/*  32 */     Gui.jLabel30.setText(DamMagMin + "~" + DamMagMax);
/*  33 */     Gui.jLabel32.setText(DefPhy + "");
/*  34 */     Gui.jLabel34.setText(DefMag + "");
/*  35 */     Gui.jLabel36.setText(AtkRate + "");
/*  36 */     Gui.jLabel38.setText(DefRate + "");
/*  37 */     Gui.jLabel40.setText(Str + "");
/*  38 */     Gui.jLabel42.setText(Int + "");
/*  39 */     SroBot.mHP = MaxHP;
/*  40 */     SroBot.mMP = MaxMP;
/*  41 */     Button.HPupdate();
/*  42 */     Button.MPupdate();
/*     */   }
/*     */   public static void CharUpdate(String[] SkillList, String sData, DefaultListModel<String> ListAllSkillName) {
/*  45 */     String header = "";
/*  46 */     int PlayerType = Integer.parseInt(Convert.revertString(sData.substring(8, 16)), 16);
/*  47 */     int cLv = Integer.parseInt(sData.substring(18, 20), 16);
/*  48 */     int MaxLv = Integer.parseInt(sData.substring(20, 22), 16);
/*  49 */     int Exp = Integer.parseInt(Convert.revertString(sData.substring(22, 38)), 16);
/*  50 */     int Gold = Integer.parseInt(Convert.revertString(sData.substring(46, 62)), 16);
/*  51 */     int Sp = Integer.parseInt(Convert.revertString(sData.substring(62, 70)), 16);
/*  52 */     int Ber = Integer.parseInt(Convert.revertString(sData.substring(74, 76)), 16);
/*  53 */     int cHP = Integer.parseInt(Convert.revertString(sData.substring(84, 92)), 16);
/*  54 */     int cMP = Integer.parseInt(Convert.revertString(sData.substring(92, 100)), 16);
/*  55 */     int namelen = Integer.parseInt(Convert.revertString(sData.substring(sData.lastIndexOf("00C84200") + 8, sData.lastIndexOf("00C84200") + 12)), 16);
/*  56 */     String nameHex = sData.substring(sData.lastIndexOf("00C84200") + 12, sData.lastIndexOf("00C84200") + 12 + namelen * 2);
/*  57 */     String name = Convert.HexToString(nameHex);
/*  58 */     if (PlayerType < 1933) {
/*  59 */       header = "B00000101010000";
/*     */     }
/*  61 */     else if (PlayerType > 14716) {
/*  62 */       header = "B00000101020000";
/*     */     } 
/*     */     
/*  65 */     int startskill = sData.lastIndexOf(header) + 11;
/*  66 */     int stopskill = sData.lastIndexOf("00000102") + 8;
/*  67 */     String skilllist = sData.substring(startskill, stopskill);
/*  68 */     SroBot.cHP = cHP;
/*  69 */     SroBot.cMP = cMP;
/*  70 */     if (PlayerType < 1933) {
/*  71 */       Gui.jLabel26.setText("China");
/*  72 */       int len = skilllist.length();
/*  73 */       int max = Convert.chialaynguyen(len, 12);
/*  74 */       ListAllSkillName.removeAllElements();
/*  75 */       for (int i = 7; i < max; i++) {
/*  76 */         int j = i - 7;
/*  77 */         String skillID = skilllist.substring(i * 12, i * 12 + 8);
/*  78 */         SkillList[j] = Skill.SetNewSkill(skillID);
/*  79 */         SkillList[j] = Skill.GetSkillData(SroBot.skilldata, SkillList[j], SroBot.SkillLine[0]);
/*  80 */         ListAllSkillName.addElement(Skill.SkillName(SkillList[j]));
/*     */       }
/*     */     
/*  83 */     } else if (PlayerType > 14716) {
/*  84 */       Gui.jLabel26.setText("EU");
/*  85 */       int len = skilllist.length();
/*  86 */       int max = Convert.chialaynguyen(len, 12);
/*  87 */       ListAllSkillName.removeAllElements();
/*  88 */       for (int i = 6; i < max; i++) {
/*  89 */         int j = i - 6;
/*  90 */         String skillID = skilllist.substring(i * 12, i * 12 + 8);
/*  91 */         SkillList[j] = Skill.SetNewSkill(skillID);
/*  92 */         SkillList[j] = Skill.GetSkillData(SroBot.skilldata, SkillList[j], SroBot.SkillLine[0]);
/*  93 */         ListAllSkillName.addElement(Skill.SkillName(SkillList[j]));
/*     */       } 
/*     */     } 
/*     */     
/*  97 */     Gui.jLabel17.setText(cLv + "");
/*  98 */     Gui.jLabel13.setText(Exp + "");
/*  99 */     Gui.jLabel18.setText(Sp + "");
/* 100 */     Gui.jLabel19.setText(Gold + "");
/* 101 */     Gui.jLabel20.setText(cHP + Gui.jLabel20.getText().substring(Gui.jLabel20.getText().lastIndexOf("/")));
/* 102 */     Gui.jLabel21.setText(cMP + Gui.jLabel21.getText().substring(Gui.jLabel21.getText().lastIndexOf("/")));
/* 103 */     Gui.jLabel4.setText(name);
/*     */   }
/*     */   public static void CharacterSpawn(String sData, DefaultListModel<String> ID, DefaultListModel<String> Name) {
/* 106 */     if (sData.length() < 8) {
/*     */       return;
/*     */     }
/* 109 */     String model = sData.substring(0, 8);
/*     */     
/* 111 */     if ((Integer.parseInt(Convert.revertString(model), 16) < 1933 && Integer.parseInt(Convert.revertString(model), 16) > 1906) || (Integer.parseInt(Convert.revertString(model), 16) > 14874 && Integer.parseInt(Convert.revertString(model), 16) < 14901)) {
/* 112 */       int NameLoc; String ItemCount = sData.substring(18, 20);
/*     */       
/* 114 */       int AvaLoc = 20 + 10 * Integer.parseInt(ItemCount) + 2;
/*     */       
/* 116 */       String AvaCount = sData.substring(AvaLoc, AvaLoc + 2);
/*     */       
/* 118 */       int IDLoc = AvaLoc + 2 + 10 * Integer.parseInt(AvaCount) + 2;
/*     */ 
/*     */       
/* 121 */       String IDPlayer = sData.substring(IDLoc, IDLoc + 8);
/*     */       
/* 123 */       int DesLoc = IDLoc + 8 + 32;
/*     */       
/* 125 */       String Des = sData.substring(DesLoc, DesLoc + 2);
/*     */ 
/*     */       
/* 128 */       if (Des.equals("01")) {
/* 129 */         NameLoc = DesLoc + 68 + Integer.parseInt(sData.substring(DesLoc + 66, DesLoc + 68)) * 2 * 8;
/*     */       } else {
/* 131 */         NameLoc = DesLoc + 46 + Integer.parseInt(sData.substring(DesLoc + 44, DesLoc + 46)) * 2 * 8;
/*     */       } 
/* 133 */       String NameLength = sData.substring(NameLoc, NameLoc + 4);
/*     */       
/* 135 */       int Length = Integer.parseInt(Convert.revertString(NameLength), 16);
/* 136 */       String NamePlayer = sData.substring(NameLoc + 4, NameLoc + 4 + Length * 2);
/* 137 */       String FullName = Convert.HexToString(NamePlayer);
/* 138 */       ID.addElement(IDPlayer);
/* 139 */       Name.addElement(FullName);
/*     */     } 
/*     */   }
/*     */   public static void CharacterRemove(String sData, DefaultListModel ID, DefaultListModel Name) {
/* 143 */     String IDPlayer = sData;
/* 144 */     int Mi = ID.getSize();
/* 145 */     for (int i = 0; i < Mi; i++) {
/* 146 */       if (IDPlayer.equals((new StringBuilder()).append(ID.getElementAt(i)).append("").toString())) {
/* 147 */         ID.removeElementAt(i);
/* 148 */         Name.removeElementAt(i);
/* 149 */         Mi--;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   public static String CharacterGroupSpawn(String sData, DefaultListModel<String> ID, DefaultListModel<String> Name) {
/* 154 */     if (sData.length() < 8) {
/* 155 */       return sData;
/*     */     }
/* 157 */     String model = sData.substring(0, 8);
/* 158 */     String DataOut = sData;
/*     */     
/* 160 */     if ((Integer.parseInt(Convert.revertString(model), 16) < 1933 && Integer.parseInt(Convert.revertString(model), 16) > 1906) || (Integer.parseInt(Convert.revertString(model), 16) > 14874 && Integer.parseInt(Convert.revertString(model), 16) < 14901)) {
/* 161 */       int NameLoc; String ItemCount = sData.substring(18, 20);
/*     */       
/* 163 */       int AvaLoc = 20 + 10 * Integer.parseInt(ItemCount) + 2;
/*     */       
/* 165 */       String AvaCount = sData.substring(AvaLoc, AvaLoc + 2);
/*     */       
/* 167 */       int IDLoc = AvaLoc + 2 + 10 * Integer.parseInt(AvaCount) + 2;
/*     */ 
/*     */       
/* 170 */       String IDPlayer = sData.substring(IDLoc, IDLoc + 8);
/*     */       
/* 172 */       int DesLoc = IDLoc + 8 + 32;
/*     */       
/* 174 */       String Des = sData.substring(DesLoc, DesLoc + 2);
/*     */ 
/*     */       
/* 177 */       if (Des.equals("01")) {
/*     */         
/* 179 */         NameLoc = DesLoc + 68 + Integer.parseInt(sData.substring(DesLoc + 66, DesLoc + 68)) * 2 * 8;
/*     */       } else {
/*     */         
/* 182 */         NameLoc = DesLoc + 46 + Integer.parseInt(sData.substring(DesLoc + 44, DesLoc + 46)) * 2 * 8;
/*     */       } 
/* 184 */       String NameLength = sData.substring(NameLoc, NameLoc + 4);
/*     */       
/* 186 */       int Length = Integer.parseInt(Convert.revertString(NameLength), 16);
/* 187 */       String NamePlayer = sData.substring(NameLoc + 4, NameLoc + 4 + Length * 2);
/* 188 */       String FullName = Convert.HexToString(NamePlayer);
/* 189 */       int end = NameLoc + 4 + Length * 2 + 88;
/* 190 */       if (sData.length() < end) {
/* 191 */         DataOut = "";
/*     */       } else {
/* 193 */         DataOut = sData.substring(end);
/*     */       } 
/* 195 */       ID.addElement(IDPlayer);
/* 196 */       Name.addElement(FullName);
/*     */     } 
/* 198 */     return DataOut;
/*     */   }
/*     */ }


/* Location:              C:\Users\NhatTM\Downloads\SroBot\SroBot\22585 - 15820\SroBot.jar!\srobot\Character.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */