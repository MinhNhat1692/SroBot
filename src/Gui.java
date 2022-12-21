/*      */ package srobot;
/*      */ import java.awt.Color;
/*      */ import java.awt.Font;
/*      */ import java.awt.LayoutManager;
/*      */ import java.awt.event.ActionEvent;
/*      */ import java.awt.event.ActionListener;
/*      */ import java.util.Scanner;
/*      */ import javax.swing.AbstractListModel;
/*      */ import javax.swing.BorderFactory;
/*      */ import javax.swing.ButtonGroup;
/*      */ import javax.swing.DefaultComboBoxModel;
/*      */ import javax.swing.DefaultListModel;
/*      */ import javax.swing.GroupLayout;
/*      */ import javax.swing.JButton;
/*      */ import javax.swing.JCheckBox;
/*      */ import javax.swing.JComboBox;
/*      */ import javax.swing.JLabel;
/*      */ import javax.swing.JList;
/*      */ import javax.swing.JPanel;
/*      */ import javax.swing.JProgressBar;
/*      */ import javax.swing.JRadioButton;
/*      */ import javax.swing.JScrollPane;
/*      */ import javax.swing.JTabbedPane;
/*      */ import javax.swing.JTextField;
/*      */ import javax.swing.LayoutStyle;
/*      */ import javax.swing.Timer;
/*      */ import org.netbeans.lib.awtextra.AbsoluteConstraints;
/*      */ import org.netbeans.lib.awtextra.AbsoluteLayout;
/*      */ 
/*      */ public class Gui extends JFrame {
/*   31 */   public static DefaultListModel model = new DefaultListModel();
/*   32 */   public static DefaultListModel model6 = new DefaultListModel();
/*      */   
/*   34 */   public static DefaultListModel IDList = new DefaultListModel();
/*   35 */   public static DefaultListModel PlayerList = new DefaultListModel();
/*      */ 
/*      */   
/*   38 */   public static DefaultComboBoxModel SkillLureModel = new DefaultComboBoxModel();
/*   39 */   public static DefaultListModel IDSkillLureList = new DefaultListModel();
/*   40 */   public static DefaultListModel DelaySkillLureList = new DefaultListModel();
/*   41 */   public static DefaultListModel TimeLeftSkillLureList = new DefaultListModel();
/*      */   
/*      */   public static String FarmLocationWalkingData;
/*      */   
/*   45 */   public static DefaultListModel LocationLureList = new DefaultListModel();
/*   46 */   public static DefaultListModel DataWalkingList = new DefaultListModel();
/*      */ 
/*      */   
/*   49 */   public static DefaultListModel NameMonsterList = new DefaultListModel();
/*   50 */   public static DefaultListModel IDMonsterList = new DefaultListModel();
/*   51 */   public static DefaultListModel TypeMonsterList = new DefaultListModel();
/*   52 */   public static DefaultListModel CurrentHPMonsterList = new DefaultListModel();
/*   53 */   public static DefaultListModel MaxHPMonsterList = new DefaultListModel();
/*   54 */   public static DefaultListModel LvMonsterList = new DefaultListModel();
/*   55 */   public static DefaultListModel MonsterXList = new DefaultListModel();
/*   56 */   public static DefaultListModel MonsterYList = new DefaultListModel();
/*   57 */   public static DefaultListModel DistanceMonsterList = new DefaultListModel();
/*      */ 
/*      */ 
/*      */   
/*   61 */   public static DefaultListModel ListAllSkillName = new DefaultListModel();
/*   62 */   public static DefaultListModel ListSkillName = new DefaultListModel();
/*      */   
/*   64 */   public static DefaultListModel IDSkillNoTarget = new DefaultListModel();
/*   65 */   public static DefaultListModel IDPlayerNoTarget = new DefaultListModel();
/*   66 */   public static DefaultListModel TimeMaxNoTarget = new DefaultListModel();
/*   67 */   public static DefaultListModel TimeLeftNoTarget = new DefaultListModel();
/*   68 */   public static DefaultListModel ListIDSkillNoTarget = new DefaultListModel();
/*      */   
/*   70 */   public static DefaultListModel IDTarget = new DefaultListModel();
/*   71 */   public static DefaultListModel NameTarget = new DefaultListModel();
/*   72 */   public static DefaultComboBoxModel SkillNameTarget = new DefaultComboBoxModel();
/*   73 */   public static DefaultListModel InfoBuffTarget = new DefaultListModel();
/*   74 */   public static DefaultListModel IDSkillTarget = new DefaultListModel();
/*   75 */   public static DefaultListModel IDPlayerTarget = new DefaultListModel();
/*   76 */   public static DefaultListModel NamePlayerTarget = new DefaultListModel();
/*   77 */   public static DefaultListModel TimeMaxTarget = new DefaultListModel();
/*   78 */   public static DefaultListModel TimeLeftTarget = new DefaultListModel();
/*   79 */   public static DefaultListModel ListIDSkillTarget = new DefaultListModel();
/*      */   
/*   81 */   public static DefaultComboBoxModel ReviveSkill = new DefaultComboBoxModel();
/*   82 */   public static DefaultListModel IDReviveSkillList = new DefaultListModel();
/*   83 */   public static DefaultListModel Status = new DefaultListModel();
/*   84 */   public static String IDReviveSkill = "";
/*      */ 
/*      */   
/*   87 */   public static DefaultListModel ActionLureList = new DefaultListModel(); public static Timer Buff; public static Timer Revive; public static boolean ReviveCheck = false; public static Timer Follow; public static boolean FollowCheck = false; public static boolean BuffCheck = false; public static Timer ComeBack; public static boolean ComeBackCheck = false; public static Timer Lure; public static boolean LureCheck = false; public static int SizeMax; private ButtonGroup buttonGroup1; private ButtonGroup buttonGroup2; private ButtonGroup buttonGroup3; private ButtonGroup buttonGroup4; private ButtonGroup buttonGroup5; private ButtonGroup buttonGroup6; private JButton jButton1; private JButton jButton10; private JButton jButton11; private JButton jButton12; private JButton jButton13; private JButton jButton14; private JButton jButton15; private JButton jButton16; private JButton jButton17; private JButton jButton18; private JButton jButton19; private JButton jButton2; private JButton jButton20; private JButton jButton21; private JButton jButton22; private JButton jButton23; private JButton jButton24; private JButton jButton25; private JButton jButton26; private JButton jButton27; private JButton jButton29; private JButton jButton3; private JButton jButton30; private JButton jButton31; private JButton jButton34; private JButton jButton35; private JButton jButton36; private JButton jButton37; private JButton jButton38; private JButton jButton39; private JButton jButton4; private JButton jButton40; private JButton jButton41; private JButton jButton42; private JButton jButton43; private JButton jButton44; private JButton jButton45; private JButton jButton46; private JButton jButton47; private JButton jButton48; private JButton jButton49; private JButton jButton5; private JButton jButton50; private JButton jButton51; private JButton jButton52; private JButton jButton53; private JButton jButton54; private JButton jButton55; private JButton jButton56; private JButton jButton57; private JButton jButton58; private JButton jButton59; private JButton jButton6; private JButton jButton60; private JButton jButton61; private JButton jButton62; private JButton jButton63; private JButton jButton64; private JButton jButton65; private JButton jButton66; private JButton jButton67; private JButton jButton68; private JButton jButton69; private JButton jButton7; private JButton jButton70; private JButton jButton71; private JButton jButton72; private JButton jButton73; private JButton jButton74; private JButton jButton75; private JButton jButton76; private JButton jButton77; private JButton jButton78; private JButton jButton79; private JButton jButton8; private JButton jButton80; private JButton jButton9; public static JCheckBox jCheckBox1; public static JCheckBox jCheckBox10; private JCheckBox jCheckBox2; private JCheckBox jCheckBox3; private JCheckBox jCheckBox4; private JCheckBox jCheckBox5; public static JCheckBox jCheckBox6; public static JCheckBox jCheckBox7; public static JCheckBox jCheckBox8; public static JCheckBox jCheckBox9;
/*   88 */   public static DefaultListModel TimeActionLureList = new DefaultListModel(); private JComboBox jComboBox1; private JComboBox jComboBox2; private JComboBox jComboBox3; private JLabel jLabel1; private JLabel jLabel10; private JLabel jLabel100; private JLabel jLabel101; private JLabel jLabel102; private JLabel jLabel103; private JLabel jLabel104; public static JLabel jLabel11; private JLabel jLabel110; private JLabel jLabel111; private JLabel jLabel112; private JLabel jLabel113; private JLabel jLabel114; private JLabel jLabel115; private JLabel jLabel116; private JLabel jLabel117; private JLabel jLabel118; private JLabel jLabel119; private JLabel jLabel12; private JLabel jLabel120; private JLabel jLabel121; private JLabel jLabel122; private JLabel jLabel123; private JLabel jLabel124; private JLabel jLabel126; private JLabel jLabel127; private JLabel jLabel128; public static JLabel jLabel13; private JLabel jLabel14; private JLabel jLabel15; private JLabel jLabel16; public static JLabel jLabel17; public static JLabel jLabel18; public static JLabel jLabel19; private JLabel jLabel2; public static JLabel jLabel20; public static JLabel jLabel21; private JLabel jLabel23; public static JLabel jLabel24; private JLabel jLabel25; public static JLabel jLabel26; private JLabel jLabel27; public static JLabel jLabel28; private JLabel jLabel29; private JLabel jLabel3; public static JLabel jLabel30; private JLabel jLabel31; public static JLabel jLabel32; private JLabel jLabel33; public static JLabel jLabel34; private JLabel jLabel35; public static JLabel jLabel36; private JLabel jLabel37; public static JLabel jLabel38; private JLabel jLabel39; public static JLabel jLabel4; public static JLabel jLabel40; private JLabel jLabel41; public static JLabel jLabel42; public static JLabel jLabel43; private JLabel jLabel44; private JLabel jLabel45; private JLabel jLabel46; private JLabel jLabel47; private JLabel jLabel48; private JLabel jLabel49; public static JLabel jLabel5; private JLabel jLabel50; private JLabel jLabel51; private JLabel jLabel52; private JLabel jLabel53; private JLabel jLabel54; private JLabel jLabel55; private JLabel jLabel56; private JLabel jLabel57; private JLabel jLabel58; private JLabel jLabel59; private JLabel jLabel6; private JLabel jLabel60; private JLabel jLabel61; private JLabel jLabel62; private JLabel jLabel63; private JLabel jLabel64; private JLabel jLabel65; private JLabel jLabel66;
/*      */   private JLabel jLabel67;
/*      */   private JLabel jLabel68;
/*      */   private JLabel jLabel69;
/*      */   private JLabel jLabel7;
/*      */   private JLabel jLabel70;
/*      */   private JLabel jLabel71;
/*      */   private JLabel jLabel72;
/*      */   private JLabel jLabel73;
/*      */   private JLabel jLabel74;
/*      */   private JLabel jLabel75;
/*      */   private JLabel jLabel76;
/*      */   private JLabel jLabel77;
/*      */   private JLabel jLabel78;
/*      */   private JLabel jLabel79;
/*      */   private JLabel jLabel8;
/*      */   
/*      */   public Gui() {
/*  106 */     initComponents();
/*      */   }
/*      */   private JLabel jLabel80; private JLabel jLabel81; private JLabel jLabel82; private JLabel jLabel83; private JLabel jLabel84; private JLabel jLabel85; private JLabel jLabel86; private JLabel jLabel87; private JLabel jLabel88; private JLabel jLabel89; private JLabel jLabel9; private JLabel jLabel90; private JLabel jLabel91; private JLabel jLabel92; public static JLabel jLabel93; private JLabel jLabel94; private JLabel jLabel95; private JLabel jLabel96; private JLabel jLabel97; private JLabel jLabel99; private JList jList1; private JList jList10; private JList jList11; public static JList jList12; private JList jList13; private JList jList14; private JList jList15; private JList jList16; private JList jList17; private JList jList19; private JList jList2; private JList jList20; private JList jList21; private JList jList27; private JList jList28; private JList jList29; private JList jList3; private JList jList30; private JList jList31; private JList jList32; private JList jList33; private JList jList34; private JList jList35; private JList jList36; private JList jList37; private JList jList38; private JList jList39; private JList jList4; private JList jList40; private JList jList41; private JList jList42; private JList jList43; private JList jList44; private JList jList45; private JList jList46; private JList jList47; private JList jList48; private JList jList49; private JList jList5; private JList jList50; private JList jList51; private JList jList52; private JList jList53; private JList jList54; private JList jList55; private JList jList56; private JList jList57; private JList jList58; private JList jList59; private JList jList6; private JList jList60; private JList jList61; private JList jList62; private JList jList7; private JList jList8; private JList jList9; private JPanel jPanel1; private JPanel jPanel10; private JPanel jPanel11; private JPanel jPanel12; private JPanel jPanel13; private JPanel jPanel14; private JPanel jPanel15; private JPanel jPanel16; private JPanel jPanel17; private JPanel jPanel18; private JPanel jPanel19; private JPanel jPanel2; private JPanel jPanel20; private JPanel jPanel21; private JPanel jPanel22; private JPanel jPanel23; private JPanel jPanel24; private JPanel jPanel25;
/*      */   private JPanel jPanel26;
/*      */   private JPanel jPanel27;
/*      */   private JPanel jPanel28;
/*      */   private JPanel jPanel29;
/*      */   private JPanel jPanel3;
/*      */   private JPanel jPanel30;
/*      */   private JPanel jPanel31;
/*      */   private JPanel jPanel32;
/*      */   private JPanel jPanel4;
/*      */   
/*      */   private void initComponents() {
/*  120 */     this.buttonGroup1 = new ButtonGroup();
/*  121 */     this.buttonGroup2 = new ButtonGroup();
/*  122 */     this.buttonGroup3 = new ButtonGroup();
/*  123 */     this.buttonGroup4 = new ButtonGroup();
/*  124 */     this.buttonGroup5 = new ButtonGroup();
/*  125 */     this.buttonGroup6 = new ButtonGroup();
/*  126 */     this.jLabel104 = new JLabel();
/*  127 */     this.jTabbedPane1 = new JTabbedPane();
/*  128 */     this.jPanel5 = new JPanel();
/*  129 */     this.jPanel6 = new JPanel();
/*  130 */     jLabel4 = new JLabel();
/*  131 */     jLabel5 = new JLabel();
/*  132 */     this.jLabel6 = new JLabel();
/*  133 */     this.jLabel8 = new JLabel();
/*  134 */     this.jLabel9 = new JLabel();
/*  135 */     this.jLabel10 = new JLabel();
/*  136 */     jLabel11 = new JLabel();
/*  137 */     this.jLabel12 = new JLabel();
/*  138 */     jLabel13 = new JLabel();
/*  139 */     this.jLabel14 = new JLabel();
/*  140 */     this.jLabel15 = new JLabel();
/*  141 */     this.jLabel16 = new JLabel();
/*  142 */     jLabel17 = new JLabel();
/*  143 */     jLabel18 = new JLabel();
/*  144 */     jLabel19 = new JLabel();
/*  145 */     jLabel20 = new JLabel();
/*  146 */     jLabel21 = new JLabel();
/*  147 */     this.jLabel23 = new JLabel();
/*  148 */     jLabel24 = new JLabel();
/*  149 */     this.jLabel25 = new JLabel();
/*  150 */     jLabel26 = new JLabel();
/*  151 */     this.jLabel27 = new JLabel();
/*  152 */     jLabel28 = new JLabel();
/*  153 */     this.jLabel29 = new JLabel();
/*  154 */     jLabel30 = new JLabel();
/*  155 */     this.jLabel31 = new JLabel();
/*  156 */     jLabel32 = new JLabel();
/*  157 */     this.jLabel33 = new JLabel();
/*  158 */     jLabel34 = new JLabel();
/*  159 */     this.jLabel35 = new JLabel();
/*  160 */     jLabel36 = new JLabel();
/*  161 */     this.jLabel37 = new JLabel();
/*  162 */     jLabel38 = new JLabel();
/*  163 */     this.jLabel39 = new JLabel();
/*  164 */     jLabel40 = new JLabel();
/*  165 */     this.jLabel41 = new JLabel();
/*  166 */     jLabel42 = new JLabel();
/*  167 */     jLabel43 = new JLabel();
/*  168 */     this.jPanel2 = new JPanel();
/*  169 */     this.jPanel7 = new JPanel();
/*  170 */     jTextField5 = new JTextField();
/*  171 */     this.jLabel7 = new JLabel();
/*  172 */     this.jButton12 = new JButton();
/*  173 */     this.jButton13 = new JButton();
/*  174 */     this.jScrollPane17 = new JScrollPane();
/*  175 */     this.jList17 = new JList();
/*  176 */     this.jScrollPane20 = new JScrollPane();
/*  177 */     this.jList20 = new JList();
/*  178 */     this.jLabel101 = new JLabel();
/*  179 */     this.jLabel102 = new JLabel();
/*  180 */     this.jPanel3 = new JPanel();
/*  181 */     this.jTabbedPane2 = new JTabbedPane();
/*  182 */     this.jPanel4 = new JPanel();
/*  183 */     this.jPanel14 = new JPanel();
/*  184 */     this.jCheckBox4 = new JCheckBox();
/*  185 */     this.jCheckBox3 = new JCheckBox();
/*  186 */     this.jCheckBox2 = new JCheckBox();
/*  187 */     jCheckBox1 = new JCheckBox();
/*  188 */     this.jPanel15 = new JPanel();
/*  189 */     this.jProgressBar1 = new JProgressBar();
/*  190 */     this.jProgressBar2 = new JProgressBar();
/*  191 */     this.jProgressBar3 = new JProgressBar();
/*  192 */     this.jProgressBar4 = new JProgressBar();
/*  193 */     this.jProgressBar5 = new JProgressBar();
/*  194 */     this.jProgressBar6 = new JProgressBar();
/*  195 */     this.jProgressBar7 = new JProgressBar();
/*  196 */     this.jProgressBar8 = new JProgressBar();
/*  197 */     this.jLabel48 = new JLabel();
/*  198 */     this.jLabel49 = new JLabel();
/*  199 */     this.jLabel50 = new JLabel();
/*  200 */     this.jLabel51 = new JLabel();
/*  201 */     this.jLabel52 = new JLabel();
/*  202 */     this.jLabel53 = new JLabel();
/*  203 */     this.jLabel54 = new JLabel();
/*  204 */     this.jLabel55 = new JLabel();
/*  205 */     this.jLabel56 = new JLabel();
/*  206 */     this.jLabel57 = new JLabel();
/*  207 */     this.jLabel58 = new JLabel();
/*  208 */     this.jLabel59 = new JLabel();
/*  209 */     this.jLabel60 = new JLabel();
/*  210 */     this.jLabel61 = new JLabel();
/*  211 */     this.jLabel62 = new JLabel();
/*  212 */     this.jLabel63 = new JLabel();
/*  213 */     this.jPanel16 = new JPanel();
/*  214 */     this.jScrollPane6 = new JScrollPane();
/*  215 */     this.jList5 = new JList();
/*  216 */     this.jTextField11 = new JTextField();
/*  217 */     this.jButton15 = new JButton();
/*  218 */     this.jButton16 = new JButton();
/*  219 */     this.jPanel17 = new JPanel();
/*  220 */     jTextField15 = new JTextField();
/*  221 */     this.jLabel89 = new JLabel();
/*  222 */     this.jLabel90 = new JLabel();
/*  223 */     jRadioButton3 = new JRadioButton();
/*  224 */     this.jRadioButton8 = new JRadioButton();
/*  225 */     this.jButton29 = new JButton();
/*  226 */     this.jLabel91 = new JLabel();
/*  227 */     jTextField16 = new JTextField();
/*  228 */     this.jLabel92 = new JLabel();
/*  229 */     jTextField17 = new JTextField();
/*  230 */     jCheckBox6 = new JCheckBox();
/*  231 */     this.jPanel26 = new JPanel();
/*  232 */     this.jPanel27 = new JPanel();
/*  233 */     jRadioButton9 = new JRadioButton();
/*  234 */     this.jRadioButton10 = new JRadioButton();
/*  235 */     this.jPanel28 = new JPanel();
/*  236 */     jRadioButton11 = new JRadioButton();
/*  237 */     this.jRadioButton12 = new JRadioButton();
/*  238 */     this.jPanel9 = new JPanel();
/*  239 */     this.jTabbedPane3 = new JTabbedPane();
/*  240 */     this.jPanel18 = new JPanel();
/*  241 */     this.jScrollPane7 = new JScrollPane();
/*  242 */     this.jList7 = new JList();
/*  243 */     this.jButton18 = new JButton();
/*  244 */     this.jScrollPane10 = new JScrollPane();
/*  245 */     this.jList10 = new JList();
/*  246 */     this.jScrollPane11 = new JScrollPane();
/*  247 */     this.jList11 = new JList();
/*  248 */     this.jButton21 = new JButton();
/*  249 */     this.jScrollPane9 = new JScrollPane();
/*  250 */     this.jList9 = new JList();
/*  251 */     this.jButton23 = new JButton();
/*  252 */     this.jLabel68 = new JLabel();
/*  253 */     this.jButton42 = new JButton();
/*  254 */     this.jLabel69 = new JLabel();
/*  255 */     this.jButton43 = new JButton();
/*  256 */     this.jButton44 = new JButton();
/*  257 */     this.jLabel70 = new JLabel();
/*  258 */     this.jButton24 = new JButton();
/*  259 */     this.jButton25 = new JButton();
/*  260 */     this.jPanel19 = new JPanel();
/*  261 */     this.jButton45 = new JButton();
/*  262 */     this.jLabel71 = new JLabel();
/*  263 */     this.jButton46 = new JButton();
/*  264 */     this.jLabel72 = new JLabel();
/*  265 */     this.jButton47 = new JButton();
/*  266 */     this.jButton48 = new JButton();
/*  267 */     this.jLabel73 = new JLabel();
/*  268 */     this.jScrollPane36 = new JScrollPane();
/*  269 */     this.jList36 = new JList();
/*  270 */     this.jScrollPane37 = new JScrollPane();
/*  271 */     this.jList37 = new JList();
/*  272 */     this.jButton49 = new JButton();
/*  273 */     this.jScrollPane38 = new JScrollPane();
/*  274 */     this.jList38 = new JList();
/*  275 */     this.jScrollPane39 = new JScrollPane();
/*  276 */     this.jList39 = new JList();
/*  277 */     this.jButton50 = new JButton();
/*  278 */     this.jButton26 = new JButton();
/*  279 */     this.jButton27 = new JButton();
/*  280 */     this.jPanel20 = new JPanel();
/*  281 */     this.jButton51 = new JButton();
/*  282 */     this.jLabel74 = new JLabel();
/*  283 */     this.jButton52 = new JButton();
/*  284 */     this.jLabel75 = new JLabel();
/*  285 */     this.jButton53 = new JButton();
/*  286 */     this.jButton54 = new JButton();
/*  287 */     this.jLabel76 = new JLabel();
/*  288 */     this.jScrollPane40 = new JScrollPane();
/*  289 */     this.jList40 = new JList();
/*  290 */     this.jScrollPane41 = new JScrollPane();
/*  291 */     this.jList41 = new JList();
/*  292 */     this.jButton55 = new JButton();
/*  293 */     this.jScrollPane42 = new JScrollPane();
/*  294 */     this.jList42 = new JList();
/*  295 */     this.jScrollPane43 = new JScrollPane();
/*  296 */     this.jList43 = new JList();
/*  297 */     this.jButton56 = new JButton();
/*  298 */     this.jPanel21 = new JPanel();
/*  299 */     this.jButton57 = new JButton();
/*  300 */     this.jLabel77 = new JLabel();
/*  301 */     this.jButton58 = new JButton();
/*  302 */     this.jLabel78 = new JLabel();
/*  303 */     this.jButton59 = new JButton();
/*  304 */     this.jButton60 = new JButton();
/*  305 */     this.jLabel79 = new JLabel();
/*  306 */     this.jScrollPane44 = new JScrollPane();
/*  307 */     this.jList44 = new JList();
/*  308 */     this.jScrollPane45 = new JScrollPane();
/*  309 */     this.jList45 = new JList();
/*  310 */     this.jButton61 = new JButton();
/*  311 */     this.jScrollPane46 = new JScrollPane();
/*  312 */     this.jList46 = new JList();
/*  313 */     this.jScrollPane47 = new JScrollPane();
/*  314 */     this.jList47 = new JList();
/*  315 */     this.jButton62 = new JButton();
/*  316 */     this.jPanel22 = new JPanel();
/*  317 */     this.jButton63 = new JButton();
/*  318 */     this.jLabel80 = new JLabel();
/*  319 */     this.jButton64 = new JButton();
/*  320 */     this.jLabel81 = new JLabel();
/*  321 */     this.jButton65 = new JButton();
/*  322 */     this.jButton66 = new JButton();
/*  323 */     this.jLabel82 = new JLabel();
/*  324 */     this.jScrollPane48 = new JScrollPane();
/*  325 */     this.jList48 = new JList();
/*  326 */     this.jScrollPane49 = new JScrollPane();
/*  327 */     this.jList49 = new JList();
/*  328 */     this.jButton67 = new JButton();
/*  329 */     this.jScrollPane50 = new JScrollPane();
/*  330 */     this.jList50 = new JList();
/*  331 */     this.jScrollPane51 = new JScrollPane();
/*  332 */     this.jList51 = new JList();
/*  333 */     this.jButton68 = new JButton();
/*  334 */     this.jPanel23 = new JPanel();
/*  335 */     this.jButton69 = new JButton();
/*  336 */     this.jLabel83 = new JLabel();
/*  337 */     this.jButton70 = new JButton();
/*  338 */     this.jLabel84 = new JLabel();
/*  339 */     this.jButton71 = new JButton();
/*  340 */     this.jButton72 = new JButton();
/*  341 */     this.jLabel85 = new JLabel();
/*  342 */     this.jScrollPane52 = new JScrollPane();
/*  343 */     this.jList52 = new JList();
/*  344 */     this.jScrollPane53 = new JScrollPane();
/*  345 */     this.jList53 = new JList();
/*  346 */     this.jButton73 = new JButton();
/*  347 */     this.jScrollPane54 = new JScrollPane();
/*  348 */     this.jList54 = new JList();
/*  349 */     this.jScrollPane55 = new JScrollPane();
/*  350 */     this.jList55 = new JList();
/*  351 */     this.jButton74 = new JButton();
/*  352 */     this.jPanel24 = new JPanel();
/*  353 */     this.jButton75 = new JButton();
/*  354 */     this.jLabel86 = new JLabel();
/*  355 */     this.jButton76 = new JButton();
/*  356 */     this.jLabel87 = new JLabel();
/*  357 */     this.jButton77 = new JButton();
/*  358 */     this.jButton78 = new JButton();
/*  359 */     this.jLabel88 = new JLabel();
/*  360 */     this.jScrollPane56 = new JScrollPane();
/*  361 */     this.jList56 = new JList();
/*  362 */     this.jScrollPane57 = new JScrollPane();
/*  363 */     this.jList57 = new JList();
/*  364 */     this.jButton79 = new JButton();
/*  365 */     this.jScrollPane58 = new JScrollPane();
/*  366 */     this.jList58 = new JList();
/*  367 */     this.jScrollPane59 = new JScrollPane();
/*  368 */     this.jList59 = new JList();
/*  369 */     this.jButton80 = new JButton();
/*  370 */     this.jPanel25 = new JPanel();
/*  371 */     this.jLabel64 = new JLabel();
/*  372 */     this.jLabel65 = new JLabel();
/*  373 */     this.jTextField12 = new JTextField();
/*  374 */     this.jButton19 = new JButton();
/*  375 */     this.jScrollPane8 = new JScrollPane();
/*  376 */     this.jList8 = new JList();
/*  377 */     this.jButton20 = new JButton();
/*  378 */     this.jLabel66 = new JLabel();
/*  379 */     this.jTextField13 = new JTextField();
/*  380 */     this.jTextField14 = new JTextField();
/*  381 */     this.jButton22 = new JButton();
/*  382 */     this.jLabel67 = new JLabel();
/*  383 */     this.jButton17 = new JButton();
/*  384 */     this.jPanel8 = new JPanel();
/*  385 */     this.jPanel10 = new JPanel();
/*  386 */     this.jPanel12 = new JPanel();
/*  387 */     this.jRadioButton4 = new JRadioButton();
/*  388 */     this.jRadioButton5 = new JRadioButton();
/*  389 */     this.jPanel13 = new JPanel();
/*  390 */     this.jRadioButton6 = new JRadioButton();
/*  391 */     this.jRadioButton7 = new JRadioButton();
/*  392 */     this.jPanel11 = new JPanel();
/*  393 */     this.jTextField8 = new JTextField();
/*  394 */     this.jLabel44 = new JLabel();
/*  395 */     this.jLabel45 = new JLabel();
/*  396 */     this.jRadioButton1 = new JRadioButton();
/*  397 */     this.jRadioButton2 = new JRadioButton();
/*  398 */     this.jButton14 = new JButton();
/*  399 */     this.jLabel46 = new JLabel();
/*  400 */     this.jTextField9 = new JTextField();
/*  401 */     this.jLabel47 = new JLabel();
/*  402 */     this.jTextField10 = new JTextField();
/*  403 */     this.jCheckBox5 = new JCheckBox();
/*  404 */     this.jButton30 = new JButton();
/*  405 */     this.jButton31 = new JButton();
/*  406 */     this.jScrollPane12 = new JScrollPane();
/*  407 */     jList12 = new JList();
/*  408 */     jLabel93 = new JLabel();
/*  409 */     jTextField18 = new JTextField();
/*  410 */     this.jPanel29 = new JPanel();
/*  411 */     this.jScrollPane13 = new JScrollPane();
/*  412 */     this.jList13 = new JList();
/*  413 */     this.jLabel94 = new JLabel();
/*  414 */     this.jScrollPane14 = new JScrollPane();
/*  415 */     this.jList14 = new JList();
/*  416 */     this.jLabel95 = new JLabel();
/*  417 */     this.jButton34 = new JButton();
/*  418 */     this.jButton35 = new JButton();
/*  419 */     this.jPanel30 = new JPanel();
/*  420 */     this.jButton38 = new JButton();
/*  421 */     this.jButton39 = new JButton();
/*  422 */     this.jScrollPane19 = new JScrollPane();
/*  423 */     this.jList19 = new JList();
/*  424 */     this.jComboBox1 = new JComboBox();
/*  425 */     this.jButton40 = new JButton();
/*  426 */     this.jLabel99 = new JLabel();
/*  427 */     this.jLabel100 = new JLabel();
/*  428 */     this.jButton41 = new JButton();
/*  429 */     jCheckBox7 = new JCheckBox();
/*  430 */     jCheckBox9 = new JCheckBox();
/*  431 */     this.jScrollPane21 = new JScrollPane();
/*  432 */     this.jList21 = new JList();
/*  433 */     this.jLabel103 = new JLabel();
/*  434 */     this.jButton36 = new JButton();
/*  435 */     this.jButton37 = new JButton();
/*  436 */     jCheckBox8 = new JCheckBox();
/*  437 */     this.jPanel32 = new JPanel();
/*  438 */     this.jButton8 = new JButton();
/*  439 */     this.jComboBox3 = new JComboBox();
/*  440 */     this.jScrollPane15 = new JScrollPane();
/*  441 */     this.jList15 = new JList();
/*  442 */     this.jScrollPane16 = new JScrollPane();
/*  443 */     this.jList16 = new JList();
/*  444 */     this.jLabel96 = new JLabel();
/*  445 */     this.jLabel97 = new JLabel();
/*  446 */     jCheckBox10 = new JCheckBox();
/*  447 */     this.jButton9 = new JButton();
/*  448 */     this.jTextField21 = new JTextField();
/*  449 */     this.jButton11 = new JButton();
/*  450 */     this.jPanel1 = new JPanel();
/*  451 */     this.jTabbedPane4 = new JTabbedPane();
/*  452 */     this.jPanel31 = new JPanel();
/*  453 */     this.jScrollPane1 = new JScrollPane();
/*  454 */     this.jList1 = new JList();
/*  455 */     this.jLabel1 = new JLabel();
/*  456 */     this.jComboBox2 = new JComboBox();
/*  457 */     this.jButton3 = new JButton();
/*  458 */     this.jButton1 = new JButton();
/*  459 */     this.jButton2 = new JButton();
/*  460 */     jTextField1 = new JTextField();
/*  461 */     jTextField2 = new JTextField();
/*  462 */     this.jTextField3 = new JTextField();
/*  463 */     this.jLabel2 = new JLabel();
/*  464 */     this.jLabel3 = new JLabel();
/*  465 */     this.jLabel110 = new JLabel();
/*  466 */     this.jScrollPane2 = new JScrollPane();
/*  467 */     this.jList2 = new JList();
/*  468 */     this.jScrollPane3 = new JScrollPane();
/*  469 */     this.jList3 = new JList();
/*  470 */     this.jScrollPane5 = new JScrollPane();
/*  471 */     this.jList6 = new JList();
/*  472 */     this.jLabel113 = new JLabel();
/*  473 */     this.jLabel114 = new JLabel();
/*  474 */     this.jLabel115 = new JLabel();
/*  475 */     this.jScrollPane4 = new JScrollPane();
/*  476 */     this.jList4 = new JList();
/*  477 */     this.jLabel116 = new JLabel();
/*  478 */     this.jButton4 = new JButton();
/*  479 */     this.jScrollPane27 = new JScrollPane();
/*  480 */     this.jList27 = new JList();
/*  481 */     this.jScrollPane28 = new JScrollPane();
/*  482 */     this.jList28 = new JList();
/*  483 */     this.jLabel117 = new JLabel();
/*  484 */     this.jLabel118 = new JLabel();
/*  485 */     this.jScrollPane29 = new JScrollPane();
/*  486 */     this.jList29 = new JList();
/*  487 */     this.jScrollPane30 = new JScrollPane();
/*  488 */     this.jList30 = new JList();
/*  489 */     this.jLabel119 = new JLabel();
/*  490 */     this.jLabel120 = new JLabel();
/*  491 */     this.jScrollPane31 = new JScrollPane();
/*  492 */     this.jList31 = new JList();
/*  493 */     this.jLabel121 = new JLabel();
/*  494 */     this.jScrollPane32 = new JScrollPane();
/*  495 */     this.jList32 = new JList();
/*  496 */     this.jScrollPane33 = new JScrollPane();
/*  497 */     this.jList33 = new JList();
/*  498 */     this.jLabel111 = new JLabel();
/*  499 */     this.jLabel112 = new JLabel();
/*  500 */     this.jScrollPane34 = new JScrollPane();
/*  501 */     this.jList34 = new JList();
/*  502 */     this.jButton5 = new JButton();
/*  503 */     this.jTextField4 = new JTextField();
/*  504 */     this.jTextField6 = new JTextField();
/*  505 */     this.jLabel122 = new JLabel();
/*  506 */     this.jLabel123 = new JLabel();
/*  507 */     this.jTextField20 = new JTextField();
/*  508 */     this.jScrollPane61 = new JScrollPane();
/*  509 */     this.jList61 = new JList();
/*  510 */     this.jLabel126 = new JLabel();
/*  511 */     this.jScrollPane62 = new JScrollPane();
/*  512 */     this.jList62 = new JList();
/*  513 */     this.jLabel127 = new JLabel();
/*  514 */     this.jScrollPane35 = new JScrollPane();
/*  515 */     this.jList35 = new JList();
/*  516 */     this.jLabel128 = new JLabel();
/*  517 */     this.jScrollPane60 = new JScrollPane();
/*  518 */     this.jList60 = new JList();
/*  519 */     this.jLabel124 = new JLabel();
/*  520 */     this.jButton6 = new JButton();
/*  521 */     this.jButton7 = new JButton();
/*  522 */     this.jButton10 = new JButton();
/*      */     
/*  524 */     this.jLabel104.setText("jLabel104");
/*      */     
/*  526 */     setDefaultCloseOperation(3);
/*  527 */     getContentPane().setLayout((LayoutManager)new AbsoluteLayout());
/*      */     
/*  529 */     this.jPanel5.setLayout((LayoutManager)new AbsoluteLayout());
/*      */     
/*  531 */     this.jPanel6.setBorder(BorderFactory.createTitledBorder("Character Status"));
/*      */     
/*  533 */     jLabel4.setText("jLabel4");
/*      */     
/*  535 */     jLabel5.setText("X:");
/*      */     
/*  537 */     this.jLabel6.setText("Name");
/*      */     
/*  539 */     this.jLabel8.setText("HP");
/*      */     
/*  541 */     this.jLabel9.setText("MP");
/*      */     
/*  543 */     this.jLabel10.setText("Place");
/*      */     
/*  545 */     jLabel11.setText("jLabel11");
/*      */     
/*  547 */     this.jLabel12.setText("Exp");
/*      */     
/*  549 */     jLabel13.setText("jLabel13");
/*      */     
/*  551 */     this.jLabel14.setText("Sp");
/*      */     
/*  553 */     this.jLabel15.setText("Gold");
/*      */     
/*  555 */     this.jLabel16.setText("LV");
/*      */     
/*  557 */     jLabel17.setText("jLabel17");
/*      */     
/*  559 */     jLabel18.setText("jLabel18");
/*      */     
/*  561 */     jLabel19.setText("jLabel19");
/*      */     
/*  563 */     jLabel20.setText("/");
/*      */     
/*  565 */     jLabel21.setText("/");
/*      */     
/*  567 */     this.jLabel23.setText("ID");
/*      */     
/*  569 */     jLabel24.setText("jLabel24");
/*      */     
/*  571 */     this.jLabel25.setText("Race");
/*      */     
/*  573 */     jLabel26.setText("jLabel26");
/*      */     
/*  575 */     this.jLabel27.setText("Dam Phy");
/*      */     
/*  577 */     jLabel28.setText("~");
/*      */     
/*  579 */     this.jLabel29.setText("Dam Mag");
/*      */     
/*  581 */     jLabel30.setText("~");
/*      */     
/*  583 */     this.jLabel31.setText("Def Phy");
/*      */     
/*  585 */     jLabel32.setText("jLabel32");
/*      */     
/*  587 */     this.jLabel33.setText("Def Mag");
/*      */     
/*  589 */     jLabel34.setText("jLabel34");
/*      */     
/*  591 */     this.jLabel35.setText("Atk Rate");
/*      */     
/*  593 */     jLabel36.setText("jLabel36");
/*      */     
/*  595 */     this.jLabel37.setText("Def Rate");
/*      */     
/*  597 */     jLabel38.setText("jLabel38");
/*      */     
/*  599 */     this.jLabel39.setText("Str");
/*      */     
/*  601 */     jLabel40.setText("jLabel40");
/*      */     
/*  603 */     this.jLabel41.setText("Int");
/*      */     
/*  605 */     jLabel42.setText("jLabel42");
/*      */     
/*  607 */     jLabel43.setText("Y:");
/*      */     
/*  609 */     GroupLayout jPanel6Layout = new GroupLayout(this.jPanel6);
/*  610 */     this.jPanel6.setLayout(jPanel6Layout);
/*  611 */     jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addContainerGap().addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel8).addComponent(this.jLabel14).addComponent(this.jLabel15).addComponent(this.jLabel10).addComponent(this.jLabel12).addGroup(jPanel6Layout.createSequentialGroup().addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel9).addGroup(jPanel6Layout.createSequentialGroup().addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel6).addComponent(this.jLabel16).addComponent(this.jLabel25)).addGap(61, 61, 61).addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jLabel43).addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(jLabel26).addComponent(jLabel11).addComponent(jLabel13).addComponent(jLabel18).addComponent(jLabel19).addComponent(jLabel20).addComponent(jLabel21).addComponent(jLabel17)).addComponent(jLabel4, -2, 115, -2))).addComponent(jLabel5)).addGap(59, 59, 59).addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(jPanel6Layout.createSequentialGroup().addComponent(this.jLabel39).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel40)).addGroup(jPanel6Layout.createSequentialGroup().addComponent(this.jLabel31).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel32)).addGroup(jPanel6Layout.createSequentialGroup().addComponent(this.jLabel29).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel30)).addGroup(jPanel6Layout.createSequentialGroup().addComponent(this.jLabel23).addGap(104, 104, 104).addComponent(jLabel24)).addGroup(jPanel6Layout.createSequentialGroup().addComponent(this.jLabel27).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel28)).addGroup(jPanel6Layout.createSequentialGroup().addComponent(this.jLabel33).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel34)).addGroup(jPanel6Layout.createSequentialGroup().addComponent(this.jLabel35).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel36)).addGroup(jPanel6Layout.createSequentialGroup().addComponent(this.jLabel37).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel38)).addGroup(jPanel6Layout.createSequentialGroup().addComponent(this.jLabel41).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(jLabel42))))).addGap(0, 261, 32767)));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  683 */     jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addContainerGap().addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel6).addComponent(this.jLabel23).addComponent(jLabel24)).addComponent(jLabel4, GroupLayout.Alignment.TRAILING)).addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel6Layout.createSequentialGroup().addGap(5, 5, 5).addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel16).addComponent(jLabel17)).addGap(11, 11, 11).addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel25).addComponent(jLabel26)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabel5).addComponent(jLabel43)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel10).addComponent(jLabel11)).addGap(26, 26, 26).addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel12).addComponent(jLabel13).addComponent(this.jLabel33).addComponent(jLabel34)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel14).addComponent(jLabel18).addComponent(this.jLabel35).addComponent(jLabel36)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel15).addComponent(jLabel19).addComponent(this.jLabel37).addComponent(jLabel38)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel8).addComponent(jLabel20).addComponent(this.jLabel39).addComponent(jLabel40)).addGap(18, 18, 18).addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel9).addComponent(jLabel21).addComponent(this.jLabel41).addComponent(jLabel42)).addGap(49, 49, 49)).addGroup(jPanel6Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel27).addComponent(jLabel28)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel29).addComponent(jLabel30)).addGap(18, 18, 18).addGroup(jPanel6Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel31).addComponent(jLabel32)).addContainerGap()))));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  758 */     this.jPanel5.add(this.jPanel6, new AbsoluteConstraints(0, 0, 700, -1));
/*      */     
/*  760 */     this.jTabbedPane1.addTab("Character", this.jPanel5);
/*      */     
/*  762 */     this.jPanel7.setBorder(BorderFactory.createTitledBorder("Follow"));
/*  763 */     this.jPanel7.setLayout((LayoutManager)new AbsoluteLayout());
/*  764 */     this.jPanel7.add(jTextField5, new AbsoluteConstraints(30, 100, 213, -1));
/*      */     
/*  766 */     this.jLabel7.setText("Name");
/*  767 */     this.jPanel7.add(this.jLabel7, new AbsoluteConstraints(110, 70, -1, -1));
/*      */     
/*  769 */     this.jButton12.setText("Start");
/*  770 */     this.jButton12.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/*  772 */             Gui.this.jButton12ActionPerformed(evt);
/*      */           }
/*      */         });
/*  775 */     this.jPanel7.add(this.jButton12, new AbsoluteConstraints(30, 130, 100, -1));
/*      */     
/*  777 */     this.jButton13.setText("Stop");
/*  778 */     this.jButton13.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/*  780 */             Gui.this.jButton13ActionPerformed(evt);
/*      */           }
/*      */         });
/*  783 */     this.jPanel7.add(this.jButton13, new AbsoluteConstraints(130, 130, 110, -1));
/*      */     
/*  785 */     this.jList17.setModel(PlayerList);
/*  786 */     this.jScrollPane17.setViewportView(this.jList17);
/*      */     
/*  788 */     this.jPanel7.add(this.jScrollPane17, new AbsoluteConstraints(300, 40, 130, 300));
/*      */     
/*  790 */     this.jList20.setModel(IDList);
/*  791 */     this.jScrollPane20.setViewportView(this.jList20);
/*      */     
/*  793 */     this.jPanel7.add(this.jScrollPane20, new AbsoluteConstraints(450, 40, 130, 300));
/*      */     
/*  795 */     this.jLabel101.setText("Name");
/*  796 */     this.jPanel7.add(this.jLabel101, new AbsoluteConstraints(340, 20, -1, -1));
/*      */     
/*  798 */     this.jLabel102.setText("ID");
/*  799 */     this.jPanel7.add(this.jLabel102, new AbsoluteConstraints(510, 20, -1, -1));
/*      */     
/*  801 */     GroupLayout jPanel2Layout = new GroupLayout(this.jPanel2);
/*  802 */     this.jPanel2.setLayout(jPanel2Layout);
/*  803 */     jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel7, -1, 715, 32767));
/*      */ 
/*      */ 
/*      */     
/*  807 */     jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel7, -1, 622, 32767));
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  812 */     this.jTabbedPane1.addTab("Follow", this.jPanel2);
/*      */     
/*  814 */     this.jPanel4.setLayout((LayoutManager)new AbsoluteLayout());
/*      */     
/*  816 */     this.jPanel14.setBorder(BorderFactory.createTitledBorder("Lựa chọn thêm"));
/*  817 */     this.jPanel14.setLayout((LayoutManager)new AbsoluteLayout());
/*      */     
/*  819 */     this.jCheckBox4.setText("Điểu khiển nhóm");
/*  820 */     this.jPanel14.add(this.jCheckBox4, new AbsoluteConstraints(10, 110, -1, -1));
/*      */     
/*  822 */     this.jCheckBox3.setText("Nhóm chọn lọc");
/*  823 */     this.jPanel14.add(this.jCheckBox3, new AbsoluteConstraints(10, 80, -1, -1));
/*      */     
/*  825 */     this.jCheckBox2.setText("Tự động đăng ký nhóm");
/*  826 */     this.jPanel14.add(this.jCheckBox2, new AbsoluteConstraints(10, 50, -1, -1));
/*      */     
/*  828 */     jCheckBox1.setSelected(true);
/*  829 */     jCheckBox1.setText("Tự động chấp nhận lời mời");
/*  830 */     this.jPanel14.add(jCheckBox1, new AbsoluteConstraints(10, 20, -1, -1));
/*      */     
/*  832 */     this.jPanel4.add(this.jPanel14, new AbsoluteConstraints(10, 120, 210, 142));
/*      */     
/*  834 */     this.jPanel15.setBorder(BorderFactory.createTitledBorder("Tình trạng pt"));
/*  835 */     this.jPanel15.setLayout((LayoutManager)new AbsoluteLayout());
/*  836 */     this.jPanel15.add(this.jProgressBar1, new AbsoluteConstraints(110, 20, 320, -1));
/*  837 */     this.jPanel15.add(this.jProgressBar2, new AbsoluteConstraints(110, 80, 320, -1));
/*  838 */     this.jPanel15.add(this.jProgressBar3, new AbsoluteConstraints(110, 140, 320, -1));
/*  839 */     this.jPanel15.add(this.jProgressBar4, new AbsoluteConstraints(110, 200, 320, -1));
/*  840 */     this.jPanel15.add(this.jProgressBar5, new AbsoluteConstraints(110, 260, 320, -1));
/*  841 */     this.jPanel15.add(this.jProgressBar6, new AbsoluteConstraints(110, 320, 320, -1));
/*  842 */     this.jPanel15.add(this.jProgressBar7, new AbsoluteConstraints(110, 370, 320, -1));
/*  843 */     this.jPanel15.add(this.jProgressBar8, new AbsoluteConstraints(110, 430, 320, -1));
/*      */     
/*  845 */     this.jLabel48.setText("Chủ PT");
/*  846 */     this.jPanel15.add(this.jLabel48, new AbsoluteConstraints(60, 20, -1, -1));
/*      */     
/*  848 */     this.jLabel49.setText("Thành viên 1");
/*  849 */     this.jPanel15.add(this.jLabel49, new AbsoluteConstraints(30, 70, -1, 40));
/*      */     
/*  851 */     this.jLabel50.setText("Thành viên 2");
/*  852 */     this.jPanel15.add(this.jLabel50, new AbsoluteConstraints(30, 140, -1, -1));
/*      */     
/*  854 */     this.jLabel51.setText("Thành viên 3");
/*  855 */     this.jPanel15.add(this.jLabel51, new AbsoluteConstraints(30, 200, -1, -1));
/*      */     
/*  857 */     this.jLabel52.setText("Thành viên 4");
/*  858 */     this.jPanel15.add(this.jLabel52, new AbsoluteConstraints(30, 260, -1, -1));
/*      */     
/*  860 */     this.jLabel53.setText("Thành viên 5");
/*  861 */     this.jPanel15.add(this.jLabel53, new AbsoluteConstraints(30, 310, -1, 30));
/*      */     
/*  863 */     this.jLabel54.setText("Thành viên 6");
/*  864 */     this.jPanel15.add(this.jLabel54, new AbsoluteConstraints(30, 370, -1, -1));
/*      */     
/*  866 */     this.jLabel55.setText("Thành viên 7");
/*  867 */     this.jPanel15.add(this.jLabel55, new AbsoluteConstraints(30, 430, -1, -1));
/*      */     
/*  869 */     this.jLabel56.setText("Alive");
/*  870 */     this.jPanel15.add(this.jLabel56, new AbsoluteConstraints(110, 40, 49, -1));
/*      */     
/*  872 */     this.jLabel57.setText("Alive");
/*  873 */     this.jPanel15.add(this.jLabel57, new AbsoluteConstraints(110, 100, 49, -1));
/*      */     
/*  875 */     this.jLabel58.setText("Alive");
/*  876 */     this.jPanel15.add(this.jLabel58, new AbsoluteConstraints(110, 160, 49, -1));
/*      */     
/*  878 */     this.jLabel59.setText("Alive");
/*  879 */     this.jPanel15.add(this.jLabel59, new AbsoluteConstraints(110, 220, 49, -1));
/*      */     
/*  881 */     this.jLabel60.setText("Alive");
/*  882 */     this.jPanel15.add(this.jLabel60, new AbsoluteConstraints(110, 280, 49, -1));
/*      */     
/*  884 */     this.jLabel61.setText("Alive");
/*  885 */     this.jPanel15.add(this.jLabel61, new AbsoluteConstraints(110, 340, 49, -1));
/*      */     
/*  887 */     this.jLabel62.setText("Alive");
/*  888 */     this.jPanel15.add(this.jLabel62, new AbsoluteConstraints(110, 390, 49, -1));
/*      */     
/*  890 */     this.jLabel63.setText("Alive");
/*  891 */     this.jPanel15.add(this.jLabel63, new AbsoluteConstraints(110, 450, 49, -1));
/*      */     
/*  893 */     this.jPanel4.add(this.jPanel15, new AbsoluteConstraints(230, 120, 470, 470));
/*      */     
/*  895 */     this.jPanel16.setBorder(BorderFactory.createTitledBorder("Nhóm chọn lọc"));
/*  896 */     this.jPanel16.setLayout((LayoutManager)new AbsoluteLayout());
/*      */     
/*  898 */     this.jScrollPane6.setViewportView(this.jList5);
/*      */     
/*  900 */     this.jPanel16.add(this.jScrollPane6, new AbsoluteConstraints(14, 20, 180, 191));
/*  901 */     this.jPanel16.add(this.jTextField11, new AbsoluteConstraints(20, 270, 174, -1));
/*      */     
/*  903 */     this.jButton15.setText("^");
/*  904 */     this.jPanel16.add(this.jButton15, new AbsoluteConstraints(20, 220, 55, 40));
/*      */     
/*  906 */     this.jButton16.setText("Del");
/*  907 */     this.jPanel16.add(this.jButton16, new AbsoluteConstraints(79, 220, 110, 40));
/*      */     
/*  909 */     this.jPanel4.add(this.jPanel16, new AbsoluteConstraints(10, 270, 210, 310));
/*      */     
/*  911 */     this.jPanel17.setBorder(BorderFactory.createTitledBorder("Thông tin thêm"));
/*      */     
/*  913 */     jTextField15.setText("SnowZ");
/*      */     
/*  915 */     this.jLabel89.setText("Tên nhóm");
/*      */     
/*  917 */     this.jLabel90.setText("Loại");
/*      */     
/*  919 */     this.buttonGroup1.add(jRadioButton3);
/*  920 */     jRadioButton3.setSelected(true);
/*  921 */     jRadioButton3.setText("Săn");
/*  922 */     jRadioButton3.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/*  924 */             Gui.this.jRadioButton3ActionPerformed(evt);
/*      */           }
/*      */         });
/*      */     
/*  928 */     this.buttonGroup1.add(this.jRadioButton8);
/*  929 */     this.jRadioButton8.setText("Nhiệm vụ");
/*      */     
/*  931 */     this.jButton29.setText("Đăng ký");
/*  932 */     this.jButton29.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/*  934 */             Gui.this.jButton29ActionPerformed(evt);
/*      */           }
/*      */         });
/*      */     
/*  938 */     this.jLabel91.setText("Giới hạn cấp độ");
/*      */     
/*  940 */     jTextField16.setText("1");
/*      */     
/*  942 */     this.jLabel92.setText("->");
/*      */     
/*  944 */     jTextField17.setText("110");
/*      */     
/*  946 */     jCheckBox6.setSelected(true);
/*  947 */     jCheckBox6.setText("Gửi lời mời ngoài trưởng nhóm");
/*      */     
/*  949 */     GroupLayout jPanel17Layout = new GroupLayout(this.jPanel17);
/*  950 */     this.jPanel17.setLayout(jPanel17Layout);
/*  951 */     jPanel17Layout.setHorizontalGroup(jPanel17Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel17Layout.createSequentialGroup().addContainerGap().addGroup(jPanel17Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel17Layout.createSequentialGroup().addGroup(jPanel17Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jLabel89, -1, -1, 32767).addComponent(this.jLabel90, -1, -1, 32767)).addGap(18, 18, 18).addGroup(jPanel17Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel17Layout.createSequentialGroup().addComponent(jRadioButton3).addGap(176, 176, 176).addComponent(this.jButton29, -1, -1, 32767)).addComponent(jTextField15))).addGroup(jPanel17Layout.createSequentialGroup().addComponent(this.jLabel91).addGap(18, 18, 18).addComponent(jTextField16, -2, 30, -2).addGap(18, 18, 18).addComponent(this.jLabel92).addGap(18, 18, 18).addGroup(jPanel17Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel17Layout.createSequentialGroup().addComponent(this.jRadioButton8).addGap(0, 0, 32767)).addGroup(jPanel17Layout.createSequentialGroup().addComponent(jTextField17, -2, 33, -2).addGap(31, 31, 31).addComponent(jCheckBox6, -1, 205, 32767))))).addContainerGap()));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  984 */     jPanel17Layout.setVerticalGroup(jPanel17Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel17Layout.createSequentialGroup().addGroup(jPanel17Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jTextField15, -2, -1, -2).addComponent(this.jLabel89)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel17Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel90).addComponent(jRadioButton3).addComponent(this.jRadioButton8).addComponent(this.jButton29)).addGap(4, 4, 4).addGroup(jPanel17Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel91).addComponent(jTextField16, -2, -1, -2).addComponent(this.jLabel92).addComponent(jTextField17, -2, -1, -2).addComponent(jCheckBox6)).addGap(0, 0, 32767)));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1006 */     this.jPanel4.add(this.jPanel17, new AbsoluteConstraints(230, 10, 470, -1));
/*      */     
/* 1008 */     this.jPanel26.setBorder(BorderFactory.createTitledBorder("Loại nhóm"));
/*      */     
/* 1010 */     this.jPanel27.setBorder(BorderFactory.createTitledBorder("Điểm"));
/*      */     
/* 1012 */     this.buttonGroup2.add(jRadioButton9);
/* 1013 */     jRadioButton9.setSelected(true);
/* 1014 */     jRadioButton9.setText("Chia");
/*      */     
/* 1016 */     this.buttonGroup2.add(this.jRadioButton10);
/* 1017 */     this.jRadioButton10.setText("Không chia");
/*      */     
/* 1019 */     GroupLayout jPanel27Layout = new GroupLayout(this.jPanel27);
/* 1020 */     this.jPanel27.setLayout(jPanel27Layout);
/* 1021 */     jPanel27Layout.setHorizontalGroup(jPanel27Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup().addGap(0, 0, 32767).addGroup(jPanel27Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jRadioButton10).addComponent(jRadioButton9))));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1029 */     jPanel27Layout.setVerticalGroup(jPanel27Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel27Layout.createSequentialGroup().addComponent(jRadioButton9).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jRadioButton10).addContainerGap()));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1038 */     this.jPanel28.setBorder(BorderFactory.createTitledBorder("Đồ"));
/*      */     
/* 1040 */     this.buttonGroup3.add(jRadioButton11);
/* 1041 */     jRadioButton11.setSelected(true);
/* 1042 */     jRadioButton11.setText("Chia");
/*      */     
/* 1044 */     this.buttonGroup3.add(this.jRadioButton12);
/* 1045 */     this.jRadioButton12.setText("Không chia");
/*      */     
/* 1047 */     GroupLayout jPanel28Layout = new GroupLayout(this.jPanel28);
/* 1048 */     this.jPanel28.setLayout(jPanel28Layout);
/* 1049 */     jPanel28Layout.setHorizontalGroup(jPanel28Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jRadioButton11).addComponent(this.jRadioButton12));
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1054 */     jPanel28Layout.setVerticalGroup(jPanel28Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel28Layout.createSequentialGroup().addComponent(jRadioButton11).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.jRadioButton12).addContainerGap()));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1063 */     GroupLayout jPanel26Layout = new GroupLayout(this.jPanel26);
/* 1064 */     this.jPanel26.setLayout(jPanel26Layout);
/* 1065 */     jPanel26Layout.setHorizontalGroup(jPanel26Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel26Layout.createSequentialGroup().addComponent(this.jPanel27, -2, -1, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jPanel28, -1, -1, 32767).addContainerGap()));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1073 */     jPanel26Layout.setVerticalGroup(jPanel26Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jPanel28, -1, -1, 32767).addComponent(this.jPanel27, -1, -1, 32767));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1079 */     this.jPanel4.add(this.jPanel26, new AbsoluteConstraints(10, 10, 207, -1));
/*      */     
/* 1081 */     this.jTabbedPane2.addTab("Đăng ký nhóm", this.jPanel4);
/*      */     
/* 1083 */     this.jList7.setModel(new AbstractListModel() {
/* 1084 */           String[] strings = new String[] { "Skill member 1" };
/* 1085 */           public int getSize() { return this.strings.length; }
/* 1086 */           public Object getElementAt(int i) { return this.strings[i]; }
/*      */         });
/* 1088 */     this.jScrollPane7.setViewportView(this.jList7);
/*      */     
/* 1090 */     this.jButton18.setText("Lấy danh sách skill");
/*      */     
/* 1092 */     this.jList10.setModel(new AbstractListModel() {
/* 1093 */           String[] strings = new String[] { "Buff skill A cho nv B" };
/* 1094 */           public int getSize() { return this.strings.length; }
/* 1095 */           public Object getElementAt(int i) { return this.strings[i]; }
/*      */         });
/* 1097 */     this.jScrollPane10.setViewportView(this.jList10);
/*      */     
/* 1099 */     this.jList11.setModel(new AbstractListModel() {
/* 1100 */           String[] strings = new String[] { "Nhân vật thuộc pt" };
/* 1101 */           public int getSize() { return this.strings.length; }
/* 1102 */           public Object getElementAt(int i) { return this.strings[i]; }
/*      */         });
/* 1104 */     this.jScrollPane11.setViewportView(this.jList11);
/*      */     
/* 1106 */     this.jButton21.setText("->");
/*      */     
/* 1108 */     this.jList9.setModel(new AbstractListModel() {
/* 1109 */           String[] strings = new String[] { "List skill no target" };
/* 1110 */           public int getSize() { return this.strings.length; }
/* 1111 */           public Object getElementAt(int i) { return this.strings[i]; }
/*      */         });
/* 1113 */     this.jScrollPane9.setViewportView(this.jList9);
/*      */     
/* 1115 */     this.jButton23.setText("->");
/*      */     
/* 1117 */     this.jLabel68.setText("Cho phép");
/*      */     
/* 1119 */     this.jButton42.setText("Gửi setting");
/*      */     
/* 1121 */     this.jLabel69.setText("Thành công");
/*      */     
/* 1123 */     this.jButton43.setText("Bắt đầu");
/*      */     
/* 1125 */     this.jButton44.setText("Dừng");
/*      */     
/* 1127 */     this.jLabel70.setText("Thành công");
/*      */     
/* 1129 */     this.jButton24.setText("Del");
/*      */     
/* 1131 */     this.jButton25.setText("Del");
/*      */     
/* 1133 */     GroupLayout jPanel18Layout = new GroupLayout(this.jPanel18);
/* 1134 */     this.jPanel18.setLayout(jPanel18Layout);
/* 1135 */     jPanel18Layout.setHorizontalGroup(jPanel18Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel18Layout.createSequentialGroup().addGap(22, 22, 22).addGroup(jPanel18Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jScrollPane7, -2, 153, -2).addComponent(this.jButton18).addComponent(this.jLabel68, -2, 133, -2)).addGroup(jPanel18Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel18Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel18Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel18Layout.createSequentialGroup().addGroup(jPanel18Layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(this.jButton23).addComponent(this.jButton24)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jScrollPane9)).addGroup(jPanel18Layout.createSequentialGroup().addComponent(this.jScrollPane11, -2, 187, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel18Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jButton25, -1, -1, 32767).addComponent(this.jButton21, -1, -1, 32767)).addGap(0, 9, 32767)))).addGroup(jPanel18Layout.createSequentialGroup().addGap(5, 5, 5).addGroup(jPanel18Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel69).addComponent(this.jButton42)))).addGap(13, 13, 13).addGroup(jPanel18Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jScrollPane10).addGroup(jPanel18Layout.createSequentialGroup().addGroup(jPanel18Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel18Layout.createSequentialGroup().addComponent(this.jButton43).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jButton44)).addComponent(this.jLabel70)).addGap(0, 114, 32767))).addContainerGap()));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1178 */     jPanel18Layout.setVerticalGroup(jPanel18Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup().addGroup(jPanel18Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton18).addComponent(this.jButton42).addComponent(this.jButton43).addComponent(this.jButton44)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel18Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel68).addComponent(this.jLabel69).addComponent(this.jLabel70)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 39, 32767).addGroup(jPanel18Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jScrollPane7).addComponent(this.jScrollPane10).addGroup(jPanel18Layout.createSequentialGroup().addGroup(jPanel18Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel18Layout.createSequentialGroup().addGap(56, 56, 56).addComponent(this.jButton21).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton25).addGap(0, 0, 32767)).addComponent(this.jScrollPane11, -1, 157, 32767)).addGroup(jPanel18Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel18Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jScrollPane9, -2, 290, -2)).addGroup(jPanel18Layout.createSequentialGroup().addGap(136, 136, 136).addComponent(this.jButton23).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jButton24))))).addGap(31, 31, 31)));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1216 */     this.jTabbedPane3.addTab("Member 1", this.jPanel18);
/*      */     
/* 1218 */     this.jPanel19.setLayout((LayoutManager)new AbsoluteLayout());
/*      */     
/* 1220 */     this.jButton45.setText("Lấy danh sách skill");
/* 1221 */     this.jPanel19.add(this.jButton45, new AbsoluteConstraints(22, 0, -1, -1));
/*      */     
/* 1223 */     this.jLabel71.setText("Cho phép");
/* 1224 */     this.jPanel19.add(this.jLabel71, new AbsoluteConstraints(22, 29, 133, -1));
/*      */     
/* 1226 */     this.jButton46.setText("Gửi setting");
/* 1227 */     this.jPanel19.add(this.jButton46, new AbsoluteConstraints(180, 0, -1, -1));
/*      */     
/* 1229 */     this.jLabel72.setText("Thành công");
/* 1230 */     this.jPanel19.add(this.jLabel72, new AbsoluteConstraints(180, 29, -1, -1));
/*      */     
/* 1232 */     this.jButton47.setText("Bắt đầu");
/* 1233 */     this.jPanel19.add(this.jButton47, new AbsoluteConstraints(470, 0, -1, -1));
/*      */     
/* 1235 */     this.jButton48.setText("Dừng");
/* 1236 */     this.jPanel19.add(this.jButton48, new AbsoluteConstraints(560, 0, -1, -1));
/*      */     
/* 1238 */     this.jLabel73.setText("Thành công");
/* 1239 */     this.jPanel19.add(this.jLabel73, new AbsoluteConstraints(480, 30, -1, -1));
/*      */     
/* 1241 */     this.jList36.setModel(new AbstractListModel() {
/* 1242 */           String[] strings = new String[] { "Nhân vật thuộc pt" };
/* 1243 */           public int getSize() { return this.strings.length; }
/* 1244 */           public Object getElementAt(int i) { return this.strings[i]; }
/*      */         });
/* 1246 */     this.jScrollPane36.setViewportView(this.jList36);
/*      */     
/* 1248 */     this.jPanel19.add(this.jScrollPane36, new AbsoluteConstraints(181, 82, 187, 157));
/*      */     
/* 1250 */     this.jList37.setModel(new AbstractListModel() {
/* 1251 */           String[] strings = new String[] { "Skill member 1" };
/* 1252 */           public int getSize() { return this.strings.length; }
/* 1253 */           public Object getElementAt(int i) { return this.strings[i]; }
/*      */         });
/* 1255 */     this.jScrollPane37.setViewportView(this.jList37);
/*      */     
/* 1257 */     this.jPanel19.add(this.jScrollPane37, new AbsoluteConstraints(22, 82, 153, 453));
/*      */     
/* 1259 */     this.jButton49.setText("->");
/* 1260 */     this.jPanel19.add(this.jButton49, new AbsoluteConstraints(374, 138, 47, -1));
/*      */     
/* 1262 */     this.jList38.setModel(new AbstractListModel() {
/* 1263 */           String[] strings = new String[] { "Buff skill A cho nv B" };
/* 1264 */           public int getSize() { return this.strings.length; }
/* 1265 */           public Object getElementAt(int i) { return this.strings[i]; }
/*      */         });
/* 1267 */     this.jScrollPane38.setViewportView(this.jList38);
/*      */     
/* 1269 */     this.jPanel19.add(this.jScrollPane38, new AbsoluteConstraints(455, 82, 240, 453));
/*      */     
/* 1271 */     this.jList39.setModel(new AbstractListModel() {
/* 1272 */           String[] strings = new String[] { "List skill no target" };
/* 1273 */           public int getSize() { return this.strings.length; }
/* 1274 */           public Object getElementAt(int i) { return this.strings[i]; }
/*      */         });
/* 1276 */     this.jScrollPane39.setViewportView(this.jList39);
/*      */     
/* 1278 */     this.jPanel19.add(this.jScrollPane39, new AbsoluteConstraints(234, 245, 208, 290));
/*      */     
/* 1280 */     this.jButton50.setText("->");
/* 1281 */     this.jPanel19.add(this.jButton50, new AbsoluteConstraints(181, 375, 47, -1));
/*      */     
/* 1283 */     this.jButton26.setText("Del");
/* 1284 */     this.jPanel19.add(this.jButton26, new AbsoluteConstraints(181, 404, -1, -1));
/*      */     
/* 1286 */     this.jButton27.setText("Del");
/* 1287 */     this.jPanel19.add(this.jButton27, new AbsoluteConstraints(374, 167, -1, -1));
/*      */     
/* 1289 */     this.jTabbedPane3.addTab("Member 2", this.jPanel19);
/*      */     
/* 1291 */     this.jButton51.setText("Lấy danh sách skill");
/*      */     
/* 1293 */     this.jLabel74.setText("Cho phép");
/*      */     
/* 1295 */     this.jButton52.setText("Gửi setting");
/*      */     
/* 1297 */     this.jLabel75.setText("Thành công");
/*      */     
/* 1299 */     this.jButton53.setText("Bắt đầu");
/*      */     
/* 1301 */     this.jButton54.setText("Dừng");
/*      */     
/* 1303 */     this.jLabel76.setText("Thành công");
/*      */     
/* 1305 */     this.jList40.setModel(new AbstractListModel() {
/* 1306 */           String[] strings = new String[] { "Nhân vật thuộc pt" };
/* 1307 */           public int getSize() { return this.strings.length; }
/* 1308 */           public Object getElementAt(int i) { return this.strings[i]; }
/*      */         });
/* 1310 */     this.jScrollPane40.setViewportView(this.jList40);
/*      */     
/* 1312 */     this.jList41.setModel(new AbstractListModel() {
/* 1313 */           String[] strings = new String[] { "Skill member 1" };
/* 1314 */           public int getSize() { return this.strings.length; }
/* 1315 */           public Object getElementAt(int i) { return this.strings[i]; }
/*      */         });
/* 1317 */     this.jScrollPane41.setViewportView(this.jList41);
/*      */     
/* 1319 */     this.jButton55.setText("->");
/*      */     
/* 1321 */     this.jList42.setModel(new AbstractListModel() {
/* 1322 */           String[] strings = new String[] { "Buff skill A cho nv B" };
/* 1323 */           public int getSize() { return this.strings.length; }
/* 1324 */           public Object getElementAt(int i) { return this.strings[i]; }
/*      */         });
/* 1326 */     this.jScrollPane42.setViewportView(this.jList42);
/*      */     
/* 1328 */     this.jList43.setModel(new AbstractListModel() {
/* 1329 */           String[] strings = new String[] { "List skill no target" };
/* 1330 */           public int getSize() { return this.strings.length; }
/* 1331 */           public Object getElementAt(int i) { return this.strings[i]; }
/*      */         });
/* 1333 */     this.jScrollPane43.setViewportView(this.jList43);
/*      */     
/* 1335 */     this.jButton56.setText("->");
/*      */     
/* 1337 */     GroupLayout jPanel20Layout = new GroupLayout(this.jPanel20);
/* 1338 */     this.jPanel20.setLayout(jPanel20Layout);
/* 1339 */     jPanel20Layout.setHorizontalGroup(jPanel20Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel20Layout.createSequentialGroup().addGap(22, 22, 22).addGroup(jPanel20Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jScrollPane41, -2, 153, -2).addComponent(this.jButton51).addComponent(this.jLabel74, -2, 133, -2)).addGroup(jPanel20Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel20Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel20Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(jPanel20Layout.createSequentialGroup().addComponent(this.jButton56).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jScrollPane43)).addGroup(jPanel20Layout.createSequentialGroup().addComponent(this.jScrollPane40, -2, 187, -2).addGap(1, 1, 1).addComponent(this.jButton55)))).addGroup(jPanel20Layout.createSequentialGroup().addGap(5, 5, 5).addGroup(jPanel20Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel75).addComponent(this.jButton52)))).addGap(13, 13, 13).addGroup(jPanel20Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jScrollPane42).addGroup(jPanel20Layout.createSequentialGroup().addGroup(jPanel20Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel20Layout.createSequentialGroup().addComponent(this.jButton53).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jButton54)).addComponent(this.jLabel76)).addGap(0, 130, 32767))).addContainerGap()));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1377 */     jPanel20Layout.setVerticalGroup(jPanel20Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup().addGroup(jPanel20Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton51).addComponent(this.jButton52).addComponent(this.jButton53).addComponent(this.jButton54)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel20Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel74).addComponent(this.jLabel75).addComponent(this.jLabel76)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 39, 32767).addGroup(jPanel20Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jScrollPane41).addComponent(this.jScrollPane42).addGroup(jPanel20Layout.createSequentialGroup().addGroup(jPanel20Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel20Layout.createSequentialGroup().addGap(56, 56, 56).addComponent(this.jButton55).addGap(0, 0, 32767)).addComponent(this.jScrollPane40, -1, 157, 32767)).addGroup(jPanel20Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel20Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jScrollPane43, -2, 290, -2)).addGroup(jPanel20Layout.createSequentialGroup().addGap(136, 136, 136).addComponent(this.jButton56))))).addGap(31, 31, 31)));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1411 */     this.jTabbedPane3.addTab("Member 3", this.jPanel20);
/*      */     
/* 1413 */     this.jButton57.setText("Lấy danh sách skill");
/*      */     
/* 1415 */     this.jLabel77.setText("Cho phép");
/*      */     
/* 1417 */     this.jButton58.setText("Gửi setting");
/*      */     
/* 1419 */     this.jLabel78.setText("Thành công");
/*      */     
/* 1421 */     this.jButton59.setText("Bắt đầu");
/*      */     
/* 1423 */     this.jButton60.setText("Dừng");
/*      */     
/* 1425 */     this.jLabel79.setText("Thành công");
/*      */     
/* 1427 */     this.jList44.setModel(new AbstractListModel() {
/* 1428 */           String[] strings = new String[] { "Nhân vật thuộc pt" };
/* 1429 */           public int getSize() { return this.strings.length; }
/* 1430 */           public Object getElementAt(int i) { return this.strings[i]; }
/*      */         });
/* 1432 */     this.jScrollPane44.setViewportView(this.jList44);
/*      */     
/* 1434 */     this.jList45.setModel(new AbstractListModel() {
/* 1435 */           String[] strings = new String[] { "Skill member 1" };
/* 1436 */           public int getSize() { return this.strings.length; }
/* 1437 */           public Object getElementAt(int i) { return this.strings[i]; }
/*      */         });
/* 1439 */     this.jScrollPane45.setViewportView(this.jList45);
/*      */     
/* 1441 */     this.jButton61.setText("->");
/*      */     
/* 1443 */     this.jList46.setModel(new AbstractListModel() {
/* 1444 */           String[] strings = new String[] { "Buff skill A cho nv B" };
/* 1445 */           public int getSize() { return this.strings.length; }
/* 1446 */           public Object getElementAt(int i) { return this.strings[i]; }
/*      */         });
/* 1448 */     this.jScrollPane46.setViewportView(this.jList46);
/*      */     
/* 1450 */     this.jList47.setModel(new AbstractListModel() {
/* 1451 */           String[] strings = new String[] { "List skill no target" };
/* 1452 */           public int getSize() { return this.strings.length; }
/* 1453 */           public Object getElementAt(int i) { return this.strings[i]; }
/*      */         });
/* 1455 */     this.jScrollPane47.setViewportView(this.jList47);
/*      */     
/* 1457 */     this.jButton62.setText("->");
/*      */     
/* 1459 */     GroupLayout jPanel21Layout = new GroupLayout(this.jPanel21);
/* 1460 */     this.jPanel21.setLayout(jPanel21Layout);
/* 1461 */     jPanel21Layout.setHorizontalGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel21Layout.createSequentialGroup().addGap(22, 22, 22).addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jScrollPane45, -2, 153, -2).addComponent(this.jButton57).addComponent(this.jLabel77, -2, 133, -2)).addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel21Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(jPanel21Layout.createSequentialGroup().addComponent(this.jButton62).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jScrollPane47)).addGroup(jPanel21Layout.createSequentialGroup().addComponent(this.jScrollPane44, -2, 187, -2).addGap(1, 1, 1).addComponent(this.jButton61)))).addGroup(jPanel21Layout.createSequentialGroup().addGap(5, 5, 5).addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel78).addComponent(this.jButton58)))).addGap(13, 13, 13).addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jScrollPane46).addGroup(jPanel21Layout.createSequentialGroup().addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel21Layout.createSequentialGroup().addComponent(this.jButton59).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jButton60)).addComponent(this.jLabel79)).addGap(0, 130, 32767))).addContainerGap()));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1499 */     jPanel21Layout.setVerticalGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup().addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton57).addComponent(this.jButton58).addComponent(this.jButton59).addComponent(this.jButton60)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel77).addComponent(this.jLabel78).addComponent(this.jLabel79)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 39, 32767).addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jScrollPane45).addComponent(this.jScrollPane46).addGroup(jPanel21Layout.createSequentialGroup().addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel21Layout.createSequentialGroup().addGap(56, 56, 56).addComponent(this.jButton61).addGap(0, 0, 32767)).addComponent(this.jScrollPane44, -1, 157, 32767)).addGroup(jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel21Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jScrollPane47, -2, 290, -2)).addGroup(jPanel21Layout.createSequentialGroup().addGap(136, 136, 136).addComponent(this.jButton62))))).addGap(31, 31, 31)));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1533 */     this.jTabbedPane3.addTab("Member 4", this.jPanel21);
/*      */     
/* 1535 */     this.jButton63.setText("Lấy danh sách skill");
/*      */     
/* 1537 */     this.jLabel80.setText("Cho phép");
/*      */     
/* 1539 */     this.jButton64.setText("Gửi setting");
/*      */     
/* 1541 */     this.jLabel81.setText("Thành công");
/*      */     
/* 1543 */     this.jButton65.setText("Bắt đầu");
/*      */     
/* 1545 */     this.jButton66.setText("Dừng");
/*      */     
/* 1547 */     this.jLabel82.setText("Thành công");
/*      */     
/* 1549 */     this.jList48.setModel(new AbstractListModel() {
/* 1550 */           String[] strings = new String[] { "Nhân vật thuộc pt" };
/* 1551 */           public int getSize() { return this.strings.length; }
/* 1552 */           public Object getElementAt(int i) { return this.strings[i]; }
/*      */         });
/* 1554 */     this.jScrollPane48.setViewportView(this.jList48);
/*      */     
/* 1556 */     this.jList49.setModel(new AbstractListModel() {
/* 1557 */           String[] strings = new String[] { "Skill member 1" };
/* 1558 */           public int getSize() { return this.strings.length; }
/* 1559 */           public Object getElementAt(int i) { return this.strings[i]; }
/*      */         });
/* 1561 */     this.jScrollPane49.setViewportView(this.jList49);
/*      */     
/* 1563 */     this.jButton67.setText("->");
/*      */     
/* 1565 */     this.jList50.setModel(new AbstractListModel() {
/* 1566 */           String[] strings = new String[] { "Buff skill A cho nv B" };
/* 1567 */           public int getSize() { return this.strings.length; }
/* 1568 */           public Object getElementAt(int i) { return this.strings[i]; }
/*      */         });
/* 1570 */     this.jScrollPane50.setViewportView(this.jList50);
/*      */     
/* 1572 */     this.jList51.setModel(new AbstractListModel() {
/* 1573 */           String[] strings = new String[] { "List skill no target" };
/* 1574 */           public int getSize() { return this.strings.length; }
/* 1575 */           public Object getElementAt(int i) { return this.strings[i]; }
/*      */         });
/* 1577 */     this.jScrollPane51.setViewportView(this.jList51);
/*      */     
/* 1579 */     this.jButton68.setText("->");
/*      */     
/* 1581 */     GroupLayout jPanel22Layout = new GroupLayout(this.jPanel22);
/* 1582 */     this.jPanel22.setLayout(jPanel22Layout);
/* 1583 */     jPanel22Layout.setHorizontalGroup(jPanel22Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel22Layout.createSequentialGroup().addGap(22, 22, 22).addGroup(jPanel22Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jScrollPane49, -2, 153, -2).addComponent(this.jButton63).addComponent(this.jLabel80, -2, 133, -2)).addGroup(jPanel22Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel22Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel22Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(jPanel22Layout.createSequentialGroup().addComponent(this.jButton68).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jScrollPane51)).addGroup(jPanel22Layout.createSequentialGroup().addComponent(this.jScrollPane48, -2, 187, -2).addGap(1, 1, 1).addComponent(this.jButton67)))).addGroup(jPanel22Layout.createSequentialGroup().addGap(5, 5, 5).addGroup(jPanel22Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel81).addComponent(this.jButton64)))).addGap(13, 13, 13).addGroup(jPanel22Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jScrollPane50).addGroup(jPanel22Layout.createSequentialGroup().addGroup(jPanel22Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel22Layout.createSequentialGroup().addComponent(this.jButton65).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jButton66)).addComponent(this.jLabel82)).addGap(0, 130, 32767))).addContainerGap()));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1621 */     jPanel22Layout.setVerticalGroup(jPanel22Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup().addGroup(jPanel22Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton63).addComponent(this.jButton64).addComponent(this.jButton65).addComponent(this.jButton66)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel22Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel80).addComponent(this.jLabel81).addComponent(this.jLabel82)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 39, 32767).addGroup(jPanel22Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jScrollPane49).addComponent(this.jScrollPane50).addGroup(jPanel22Layout.createSequentialGroup().addGroup(jPanel22Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel22Layout.createSequentialGroup().addGap(56, 56, 56).addComponent(this.jButton67).addGap(0, 0, 32767)).addComponent(this.jScrollPane48, -1, 157, 32767)).addGroup(jPanel22Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel22Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jScrollPane51, -2, 290, -2)).addGroup(jPanel22Layout.createSequentialGroup().addGap(136, 136, 136).addComponent(this.jButton68))))).addGap(31, 31, 31)));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1655 */     this.jTabbedPane3.addTab("Member 5", this.jPanel22);
/*      */     
/* 1657 */     this.jButton69.setText("Lấy danh sách skill");
/*      */     
/* 1659 */     this.jLabel83.setText("Cho phép");
/*      */     
/* 1661 */     this.jButton70.setText("Gửi setting");
/*      */     
/* 1663 */     this.jLabel84.setText("Thành công");
/*      */     
/* 1665 */     this.jButton71.setText("Bắt đầu");
/*      */     
/* 1667 */     this.jButton72.setText("Dừng");
/*      */     
/* 1669 */     this.jLabel85.setText("Thành công");
/*      */     
/* 1671 */     this.jList52.setModel(new AbstractListModel() {
/* 1672 */           String[] strings = new String[] { "Nhân vật thuộc pt" };
/* 1673 */           public int getSize() { return this.strings.length; }
/* 1674 */           public Object getElementAt(int i) { return this.strings[i]; }
/*      */         });
/* 1676 */     this.jScrollPane52.setViewportView(this.jList52);
/*      */     
/* 1678 */     this.jList53.setModel(new AbstractListModel() {
/* 1679 */           String[] strings = new String[] { "Skill member 1" };
/* 1680 */           public int getSize() { return this.strings.length; }
/* 1681 */           public Object getElementAt(int i) { return this.strings[i]; }
/*      */         });
/* 1683 */     this.jScrollPane53.setViewportView(this.jList53);
/*      */     
/* 1685 */     this.jButton73.setText("->");
/*      */     
/* 1687 */     this.jList54.setModel(new AbstractListModel() {
/* 1688 */           String[] strings = new String[] { "Buff skill A cho nv B" };
/* 1689 */           public int getSize() { return this.strings.length; }
/* 1690 */           public Object getElementAt(int i) { return this.strings[i]; }
/*      */         });
/* 1692 */     this.jScrollPane54.setViewportView(this.jList54);
/*      */     
/* 1694 */     this.jList55.setModel(new AbstractListModel() {
/* 1695 */           String[] strings = new String[] { "List skill no target" };
/* 1696 */           public int getSize() { return this.strings.length; }
/* 1697 */           public Object getElementAt(int i) { return this.strings[i]; }
/*      */         });
/* 1699 */     this.jScrollPane55.setViewportView(this.jList55);
/*      */     
/* 1701 */     this.jButton74.setText("->");
/*      */     
/* 1703 */     GroupLayout jPanel23Layout = new GroupLayout(this.jPanel23);
/* 1704 */     this.jPanel23.setLayout(jPanel23Layout);
/* 1705 */     jPanel23Layout.setHorizontalGroup(jPanel23Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel23Layout.createSequentialGroup().addGap(22, 22, 22).addGroup(jPanel23Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jScrollPane53, -2, 153, -2).addComponent(this.jButton69).addComponent(this.jLabel83, -2, 133, -2)).addGroup(jPanel23Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel23Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel23Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(jPanel23Layout.createSequentialGroup().addComponent(this.jButton74).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jScrollPane55)).addGroup(jPanel23Layout.createSequentialGroup().addComponent(this.jScrollPane52, -2, 187, -2).addGap(1, 1, 1).addComponent(this.jButton73)))).addGroup(jPanel23Layout.createSequentialGroup().addGap(5, 5, 5).addGroup(jPanel23Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel84).addComponent(this.jButton70)))).addGap(13, 13, 13).addGroup(jPanel23Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jScrollPane54).addGroup(jPanel23Layout.createSequentialGroup().addGroup(jPanel23Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel23Layout.createSequentialGroup().addComponent(this.jButton71).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jButton72)).addComponent(this.jLabel85)).addGap(0, 130, 32767))).addContainerGap()));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1743 */     jPanel23Layout.setVerticalGroup(jPanel23Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup().addGroup(jPanel23Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton69).addComponent(this.jButton70).addComponent(this.jButton71).addComponent(this.jButton72)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel23Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel83).addComponent(this.jLabel84).addComponent(this.jLabel85)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 39, 32767).addGroup(jPanel23Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jScrollPane53).addComponent(this.jScrollPane54).addGroup(jPanel23Layout.createSequentialGroup().addGroup(jPanel23Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel23Layout.createSequentialGroup().addGap(56, 56, 56).addComponent(this.jButton73).addGap(0, 0, 32767)).addComponent(this.jScrollPane52, -1, 157, 32767)).addGroup(jPanel23Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel23Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jScrollPane55, -2, 290, -2)).addGroup(jPanel23Layout.createSequentialGroup().addGap(136, 136, 136).addComponent(this.jButton74))))).addGap(31, 31, 31)));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1777 */     this.jTabbedPane3.addTab("Member 6", this.jPanel23);
/*      */     
/* 1779 */     this.jButton75.setText("Lấy danh sách skill");
/*      */     
/* 1781 */     this.jLabel86.setText("Cho phép");
/*      */     
/* 1783 */     this.jButton76.setText("Gửi setting");
/*      */     
/* 1785 */     this.jLabel87.setText("Thành công");
/*      */     
/* 1787 */     this.jButton77.setText("Bắt đầu");
/*      */     
/* 1789 */     this.jButton78.setText("Dừng");
/*      */     
/* 1791 */     this.jLabel88.setText("Thành công");
/*      */     
/* 1793 */     this.jList56.setModel(new AbstractListModel() {
/* 1794 */           String[] strings = new String[] { "Nhân vật thuộc pt" };
/* 1795 */           public int getSize() { return this.strings.length; }
/* 1796 */           public Object getElementAt(int i) { return this.strings[i]; }
/*      */         });
/* 1798 */     this.jScrollPane56.setViewportView(this.jList56);
/*      */     
/* 1800 */     this.jList57.setModel(new AbstractListModel() {
/* 1801 */           String[] strings = new String[] { "Skill member 1" };
/* 1802 */           public int getSize() { return this.strings.length; }
/* 1803 */           public Object getElementAt(int i) { return this.strings[i]; }
/*      */         });
/* 1805 */     this.jScrollPane57.setViewportView(this.jList57);
/*      */     
/* 1807 */     this.jButton79.setText("->");
/*      */     
/* 1809 */     this.jList58.setModel(new AbstractListModel() {
/* 1810 */           String[] strings = new String[] { "Buff skill A cho nv B" };
/* 1811 */           public int getSize() { return this.strings.length; }
/* 1812 */           public Object getElementAt(int i) { return this.strings[i]; }
/*      */         });
/* 1814 */     this.jScrollPane58.setViewportView(this.jList58);
/*      */     
/* 1816 */     this.jList59.setModel(new AbstractListModel() {
/* 1817 */           String[] strings = new String[] { "List skill no target" };
/* 1818 */           public int getSize() { return this.strings.length; }
/* 1819 */           public Object getElementAt(int i) { return this.strings[i]; }
/*      */         });
/* 1821 */     this.jScrollPane59.setViewportView(this.jList59);
/*      */     
/* 1823 */     this.jButton80.setText("->");
/*      */     
/* 1825 */     GroupLayout jPanel24Layout = new GroupLayout(this.jPanel24);
/* 1826 */     this.jPanel24.setLayout(jPanel24Layout);
/* 1827 */     jPanel24Layout.setHorizontalGroup(jPanel24Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel24Layout.createSequentialGroup().addGap(22, 22, 22).addGroup(jPanel24Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jScrollPane57, -2, 153, -2).addComponent(this.jButton75).addComponent(this.jLabel86, -2, 133, -2)).addGroup(jPanel24Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel24Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel24Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(jPanel24Layout.createSequentialGroup().addComponent(this.jButton80).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jScrollPane59)).addGroup(jPanel24Layout.createSequentialGroup().addComponent(this.jScrollPane56, -2, 187, -2).addGap(1, 1, 1).addComponent(this.jButton79)))).addGroup(jPanel24Layout.createSequentialGroup().addGap(5, 5, 5).addGroup(jPanel24Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel87).addComponent(this.jButton76)))).addGap(13, 13, 13).addGroup(jPanel24Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jScrollPane58).addGroup(jPanel24Layout.createSequentialGroup().addGroup(jPanel24Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel24Layout.createSequentialGroup().addComponent(this.jButton77).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.jButton78)).addComponent(this.jLabel88)).addGap(0, 130, 32767))).addContainerGap()));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1865 */     jPanel24Layout.setVerticalGroup(jPanel24Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup().addGroup(jPanel24Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jButton75).addComponent(this.jButton76).addComponent(this.jButton77).addComponent(this.jButton78)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel24Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel86).addComponent(this.jLabel87).addComponent(this.jLabel88)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 39, 32767).addGroup(jPanel24Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jScrollPane57).addComponent(this.jScrollPane58).addGroup(jPanel24Layout.createSequentialGroup().addGroup(jPanel24Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel24Layout.createSequentialGroup().addGap(56, 56, 56).addComponent(this.jButton79).addGap(0, 0, 32767)).addComponent(this.jScrollPane56, -1, 157, 32767)).addGroup(jPanel24Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel24Layout.createSequentialGroup().addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jScrollPane59, -2, 290, -2)).addGroup(jPanel24Layout.createSequentialGroup().addGap(136, 136, 136).addComponent(this.jButton80))))).addGap(31, 31, 31)));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1899 */     this.jTabbedPane3.addTab("Member 7", this.jPanel24);
/*      */     
/* 1901 */     this.jLabel64.setText("Dừng mọi hoạt động");
/*      */     
/* 1903 */     this.jLabel65.setText("Bám theo nhân vật:");
/*      */     
/* 1905 */     this.jTextField12.setText("ID");
/*      */     
/* 1907 */     this.jButton19.setText("Gửi lệnh toàn bộ");
/*      */     
/* 1909 */     this.jList8.setModel(new AbstractListModel() {
/* 1910 */           String[] strings = new String[] { "Danh sách chấp hành lệnh" };
/* 1911 */           public int getSize() { return this.strings.length; }
/* 1912 */           public Object getElementAt(int i) { return this.strings[i]; }
/*      */         });
/* 1914 */     this.jScrollPane8.setViewportView(this.jList8);
/*      */     
/* 1916 */     this.jButton20.setText("Gửi lệnh toàn bộ");
/*      */     
/* 1918 */     this.jLabel66.setText("Đi đến tọa độ");
/*      */     
/* 1920 */     this.jTextField13.setText("X");
/*      */     
/* 1922 */     this.jTextField14.setText("Y");
/*      */     
/* 1924 */     this.jButton22.setText("Gửi lệnh toàn bộ");
/*      */     
/* 1926 */     this.jLabel67.setText("Bắt đầu bot ( không tính chủ pt)");
/*      */     
/* 1928 */     this.jButton17.setText("Gửi lệnh toàn bộ");
/*      */     
/* 1930 */     GroupLayout jPanel25Layout = new GroupLayout(this.jPanel25);
/* 1931 */     this.jPanel25.setLayout(jPanel25Layout);
/* 1932 */     jPanel25Layout.setHorizontalGroup(jPanel25Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup().addContainerGap().addGroup(jPanel25Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel25Layout.createSequentialGroup().addGroup(jPanel25Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel25Layout.createSequentialGroup().addGroup(jPanel25Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jLabel65).addComponent(this.jLabel64, -1, 197, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jTextField12, -2, 90, -2)).addGroup(jPanel25Layout.createSequentialGroup().addComponent(this.jLabel66).addGap(29, 29, 29).addComponent(this.jTextField13, -2, 39, -2).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(this.jTextField14, -2, 42, -2))).addGap(12, 12, 12)).addGroup(jPanel25Layout.createSequentialGroup().addComponent(this.jLabel67).addGap(90, 90, 90))).addGroup(jPanel25Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel25Layout.createSequentialGroup().addGap(55, 55, 55).addComponent(this.jButton19)).addComponent(this.jButton20, GroupLayout.Alignment.TRAILING).addComponent(this.jButton22, GroupLayout.Alignment.TRAILING).addComponent(this.jButton17, GroupLayout.Alignment.TRAILING)).addGap(57, 57, 57).addComponent(this.jScrollPane8, -2, 131, -2).addGap(38, 38, 38)));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1966 */     jPanel25Layout.setVerticalGroup(jPanel25Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel25Layout.createSequentialGroup().addGap(21, 21, 21).addGroup(jPanel25Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel25Layout.createSequentialGroup().addGroup(jPanel25Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel64, -2, 23, -2).addComponent(this.jButton19)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel25Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel65).addComponent(this.jTextField12, -2, -1, -2).addComponent(this.jButton20)).addGap(11, 11, 11).addGroup(jPanel25Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel66).addComponent(this.jTextField13, -2, -1, -2).addComponent(this.jTextField14, -2, -1, -2).addComponent(this.jButton22)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel25Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel67).addComponent(this.jButton17))).addComponent(this.jScrollPane8, -2, 243, -2)).addContainerGap(302, 32767)));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1994 */     this.jTabbedPane3.addTab("Điểu khiển chung", this.jPanel25);
/*      */     
/* 1996 */     GroupLayout jPanel9Layout = new GroupLayout(this.jPanel9);
/* 1997 */     this.jPanel9.setLayout(jPanel9Layout);
/* 1998 */     jPanel9Layout.setHorizontalGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jTabbedPane3));
/*      */ 
/*      */ 
/*      */     
/* 2002 */     jPanel9Layout.setVerticalGroup(jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jTabbedPane3));
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2007 */     this.jTabbedPane2.addTab("Di chuyển nhóm - dành riêng cho trưởng nhóm", this.jPanel9);
/*      */     
/* 2009 */     this.jPanel8.setLayout((LayoutManager)new AbsoluteLayout());
/*      */     
/* 2011 */     this.jPanel10.setBorder(BorderFactory.createTitledBorder("Loại nhóm"));
/* 2012 */     this.jPanel10.setLayout((LayoutManager)new AbsoluteLayout());
/*      */     
/* 2014 */     this.jPanel12.setBorder(BorderFactory.createTitledBorder("Điểm"));
/* 2015 */     this.jPanel12.setLayout((LayoutManager)new AbsoluteLayout());
/*      */     
/* 2017 */     this.buttonGroup5.add(this.jRadioButton4);
/* 2018 */     this.jRadioButton4.setSelected(true);
/* 2019 */     this.jRadioButton4.setText("Chia");
/* 2020 */     this.jPanel12.add(this.jRadioButton4, new AbsoluteConstraints(10, 20, -1, -1));
/*      */     
/* 2022 */     this.buttonGroup5.add(this.jRadioButton5);
/* 2023 */     this.jRadioButton5.setText("Không chia");
/* 2024 */     this.jPanel12.add(this.jRadioButton5, new AbsoluteConstraints(10, 60, -1, -1));
/*      */     
/* 2026 */     this.jPanel10.add(this.jPanel12, new AbsoluteConstraints(10, 20, 97, 103));
/*      */     
/* 2028 */     this.jPanel13.setBorder(BorderFactory.createTitledBorder("Đồ"));
/* 2029 */     this.jPanel13.setLayout((LayoutManager)new AbsoluteLayout());
/*      */     
/* 2031 */     this.buttonGroup4.add(this.jRadioButton6);
/* 2032 */     this.jRadioButton6.setSelected(true);
/* 2033 */     this.jRadioButton6.setText("Chia");
/* 2034 */     this.jPanel13.add(this.jRadioButton6, new AbsoluteConstraints(10, 20, -1, -1));
/*      */     
/* 2036 */     this.buttonGroup4.add(this.jRadioButton7);
/* 2037 */     this.jRadioButton7.setText("Không chia");
/* 2038 */     this.jPanel13.add(this.jRadioButton7, new AbsoluteConstraints(10, 60, -1, -1));
/*      */     
/* 2040 */     this.jPanel10.add(this.jPanel13, new AbsoluteConstraints(110, 20, 100, 103));
/*      */     
/* 2042 */     this.jPanel8.add(this.jPanel10, new AbsoluteConstraints(10, 10, 220, 130));
/*      */     
/* 2044 */     this.jPanel11.setBorder(BorderFactory.createTitledBorder("Thông tin thêm"));
/*      */     
/* 2046 */     this.jTextField8.setText("SnowZ");
/*      */     
/* 2048 */     this.jLabel44.setText("Tên nhóm");
/*      */     
/* 2050 */     this.jLabel45.setText("Loại");
/*      */     
/* 2052 */     this.buttonGroup6.add(this.jRadioButton1);
/* 2053 */     this.jRadioButton1.setSelected(true);
/* 2054 */     this.jRadioButton1.setText("Săn");
/* 2055 */     this.jRadioButton1.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/* 2057 */             Gui.this.jRadioButton1ActionPerformed(evt);
/*      */           }
/*      */         });
/*      */     
/* 2061 */     this.buttonGroup6.add(this.jRadioButton2);
/* 2062 */     this.jRadioButton2.setText("Nhiệm vụ");
/*      */     
/* 2064 */     this.jButton14.setText("Đăng ký");
/*      */     
/* 2066 */     this.jLabel46.setText("Giới hạn cấp độ");
/*      */     
/* 2068 */     this.jTextField9.setText("1");
/*      */     
/* 2070 */     this.jLabel47.setText("->");
/*      */     
/* 2072 */     this.jTextField10.setText("110");
/*      */     
/* 2074 */     this.jCheckBox5.setSelected(true);
/* 2075 */     this.jCheckBox5.setText("Gửi lời mời ngoài trưởng nhóm");
/*      */     
/* 2077 */     GroupLayout jPanel11Layout = new GroupLayout(this.jPanel11);
/* 2078 */     this.jPanel11.setLayout(jPanel11Layout);
/* 2079 */     jPanel11Layout.setHorizontalGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel11Layout.createSequentialGroup().addContainerGap().addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel11Layout.createSequentialGroup().addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.jLabel44, -1, -1, 32767).addComponent(this.jLabel45, -1, -1, 32767)).addGap(18, 18, 18).addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel11Layout.createSequentialGroup().addComponent(this.jRadioButton1).addGap(176, 176, 176).addComponent(this.jButton14)).addComponent(this.jTextField8, -2, 365, -2)).addGap(18, 18, 18)).addGroup(jPanel11Layout.createSequentialGroup().addComponent(this.jLabel46).addGap(18, 18, 18).addComponent(this.jTextField9, -2, 30, -2).addGap(18, 18, 18).addComponent(this.jLabel47).addGap(18, 18, 18).addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel11Layout.createSequentialGroup().addComponent(this.jRadioButton2).addGap(0, 0, 32767)).addGroup(jPanel11Layout.createSequentialGroup().addComponent(this.jTextField10, -2, 33, -2).addGap(31, 31, 31).addComponent(this.jCheckBox5, -1, -1, 32767))).addContainerGap()))));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2113 */     jPanel11Layout.setVerticalGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel11Layout.createSequentialGroup().addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jTextField8, -2, -1, -2).addComponent(this.jLabel44)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel45).addComponent(this.jRadioButton1).addComponent(this.jRadioButton2).addComponent(this.jButton14)).addGap(18, 18, 18).addGroup(jPanel11Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.jLabel46).addComponent(this.jTextField9, -2, -1, -2).addComponent(this.jLabel47).addComponent(this.jTextField10, -2, -1, -2).addComponent(this.jCheckBox5)).addGap(0, 8, 32767)));
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2135 */     this.jPanel8.add(this.jPanel11, new AbsoluteConstraints(240, 20, 470, 130));
/*      */     
/* 2137 */     this.jButton30.setText("Cập nhật");
/* 2138 */     this.jButton30.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/* 2140 */             Gui.this.jButton30ActionPerformed(evt);
/*      */           }
/*      */         });
/* 2143 */     this.jPanel8.add(this.jButton30, new AbsoluteConstraints(352, 490, 350, 50));
/*      */     
/* 2145 */     this.jButton31.setText("Gia nhập");
/* 2146 */     this.jButton31.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/* 2148 */             Gui.this.jButton31ActionPerformed(evt);
/*      */           }
/*      */         });
/* 2151 */     this.jPanel8.add(this.jButton31, new AbsoluteConstraints(10, 490, 340, 50));
/*      */     
/* 2153 */     jList12.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
/* 2154 */     jList12.setModel(model6);
/* 2155 */     this.jScrollPane12.setViewportView(jList12);
/*      */     
/* 2157 */     this.jPanel8.add(this.jScrollPane12, new AbsoluteConstraints(10, 154, 690, 320));
/*      */     
/* 2159 */     jLabel93.setText("Đang cập nhật");
/* 2160 */     this.jPanel8.add(jLabel93, new AbsoluteConstraints(60, 550, 240, -1));
/*      */     
/* 2162 */     jTextField18.setText("jTextField18");
/* 2163 */     this.jPanel8.add(jTextField18, new AbsoluteConstraints(310, 560, 380, -1));
/*      */     
/* 2165 */     this.jTabbedPane2.addTab("Danh sách nhóm", this.jPanel8);
/*      */     
/* 2167 */     GroupLayout jPanel3Layout = new GroupLayout(this.jPanel3);
/* 2168 */     this.jPanel3.setLayout(jPanel3Layout);
/* 2169 */     jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jTabbedPane2));
/*      */ 
/*      */ 
/*      */     
/* 2173 */     jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.jTabbedPane2, GroupLayout.Alignment.TRAILING));
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 2178 */     this.jTabbedPane1.addTab("Hỗ Trợ Nhóm", this.jPanel3);
/*      */     
/* 2180 */     this.jPanel29.setLayout((LayoutManager)new AbsoluteLayout());
/*      */     
/* 2182 */     this.jList13.setModel(ListAllSkillName);
/* 2183 */     this.jScrollPane13.setViewportView(this.jList13);
/*      */     
/* 2185 */     this.jPanel29.add(this.jScrollPane13, new AbsoluteConstraints(10, 40, 170, 570));
/*      */     
/* 2187 */     this.jLabel94.setFont(new Font("Tahoma", 1, 18));
/* 2188 */     this.jLabel94.setText("Danh sách kỹ năng");
/* 2189 */     this.jPanel29.add(this.jLabel94, new AbsoluteConstraints(10, 0, -1, 30));
/*      */     
/* 2191 */     this.jList14.setModel(ListSkillName);
/* 2192 */     this.jScrollPane14.setViewportView(this.jList14);
/*      */     
/* 2194 */     this.jPanel29.add(this.jScrollPane14, new AbsoluteConstraints(240, 40, 120, 240));
/*      */     
/* 2196 */     this.jLabel95.setFont(new Font("Tahoma", 1, 18));
/* 2197 */     this.jLabel95.setText("Kỹ năng buff");
/* 2198 */     this.jPanel29.add(this.jLabel95, new AbsoluteConstraints(240, 0, -1, 30));
/*      */     
/* 2200 */     this.jButton34.setText("->");
/* 2201 */     this.jButton34.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/* 2203 */             Gui.this.jButton34ActionPerformed(evt);
/*      */           }
/*      */         });
/* 2206 */     this.jPanel29.add(this.jButton34, new AbsoluteConstraints(180, 100, 60, 60));
/*      */     
/* 2208 */     this.jButton35.setText("Del");
/* 2209 */     this.jButton35.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/* 2211 */             Gui.this.jButton35ActionPerformed(evt);
/*      */           }
/*      */         });
/* 2214 */     this.jPanel29.add(this.jButton35, new AbsoluteConstraints(180, 170, 60, 60));
/*      */     
/* 2216 */     this.jPanel30.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)), "Hỗ trợ từng cá nhân"));
/* 2217 */     this.jPanel30.setLayout((LayoutManager)new AbsoluteLayout());
/*      */     
/* 2219 */     this.jButton38.setText("Add HS");
/* 2220 */     this.jButton38.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/* 2222 */             Gui.this.jButton38ActionPerformed(evt);
/*      */           }
/*      */         });
/* 2225 */     this.jPanel30.add(this.jButton38, new AbsoluteConstraints(20, 220, -1, 50));
/*      */     
/* 2227 */     this.jButton39.setText("Del HS");
/* 2228 */     this.jButton39.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/* 2230 */             Gui.this.jButton39ActionPerformed(evt);
/*      */           }
/*      */         });
/* 2233 */     this.jPanel30.add(this.jButton39, new AbsoluteConstraints(90, 220, 70, 50));
/*      */     
/* 2235 */     this.jList19.setModel(InfoBuffTarget);
/* 2236 */     this.jScrollPane19.setViewportView(this.jList19);
/*      */     
/* 2238 */     this.jPanel30.add(this.jScrollPane19, new AbsoluteConstraints(390, 50, 90, 150));
/*      */     
/* 2240 */     this.jComboBox1.setModel(SkillNameTarget);
/* 2241 */     this.jPanel30.add(this.jComboBox1, new AbsoluteConstraints(230, 50, 140, 30));
/*      */     
/* 2243 */     this.jButton40.setText("Thêm");
/* 2244 */     this.jButton40.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/* 2246 */             Gui.this.jButton40ActionPerformed(evt);
/*      */           }
/*      */         });
/* 2249 */     this.jPanel30.add(this.jButton40, new AbsoluteConstraints(230, 100, 140, 50));
/*      */     
/* 2251 */     this.jLabel99.setText("Skill");
/* 2252 */     this.jPanel30.add(this.jLabel99, new AbsoluteConstraints(290, 20, -1, -1));
/*      */     
/* 2254 */     this.jLabel100.setText("Danh sách skill buff");
/* 2255 */     this.jPanel30.add(this.jLabel100, new AbsoluteConstraints(390, 20, -1, -1));
/*      */     
/* 2257 */     this.jButton41.setText("Xóa");
/* 2258 */     this.jButton41.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/* 2260 */             Gui.this.jButton41ActionPerformed(evt);
/*      */           }
/*      */         });
/* 2263 */     this.jPanel30.add(this.jButton41, new AbsoluteConstraints(230, 150, 140, 50));
/*      */     
/* 2265 */     jCheckBox7.setSelected(true);
/* 2266 */     jCheckBox7.setText("Buff");
/* 2267 */     this.jPanel30.add(jCheckBox7, new AbsoluteConstraints(280, 270, -1, -1));
/*      */     
/* 2269 */     jCheckBox9.setSelected(true);
/* 2270 */     jCheckBox9.setText("Tự động chấp nhận hs");
/* 2271 */     this.jPanel30.add(jCheckBox9, new AbsoluteConstraints(340, 270, -1, -1));
/*      */     
/* 2273 */     this.jList21.setModel(PlayerList);
/* 2274 */     this.jScrollPane21.setViewportView(this.jList21);
/*      */     
/* 2276 */     this.jPanel30.add(this.jScrollPane21, new AbsoluteConstraints(20, 50, 140, 150));
/*      */     
/* 2278 */     this.jLabel103.setText("Name");
/* 2279 */     this.jPanel30.add(this.jLabel103, new AbsoluteConstraints(40, 20, -1, -1));
/*      */     
/* 2281 */     this.jPanel29.add(this.jPanel30, new AbsoluteConstraints(200, 300, 500, 310));
/*      */     
/* 2283 */     this.jButton36.setText("Start");
/* 2284 */     this.jButton36.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/* 2286 */             Gui.this.jButton36ActionPerformed(evt);
/*      */           }
/*      */         });
/* 2289 */     this.jPanel29.add(this.jButton36, new AbsoluteConstraints(630, 10, 80, 80));
/*      */     
/* 2291 */     this.jButton37.setLabel("Stop");
/* 2292 */     this.jButton37.setVisible(false);
/* 2293 */     this.jButton37.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/* 2295 */             Gui.this.jButton37ActionPerformed(evt);
/*      */           }
/*      */         });
/* 2298 */     this.jPanel29.add(this.jButton37, new AbsoluteConstraints(540, 10, 80, 80));
/*      */     
/* 2300 */     jCheckBox8.setSelected(true);
/* 2301 */     jCheckBox8.setText("Buff");
/* 2302 */     this.jPanel29.add(jCheckBox8, new AbsoluteConstraints(370, 40, -1, -1));
/*      */     
/* 2304 */     this.jPanel32.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(new Color(0, 51, 255)), "Hỗ trợ hồi sinh", 0, 0, new Font("Tahoma", 0, 11), new Color(0, 51, 255)));
/* 2305 */     this.jPanel32.setLayout((LayoutManager)new AbsoluteLayout());
/*      */     
/* 2307 */     this.jButton8.setText("Lấy skill hs");
/* 2308 */     this.jButton8.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/* 2310 */             Gui.this.jButton8ActionPerformed(evt);
/*      */           }
/*      */         });
/* 2313 */     this.jPanel32.add(this.jButton8, new AbsoluteConstraints(10, 20, 130, 30));
/*      */     
/* 2315 */     this.jComboBox3.setModel(ReviveSkill);
/* 2316 */     this.jPanel32.add(this.jComboBox3, new AbsoluteConstraints(150, 20, 160, 30));
/*      */     
/* 2318 */     this.jList15.setModel(NameTarget);
/* 2319 */     this.jScrollPane15.setViewportView(this.jList15);
/*      */     
/* 2321 */     this.jPanel32.add(this.jScrollPane15, new AbsoluteConstraints(20, 80, 100, 70));
/*      */     
/* 2323 */     this.jList16.setModel(Status);
/* 2324 */     this.jScrollPane16.setViewportView(this.jList16);
/*      */     
/* 2326 */     this.jPanel32.add(this.jScrollPane16, new AbsoluteConstraints(130, 80, 80, 70));
/*      */     
/* 2328 */     this.jLabel96.setText("Người được hs");
/* 2329 */     this.jPanel32.add(this.jLabel96, new AbsoluteConstraints(40, 60, -1, -1));
/*      */     
/* 2331 */     this.jLabel97.setText("Tình trạng");
/* 2332 */     this.jPanel32.add(this.jLabel97, new AbsoluteConstraints(140, 60, -1, -1));
/*      */     
/* 2334 */     jCheckBox10.setText("Hồi sinh");
/* 2335 */     this.jPanel32.add(jCheckBox10, new AbsoluteConstraints(210, 160, -1, -1));
/*      */     
/* 2337 */     this.jButton9.setText("Xác nhận skill");
/* 2338 */     this.jButton9.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/* 2340 */             Gui.this.jButton9ActionPerformed(evt);
/*      */           }
/*      */         });
/* 2343 */     this.jPanel32.add(this.jButton9, new AbsoluteConstraints(220, 80, -1, 30));
/*      */     
/* 2345 */     this.jTextField21.setEnabled(false);
/* 2346 */     this.jPanel32.add(this.jTextField21, new AbsoluteConstraints(220, 120, 100, -1));
/*      */     
/* 2348 */     this.jButton11.setText("Reset");
/* 2349 */     this.jButton11.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/* 2351 */             Gui.this.jButton11ActionPerformed(evt);
/*      */           }
/*      */         });
/* 2354 */     this.jPanel32.add(this.jButton11, new AbsoluteConstraints(20, 160, 100, -1));
/*      */     
/* 2356 */     this.jPanel29.add(this.jPanel32, new AbsoluteConstraints(370, 100, 330, 200));
/*      */     
/* 2358 */     this.jTabbedPane1.addTab("Buff Complete", this.jPanel29);
/*      */     
/* 2360 */     this.jPanel1.setLayout((LayoutManager)new AbsoluteLayout());
/*      */     
/* 2362 */     this.jPanel31.setLayout((LayoutManager)new AbsoluteLayout());
/*      */     
/* 2364 */     this.jList1.setModel(ListAllSkillName);
/* 2365 */     this.jScrollPane1.setViewportView(this.jList1);
/*      */     
/* 2367 */     this.jPanel31.add(this.jScrollPane1, new AbsoluteConstraints(20, 40, 130, 240));
/*      */     
/* 2369 */     this.jLabel1.setText("Kỹ năng");
/* 2370 */     this.jPanel31.add(this.jLabel1, new AbsoluteConstraints(60, 20, -1, -1));
/*      */     
/* 2372 */     this.jComboBox2.setModel(SkillLureModel);
/* 2373 */     this.jPanel31.add(this.jComboBox2, new AbsoluteConstraints(160, 40, 200, -1));
/*      */     
/* 2375 */     this.jButton3.setText("Add skill");
/* 2376 */     this.jButton3.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/* 2378 */             Gui.this.jButton3ActionPerformed(evt);
/*      */           }
/*      */         });
/* 2381 */     this.jPanel31.add(this.jButton3, new AbsoluteConstraints(20, 280, 130, 50));
/*      */     
/* 2383 */     this.jButton1.setText("Start");
/* 2384 */     this.jButton1.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/* 2386 */             Gui.this.jButton1ActionPerformed(evt);
/*      */           }
/*      */         });
/* 2389 */     this.jPanel31.add(this.jButton1, new AbsoluteConstraints(650, 10, -1, 60));
/*      */     
/* 2391 */     this.jButton2.setText("Stop");
/* 2392 */     this.jButton2.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/* 2394 */             Gui.this.jButton2ActionPerformed(evt);
/*      */           }
/*      */         });
/* 2397 */     this.jPanel31.add(this.jButton2, new AbsoluteConstraints(590, 10, 60, 60));
/*      */     
/* 2399 */     jTextField1.setText("0");
/* 2400 */     this.jPanel31.add(jTextField1, new AbsoluteConstraints(260, 280, 70, -1));
/*      */     
/* 2402 */     jTextField2.setText("0");
/* 2403 */     this.jPanel31.add(jTextField2, new AbsoluteConstraints(260, 310, 70, -1));
/*      */     
/* 2405 */     this.jTextField3.setText("10");
/* 2406 */     this.jPanel31.add(this.jTextField3, new AbsoluteConstraints(260, 340, 70, -1));
/*      */     
/* 2408 */     this.jLabel2.setText("X");
/* 2409 */     this.jPanel31.add(this.jLabel2, new AbsoluteConstraints(170, 280, 90, 20));
/*      */     
/* 2411 */     this.jLabel3.setText("Y");
/* 2412 */     this.jPanel31.add(this.jLabel3, new AbsoluteConstraints(170, 310, 90, 20));
/*      */     
/* 2414 */     this.jLabel110.setText("Bán kính Farm");
/* 2415 */     this.jPanel31.add(this.jLabel110, new AbsoluteConstraints(170, 340, 90, 20));
/*      */     
/* 2417 */     this.jList2.setModel(NameMonsterList);
/* 2418 */     this.jScrollPane2.setViewportView(this.jList2);
/*      */     
/* 2420 */     this.jPanel31.add(this.jScrollPane2, new AbsoluteConstraints(10, 460, 80, 100));
/*      */     
/* 2422 */     this.jList3.setModel(IDMonsterList);
/* 2423 */     this.jScrollPane3.setViewportView(this.jList3);
/*      */     
/* 2425 */     this.jPanel31.add(this.jScrollPane3, new AbsoluteConstraints(90, 460, 60, 100));
/*      */     
/* 2427 */     this.jList6.setModel(DistanceMonsterList);
/* 2428 */     this.jScrollPane5.setViewportView(this.jList6);
/*      */     
/* 2430 */     this.jPanel31.add(this.jScrollPane5, new AbsoluteConstraints(580, 460, 60, 100));
/*      */     
/* 2432 */     this.jLabel113.setText("ID Monster");
/* 2433 */     this.jPanel31.add(this.jLabel113, new AbsoluteConstraints(90, 430, -1, -1));
/*      */     
/* 2435 */     this.jLabel114.setText("Tên");
/* 2436 */     this.jPanel31.add(this.jLabel114, new AbsoluteConstraints(40, 430, -1, -1));
/*      */     
/* 2438 */     this.jLabel115.setText("Khoảng cách");
/* 2439 */     this.jPanel31.add(this.jLabel115, new AbsoluteConstraints(580, 430, -1, -1));
/*      */     
/* 2441 */     this.jList4.setModel(TypeMonsterList);
/* 2442 */     this.jScrollPane4.setViewportView(this.jList4);
/*      */     
/* 2444 */     this.jPanel31.add(this.jScrollPane4, new AbsoluteConstraints(150, 460, 70, 100));
/*      */     
/* 2446 */     this.jLabel116.setText("Loại");
/* 2447 */     this.jPanel31.add(this.jLabel116, new AbsoluteConstraints(170, 430, -1, -1));
/*      */     
/* 2449 */     this.jButton4.setText("Xác nhận");
/* 2450 */     this.jButton4.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/* 2452 */             Gui.this.jButton4ActionPerformed(evt);
/*      */           }
/*      */         });
/* 2455 */     this.jPanel31.add(this.jButton4, new AbsoluteConstraints(340, 280, -1, 110));
/*      */     
/* 2457 */     this.jList27.setModel(LvMonsterList);
/* 2458 */     this.jScrollPane27.setViewportView(this.jList27);
/*      */     
/* 2460 */     this.jPanel31.add(this.jScrollPane27, new AbsoluteConstraints(420, 460, 40, 100));
/*      */     
/* 2462 */     this.jList28.setModel(MaxHPMonsterList);
/* 2463 */     this.jScrollPane28.setViewportView(this.jList28);
/*      */     
/* 2465 */     this.jPanel31.add(this.jScrollPane28, new AbsoluteConstraints(320, 460, 100, 100));
/*      */     
/* 2467 */     this.jLabel117.setText("Max HP");
/* 2468 */     this.jPanel31.add(this.jLabel117, new AbsoluteConstraints(350, 430, -1, -1));
/*      */     
/* 2470 */     this.jLabel118.setText("LV");
/* 2471 */     this.jPanel31.add(this.jLabel118, new AbsoluteConstraints(430, 430, -1, -1));
/*      */     
/* 2473 */     this.jList29.setModel(MonsterXList);
/* 2474 */     this.jScrollPane29.setViewportView(this.jList29);
/*      */     
/* 2476 */     this.jPanel31.add(this.jScrollPane29, new AbsoluteConstraints(460, 460, 60, 100));
/*      */     
/* 2478 */     this.jList30.setModel(MonsterYList);
/* 2479 */     this.jScrollPane30.setViewportView(this.jList30);
/*      */     
/* 2481 */     this.jPanel31.add(this.jScrollPane30, new AbsoluteConstraints(520, 460, 60, 100));
/*      */     
/* 2483 */     this.jLabel119.setText("X");
/* 2484 */     this.jPanel31.add(this.jLabel119, new AbsoluteConstraints(490, 430, -1, -1));
/*      */     
/* 2486 */     this.jLabel120.setText("Y");
/* 2487 */     this.jPanel31.add(this.jLabel120, new AbsoluteConstraints(550, 430, -1, -1));
/*      */     
/* 2489 */     this.jList31.setModel(CurrentHPMonsterList);
/* 2490 */     this.jScrollPane31.setViewportView(this.jList31);
/*      */     
/* 2492 */     this.jPanel31.add(this.jScrollPane31, new AbsoluteConstraints(220, 460, 100, 100));
/*      */     
/* 2494 */     this.jLabel121.setText("Current HP");
/* 2495 */     this.jPanel31.add(this.jLabel121, new AbsoluteConstraints(240, 430, -1, -1));
/*      */     
/* 2497 */     this.jList32.setModel(IDSkillLureList);
/* 2498 */     this.jScrollPane32.setViewportView(this.jList32);
/*      */     
/* 2500 */     this.jPanel31.add(this.jScrollPane32, new AbsoluteConstraints(160, 100, 110, 60));
/*      */     
/* 2502 */     this.jList33.setModel(DelaySkillLureList);
/* 2503 */     this.jScrollPane33.setViewportView(this.jList33);
/*      */     
/* 2505 */     this.jPanel31.add(this.jScrollPane33, new AbsoluteConstraints(270, 100, 90, 60));
/*      */     
/* 2507 */     this.jLabel111.setText("ID Skill");
/* 2508 */     this.jPanel31.add(this.jLabel111, new AbsoluteConstraints(200, 70, -1, -1));
/*      */     
/* 2510 */     this.jLabel112.setText("Delay Max");
/* 2511 */     this.jPanel31.add(this.jLabel112, new AbsoluteConstraints(290, 70, -1, -1));
/*      */     
/* 2513 */     this.jList34.setModel(LocationLureList);
/* 2514 */     this.jScrollPane34.setViewportView(this.jList34);
/*      */     
/* 2516 */     this.jPanel31.add(this.jScrollPane34, new AbsoluteConstraints(430, 220, 80, 170));
/*      */     
/* 2518 */     this.jButton5.setText("Thêm vị trí");
/* 2519 */     this.jButton5.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/* 2521 */             Gui.this.jButton5ActionPerformed(evt);
/*      */           }
/*      */         });
/* 2524 */     this.jPanel31.add(this.jButton5, new AbsoluteConstraints(240, 230, -1, -1));
/* 2525 */     this.jPanel31.add(this.jTextField4, new AbsoluteConstraints(200, 200, 80, -1));
/* 2526 */     this.jPanel31.add(this.jTextField6, new AbsoluteConstraints(290, 200, 90, -1));
/*      */     
/* 2528 */     this.jLabel122.setText("Vị Trí");
/* 2529 */     this.jPanel31.add(this.jLabel122, new AbsoluteConstraints(460, 200, -1, -1));
/*      */     
/* 2531 */     this.jLabel123.setText("Số mob");
/* 2532 */     this.jPanel31.add(this.jLabel123, new AbsoluteConstraints(170, 370, 70, 20));
/*      */     
/* 2534 */     this.jTextField20.setText("5");
/* 2535 */     this.jPanel31.add(this.jTextField20, new AbsoluteConstraints(260, 370, 70, -1));
/*      */     
/* 2537 */     this.jList61.setModel(ActionLureList);
/* 2538 */     this.jScrollPane61.setViewportView(this.jList61);
/*      */     
/* 2540 */     this.jPanel31.add(this.jScrollPane61, new AbsoluteConstraints(430, 90, 130, 110));
/*      */     
/* 2542 */     this.jLabel126.setText("Action List");
/* 2543 */     this.jPanel31.add(this.jLabel126, new AbsoluteConstraints(470, 70, 60, -1));
/*      */     
/* 2545 */     this.jList62.setModel(TimeActionLureList);
/* 2546 */     this.jScrollPane62.setViewportView(this.jList62);
/*      */     
/* 2548 */     this.jPanel31.add(this.jScrollPane62, new AbsoluteConstraints(570, 90, 60, 110));
/*      */     
/* 2550 */     this.jLabel127.setText("Place");
/* 2551 */     this.jPanel31.add(this.jLabel127, new AbsoluteConstraints(590, 70, -1, -1));
/*      */     
/* 2553 */     this.jList35.setModel(DataWalkingList);
/* 2554 */     this.jScrollPane35.setViewportView(this.jList35);
/*      */     
/* 2556 */     this.jPanel31.add(this.jScrollPane35, new AbsoluteConstraints(520, 220, 180, 170));
/*      */     
/* 2558 */     this.jLabel128.setText("Data Walking");
/* 2559 */     this.jPanel31.add(this.jLabel128, new AbsoluteConstraints(580, 200, -1, -1));
/*      */     
/* 2561 */     this.jList60.setModel(TimeLeftSkillLureList);
/* 2562 */     this.jScrollPane60.setViewportView(this.jList60);
/*      */     
/* 2564 */     this.jPanel31.add(this.jScrollPane60, new AbsoluteConstraints(360, 100, 60, 60));
/*      */     
/* 2566 */     this.jLabel124.setText("Delay");
/* 2567 */     this.jPanel31.add(this.jLabel124, new AbsoluteConstraints(370, 70, -1, -1));
/*      */     
/* 2569 */     this.jButton6.setText("Đi về vị trí farm");
/* 2570 */     this.jButton6.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/* 2572 */             Gui.this.jButton6ActionPerformed(evt);
/*      */           }
/*      */         });
/* 2575 */     this.jPanel31.add(this.jButton6, new AbsoluteConstraints(20, 340, 130, 40));
/*      */     
/* 2577 */     this.jButton7.setText("Dừng");
/* 2578 */     this.jButton7.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/* 2580 */             Gui.this.jButton7ActionPerformed(evt);
/*      */           }
/*      */         });
/* 2583 */     this.jPanel31.add(this.jButton7, new AbsoluteConstraints(20, 380, 130, 40));
/*      */     
/* 2585 */     this.jButton10.setText("RemoveAll");
/* 2586 */     this.jButton10.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/* 2588 */             Gui.this.jButton10ActionPerformed(evt);
/*      */           }
/*      */         });
/* 2591 */     this.jPanel31.add(this.jButton10, new AbsoluteConstraints(460, 30, -1, -1));
/*      */     
/* 2593 */     this.jTabbedPane4.addTab("Tank + Lure", this.jPanel31);
/*      */     
/* 2595 */     this.jPanel1.add(this.jTabbedPane4, new AbsoluteConstraints(0, 0, 720, 620));
/*      */     
/* 2597 */     this.jTabbedPane1.addTab("Farming", this.jPanel1);
/*      */     
/* 2599 */     getContentPane().add(this.jTabbedPane1, new AbsoluteConstraints(0, 1, 720, 650));
/*      */     
/* 2601 */     pack();
/*      */   }
/*      */   private JPanel jPanel5; private JPanel jPanel6; private JPanel jPanel7; private JPanel jPanel8; private JPanel jPanel9; private JProgressBar jProgressBar1; private JProgressBar jProgressBar2; private JProgressBar jProgressBar3; private JProgressBar jProgressBar4; private JProgressBar jProgressBar5; private JProgressBar jProgressBar6; private JProgressBar jProgressBar7; private JProgressBar jProgressBar8; private JRadioButton jRadioButton1; private JRadioButton jRadioButton10; public static JRadioButton jRadioButton11; private JRadioButton jRadioButton12; private JRadioButton jRadioButton2; public static JRadioButton jRadioButton3; private JRadioButton jRadioButton4; private JRadioButton jRadioButton5; private JRadioButton jRadioButton6; private JRadioButton jRadioButton7; private JRadioButton jRadioButton8; public static JRadioButton jRadioButton9; private JScrollPane jScrollPane1; private JScrollPane jScrollPane10; private JScrollPane jScrollPane11; private JScrollPane jScrollPane12; private JScrollPane jScrollPane13; private JScrollPane jScrollPane14; private JScrollPane jScrollPane15; private JScrollPane jScrollPane16; private JScrollPane jScrollPane17; private JScrollPane jScrollPane19; private JScrollPane jScrollPane2; private JScrollPane jScrollPane20; private JScrollPane jScrollPane21; private JScrollPane jScrollPane27; private JScrollPane jScrollPane28; private JScrollPane jScrollPane29; private JScrollPane jScrollPane3; private JScrollPane jScrollPane30; private JScrollPane jScrollPane31; private JScrollPane jScrollPane32; private JScrollPane jScrollPane33; private JScrollPane jScrollPane34; private JScrollPane jScrollPane35; private JScrollPane jScrollPane36; private JScrollPane jScrollPane37; private JScrollPane jScrollPane38; private JScrollPane jScrollPane39; private JScrollPane jScrollPane4; private JScrollPane jScrollPane40; private JScrollPane jScrollPane41; private JScrollPane jScrollPane42; private JScrollPane jScrollPane43; private JScrollPane jScrollPane44; private JScrollPane jScrollPane45; private JScrollPane jScrollPane46; private JScrollPane jScrollPane47; private JScrollPane jScrollPane48; private JScrollPane jScrollPane49; private JScrollPane jScrollPane5; private JScrollPane jScrollPane50; private JScrollPane jScrollPane51; private JScrollPane jScrollPane52; private JScrollPane jScrollPane53; private JScrollPane jScrollPane54; private JScrollPane jScrollPane55; private JScrollPane jScrollPane56; private JScrollPane jScrollPane57; private JScrollPane jScrollPane58; private JScrollPane jScrollPane59; private JScrollPane jScrollPane6; private JScrollPane jScrollPane60; private JScrollPane jScrollPane61; private JScrollPane jScrollPane62; private JScrollPane jScrollPane7; private JScrollPane jScrollPane8; private JScrollPane jScrollPane9; private JTabbedPane jTabbedPane1; private JTabbedPane jTabbedPane2; private JTabbedPane jTabbedPane3; private JTabbedPane jTabbedPane4; public static JTextField jTextField1; private JTextField jTextField10; private JTextField jTextField11; private JTextField jTextField12; private JTextField jTextField13; private JTextField jTextField14; public static JTextField jTextField15; public static JTextField jTextField16; public static JTextField jTextField17; public static JTextField jTextField18; public static JTextField jTextField2; private JTextField jTextField20; private JTextField jTextField21; private JTextField jTextField3; private JTextField jTextField4; public static JTextField jTextField5; private JTextField jTextField6; private JTextField jTextField8;
/*      */   private JTextField jTextField9;
/*      */   
/*      */   private void jButton12ActionPerformed(ActionEvent evt) {
/* 2607 */     Button.FollowUpdate(jTextField5.getText(), PlayerList, IDList);
/* 2608 */     Follow = new Timer(1200, new ActionListener() {
/*      */           public void actionPerformed(ActionEvent e) {
/* 2610 */             if (!SroBot.IDFollow.equals("noID")) {
/* 2611 */               Walking.CastFollow(SroBot.IDFollow);
/*      */             }
/*      */           }
/*      */         });
/*      */ 
/*      */     
/* 2617 */     Follow.start();
/* 2618 */     FollowCheck = true;
/*      */   }
/*      */ 
/*      */   
/*      */   private void jButton13ActionPerformed(ActionEvent evt) {
/* 2623 */     Follow.stop();
/* 2624 */     FollowCheck = false;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void jRadioButton1ActionPerformed(ActionEvent evt) {}
/*      */ 
/*      */ 
/*      */   
/*      */   private void jRadioButton3ActionPerformed(ActionEvent evt) {}
/*      */ 
/*      */   
/*      */   private void jButton29ActionPerformed(ActionEvent evt) {
/* 2637 */     Button.jButton29();
/*      */   }
/*      */ 
/*      */   
/*      */   private void jButton30ActionPerformed(ActionEvent evt) {
/* 2642 */     Party.PartyInfoRequest();
/*      */   }
/*      */ 
/*      */   
/*      */   private void jButton31ActionPerformed(ActionEvent evt) {
/* 2647 */     Button.jButton31();
/*      */   }
/*      */ 
/*      */   
/*      */   private void jButton34ActionPerformed(ActionEvent evt) {
/* 2652 */     int i = SroBot.go.jList13.getSelectedIndex();
/* 2653 */     Button.AddSkillBuff(SroBot.skilllist[i], ListSkillName, SkillNameTarget, IDSkillNoTarget, IDPlayerNoTarget, TimeMaxNoTarget, TimeLeftNoTarget, ListIDSkillNoTarget);
/*      */   }
/*      */ 
/*      */   
/*      */   private void jButton40ActionPerformed(ActionEvent evt) {
/* 2658 */     if (this.jList21.getSelectedValue() != null) {
/* 2659 */       int i = this.jList21.getSelectedIndex();
/* 2660 */       String ID = (new StringBuilder()).append(IDList.getElementAt(i)).append("").toString();
/* 2661 */       InfoBuffTarget.addElement(this.jComboBox1.getSelectedItem() + "," + ID + "," + this.jList21.getSelectedValue());
/* 2662 */       String name = (new StringBuilder()).append(this.jList21.getSelectedValue()).append("").toString();
/* 2663 */       int MaxIndexSkill = ListAllSkillName.getSize();
/* 2664 */       String SkillData = Skill.SkillSearch(SroBot.skilllist, MaxIndexSkill, this.jComboBox1.getSelectedItem() + "");
/* 2665 */       Buffing.AddSkillBuff(SkillData, ID, IDSkillTarget, IDPlayerTarget, TimeMaxTarget, TimeLeftTarget, ListIDSkillTarget);
/* 2666 */       NamePlayerTarget.addElement(name);
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   private void jButton35ActionPerformed(ActionEvent evt) {
/* 2672 */     String SkillName = (new StringBuilder()).append(this.jList14.getSelectedValue()).append("").toString();
/* 2673 */     String SkillData = Skill.SkillSearch(SroBot.skilllist, ListAllSkillName.getSize(), SkillName);
/* 2674 */     Button.RemoveSkillBuff(false, SkillData, SroBot.ID, IDSkillNoTarget, IDPlayerNoTarget, NamePlayerTarget, TimeMaxNoTarget, TimeLeftNoTarget, ListIDSkillNoTarget);
/* 2675 */     ListSkillName.removeElement(SkillName);
/*      */   }
/*      */ 
/*      */   
/*      */   private void jButton41ActionPerformed(ActionEvent evt) {
/* 2680 */     String Data = (new StringBuilder()).append(this.jList19.getSelectedValue()).append("").toString();
/* 2681 */     int index = this.jList19.getSelectedIndex();
/* 2682 */     int Mark = Data.length();
/* 2683 */     Scanner scanner = new Scanner(Data);
/* 2684 */     scanner.useDelimiter(",");
/* 2685 */     String SkillName = scanner.next();
/* 2686 */     String IDPlayer = scanner.next();
/* 2687 */     String name = scanner.next();
/* 2688 */     scanner.close();
/* 2689 */     scanner = null;
/* 2690 */     String SkillData = Skill.SkillSearch(SroBot.skilllist, ListAllSkillName.getSize(), SkillName);
/* 2691 */     Button.RemoveSkillBuff(true, SkillData, name, IDSkillTarget, IDPlayerTarget, NamePlayerTarget, TimeMaxTarget, TimeLeftTarget, ListIDSkillTarget);
/* 2692 */     InfoBuffTarget.removeElementAt(index);
/*      */   }
/*      */ 
/*      */   
/*      */   private void jButton36ActionPerformed(ActionEvent evt) {
/* 2697 */     this.jButton37.setVisible(true);
/* 2698 */     this.jButton36.setVisible(false);
/* 2699 */     Buff = new Timer(800, new ActionListener() {
/*      */           public void actionPerformed(ActionEvent e) {
/* 2701 */             Buffing.buffing(Gui.jCheckBox6, SroBot.Walking[0], false, Gui.IDSkillNoTarget, Gui.IDPlayerNoTarget, Gui.TimeMaxNoTarget, Gui.TimeLeftNoTarget, Gui.ListIDSkillNoTarget);
/* 2702 */             Buffing.buffing(Gui.jCheckBox7, SroBot.Walking[0], true, Gui.IDSkillTarget, Gui.IDPlayerTarget, Gui.TimeMaxTarget, Gui.TimeLeftTarget, Gui.ListIDSkillTarget);
/*      */           }
/*      */         });
/* 2705 */     Buff.start();
/* 2706 */     if (jCheckBox10.isSelected()) {
/* 2707 */       Revive = new Timer(3000, new ActionListener() {
/*      */             public void actionPerformed(ActionEvent e) {
/* 2709 */               Buffing.Revive(Gui.IDReviveSkill, Gui.IDTarget, Gui.Status);
/*      */             }
/*      */           });
/* 2712 */       Revive.start();
/* 2713 */       ReviveCheck = true;
/*      */     } 
/* 2715 */     BuffCheck = true;
/*      */   }
/*      */ 
/*      */   
/*      */   private void jButton37ActionPerformed(ActionEvent evt) {
/* 2720 */     Buff.stop();
/* 2721 */     Buff = null;
/* 2722 */     if (ReviveCheck) {
/* 2723 */       Revive.stop();
/* 2724 */       Revive = null;
/* 2725 */       ReviveCheck = false;
/*      */     } 
/* 2727 */     this.jButton36.setVisible(true);
/* 2728 */     this.jButton37.setVisible(false);
/* 2729 */     BuffCheck = false;
/*      */   }
/*      */ 
/*      */   
/*      */   private void jButton4ActionPerformed(ActionEvent evt) {
/* 2734 */     SroBot.farmX[0] = SroBot.myX[0];
/* 2735 */     jTextField1.setText(SroBot.farmX[0] + "");
/* 2736 */     SroBot.farmY[0] = SroBot.myY[0];
/* 2737 */     jTextField2.setText(SroBot.farmY[0] + "");
/* 2738 */     FarmLocationWalkingData = SroBot.WalkingData[0];
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void jButton3ActionPerformed(ActionEvent evt) {
/* 2744 */     String skill = Skill.SkillSearch(SroBot.skilllist, SroBot.SkillLine[0], (new StringBuilder()).append(this.jList1.getSelectedValue()).append("").toString());
/* 2745 */     SkillLureModel.addElement(SROScanner.GetStringAt(2, skill));
/* 2746 */     IDSkillLureList.addElement(SROScanner.GetStringAt(0, skill));
/* 2747 */     DelaySkillLureList.addElement(SROScanner.GetStringAt(8, skill));
/* 2748 */     TimeLeftSkillLureList.addElement(Integer.valueOf(0));
/*      */   }
/*      */ 
/*      */   
/*      */   private void jButton5ActionPerformed(ActionEvent evt) {
/* 2753 */     int index = this.jComboBox2.getSelectedIndex();
/* 2754 */     int size = TimeActionLureList.getSize();
/* 2755 */     ActionLureList.addElement("0104" + IDSkillLureList.getElementAt(index) + "00");
/* 2756 */     TimeActionLureList.addElement(Integer.valueOf(size / 2));
/* 2757 */     ActionLureList.addElement(SroBot.WalkingData[0]);
/* 2758 */     TimeActionLureList.addElement(Integer.valueOf(size / 2 + 1));
/* 2759 */     ActionLureList.addElement("0104" + IDSkillLureList.getElementAt(index) + "00");
/* 2760 */     TimeActionLureList.addElement(Integer.valueOf(size / 2 + 1));
/* 2761 */     ActionLureList.addElement(FarmLocationWalkingData);
/* 2762 */     TimeActionLureList.addElement(Integer.valueOf(size / 2 + 2));
/* 2763 */     this.jTextField4.setText(SroBot.myX[0] + "");
/* 2764 */     this.jTextField6.setText(SroBot.myY[0] + "");
/* 2765 */     LocationLureList.addElement("X: " + this.jTextField4.getText() + " Y: " + this.jTextField6.getText() + " " + this.jComboBox2.getSelectedItem());
/* 2766 */     DataWalkingList.addElement(SroBot.WalkingData[0]);
/* 2767 */     size = TimeActionLureList.getSize();
/* 2768 */     SizeMax = Integer.parseInt((new StringBuilder()).append(TimeActionLureList.getElementAt(size - 1)).append("").toString());
/*      */   }
/*      */ 
/*      */   
/*      */   private void jButton1ActionPerformed(ActionEvent evt) {
/* 2773 */     this.jButton2.setVisible(true);
/* 2774 */     this.jButton1.setVisible(false);
/* 2775 */     Lure = new Timer(1500, new ActionListener() {
/*      */           public void actionPerformed(ActionEvent e) {
/* 2777 */             int i = Gui.this.jComboBox2.getSelectedIndex();
/* 2778 */             Monster.DoActionLure(Integer.parseInt((new StringBuilder()).append(Gui.TimeLeftSkillLureList.getElementAt(i)).append("").toString()), Gui.ActionLureList, Gui.TimeActionLureList);
/* 2779 */             if (Integer.parseInt((new StringBuilder()).append(Gui.TimeLeftSkillLureList.getElementAt(i)).append("").toString()) == 0) {
/* 2780 */               for (int j = 0; j < Gui.TimeActionLureList.getSize(); j++) {
/* 2781 */                 if (Integer.parseInt((new StringBuilder()).append(Gui.TimeActionLureList.getElementAt(j)).append("").toString()) == 0) {
/* 2782 */                   Gui.TimeActionLureList.setElementAt(Integer.valueOf(Gui.SizeMax), j);
/*      */                 } else {
/* 2784 */                   Gui.TimeActionLureList.setElementAt(Integer.valueOf(Integer.parseInt((new StringBuilder()).append(Gui.TimeActionLureList.getElementAt(j)).append("").toString()) - 1), j);
/*      */                 } 
/*      */               } 
/* 2787 */               Gui.TimeLeftSkillLureList.setElementAt(Integer.valueOf(Integer.parseInt((new StringBuilder()).append(Gui.DelaySkillLureList.getElementAt(i)).append("").toString())), i);
/*      */             } 
/* 2789 */             if (Integer.parseInt((new StringBuilder()).append(Gui.TimeLeftSkillLureList.getElementAt(i)).append("").toString()) < 1501) {
/* 2790 */               Gui.TimeLeftSkillLureList.setElementAt(Integer.valueOf(0), i);
/*      */             } else {
/* 2792 */               Gui.TimeLeftSkillLureList.setElementAt(Integer.valueOf(Integer.parseInt((new StringBuilder()).append(Gui.TimeLeftSkillLureList.getElementAt(i)).append("").toString()) - 1500), i);
/*      */             } 
/*      */           }
/*      */         });
/* 2796 */     Lure.start();
/* 2797 */     LureCheck = true;
/*      */   }
/*      */ 
/*      */   
/*      */   private void jButton2ActionPerformed(ActionEvent evt) {
/* 2802 */     this.jButton2.setVisible(false);
/* 2803 */     this.jButton1.setVisible(true);
/* 2804 */     Lure.stop();
/* 2805 */     Lure = null;
/* 2806 */     LureCheck = false;
/*      */   }
/*      */ 
/*      */   
/*      */   private void jButton6ActionPerformed(ActionEvent evt) {
/* 2811 */     this.jButton7.setVisible(true);
/* 2812 */     this.jButton6.setVisible(false);
/* 2813 */     ComeBack = new Timer(3000, new ActionListener() {
/*      */           public void actionPerformed(ActionEvent e) {
/* 2815 */             InjectPacket.Injectpacket("7021", Gui.FarmLocationWalkingData, true, false);
/*      */           }
/*      */         });
/* 2818 */     ComeBack.start();
/* 2819 */     ComeBackCheck = true;
/*      */   }
/*      */ 
/*      */   
/*      */   private void jButton7ActionPerformed(ActionEvent evt) {
/* 2824 */     this.jButton7.setVisible(false);
/* 2825 */     this.jButton6.setVisible(true);
/* 2826 */     ComeBack.stop();
/* 2827 */     ComeBack = null;
/* 2828 */     ComeBackCheck = false;
/*      */   }
/*      */ 
/*      */   
/*      */   private void jButton8ActionPerformed(ActionEvent evt) {
/* 2833 */     int i = ListAllSkillName.getSize();
/* 2834 */     ReviveSkill.removeAllElements();
/* 2835 */     for (int j = 0; j < i - 1; j++) {
/* 2836 */       if (SROScanner.GetStringAt(6, SroBot.skilllist[j]).equals("1")) {
/* 2837 */         ReviveSkill.addElement(SROScanner.GetStringAt(2, SroBot.skilllist[j]));
/* 2838 */         IDReviveSkillList.addElement(SROScanner.GetStringAt(0, SroBot.skilllist[j]));
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   private void jButton9ActionPerformed(ActionEvent evt) {
/* 2845 */     int i = this.jComboBox3.getSelectedIndex();
/* 2846 */     IDReviveSkill = (new StringBuilder()).append(IDReviveSkillList.getElementAt(i)).append("").toString();
/* 2847 */     this.jTextField21.setText(IDReviveSkill);
/*      */   }
/*      */ 
/*      */   
/*      */   private void jButton10ActionPerformed(ActionEvent evt) {
/* 2852 */     ActionLureList.removeAllElements();
/* 2853 */     TimeActionLureList.removeAllElements();
/*      */   }
/*      */ 
/*      */   
/*      */   private void jButton11ActionPerformed(ActionEvent evt) {
/* 2858 */     IDTarget.removeAllElements();
/* 2859 */     Status.removeAllElements();
/*      */   }
/*      */ 
/*      */   
/*      */   private void jButton38ActionPerformed(ActionEvent evt) {
/* 2864 */     if (this.jList21.getSelectedValue() != null) {
/* 2865 */       int i = this.jList21.getSelectedIndex();
/* 2866 */       IDTarget.addElement(IDList.getElementAt(i));
/* 2867 */       NameTarget.addElement(this.jList21.getSelectedValue());
/* 2868 */       Status.addElement("Alive");
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   private void jButton39ActionPerformed(ActionEvent evt) {
/* 2874 */     int i = this.jList21.getSelectedIndex();
/* 2875 */     String name = (new StringBuilder()).append(PlayerList.getElementAt(i)).append("").toString();
/* 2876 */     String ID = (new StringBuilder()).append(IDList.getElementAt(i)).append("").toString();
/* 2877 */     NameTarget.removeElement(name);
/* 2878 */     IDTarget.removeElement(ID);
/* 2879 */     Status.removeElementAt(i);
/*      */   }
/*      */ }


/* Location:              C:\Users\NhatTM\Downloads\SroBot\SroBot\22585 - 15820\SroBot.jar!\srobot\Gui.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */