/*     */ package srobot;
/*     */ 
/*     */ import java.io.File;
/*     */ import java.io.FileNotFoundException;
/*     */ import java.util.Scanner;
/*     */ import javax.swing.DefaultListModel;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Monster
/*     */ {
/*     */   public static int UpdateMonsterData(String[] MonsterData) throws FileNotFoundException {
/*  18 */     String path = System.getProperty("user.dir");
/*  19 */     Scanner sc = new Scanner(new File(path + "\\data\\mob.txt"), "Unicode");
/*     */     int i;
/*  21 */     for (i = 0; sc.hasNextLine(); i++) {
/*  22 */       MonsterData[i] = sc.nextLine();
/*     */     }
/*  24 */     sc.close();
/*  25 */     sc = null;
/*  26 */     return i;
/*     */   }
/*     */   public static void SingleSpawn(String sData, int farmX, int farmY, String[] MonsterData, int MonsterLine, DefaultListModel<String> NameMonsterList, DefaultListModel<String> IDMonsterList, DefaultListModel<String> TypeMonsterList, DefaultListModel<Integer> CurrentHPMonsterList, DefaultListModel<Integer> MaxHPMonsterList, DefaultListModel<Integer> LvMonsterList, DefaultListModel<Integer> MonsterXList, DefaultListModel<Integer> MonsterYList, DefaultListModel<Integer> DistanceMonsterList) {
/*  29 */     String ID = sData.substring(0, 8);
/*  30 */     int Distance = 0;
/*  31 */     int mobX = 0;
/*  32 */     int mobY = 0;
/*  33 */     int mHP = 0;
/*  34 */     int lv = 0;
/*  35 */     int multiHP = 1;
/*  36 */     boolean bool = false;
/*  37 */     for (int i = 0; i < MonsterLine; i++) {
/*  38 */       if (ID.equals(SROScanner.GetStringAt(0, MonsterData[i]) + "")) {
/*  39 */         bool = true;
/*  40 */         if (sData.length() == 104) {
/*  41 */           mobX = Location.CalculateLocationFor3015(sData.substring(16, 18), sData.substring(20, 28), true);
/*  42 */           MonsterXList.addElement(Integer.valueOf(mobX));
/*  43 */           mobY = Location.CalculateLocationFor3015(sData.substring(18, 20), sData.substring(36, 44), false);
/*  44 */           MonsterYList.addElement(Integer.valueOf(mobY));
/*  45 */           Distance = Location.Distance(farmX, farmY, mobX, mobY);
/*  46 */           NameMonsterList.addElement(SROScanner.GetStringAt(1, MonsterData[i]));
/*  47 */           IDMonsterList.addElement(sData.substring(8, 16));
/*  48 */           if (sData.substring(100).equals("0001")) {
/*  49 */             TypeMonsterList.addElement("Thường");
/*     */           } else {
/*  51 */             TypeMonsterList.addElement(sData.substring(100));
/*     */           } 
/*  53 */           CurrentHPMonsterList.addElement(Integer.valueOf(Integer.parseInt(SROScanner.GetStringAt(3, MonsterData[i])) * multiHP));
/*  54 */           MaxHPMonsterList.addElement(Integer.valueOf(Integer.parseInt(SROScanner.GetStringAt(3, MonsterData[i])) * multiHP));
/*  55 */           LvMonsterList.addElement(Integer.valueOf(Integer.parseInt(SROScanner.GetStringAt(2, MonsterData[i]))));
/*  56 */           DistanceMonsterList.addElement(Integer.valueOf(Distance));
/*     */         } 
/*  58 */         i = MonsterLine;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   public static boolean GroupSpawn(String sData, int farmX, int farmY, String[] MonsterData, int MonsterLine, DefaultListModel<String> NameMonsterList, DefaultListModel<String> IDMonsterList, DefaultListModel<String> TypeMonsterList, DefaultListModel<Integer> CurrentHPMonsterList, DefaultListModel<Integer> MaxHPMonsterList, DefaultListModel<Integer> LvMonsterList, DefaultListModel<Integer> MonsterXList, DefaultListModel<Integer> MonsterYList, DefaultListModel<Integer> DistanceMonsterList) {
/*  63 */     String ID = sData.substring(0, 8);
/*  64 */     int Distance = 0;
/*  65 */     int mobX = 0;
/*  66 */     int mobY = 0;
/*  67 */     int mHP = 0;
/*  68 */     int lv = 0;
/*  69 */     int multiHP = 1;
/*  70 */     boolean bool = false;
/*  71 */     for (int i = 0; i < MonsterLine; i++) {
/*  72 */       if (ID.equals(SROScanner.GetStringAt(0, MonsterData[i]) + "")) {
/*  73 */         bool = true;
/*  74 */         mobX = Location.CalculateLocationFor3015(sData.substring(16, 18), sData.substring(20, 28), true);
/*  75 */         MonsterXList.addElement(Integer.valueOf(mobX));
/*  76 */         mobY = Location.CalculateLocationFor3015(sData.substring(18, 20), sData.substring(36, 44), false);
/*  77 */         MonsterYList.addElement(Integer.valueOf(mobY));
/*  78 */         Distance = Location.Distance(farmX, farmY, mobX, mobY);
/*  79 */         NameMonsterList.addElement(SROScanner.GetStringAt(1, MonsterData[i]));
/*  80 */         IDMonsterList.addElement(sData.substring(8, 16));
/*  81 */         if (sData.substring(110).equals("01") || sData.substring(110).equals("00")) {
/*  82 */           TypeMonsterList.addElement("Thường");
/*  83 */           multiHP = 1;
/*     */         }
/*  85 */         else if (sData.substring(110).equals("04")) {
/*  86 */           TypeMonsterList.addElement("Khổng lồ");
/*  87 */           multiHP = 20;
/*     */         } else {
/*  89 */           TypeMonsterList.addElement(sData.substring(110));
/*     */         } 
/*     */         
/*  92 */         CurrentHPMonsterList.addElement(Integer.valueOf(Integer.parseInt(SROScanner.GetStringAt(3, MonsterData[i])) * multiHP));
/*  93 */         MaxHPMonsterList.addElement(Integer.valueOf(Integer.parseInt(SROScanner.GetStringAt(3, MonsterData[i])) * multiHP));
/*  94 */         LvMonsterList.addElement(Integer.valueOf(Integer.parseInt(SROScanner.GetStringAt(2, MonsterData[i]))));
/*  95 */         DistanceMonsterList.addElement(Integer.valueOf(Distance));
/*  96 */         i = MonsterLine;
/*     */       } 
/*     */     } 
/*  99 */     return bool;
/*     */   }
/*     */   
/*     */   public static void RemoveMonster(String sData, DefaultListModel NameMonsterList, DefaultListModel IDMonsterList, DefaultListModel TypeMonsterList, DefaultListModel CurrentHPMonsterList, DefaultListModel MaxHPMonsterList, DefaultListModel LvMonsterList, DefaultListModel MonsterXList, DefaultListModel MonsterYList, DefaultListModel DistanceMonsterList) {
/* 103 */     int size = IDMonsterList.getSize();
/* 104 */     for (int i = 0; i < size; i++) {
/* 105 */       if (sData.equals((new StringBuilder()).append(IDMonsterList.getElementAt(i)).append("").toString())) {
/*     */         
/* 107 */         NameMonsterList.removeElementAt(i);
/* 108 */         IDMonsterList.removeElementAt(i);
/* 109 */         TypeMonsterList.removeElementAt(i);
/* 110 */         CurrentHPMonsterList.removeElementAt(i);
/* 111 */         MaxHPMonsterList.removeElementAt(i);
/* 112 */         LvMonsterList.removeElementAt(i);
/* 113 */         MonsterXList.removeElementAt(i);
/* 114 */         MonsterYList.removeElementAt(i);
/* 115 */         DistanceMonsterList.removeElementAt(i);
/* 116 */         i = size + 1;
/*     */       } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void MonsterLocationUpdate(String ID, int X, int Y, int farmX, int farmY, DefaultListModel IDMonsterList, DefaultListModel<Integer> MonsterXList, DefaultListModel<Integer> MonsterYList, DefaultListModel<Integer> DistanceMonsterList) {
/* 122 */     int i = MonsterIndex(ID, IDMonsterList);
/* 123 */     if (i == -1) {
/*     */       return;
/*     */     }
/* 126 */     MonsterXList.setElementAt(Integer.valueOf(X), i);
/* 127 */     MonsterYList.setElementAt(Integer.valueOf(Y), i);
/* 128 */     DistanceMonsterList.setElementAt(Integer.valueOf(Location.Distance(X, Y, farmX, farmY)), i);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void GroupSpawnAnalyze(String sData, int farmX, int farmY, String[] MonsterData, int MonsterLine, DefaultListModel NameMonsterList, DefaultListModel IDMonsterList, DefaultListModel TypeMonsterList, DefaultListModel CurrentHPMonsterList, DefaultListModel MaxHPMonsterList, DefaultListModel LvMonsterList, DefaultListModel MonsterXList, DefaultListModel MonsterYList, DefaultListModel DistanceMonsterList) {
/* 133 */     boolean bool = false;
/* 134 */     if (sData.length() == 112)
/*     */     {
/* 136 */       bool = GroupSpawn(sData, farmX, farmY, MonsterData, MonsterLine, NameMonsterList, IDMonsterList, TypeMonsterList, CurrentHPMonsterList, MaxHPMonsterList, LvMonsterList, MonsterXList, MonsterYList, DistanceMonsterList);
/*     */     }
/* 138 */     if (sData.length() > 112) {
/*     */       
/* 140 */       String Data = sData.substring(0, 112);
/* 141 */       String DataNext = sData.substring(112);
/* 142 */       bool = GroupSpawn(Data, farmX, farmY, MonsterData, MonsterLine, NameMonsterList, IDMonsterList, TypeMonsterList, CurrentHPMonsterList, MaxHPMonsterList, LvMonsterList, MonsterXList, MonsterYList, DistanceMonsterList);
/* 143 */       GroupSpawnAnalyze(DataNext, farmX, farmY, MonsterData, MonsterLine, NameMonsterList, IDMonsterList, TypeMonsterList, CurrentHPMonsterList, MaxHPMonsterList, LvMonsterList, MonsterXList, MonsterYList, DistanceMonsterList);
/*     */     } 
/* 145 */     if (sData.length() >= 8 && Convert.chialaydu(sData.length(), 8) == 0 && !bool) {
/* 146 */       int j = Convert.chialaynguyen(sData.length(), 8);
/* 147 */       for (int z = 0; z < j; z++)
/*     */       {
/* 149 */         RemoveMonster(sData.substring(z * 8, (z + 1) * 8), NameMonsterList, IDMonsterList, TypeMonsterList, CurrentHPMonsterList, MaxHPMonsterList, LvMonsterList, MonsterXList, MonsterYList, DistanceMonsterList); } 
/*     */     } 
/*     */   }
/*     */   
/*     */   public static int MonsterIndex(String ID, DefaultListModel IDMonsterList) {
/* 154 */     int size = IDMonsterList.getSize();
/* 155 */     for (int i = 0; i < size; i++) {
/* 156 */       if (ID.equals((new StringBuilder()).append(IDMonsterList.getElementAt(i)).append("").toString())) {
/* 157 */         return i;
/*     */       }
/*     */     } 
/* 160 */     return -1;
/*     */   }
/*     */   public static void MonsterStatus(String sData, DefaultListModel IDMonsterList, DefaultListModel CurrentHPMonsterList) {
/* 163 */     if (sData.length() < 20) {
/*     */       return;
/*     */     }
/* 166 */     String ID = sData.substring(2, 10);
/* 167 */     int cHP = Integer.parseInt(Convert.revertString(sData.substring(12, 20)), 16);
/*     */     
/* 169 */     UpdateMonsterHP(ID, cHP, IDMonsterList, CurrentHPMonsterList);
/*     */   }
/*     */   
/*     */   public static void UpdateMonsterHP(String ID, int cHP, DefaultListModel IDMonsterList, DefaultListModel<Integer> CurrentHPMonsterList) {
/* 173 */     int i = MonsterIndex(ID, IDMonsterList);
/* 174 */     if (i != -1)
/* 175 */       CurrentHPMonsterList.setElementAt(Integer.valueOf(cHP), i); 
/*     */   }
/*     */   
/*     */   public static void DoActionLure(int Delay, DefaultListModel ActionLureList, DefaultListModel ActionLurePlaceList) {
/* 179 */     int size = ActionLureList.getSize();
/* 180 */     for (int i = 0; i < size; i++) {
/* 181 */       if ((new StringBuilder()).append(ActionLurePlaceList.getElementAt(i)).append("").toString().equals("0"))
/* 182 */         if ((new StringBuilder()).append(ActionLureList.getElementAt(i)).append("").toString().length() < 16) {
/* 183 */           if (Delay == 0) {
/* 184 */             InjectPacket.Injectpacket("7074", (new StringBuilder()).append(ActionLureList.getElementAt(i)).append("").toString(), true, false);
/*     */           }
/*     */         } else {
/*     */           
/* 188 */           InjectPacket.Injectpacket("7021", (new StringBuilder()).append(ActionLureList.getElementAt(i)).append("").toString(), true, false);
/*     */         }  
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void SkillRefresh(String[] ID, DefaultListModel SkillIDList, DefaultListModel SkillTimeMaxList, DefaultListModel SkillTimeLeftList) {
/* 194 */     int Size = SkillIDList.getSize();
/* 195 */     for (int i = 0; i < Size; i++) {
/* 196 */       if (ID[0].equals(SkillIDList.getElementAt(i))) {
/* 197 */         SkillTimeLeftList.setElementAt(SkillTimeMaxList.getElementAt(i), i);
/*     */       }
/*     */     } 
/* 200 */     ID[0] = "";
/*     */   }
/*     */ }


/* Location:              C:\Users\NhatTM\Downloads\SroBot\SroBot\22585 - 15820\SroBot.jar!\srobot\Monster.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */