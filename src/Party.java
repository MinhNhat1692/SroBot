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
/*     */ public class Party
/*     */ {
/*     */   public static void PartyRerister(String ptType, String HuntOrQuest, int lvMin, int lvMax, String NameOfParty) {
/*  15 */     String sData = "";
/*  16 */     sData = sData + "0000000000000000" + ptType + HuntOrQuest + Convert.toHexfull(lvMin, 2) + Convert.toHexfull(lvMax, 2);
/*  17 */     String hexName = "";
/*  18 */     String name = "";
/*  19 */     hexName = hexName + Convert.revertString(Convert.toHexfull(NameOfParty.length(), 4));
/*  20 */     name = Convert.stringtohex(NameOfParty);
/*  21 */     hexName = hexName + name;
/*  22 */     sData = sData + hexName;
/*  23 */     InjectPacket.Injectpacket("7069", sData, true, false);
/*     */   }
/*     */   
/*     */   public static void PacketParty(boolean ShareExp, boolean ShareItem, boolean Invite, boolean Hunt, int lvMin, int lvMax, String name) {
/*  27 */     String Type = PartyType(ShareExp, ShareItem, Invite);
/*  28 */     String HuntorQuest = "";
/*  29 */     if (Hunt) {
/*  30 */       HuntorQuest = "00";
/*     */     } else {
/*  32 */       HuntorQuest = "01";
/*     */     } 
/*  34 */     PartyRerister(Type, HuntorQuest, lvMin, lvMax, name);
/*     */   }
/*     */   
/*     */   public static String PartyType(boolean ShareExp, boolean ShareItem, boolean Invite) {
/*  38 */     int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;
/*  39 */     String Type = "";
/*  40 */     if (ShareExp) {
/*  41 */       a = 1;
/*     */     } else {
/*  43 */       c = 1;
/*     */     } 
/*  45 */     if (ShareItem) {
/*  46 */       b = 1;
/*     */     } else {
/*  48 */       d = 1;
/*     */     } 
/*  50 */     if (Invite) {
/*  51 */       e = 4;
/*     */     }
/*  53 */     f = a * 0 + b * 3 + c * -1 + d * 1 + e;
/*  54 */     Type = "0" + f;
/*  55 */     return Type;
/*     */   }
/*     */   public static void AcceptParty() {
/*  58 */     InjectPacket.Injectpacket("3080", "0101", true, false);
/*     */   }
/*     */   public static void UpdatePartyRequest(String sData) {
/*  61 */     if (Gui.jCheckBox1.isSelected()) {
/*     */       
/*  63 */       if (sData.substring(10, 12).equals(PartyType(Gui.jRadioButton11.isSelected(), Gui.jRadioButton9.isSelected(), Gui.jCheckBox6.isSelected()))) {
/*  64 */         AcceptParty();
/*     */       }
/*     */     } else {
/*     */       return;
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void PartyInfoRequest() {
/*  72 */     InjectPacket.Injectpacket("706C", "00", true, false);
/*     */   }
/*     */   public static void UpdatePartyList(String sData, String[][] PartyListData, String[] PartyID, DefaultListModel model) {
/*  75 */     model.removeAllElements();
/*  76 */     String PartyData = sData.substring(8);
/*  77 */     String PartyDataNext = PartyData;
/*  78 */     String[] Data = new String[150];
/*  79 */     int[] space = new int[7];
/*  80 */     space[0] = 10;
/*  81 */     space[1] = 20;
/*  82 */     space[2] = 50;
/*  83 */     space[3] = 10;
/*  84 */     space[4] = 20;
/*  85 */     space[5] = 10;
/*  86 */     int[] i = new int[1];
/*  87 */     CropPartyData(PartyData, Data, i);
/*  88 */     for (int j = 0; j <= i[0] - 1; j++) {
/*  89 */       AnalysisPartyData(Data[j], PartyListData[j], PartyID, j);
/*  90 */       JListFunction.AddDataRow(model, PartyListData[j], space, 7);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static String CropPartyData(String sData, String[] PartyData, int[] Array) {
/*  96 */     int nameLength = Integer.parseInt(Convert.revertString(sData.substring(16, 20)), 16);
/*  97 */     int PartyNameLength = Integer.parseInt(Convert.revertString(sData.substring(20 + nameLength * 2 + 12, 20 + nameLength * 2 + 16)), 16);
/*  98 */     int PartyDataLength = 20 + nameLength * 2 + 16 + PartyNameLength * 2;
/*  99 */     PartyData[Array[0]] = sData.substring(0, PartyDataLength);
/* 100 */     String PartyNext = sData.substring(PartyDataLength);
/* 101 */     Array[0] = Array[0] + 1;
/* 102 */     if (PartyNext.length() > 38) {
/* 103 */       CropPartyData(PartyNext, PartyData, Array);
/*     */     }
/* 105 */     return PartyNext;
/*     */   }
/*     */   
/*     */   public static void AnalysisPartyData(String PartyData, String[] OutputData, String[] IDParty, int j) {
/* 109 */     IDParty[j] = PartyData.substring(0, 8);
/* 110 */     int nameLength = Integer.parseInt(Convert.revertString(PartyData.substring(16, 20)), 16);
/* 111 */     int PartyNameLength = Integer.parseInt(Convert.revertString(PartyData.substring(20 + nameLength * 2 + 12, 20 + nameLength * 2 + 16)), 16);
/* 112 */     OutputData[0] = Integer.parseInt(Convert.revertString(PartyData.substring(0, 8)), 16) + "";
/* 113 */     OutputData[1] = Convert.HexToString(PartyData.substring(20, 20 + nameLength * 2));
/* 114 */     if (PartyData.substring(20 + nameLength * 2 + 4, 20 + nameLength * 2 + 6).equals("01") || PartyData.substring(20 + nameLength * 2 + 4, 20 + nameLength * 2 + 6).equals("03") || PartyData.substring(20 + nameLength * 2 + 4, 20 + nameLength * 2 + 6).equals("05") || PartyData.substring(20 + nameLength * 2 + 4, 20 + nameLength * 2 + 6).equals("07")) {
/* 115 */       OutputData[3] = Integer.parseInt(PartyData.substring(20 + nameLength * 2 + 2, 20 + nameLength * 2 + 4), 16) + "/8";
/*     */     } else {
/* 117 */       OutputData[3] = Integer.parseInt(PartyData.substring(20 + nameLength * 2 + 2, 20 + nameLength * 2 + 4), 16) + "/4";
/*     */     } 
/* 119 */     if (PartyData.substring(20 + nameLength * 2 + 4, 20 + nameLength * 2 + 6).equals("01") || PartyData.substring(20 + nameLength * 2 + 4, 20 + nameLength * 2 + 6).equals("03") || PartyData.substring(20 + nameLength * 2 + 4, 20 + nameLength * 2 + 6).equals("05") || PartyData.substring(20 + nameLength * 2 + 4, 20 + nameLength * 2 + 6).equals("07")) {
/* 120 */       OutputData[4] = "C Điểm";
/*     */     } else {
/* 122 */       OutputData[4] = "KC Điểm";
/*     */     } 
/* 124 */     if (PartyData.substring(20 + nameLength * 2 + 4, 20 + nameLength * 2 + 6).equals("00") || PartyData.substring(20 + nameLength * 2 + 4, 20 + nameLength * 2 + 6).equals("01") || PartyData.substring(20 + nameLength * 2 + 4, 20 + nameLength * 2 + 6).equals("04") || PartyData.substring(20 + nameLength * 2 + 4, 20 + nameLength * 2 + 6).equals("05")) {
/* 125 */       OutputData[4] = OutputData[4] + "- KC Đồ";
/*     */     } else {
/* 127 */       OutputData[4] = OutputData[4] + "- C Đồ";
/*     */     } 
/* 129 */     if (PartyData.substring(20 + nameLength * 2 + 6, 20 + nameLength * 2 + 8).equals("00")) {
/* 130 */       OutputData[5] = "Săn";
/*     */     } else {
/* 132 */       OutputData[5] = "NV";
/*     */     } 
/* 134 */     OutputData[6] = Integer.parseInt(PartyData.substring(20 + nameLength * 2 + 8, 20 + nameLength * 2 + 10), 16) + "~" + Integer.parseInt(PartyData.substring(20 + nameLength * 2 + 10, 20 + nameLength * 2 + 12), 16);
/* 135 */     OutputData[2] = Convert.HexToString(PartyData.substring(20 + nameLength * 2 + 16));
/*     */   }
/*     */   public static void SendRequestJointParty(String PTID) {
/* 138 */     InjectPacket.Injectpacket("706D", PTID, true, false);
/*     */   }
/*     */ }


/* Location:              C:\Users\NhatTM\Downloads\SroBot\SroBot\22585 - 15820\SroBot.jar!\srobot\Party.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */