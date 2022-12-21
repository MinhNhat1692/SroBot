/*     */ package srobot;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Convert
/*     */ {
/*     */   public static String stringtohex(String sData) {
/*  13 */     int Slen = sData.length();
/*  14 */     String sBack = "";
/*  15 */     for (int i = 0; i < Slen; i++) {
/*  16 */       char c = sData.charAt(i);
/*  17 */       int j = c;
/*  18 */       sBack = sBack + Decimaltohexadecimal(j);
/*     */     } 
/*  20 */     return sBack;
/*     */   }
/*     */   
/*     */   public static String Decimaltohexadecimal(int a) {
/*  24 */     String hex1 = Integer.toHexString(a);
/*  25 */     return hex1;
/*     */   }
/*     */   
/*     */   public static String tohex(int a) {
/*  29 */     String b = "";
/*  30 */     switch (a) {
/*     */       case 0:
/*  32 */         b = b + "0";
/*  33 */         return b;
/*     */       case 1:
/*  35 */         b = b + "1";
/*  36 */         return b;
/*     */       case 2:
/*  38 */         b = b + "2";
/*  39 */         return b;
/*     */       case 3:
/*  41 */         b = b + "3";
/*  42 */         return b;
/*     */       case 4:
/*  44 */         b = b + "4";
/*  45 */         return b;
/*     */       case 5:
/*  47 */         b = b + "5";
/*  48 */         return b;
/*     */       case 6:
/*  50 */         b = b + "6";
/*  51 */         return b;
/*     */       case 7:
/*  53 */         b = b + "7";
/*  54 */         return b;
/*     */       case 8:
/*  56 */         b = b + "8";
/*  57 */         return b;
/*     */       case 9:
/*  59 */         b = b + "9";
/*  60 */         return b;
/*     */       case 10:
/*  62 */         b = b + "A";
/*  63 */         return b;
/*     */       case 11:
/*  65 */         b = b + "B";
/*  66 */         return b;
/*     */       case 12:
/*  68 */         b = b + "C";
/*  69 */         return b;
/*     */       case 13:
/*  71 */         b = b + "D";
/*  72 */         return b;
/*     */       case 14:
/*  74 */         b = b + "E";
/*  75 */         return b;
/*     */       case 15:
/*  77 */         b = b + "F";
/*  78 */         return b;
/*     */     } 
/*  80 */     return b;
/*     */   }
/*     */   
/*     */   public static int luythua(int a, int n) {
/*  84 */     int z = 1;
/*  85 */     for (int i = 0; i < n; i++) {
/*  86 */       z *= a;
/*     */     }
/*  88 */     return z;
/*     */   }
/*     */   public static double luythuafloat(double a, int n) {
/*  91 */     double z = 1.0D;
/*  92 */     for (int i = 0; i < n; i++) {
/*  93 */       z *= a;
/*     */     }
/*  95 */     return z;
/*     */   }
/*     */   
/*     */   public static String bytetoHex(byte a) {
/*  99 */     int i = a & 0xFF;
/*     */     
/* 101 */     String b = "";
/* 102 */     String e = "";
/* 103 */     if (i < 16) {
/* 104 */       b = b + tohex(i) + "0";
/*     */     }
/* 106 */     while (i >= 16) {
/* 107 */       int c = chialaydu(i, 16);
/* 108 */       b = b + tohex(c);
/* 109 */       int d = chialaynguyen(i, 16);
/* 110 */       if (d < 16) {
/* 111 */         b = b + tohex(d);
/*     */       }
/* 113 */       i = d;
/*     */     } 
/* 115 */     int len = b.length();
/* 116 */     if (len == 1) {
/* 117 */       e = "0" + b;
/*     */     } else {
/* 119 */       e = b.substring(1) + b.substring(0, 1);
/*     */     } 
/* 121 */     return e;
/*     */   }
/*     */   
/*     */   public static int chialaydu(int a, int heso) {
/* 125 */     int b = a % heso;
/* 126 */     return b;
/*     */   }
/*     */ 
/*     */   
/*     */   public static int chialaynguyen(int a, int heso) {
/* 131 */     int b = a / heso;
/* 132 */     return b;
/*     */   }
/*     */   
/*     */   public static String toHexfull(int a, int sLong) {
/* 136 */     String sHex = "";
/* 137 */     sHex = Decimaltohexadecimal(a);
/* 138 */     int z = sLong - sHex.length();
/* 139 */     if (z > 0) {
/* 140 */       for (int i = 0; i < z; i++) {
/* 141 */         sHex = "0" + sHex;
/*     */       }
/*     */     }
/* 144 */     return sHex;
/*     */   }
/*     */   public static String revertString(String string) {
/* 147 */     String tmp = "";
/* 148 */     int len = string.length();
/* 149 */     for (int i = 0; i < len / 2; i++) {
/* 150 */       tmp = string.substring(i * 2, (i + 1) * 2) + tmp;
/*     */     }
/* 152 */     return tmp;
/*     */   }
/*     */   
/*     */   public static String HexToString(String hex) {
/* 156 */     StringBuilder sb = new StringBuilder();
/* 157 */     StringBuilder temp = new StringBuilder();
/*     */ 
/*     */     
/* 160 */     for (int i = 0; i < hex.length() - 1; i += 2) {
/*     */ 
/*     */       
/* 163 */       String output = hex.substring(i, i + 2);
/*     */       
/* 165 */       int decimal = Integer.parseInt(output, 16);
/*     */       
/* 167 */       sb.append((char)decimal);
/*     */       
/* 169 */       temp.append(decimal);
/*     */     } 
/*     */ 
/*     */     
/* 173 */     return sb.toString();
/*     */   }
/*     */   public static String HexToBinary(String Hex) {
/* 176 */     int len = Hex.length();
/* 177 */     String Binary = "";
/* 178 */     for (int i = 0; i < len; i++) {
/* 179 */       String bin = Integer.toBinaryString(Integer.parseInt(Hex.substring(i, i + 1), 16));
/* 180 */       int BinLen = bin.length();
/* 181 */       if (BinLen < 4) {
/* 182 */         for (int j = 0; j < 4 - BinLen; j++) {
/* 183 */           bin = "0" + bin;
/*     */         }
/*     */       }
/*     */       
/* 187 */       Binary = Binary + bin;
/*     */     } 
/* 189 */     return Binary;
/*     */   }
/*     */   public static double HextoFloat(String Hex) {
/* 192 */     double Float = 0.0D;
/* 193 */     int Sign = 0;
/* 194 */     int Exponent = 0;
/* 195 */     double Mantissa = 1.0D;
/* 196 */     String Bin = HexToBinary(Hex);
/* 197 */     if (Bin.substring(0, 1).equals("0")) {
/* 198 */       Sign = 1;
/*     */     } else {
/* 200 */       Sign = -1;
/*     */     } 
/* 202 */     Exponent = Integer.parseInt(Bin.substring(1, 9), 2) - 127;
/* 203 */     for (int i = 0; i < 10; i++) {
/* 204 */       Mantissa += luythuafloat(0.5D, i + 1) * Integer.parseInt(Bin.substring(i + 9, i + 10));
/*     */     }
/* 206 */     Float = (Sign * luythua(2, Exponent)) * Mantissa;
/* 207 */     return Float;
/*     */   }
/*     */   public static int LongHex(String Hex) {
/* 210 */     int n = (int)Long.parseLong(Hex, 16);
/* 211 */     return n;
/*     */   }
/*     */ }


/* Location:              C:\Users\NhatTM\Downloads\SroBot\SroBot\22585 - 15820\SroBot.jar!\srobot\Convert.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */