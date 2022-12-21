/*     */ package srobot;
/*     */ 
/*     */ import javax.swing.DefaultListModel;
/*     */ import javax.swing.JLabel;
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
/*     */ public class Walking
/*     */ {
/*     */   public static void UpdateStatusWalking(String sData, String IDplayer, String IDfollow, int[] myX, int[] myY, JLabel Place, JLabel X, JLabel Y, int[] farmX, int[] farmY, String[] LocationData, int LocationLine, DefaultListModel IDMonsterList, DefaultListModel MonsterXList, DefaultListModel MonsterYList, DefaultListModel DistanceMonsterList) {
/*     */     String ID;
/*     */     String Xsec;
/*     */     String Xsec1;
/*     */     String Ysec;
/*     */     String Ysec1;
/*     */     String Xcoord;
/*     */     String Xcoord1;
/*     */     String Ycoord;
/*     */     String Ycoord1;
/*     */     String Zcoord;
/*     */     String Zcoord1;
/*     */     int x;
/*     */     int y;
/*  31 */     switch (sData.length()) {
/*     */       case 28:
/*  33 */         ID = sData.substring(0, 8);
/*  34 */         Xsec = sData.substring(10, 12);
/*  35 */         Ysec = sData.substring(12, 14);
/*  36 */         Xcoord = sData.substring(14, 18);
/*  37 */         Zcoord = sData.substring(18, 22);
/*  38 */         Ycoord = sData.substring(22, 26);
/*  39 */         x = Location.CalculateLocation(Xsec, Xcoord, true, true);
/*  40 */         y = Location.CalculateLocation(Ysec, Ycoord, false, true);
/*  41 */         switch (CheckID(ID, IDplayer, IDfollow)) {
/*     */           case 0:
/*  43 */             Monster.MonsterLocationUpdate(ID, x, y, farmX[0], farmY[0], IDMonsterList, MonsterXList, MonsterYList, DistanceMonsterList);
/*     */             return;
/*     */           case 1:
/*  46 */             Location.UpdataLocationName(Place, Xsec + Ysec, LocationData, LocationLine);
/*  47 */             X.setText("X : " + x);
/*  48 */             myX[0] = x;
/*  49 */             Y.setText("Y : " + y);
/*  50 */             myY[0] = y;
/*     */             return;
/*     */         } 
/*     */       
/*     */       
/*     */       
/*     */       case 48:
/*  57 */         ID = sData.substring(0, 8);
/*  58 */         Xsec = sData.substring(10, 12);
/*  59 */         Ysec = sData.substring(12, 14);
/*  60 */         Xcoord = sData.substring(14, 18);
/*  61 */         Zcoord = sData.substring(18, 22);
/*  62 */         Ycoord = sData.substring(22, 26);
/*  63 */         Xsec1 = sData.substring(28, 30);
/*  64 */         Ysec1 = sData.substring(30, 32);
/*  65 */         Xcoord1 = sData.substring(32, 36);
/*  66 */         Zcoord1 = sData.substring(36, 44);
/*  67 */         Ycoord1 = sData.substring(44, 48);
/*  68 */         x = Location.CalculateLocation(Xsec, Xcoord, true, true);
/*  69 */         y = Location.CalculateLocation(Ysec, Ycoord, false, true);
/*  70 */         switch (CheckID(ID, IDplayer, IDfollow)) {
/*     */           case 0:
/*  72 */             Monster.MonsterLocationUpdate(ID, x, y, farmX[0], farmY[0], IDMonsterList, MonsterXList, MonsterYList, DistanceMonsterList);
/*     */             return;
/*     */           case 1:
/*  75 */             Location.UpdataLocationName(Place, Xsec + Ysec, LocationData, LocationLine);
/*  76 */             X.setText("X : " + x);
/*  77 */             myX[0] = x;
/*  78 */             Y.setText("Y : " + y);
/*  79 */             myY[0] = y;
/*     */             return;
/*     */         } 
/*     */       
/*     */       
/*     */       
/*     */       case 40:
/*  86 */         ID = sData.substring(0, 8);
/*  87 */         Xsec = sData.substring(10, 12);
/*  88 */         Ysec = sData.substring(12, 14);
/*  89 */         Xcoord = sData.substring(14, 22);
/*  90 */         Ycoord = sData.substring(22, 30);
/*  91 */         Zcoord = sData.substring(30, 38);
/*  92 */         x = Location.CalculateLocationSpecial(Xsec, Xcoord, true);
/*  93 */         y = Location.CalculateLocationSpecial(Ysec, Ycoord, false);
/*  94 */         switch (CheckID(ID, IDplayer, IDfollow)) {
/*     */           case 0:
/*     */             return;
/*     */           
/*     */           case 1:
/*  99 */             Location.UpdataLocationName(Place, Xsec + Ysec, LocationData, LocationLine);
/* 100 */             X.setText("X : " + x);
/* 101 */             myX[0] = x;
/* 102 */             Y.setText("Y : " + y);
/* 103 */             myY[0] = y;
/*     */             return;
/*     */         } 
/*     */       
/*     */       
/*     */       
/*     */       case 68:
/* 110 */         ID = sData.substring(0, 8);
/* 111 */         Xsec = sData.substring(10, 12);
/* 112 */         Ysec = sData.substring(12, 14);
/* 113 */         Xcoord = sData.substring(14, 22);
/* 114 */         Ycoord = sData.substring(22, 30);
/* 115 */         Zcoord = sData.substring(30, 38);
/* 116 */         Xsec1 = sData.substring(40, 42);
/* 117 */         Ysec1 = sData.substring(42, 44);
/* 118 */         Xcoord1 = sData.substring(44, 52);
/* 119 */         Ycoord1 = sData.substring(52, 60);
/* 120 */         Zcoord1 = sData.substring(60, 68);
/* 121 */         x = Location.CalculateLocation(Xsec, Xcoord, true, false);
/* 122 */         y = Location.CalculateLocation(Ysec, Ycoord, true, false);
/* 123 */         switch (CheckID(ID, IDplayer, IDfollow)) {
/*     */           case 0:
/*     */             return;
/*     */           
/*     */           case 1:
/* 128 */             Location.UpdataLocationName(Place, Xsec + Ysec, LocationData, LocationLine);
/* 129 */             X.setText("X : " + x);
/* 130 */             myX[0] = x;
/* 131 */             Y.setText("Y : " + y);
/* 132 */             myY[0] = y;
/*     */             return;
/*     */         } 
/*     */         break;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static void CastFollow(String ID) {
/* 141 */     InjectPacket.Injectpacket("7074", "010301" + ID, true, false);
/*     */   }
/*     */   public static int CheckID(String ID, String IDplayer, String IDfollow) {
/* 144 */     if (ID.equals(IDplayer)) {
/* 145 */       return 1;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 150 */     return 0;
/*     */   }
/*     */ }


/* Location:              C:\Users\NhatTM\Downloads\SroBot\SroBot\22585 - 15820\SroBot.jar!\srobot\Walking.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */