/*     */ package srobot;
/*     */ 
/*     */ import java.util.Scanner;
/*     */ import javax.swing.JTextField;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Skill
/*     */ {
/*     */   public static void UpdateSkill(String sData, JTextField PlayerID) {
/*  16 */     if (sData.length() > 14) {
/*  17 */       PlayerID.setText(sData.substring(14));
/*     */     }
/*     */   }
/*     */   
/*     */   public static String GetSkillData(String[] SkillData, String SkillNotRated, int size) {
/*  22 */     String OutputString = SkillNotRated;
/*  23 */     for (int i = 0; i < size; i++) {
/*  24 */       if (CompareSkillData(SkillNotRated, SkillData[i])) {
/*  25 */         OutputString = SkillData[i];
/*  26 */         return OutputString;
/*     */       } 
/*     */     } 
/*  29 */     return OutputString;
/*     */   }
/*     */   
/*     */   public static boolean CompareSkillData(String SkillData, String SkillDataFile) {
/*  33 */     String ID1 = SkillData.substring(0, 8);
/*  34 */     String ID2 = SkillDataFile.substring(0, 8);
/*  35 */     if (ID1.equals(ID2)) {
/*  36 */       return true;
/*     */     }
/*  38 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public static String SetNewSkill(String ID) {
/*  43 */     String skill = ID + ",NoRate," + ID;
/*  44 */     return skill;
/*     */   }
/*     */   
/*     */   public static String SkillName(String SkillData) {
/*  48 */     String[] skilldata = new String[15];
/*     */     
/*  50 */     Scanner scanner = new Scanner(SkillData);
/*  51 */     scanner.useDelimiter(",");
/*  52 */     for (int i = 0; i < 15; i++) {
/*  53 */       skilldata[i] = scanner.next();
/*  54 */       if (!scanner.hasNext()) {
/*  55 */         i = 16;
/*     */       }
/*     */     } 
/*  58 */     scanner.close();
/*  59 */     String name = skilldata[2];
/*  60 */     skilldata = null;
/*  61 */     return name;
/*     */   }
/*     */   public static boolean BuffChecker(String SkillData) {
/*  64 */     String[] skilldata = new String[15];
/*  65 */     Scanner scanner = new Scanner(SkillData);
/*  66 */     scanner.useDelimiter(",");
/*  67 */     for (int i = 0; i < 15; i++) {
/*  68 */       skilldata[i] = scanner.next();
/*  69 */       if (!scanner.hasNext()) {
/*  70 */         i = 16;
/*     */       }
/*     */     } 
/*  73 */     scanner.close();
/*  74 */     if (skilldata[3].equals("2")) {
/*  75 */       if (skilldata[4].equals("0") || skilldata[5].equals("1")) {
/*  76 */         skilldata = null;
/*  77 */         return true;
/*     */       } 
/*  79 */       skilldata = null;
/*  80 */       return false;
/*     */     } 
/*     */     
/*  83 */     skilldata = null;
/*  84 */     return false;
/*     */   }
/*     */   public static boolean TargetChecker(String SkillData) {
/*  87 */     String[] skilldata = new String[15];
/*  88 */     Scanner scanner = new Scanner(SkillData);
/*  89 */     scanner.useDelimiter(",");
/*  90 */     for (int i = 0; i < 15; i++) {
/*  91 */       skilldata[i] = scanner.next();
/*  92 */       if (!scanner.hasNext()) {
/*  93 */         i = 16;
/*     */       }
/*     */     } 
/*  96 */     scanner.close();
/*  97 */     if (skilldata[4].equals("1")) {
/*  98 */       skilldata = null;
/*  99 */       return true;
/*     */     } 
/* 101 */     skilldata = null;
/* 102 */     return false;
/*     */   }
/*     */   
/*     */   public static String SkillID(String SkillData) {
/* 106 */     String[] skilldata = new String[15];
/*     */     
/* 108 */     Scanner scanner = new Scanner(SkillData);
/* 109 */     scanner.useDelimiter(",");
/* 110 */     for (int i = 0; i < 15; i++) {
/* 111 */       skilldata[i] = scanner.next();
/* 112 */       if (!scanner.hasNext()) {
/* 113 */         i = 16;
/*     */       }
/*     */     } 
/* 116 */     scanner.close();
/* 117 */     String ID = skilldata[0];
/* 118 */     skilldata = null;
/* 119 */     return ID;
/*     */   }
/*     */   public static int SkillTimeMax(String SkillData) {
/* 122 */     String[] skilldata = new String[15];
/*     */     
/* 124 */     Scanner scanner = new Scanner(SkillData);
/* 125 */     scanner.useDelimiter(",");
/* 126 */     for (int i = 0; i < 15; i++) {
/* 127 */       skilldata[i] = scanner.next();
/* 128 */       if (!scanner.hasNext()) {
/* 129 */         i = 16;
/*     */       }
/*     */     } 
/* 132 */     scanner.close();
/* 133 */     int TimeMax = Integer.parseInt(skilldata[7]) + Integer.parseInt(skilldata[9]);
/* 134 */     skilldata = null;
/* 135 */     return TimeMax;
/*     */   }
/*     */   
/*     */   public static String SkillSearch(String[] SkillList, int MaxIndex, String Name) {
/* 139 */     String str = "";
/* 140 */     for (int i = 0; i < MaxIndex; i++) {
/* 141 */       if (SkillName(SkillList[i]).equals(Name)) {
/* 142 */         return SkillList[i];
/*     */       }
/*     */     } 
/* 145 */     return str;
/*     */   }
/*     */ }


/* Location:              C:\Users\NhatTM\Downloads\SroBot\SroBot\22585 - 15820\SroBot.jar!\srobot\Skill.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */