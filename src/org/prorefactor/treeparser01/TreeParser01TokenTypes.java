// $ANTLR 2.7.7 (20060906): "expandedtreeparser01.g" -> "TreeParser01.java"$

	package org.prorefactor.treeparser01;

	import org.prorefactor.core.IJPNode;
	import org.prorefactor.treeparser.CQ;
	import org.prorefactor.treeparser.IJPTreeParser;
	
	import java.util.ArrayList;

public interface TreeParser01TokenTypes {
	int EOF = 1;
	int NULL_TREE_LOOKAHEAD = 3;
	int LEXDATE = 4;
	int NAMEDOT = 5;
	int NUMBER = 6;
	int OBJCOLON = 7;
	int QSTRING = 8;
	int PERIOD = 9;
	int PROPARSEDIRECTIVE = 10;
	int LEXOTHER = 11;
	int AACBIT = 12;
	int AACONTROL = 13;
	int AALIST = 14;
	int AAMEMORY = 15;
	int AAMSG = 16;
	int AAPCONTROL = 17;
	int AASERIAL = 18;
	int AATRACE = 19;
	int ABSOLUTE = 20;
	int ACCELERATOR = 21;
	int ACCUMULATE = 22;
	int ACTIVEWINDOW = 23;
	int ADD = 24;
	int ADVISE = 25;
	int ALERTBOX = 26;
	int ALIAS = 27;
	int ALL = 28;
	int ALLOWREPLICATION = 29;
	int ALTER = 30;
	int ALTERNATEKEY = 31;
	int AMBIGUOUS = 32;
	int ANALYZE = 33;
	int AND = 34;
	int ANSIONLY = 35;
	int ANY = 36;
	int ANYWHERE = 37;
	int APPEND = 38;
	int APPLICATION = 39;
	int APPLY = 40;
	int ARRAYMESSAGE = 41;
	int AS = 42;
	int ASC = 43;
	int ASCENDING = 44;
	int ASKOVERWRITE = 45;
	int ASSIGN = 46;
	int ASYNCHRONOUS = 47;
	int AT = 48;
	int ATTACHMENT = 49;
	int ATTRSPACE = 50;
	int AUTHORIZATION = 51;
	int AUTOCOMPLETION = 52;
	int AUTOENDKEY = 53;
	int AUTOGO = 54;
	int AUTOMATIC = 55;
	int AUTORETURN = 56;
	int AVAILABLE = 57;
	int AVERAGE = 58;
	int AVG = 59;
	int BACKGROUND = 60;
	int BACKWARDS = 61;
	int BASEKEY = 62;
	int BEFOREHIDE = 63;
	int BEGINS = 64;
	int BELL = 65;
	int BETWEEN = 66;
	int BGCOLOR = 67;
	int BIGENDIAN = 68;
	int BINARY = 69;
	int BINDWHERE = 70;
	int BLANK = 71;
	int BOTH = 72;
	int BOTTOM = 73;
	int BREAK = 74;
	int BROWSE = 75;
	int BTOS = 76;
	int BUFFER = 77;
	int BUFFERCHARS = 78;
	int BUFFERCOMPARE = 79;
	int BUFFERCOPY = 80;
	int BUFFERLINES = 81;
	int BUFFERNAME = 82;
	int BUTTON = 83;
	int BUTTONS = 84;
	int BY = 85;
	int BYPOINTER = 86;
	int BYTE = 87;
	int BYVARIANTPOINTER = 88;
	int CACHE = 89;
	int CACHESIZE = 90;
	int CALL = 91;
	int CANDO = 92;
	int CANFIND = 93;
	int CANQUERY = 94;
	int CANSET = 95;
	int CANCELBUTTON = 96;
	int CAPS = 97;
	int CASE = 98;
	int CASESENSITIVE = 99;
	int CDECL_KW = 100;
	int CENTERED = 101;
	int CHAINED = 102;
	int CHARACTER = 103;
	int CHARACTERLENGTH = 104;
	int CHECK = 105;
	int CHOOSE = 106;
	int CHR = 107;
	int CLEAR = 108;
	int CLIPBOARD = 109;
	int CLOSE = 110;
	int CODEBASELOCATOR = 111;
	int CODEPAGECONVERT = 112;
	int COLLATE = 113;
	int COLOF = 114;
	int COLON = 115;
	int COLONALIGNED = 116;
	int COLOR = 117;
	int COLORTABLE = 118;
	int COLUMN = 119;
	int COLUMNBGCOLOR = 120;
	int COLUMNDCOLOR = 121;
	int COLUMNFGCOLOR = 122;
	int COLUMNFONT = 123;
	int COLUMNLABEL = 124;
	int COLUMNOF = 125;
	int COLUMNPFCOLOR = 126;
	int COLUMNS = 127;
	int COMHANDLE = 128;
	int COMBOBOX = 129;
	int COMMAND = 130;
	int COMPARE = 131;
	int COMPARES = 132;
	int COMPLETE = 133;
	int COMPILE = 134;
	int COMPILER = 135;
	int COMSELF = 136;
	int CONFIGNAME = 137;
	int CONNECT = 138;
	int CONNECTED = 139;
	int CONTAINS = 140;
	int CONTENTS = 141;
	int CONTEXT = 142;
	int CONTEXTHELP = 143;
	int CONTEXTHELPFILE = 144;
	int CONTEXTHELPID = 145;
	int CONTEXTPOPUP = 146;
	int CONTROL = 147;
	int CONTROLFRAME = 148;
	int CONVERT = 149;
	int CONVERT3DCOLORS = 150;
	int COUNT = 151;
	int COUNTOF = 152;
	int CREATE = 153;
	int CREATETESTFILE = 154;
	int CURRENT = 155;
	int CURRENTCHANGED = 156;
	int CURRENTENVIRONMENT = 157;
	int CURRENTLANGUAGE = 158;
	int CURRENTRESULTROW = 159;
	int CURRENTVALUE = 160;
	int CURRENTWINDOW = 161;
	int CURSOR = 162;
	int DATABASE = 163;
	int DATABIND = 164;
	int DATASERVERS = 165;
	int DATE = 166;
	int DAY = 167;
	int DBCODEPAGE = 168;
	int DBCOLLATION = 169;
	int DBIMS = 170;
	int DBNAME = 171;
	int DBPARAM = 172;
	int DBRESTRICTIONS = 173;
	int DBTASKID = 174;
	int DBTYPE = 175;
	int DBVERSION = 176;
	int DCOLOR = 177;
	int DDE = 178;
	int DEBLANK = 179;
	int DEBUG = 180;
	int DEBUGLIST = 181;
	int DEBUGGER = 182;
	int DECIMAL = 183;
	int DECIMALS = 184;
	int DECLARE = 185;
	int DEFAULT = 186;
	int DEFAULTBUTTON = 187;
	int DEFAULTEXTENSION = 188;
	int DEFAULTNOXLATE = 189;
	int DEFAULTWINDOW = 190;
	int DEFERLOBFETCH = 191;
	int DEFINE = 192;
	int DEFINED = 193;
	int DELETE_KW = 194;
	int DELETERESULTLISTENTRY = 196;
	int DELIMITER = 197;
	int DESC = 198;
	int DESCENDING = 199;
	int DESELECTION = 200;
	int DIALOGBOX = 201;
	int DIALOGHELP = 202;
	int DICTIONARY = 203;
	int DIR = 204;
	int DISABLE = 205;
	int DISABLEAUTOZAP = 206;
	int DISABLED = 207;
	int DISCONNECT = 208;
	int DISPLAY = 209;
	int DISTINCT = 210;
	int DO = 211;
	int DOS = 212;
	int DOUBLE = 213;
	int DOWN = 214;
	int DROP = 215;
	int DROPDOWN = 216;
	int DROPDOWNLIST = 217;
	int DROPFILENOTIFY = 218;
	int DROPTARGET = 219;
	int DUMP = 220;
	int DYNAMIC = 221;
	int DYNAMICFUNCTION = 222;
	int EACH = 223;
	int ECHO = 224;
	int EDGECHARS = 225;
	int EDGEPIXELS = 226;
	int EDITUNDO = 227;
	int EDITING = 228;
	int EDITOR = 229;
	int ELSE = 230;
	int EMPTY = 231;
	int ENABLE = 232;
	int ENCODE = 233;
	int END = 234;
	int ENDMOVE = 235;
	int ENDRESIZE = 236;
	int ENDROWRESIZE = 237;
	int ENDKEY = 238;
	int ENTERED = 239;
	int ENTRY = 240;
	int EQ = 241;
	int ERROR = 242;
	int ERRORSTATUS = 243;
	int ESCAPE = 244;
	int ETIME_KW = 245;
	int EVENTPROCEDURE = 246;
	int EVENTS = 247;
	int EXCEPT = 248;
	int EXCLUSIVEID = 249;
	int EXCLUSIVELOCK = 250;
	int EXCLUSIVEWEBUSER = 251;
	int EXECUTE = 252;
	int EXISTS = 253;
	int EXP = 254;
	int EXPAND = 255;
	int EXPANDABLE = 256;
	int EXPLICIT = 257;
	int EXPORT = 258;
	int EXTENDED = 259;
	int EXTENT = 260;
	int EXTERNAL = 261;
	int FALSE_KW = 262;
	int FETCH = 263;
	int FGCOLOR = 264;
	int FIELD = 265;
	int FIELDS = 266;
	int FILE = 267;
	int FILEINFORMATION = 268;
	int FILENAME = 269;
	int FILL = 270;
	int FILLIN = 271;
	int FILTERS = 272;
	int FIND = 273;
	int FINDCASESENSITIVE = 274;
	int FINDER = 275;
	int FINDGLOBAL = 276;
	int FINDNEXTOCCURRENCE = 277;
	int FINDPREVOCCURRENCE = 278;
	int FINDSELECT = 279;
	int FINDWRAPAROUND = 280;
	int FIRST = 281;
	int FIRSTOF = 282;
	int FITLASTCOLUMN = 283;
	int FIXEDONLY = 284;
	int FLATBUTTON = 285;
	int FLOAT = 286;
	int FOCUS = 287;
	int FONT = 288;
	int FONTBASEDLAYOUT = 289;
	int FONTTABLE = 290;
	int FOR = 291;
	int FORCEFILE = 292;
	int FORMINPUT = 293;
	int FORMAT = 294;
	int FORWARDS = 295;
	int FRAME = 296;
	int FRAMECOL = 297;
	int FRAMEDB = 298;
	int FRAMEDOWN = 299;
	int FRAMEFIELD = 300;
	int FRAMEFILE = 301;
	int FRAMEINDEX = 302;
	int FRAMELINE = 303;
	int FRAMENAME = 304;
	int FRAMEROW = 305;
	int FRAMEVALUE = 306;
	int FREQUENCY = 307;
	int FROM = 308;
	int FROMCURRENT = 309;
	int FUNCTION = 310;
	int GE = 311;
	int GENERATEMD5 = 312;
	int GET = 313;
	int GETBITS = 314;
	int GETBUFFERHANDLE = 315;
	int GETBYTE = 316;
	int GETBYTES = 317;
	int GETBYTEORDER = 318;
	int GETCGILIST = 319;
	int GETCGIVALUE = 320;
	int GETCODEPAGES = 321;
	int GETCOLLATIONS = 322;
	int GETCONFIGVALUE = 323;
	int GETDOUBLE = 324;
	int GETFILE = 325;
	int GETFLOAT = 326;
	int GETKEYVALUE = 327;
	int GETLICENSE = 328;
	int GETLONG = 329;
	int GETPOINTERVALUE = 330;
	int GETSHORT = 331;
	int GETSIZE = 332;
	int GETSTRING = 333;
	int GETUNSIGNEDSHORT = 334;
	int GLOBAL = 335;
	int GOON = 336;
	int GOPENDING = 337;
	int GRANT = 338;
	int GRAPHICEDGE = 339;
	int GROUP = 340;
	int GTHAN = 341;
	int HANDLE = 342;
	int HAVING = 343;
	int HEADER = 344;
	int HEIGHT = 345;
	int HELP = 346;
	int HELPTOPIC = 347;
	int HIDE = 348;
	int HINT = 349;
	int HORIZONTAL = 350;
	int HOSTBYTEORDER = 351;
	int HTMLENDOFLINE = 352;
	int HTMLFRAMEBEGIN = 353;
	int HTMLFRAMEEND = 354;
	int HTMLHEADERBEGIN = 355;
	int HTMLHEADEREND = 356;
	int HTMLTITLEBEGIN = 357;
	int HTMLTITLEEND = 358;
	int IF = 359;
	int IMAGE = 360;
	int IMAGEDOWN = 361;
	int IMAGEINSENSITIVE = 362;
	int IMAGESIZE = 363;
	int IMAGESIZECHARS = 364;
	int IMAGESIZEPIXELS = 365;
	int IMAGEUP = 366;
	int IMPORT = 367;
	int IN_KW = 368;
	int INCREMENTEXCLUSIVEID = 369;
	int INDEX = 370;
	int INDEXHINT = 371;
	int INDEXEDREPOSITION = 372;
	int INDICATOR = 373;
	int INFORMATION = 374;
	int INITIAL = 375;
	int INITIALDIR = 376;
	int INITIALFILTER = 377;
	int INITIATE = 378;
	int INNER = 379;
	int INNERCHARS = 380;
	int INNERLINES = 381;
	int INPUT = 382;
	int INPUTOUTPUT = 383;
	int INSERT = 384;
	int INTEGER = 385;
	int INTO = 386;
	int IS = 387;
	int ISATTRSPACE = 388;
	int ISLEADBYTE = 389;
	int ITEM = 390;
	int JOIN = 391;
	int JOINBYSQLDB = 392;
	int KBLABEL = 393;
	int KEEPMESSAGES = 394;
	int KEEPTABORDER = 395;
	int KEY = 396;
	int KEYCODE = 397;
	int KEYFUNCTION = 398;
	int KEYLABEL = 399;
	int KEYS = 400;
	int KEYWORD = 401;
	int KEYWORDALL = 402;
	int LABEL = 403;
	int LABELBGCOLOR = 404;
	int LABELDCOLOR = 405;
	int LABELFGCOLOR = 406;
	int LABELFONT = 407;
	int LANDSCAPE = 408;
	int LANGUAGES = 409;
	int LARGE = 410;
	int LARGETOSMALL = 411;
	int LAST = 412;
	int LASTEVENT = 413;
	int LASTOF = 414;
	int LASTKEY = 415;
	int LC = 416;
	int LDBNAME = 417;
	int LE = 418;
	int LEAVE = 419;
	int LEFT = 420;
	int LEFTALIGNED = 421;
	int LEFTTRIM = 422;
	int LENGTH = 423;
	int LIBRARY = 424;
	int LIKE = 425;
	int LINECOUNTER = 426;
	int LISTEVENTS = 427;
	int LISTITEMPAIRS = 428;
	int LISTITEMS = 429;
	int LISTQUERYATTRS = 430;
	int LISTSETATTRS = 431;
	int LISTWIDGETS = 432;
	int LISTING = 433;
	int LITTLEENDIAN = 434;
	int LOAD = 435;
	int LOADPICTURE = 436;
	int LOCKED = 437;
	int LOG = 438;
	int LOGICAL = 439;
	int LONG = 440;
	int LOOKAHEAD = 441;
	int LOOKUP = 442;
	int LTHAN = 443;
	int MACHINECLASS = 444;
	int MAP = 445;
	int MARGINEXTRA = 446;
	int MATCHES = 447;
	int MAX = 448;
	int MAXCHARS = 449;
	int MAXROWS = 450;
	int MAXSIZE = 451;
	int MAXVALUE = 452;
	int MAXIMIZE = 453;
	int MAXIMUM = 454;
	int MEMBER = 455;
	int MEMPTR = 456;
	int MENU = 457;
	int MENUITEM = 458;
	int MENUBAR = 459;
	int MESSAGE = 460;
	int MESSAGELINE = 461;
	int MESSAGELINES = 462;
	int MIN = 463;
	int MINSIZE = 464;
	int MINVALUE = 465;
	int MINIMUM = 466;
	int MODULO = 467;
	int MONTH = 468;
	int MOUSE = 469;
	int MOUSEPOINTER = 470;
	int MPE = 471;
	int MULTIPLE = 472;
	int MULTIPLEKEY = 473;
	int MUSTEXIST = 474;
	int NATIVE = 475;
	int NE = 476;
	int NEW = 477;
	int NEXT = 478;
	int NEXTPROMPT = 479;
	int NEXTVALUE = 480;
	int NO = 481;
	int NOAPPLY = 482;
	int NOARRAYMESSAGE = 483;
	int NOASSIGN = 484;
	int NOATTRLIST = 485;
	int NOATTRSPACE = 486;
	int NOAUTOVALIDATE = 487;
	int NOBINDWHERE = 488;
	int NOBOX = 489;
	int NOCOLUMNSCROLLING = 490;
	int NOCONSOLE = 491;
	int NOCONVERT = 492;
	int NOCONVERT3DCOLORS = 493;
	int NOCURRENTVALUE = 494;
	int NODEBUG = 495;
	int NODRAG = 496;
	int NOECHO = 497;
	int NOEMPTYSPACE = 498;
	int NOERROR_KW = 499;
	int NOFILL = 500;
	int NOFOCUS = 501;
	int NOHELP = 502;
	int NOHIDE = 503;
	int NOINDEXHINT = 504;
	int NOJOINBYSQLDB = 505;
	int NOLABELS = 506;
	int NOLOCK = 507;
	int NOLOOKAHEAD = 508;
	int NOMAP = 509;
	int NOMESSAGE = 510;
	int NONE = 511;
	int NOPAUSE = 512;
	int NOPREFETCH = 513;
	int NORETURNVALUE = 514;
	int NORMAL = 515;
	int NOROWMARKERS = 516;
	int NOSCROLLBARVERTICAL = 517;
	int NOSEPARATECONNECTION = 518;
	int NOSEPARATORS = 519;
	int NOTABSTOP = 520;
	int NOUNDERLINE = 521;
	int NOUNDO = 522;
	int NOVALIDATE = 523;
	int NOWAIT = 524;
	int NOWORDWRAP = 525;
	int NOT = 526;
	int NULL_KW = 527;
	int NUMALIASES = 528;
	int NUMCOPIES = 529;
	int NUMDBS = 530;
	int NUMENTRIES = 531;
	int NUMRESULTS = 532;
	int NUMERIC = 533;
	int OBJECT = 534;
	int OCTETLENGTH = 535;
	int OF = 536;
	int OFF = 537;
	int OK = 538;
	int OKCANCEL = 539;
	int OLD = 540;
	int ON = 541;
	int ONLY = 542;
	int OPEN = 543;
	int OPSYS = 544;
	int OPTION = 545;
	int OR = 546;
	int ORDER = 547;
	int ORDEREDJOIN = 548;
	int ORDINAL = 549;
	int OS2 = 550;
	int OS400 = 551;
	int OSAPPEND = 552;
	int OSCOMMAND = 553;
	int OSCOPY = 554;
	int OSCREATEDIR = 555;
	int OSDELETE = 556;
	int OSDIR = 557;
	int OSDRIVES = 558;
	int OSERROR = 559;
	int OSGETENV = 560;
	int OSRENAME = 561;
	int OTHERWISE = 562;
	int OUTER = 563;
	int OUTERJOIN = 564;
	int OUTPUT = 565;
	int OVERLAY = 566;
	int OVERRIDE = 567;
	int PAGE = 568;
	int PAGEBOTTOM = 569;
	int PAGENUMBER = 570;
	int PAGESIZE_KW = 571;
	int PAGETOP = 572;
	int PAGEWIDTH = 573;
	int PAGED = 574;
	int PARAMETER = 575;
	int PARENT = 576;
	int PARTIALKEY = 577;
	int PASCAL_KW = 578;
	int PAUSE = 579;
	int PDBNAME = 580;
	int PERFORMANCE = 581;
	int PERSISTENT = 582;
	int PFCOLOR = 583;
	int PINNABLE = 584;
	int PORTRAIT = 585;
	int POSITION = 586;
	int PRECISION = 587;
	int PREPROCESS = 588;
	int PRESELECT = 589;
	int PREV = 590;
	int PRIMARY = 591;
	int PRINTER = 592;
	int PRINTERSETUP = 593;
	int PRIVATE = 594;
	int PRIVILEGES = 595;
	int PROCTEXT = 596;
	int PROCTEXTBUFFER = 597;
	int PROCHANDLE = 598;
	int PROCSTATUS = 599;
	int PROCEDURE = 600;
	int PROCESS = 601;
	int PROFILER = 602;
	int PROGRAMNAME = 603;
	int PROGRESS = 604;
	int PROMPT = 605;
	int PROMPTFOR = 606;
	int PROMSGS = 607;
	int PROPATH = 608;
	int PROVERSION = 609;
	int PUBLIC = 610;
	int PUBLISH = 611;
	int PUT = 612;
	int PUTBITS = 613;
	int PUTBYTE = 614;
	int PUTBYTES = 615;
	int PUTDOUBLE = 616;
	int PUTFLOAT = 617;
	int PUTKEYVALUE = 618;
	int PUTLONG = 619;
	int PUTSHORT = 620;
	int PUTSTRING = 621;
	int PUTUNSIGNEDSHORT = 622;
	int QUERY = 623;
	int QUERYCLOSE = 624;
	int QUERYOFFEND = 625;
	int QUERYTUNING = 626;
	int QUESTION = 627;
	int QUIT = 628;
	int QUOTER = 629;
	int RINDEX = 630;
	int RADIOBUTTONS = 631;
	int RADIOSET = 632;
	int RANDOM = 633;
	int RAW = 634;
	int RAWTRANSFER = 635;
	int RCODEINFORMATION = 636;
	int READ = 637;
	int READAVAILABLE = 638;
	int READEXACTNUM = 639;
	int READONLY = 640;
	int READKEY = 641;
	int REAL = 642;
	int RECID = 643;
	int RECORDLENGTH = 644;
	int RECTANGLE = 645;
	int RECURSIVE = 646;
	int RELEASE = 647;
	int REPEAT = 648;
	int REPLACE = 649;
	int REPLICATIONCREATE = 650;
	int REPLICATIONDELETE = 651;
	int REPLICATIONWRITE = 652;
	int REPOSITION = 653;
	int REPOSITIONFORWARD = 654;
	int REPOSITIONBACKWARD = 655;
	int REPOSITIONTOROW = 656;
	int REPOSITIONTOROWID = 657;
	int REQUEST = 658;
	int RESULT = 659;
	int RETAIN = 660;
	int RETAINSHAPE = 661;
	int RETRY = 662;
	int RETRYCANCEL = 663;
	int RETURN = 664;
	int RETURNTOSTARTDIR = 665;
	int RETURNVALUE = 666;
	int RETURNS = 667;
	int REVERSEFROM = 668;
	int REVERT = 669;
	int REVOKE = 670;
	int RGBVALUE = 671;
	int RIGHT = 672;
	int RIGHTALIGNED = 673;
	int RIGHTTRIM = 674;
	int ROUND = 675;
	int ROW = 676;
	int ROWHEIGHTCHARS = 677;
	int ROWHEIGHTPIXELS = 678;
	int ROWID = 679;
	int ROWOF = 680;
	int RULE = 681;
	int RUN = 682;
	int RUNPROCEDURE = 683;
	int SAVE = 684;
	int SAVECACHE = 685;
	int SAVEAS = 686;
	int SAXREADER = 687;
	int SCHEMA = 688;
	int SCREEN = 689;
	int SCREENIO = 690;
	int SCREENLINES = 691;
	int SCROLL = 692;
	int SCROLLABLE = 693;
	int SCROLLBARHORIZONTAL = 694;
	int SCROLLBARVERTICAL = 695;
	int SCROLLING = 696;
	int SDBNAME = 697;
	int SEARCH = 698;
	int SEARCHSELF = 699;
	int SEARCHTARGET = 700;
	int SECTION = 701;
	int SEEK = 702;
	int SELECT = 703;
	int SELECTION = 704;
	int SELECTIONLIST = 705;
	int SELF = 706;
	int SEND = 707;
	int SENDSQLSTATEMENT = 708;
	int SEPARATECONNECTION = 709;
	int SEPARATORS = 710;
	int SERVER = 711;
	int SERVERSOCKET = 712;
	int SESSION = 713;
	int SET = 714;
	int SETBYTEORDER = 715;
	int SETCONTENTS = 716;
	int SETCURRENTVALUE = 717;
	int SETPOINTERVALUE = 718;
	int SETSIZE = 719;
	int SETUSERID = 720;
	int SHARELOCK = 721;
	int SHARED = 722;
	int SHOWSTATS = 723;
	int SIDELABELS = 724;
	int SILENT = 725;
	int SIMPLE = 726;
	int SINGLE = 727;
	int SIZE = 728;
	int SIZECHARS = 729;
	int SIZEPIXELS = 730;
	int SKIP = 731;
	int SKIPDELETEDRECORD = 732;
	int SLIDER = 733;
	int SMALLINT = 734;
	int SOCKET = 735;
	int SOME = 736;
	int SORT = 737;
	int SOURCE = 738;
	int SOURCEPROCEDURE = 739;
	int SPACE = 740;
	int SQL = 741;
	int SQRT = 742;
	int START = 743;
	int STARTMOVE = 744;
	int STARTRESIZE = 745;
	int STARTROWRESIZE = 746;
	int STATUS = 747;
	int STATUSBAR = 748;
	int STDCALL_KW = 749;
	int STRETCHTOFIT = 750;
	int STOP = 751;
	int STOREDPROCEDURE = 752;
	int STREAM = 753;
	int STREAMIO = 754;
	int STRING = 755;
	int STRINGXREF = 756;
	int SUBAVERAGE = 757;
	int SUBCOUNT = 758;
	int SUBMAXIMUM = 759;
	int SUBMENU = 760;
	int SUBMENUHELP = 761;
	int SUBMINIMUM = 762;
	int SUBTOTAL = 763;
	int SUBSCRIBE = 764;
	int SUBSTITUTE = 765;
	int SUBSTRING = 766;
	int SUM = 767;
	int SUMMARY = 768;
	int SUPER = 769;
	int SYSTEMDIALOG = 770;
	int SYSTEMHELP = 771;
	int TABLE = 772;
	int TABLEHANDLE = 773;
	int TABLENUMBER = 774;
	int TARGET = 775;
	int TARGETPROCEDURE = 776;
	int TEMPTABLE = 777;
	int TERMINAL = 778;
	int TERMINATE = 779;
	int TEXT = 780;
	int TEXTCURSOR = 781;
	int TEXTSEGGROW = 782;
	int THEN = 783;
	int THISPROCEDURE = 784;
	int THREED = 785;
	int THROUGH = 786;
	int TICMARKS = 787;
	int TIME = 788;
	int TITLE = 789;
	int TO = 790;
	int TOOLBAR = 791;
	int TOOLTIP = 792;
	int TOROWID = 793;
	int TODAY = 794;
	int TOGGLEBOX = 795;
	int TOP = 796;
	int TOPONLY = 797;
	int TOPIC = 798;
	int TOTAL = 799;
	int TRANSACTION = 800;
	int TRANSACTIONMODE = 801;
	int TRANSPARENT = 802;
	int TRAILING = 803;
	int TRIGGER = 804;
	int TRIGGERS = 805;
	int TRIM = 806;
	int TRUE_KW = 807;
	int TRUNCATE = 808;
	int UNBUFFERED = 809;
	int UNDERLINE = 810;
	int UNDO = 811;
	int UNFORMATTED = 812;
	int UNION = 813;
	int UNIQUE = 814;
	int UNIQUEMATCH = 815;
	int UNIX = 816;
	int UNLESSHIDDEN = 817;
	int UNLOAD = 818;
	int UNSUBSCRIBE = 819;
	int UP = 820;
	int UPDATE = 821;
	int URLDECODE = 822;
	int URLENCODE = 823;
	int USE = 824;
	int USEDICTEXPS = 825;
	int USEFILENAME = 826;
	int USEINDEX = 827;
	int USER = 828;
	int USERID = 829;
	int USEREVVIDEO = 830;
	int USETEXT = 831;
	int USEUNDERLINE = 832;
	int USING = 833;
	int V6FRAME = 834;
	int VALIDEVENT = 835;
	int VALIDHANDLE = 836;
	int VALIDATE = 837;
	int VALUE = 838;
	int VALUECHANGED = 839;
	int VALUES = 840;
	int VARIABLE = 841;
	int VERBOSE = 842;
	int VERTICAL = 843;
	int VIEW = 844;
	int VIEWAS = 845;
	int VMS = 846;
	int WAIT = 847;
	int WAITFOR = 848;
	int WARNING = 849;
	int WEBCONTEXT = 850;
	int WEEKDAY = 851;
	int WHEN = 852;
	int WHERE = 853;
	int WHILE = 854;
	int WIDGET = 855;
	int WIDGETHANDLE = 856;
	int WIDGETPOOL = 857;
	int WIDTH = 858;
	int WIDTHCHARS = 859;
	int WIDTHPIXELS = 860;
	int WINDOW = 861;
	int WINDOWDELAYEDMINIMIZE = 862;
	int WINDOWMAXIMIZED = 863;
	int WINDOWMINIMIZED = 864;
	int WINDOWNAME = 865;
	int WINDOWNORMAL = 866;
	int WITH = 867;
	int WORDINDEX = 868;
	int WORKTABLE = 869;
	int WRITE = 870;
	int X = 871;
	int XDOCUMENT = 872;
	int XNODEREF = 873;
	int XOF = 874;
	int XCODE = 875;
	int XREF = 876;
	int Y = 877;
	int YOF = 878;
	int YEAR = 879;
	int YES = 880;
	int YESNO = 881;
	int YESNOCANCEL = 882;
	int LEFTANGLE = 883;
	int RIGHTANGLE = 884;
	int LEXAT = 885;
	int LEFTBRACE = 886;
	int RIGHTBRACE = 887;
	int CARET = 888;
	int COMMA = 889;
	int EXCLAMATION = 890;
	int GTOREQUAL = 891;
	int GTORLT = 892;
	int LTOREQUAL = 893;
	int EQUAL = 894;
	int MINUS = 895;
	int PLUS = 896;
	int LEFTPAREN = 897;
	int RIGHTPAREN = 898;
	int SEMI = 899;
	int SLASH = 900;
	int STAR = 901;
	int SINGLEQUOTE = 902;
	int UNKNOWNVALUE = 903;
	int PIPE = 904;
	int BACKTICK = 905;
	int WS = 906;
	int COMMENT = 907;
	int DQSTRING = 908;
	int SQSTRING = 909;
	int DIGITSTART = 910;
	int PLUSMINUSSTART = 911;
	int PERIODSTART = 912;
	int ID = 913;
	int ID_TWO = 914;
	int ID_THREE = 915;
	int ESCAPED_QUOTE = 916;
	int LEXCOLON = 917;
	int PREPROCESSDIRECTIVE = 918;
	int GLOBALDEFINE = 919;
	int SCOPEDDEFINE = 920;
	int PREPROCESSIF = 921;
	int PREPROCESSELSEIF = 922;
	int PREPROCESSELSE = 923;
	int PREPROCESSENDIF = 924;
	int IFCOND = 925;
	int PREPROCESSUNDEFINE = 926;
	int PREPROCESSMESSAGE = 927;
	int PREPROCESSJMESSAGE = 928;
	int DEFINETEXT = 929;
	int PREPROCESSTOKEN = 930;
	int INCLUDEREFARG = 931;
	int DIGITS = 932;
	int AMPANALYZESUSPEND = 933;
	int AMPANALYZERESUME = 934;
	int AMPGLOBALDEFINE = 935;
	int AMPELSE = 936;
	int AMPELSEIF = 937;
	int AMPENDIF = 938;
	int AMPIF = 939;
	int AMPMESSAGE = 940;
	int AMPTHEN = 941;
	int AMPUNDEFINE = 942;
	int AMPSCOPEDDEFINE = 943;
	int Scanner_head = 944;
	int Scanner_tail = 945;
	int BACKSLASH = 946;
	int COMMENTSTART = 947;
	int COMMENTEND = 948;
	int LEFTCURLY = 949;
	int RIGHTCURLY = 950;
	int CURLYAMP = 951;
	int CURLYNUMBER = 952;
	int CURLYSTAR = 953;
	int DOUBLEQUOTE = 954;
	int TILDE = 955;
	int NEWLINE = 956;
	int FREECHAR = 957;
	int Aggregate_phrase = 958;
	int Array_subscript = 959;
	int Assign_from_buffer = 960;
	int Automationobject = 961;
	int Block_iterator = 962;
	int Code_block = 963;
	int Entered_func = 964;
	int Editing_phrase = 965;
	int Expr_statement = 966;
	int Event_list = 967;
	int Field_list = 968;
	int Field_ref = 969;
	int Form_item = 970;
	int Format_phrase = 971;
	int Inline_definition = 972;
	int Loose_End_Keeper = 973;
	int Method_parameter = 974;
	int Method_param_list = 975;
	int Not_casesens = 976;
	int Not_null = 977;
	int Parameter_list = 978;
	int Program_root = 979;
	int Program_tail = 980;
	int Sql_begins = 981;
	int Sql_between = 982;
	int Sql_comp_query = 983;
	int Sql_in = 984;
	int Sql_like = 985;
	int Sql_null_test = 986;
	int Sql_select_what = 987;
	int Widget_ref = 988;
	int With_columns = 989;
	int With_down = 990;
	int UNARY_MINUS = 991;
	int UNARY_PLUS = 992;
	int MULTIPLY = 993;
	int DIVIDE = 994;
	int BLOCK_LABEL = 995;
	int RECORD_NAME = 996;
	int USER_FUNC = 997;
	int TYPELESS_TOKEN = 998;
	int IMPOSSIBLE_TOKEN = 999;
	int GATEWAYS = 1001;
	int FUNCTIONCALLTYPE = 1002;
	int GETATTRCALLTYPE = 1003;
	int PROCEDURECALLTYPE = 1004;
	int SAXCOMPLETE = 1005;
	int SAXPARSERERROR = 1006;
	int SAXRUNNING = 1007;
	int SAXUNINITIALIZED = 1008;
	int SETATTRCALLTYPE = 1009;
	int UNQUOTEDSTRING = 1010;
	int COPYLOB = 1011;
	int DATARELATION = 1012;
	int DATASOURCE = 1013;
	int DATASET = 1014;
	int DATASETHANDLE = 1015;
	int LOGMANAGER = 1016;
	int NOLOBS = 1017;
	int NOW = 1018;
	int STARTING = 1019;
	int BASE64 = 1020;
	int SOAPHEADER = 1021;
	int SOAPHEADERENTRYREF = 1022;
	int BLOB = 1023;
	int CLOB = 1024;
	int DATETIME = 1025;
	int DATETIMETZ = 1026;
	int LONGCHAR = 1027;
	int RELATIONFIELDS = 1028;
	int TTCODEPAGE = 1029;
	int COLUMNCODEPAGE = 1030;
	int DYNAMICCURRENTVALUE = 1031;
	int DYNAMICNEXTVALUE = 1032;
	int FIXCODEPAGE = 1033;
	int INTERVAL = 1034;
	int ISCODEPAGEFIXED = 1035;
	int ISCOLUMNCODEPAGE = 1036;
	int ISODATE = 1037;
	int MTIME = 1038;
	int LOBDIR = 1039;
	int TIMEZONE = 1040;
	int BYVALUE = 1041;
	int BYREFERENCE = 1042;
	int ADDINTERVAL = 1043;
	int GETDIR = 1044;
	int CURRENCY = 1045;
	int ERRORCODE = 1046;
	int IUNKNOWN = 1047;
	int SHORT = 1048;
	int UNSIGNEDBYTE = 1049;
	int UNSIGNEDSHORT = 1050;
	int CODEPAGE = 1051;
	int BASE64DECODE = 1052;
	int BASE64ENCODE = 1053;
	int BATCHSIZE = 1054;
	int BEFORETABLE = 1055;
	int COPYDATASET = 1056;
	int COPYTEMPTABLE = 1057;
	int DATASOURCEMODIFIED = 1058;
	int DECRYPT = 1059;
	int DELETECHARACTER = 1060;
	int ENABLEDFIELDS = 1061;
	int ENCRYPT = 1062;
	int ENCRYPTIONSALT = 1063;
	int FORMLONGINPUT = 1065;
	int GENERATEPBEKEY = 1066;
	int GENERATEPBESALT = 1067;
	int GENERATERANDOMKEY = 1068;
	int GETCGILONGVALUE = 1069;
	int LASTBATCH = 1070;
	int MD5DIGEST = 1071;
	int MERGEBYFIELD = 1072;
	int NORMALIZE = 1073;
	int PBEHASHALGORITHM = 1074;
	int PBEKEYROUNDS = 1075;
	int PREFERDATASET = 1076;
	int REJECTED = 1077;
	int REPOSITIONMODE = 1078;
	int ROWSTATE = 1079;
	int ROWUNMODIFIED = 1080;
	int ROWDELETED = 1081;
	int ROWMODIFIED = 1082;
	int ROWCREATED = 1083;
	int SECURITYPOLICY = 1084;
	int SHA1DIGEST = 1085;
	int SSLSERVERNAME = 1086;
	int SYMMETRICENCRYPTIONALGORITHM = 1087;
	int SYMMETRICENCRYPTIONIV = 1088;
	int SYMMETRICENCRYPTIONKEY = 1089;
	int SYMMETRICSUPPORT = 1090;
	int TRANSINITPROCEDURE = 1091;
	int BIGINT = 1092;
	int TIMESTAMP = 1093;
	int FIXCHAR = 1094;
	int DOT_COMMENT = 1095;
	int AUDITCONTROL = 1096;
	int AUDITENABLED = 1097;
	int AUDITPOLICY = 1098;
	int BIND = 1099;
	int CAST = 1100;
	int CLASS = 1101;
	int CLIENTPRINCIPAL = 1102;
	int CONSTRUCTOR = 1103;
	int FINAL = 1104;
	int GENERATEUUID = 1105;
	int GUID = 1106;
	int HEXDECODE = 1107;
	int HEXENCODE = 1108;
	int IMPLEMENTS = 1109;
	int INHERITS = 1110;
	int INTERFACE = 1111;
	int METHOD = 1112;
	int NAMESPACEPREFIX = 1113;
	int NAMESPACEURI = 1114;
	int NEWINSTANCE = 1115;
	int PROTECTED = 1116;
	int REFERENCEONLY = 1117;
	int SAXWRITER = 1118;
	int SETDBCLIENT = 1119;
	int THISOBJECT = 1120;
	int TYPEOF = 1121;
	int VALIDOBJECT = 1122;
	int XMLDATATYPE = 1123;
	int XMLNODETYPE = 1124;
	int TYPE_NAME = 1125;
	int WIDGETID = 1126;
	int DESTRUCTOR = 1127;
	int VOID = 1128;
	int LOCAL_METHOD_REF = 1129;
	int ANNOTATION = 1130;
	int DOUBLECOLON = 1131;
	int NESTED = 1132;
	int PASSWORDFIELD = 1133;
	int ROUNDED = 1134;
	int GROUPBOX = 1135;
	int FALSELEAKS = 1137;
	int LEAKDETECTION = 1138;
	int SAXWRITEBEGIN = 1139;
	int SAXWRITECOMPLETE = 1140;
	int SAXWRITECONTENT = 1141;
	int SAXWRITEELEMENT = 1142;
	int SAXWRITEERROR = 1143;
	int SAXWRITEIDLE = 1144;
	int SAXWRITETAG = 1145;
	int STOMPDETECTION = 1146;
	int STOMPFREQUENCY = 1147;
	int INT64 = 1148;
	int PUTINT64 = 1149;
	int GETINT64 = 1150;
	int PUTUNSIGNEDLONG = 1151;
	int GETUNSIGNEDLONG = 1152;
	int PROPERTY = 1153;
	int SAXATTRIBUTES = 1154;
	int INHERITBGCOLOR = 1155;
	int NOINHERITBGCOLOR = 1156;
	int INHERITFGCOLOR = 1157;
	int NOINHERITFGCOLOR = 1158;
	int XREFXML = 1159;
	int Property_getter = 1160;
	int Property_setter = 1161;
	int USEWIDGETPOOL = 1162;
	int ACTIVEFORM = 1163;
	int ASSEMBLY = 1164;
	int CATCH = 1165;
	int CREATELIKESEQUENTIAL = 1166;
	int CURRENTQUERY = 1167;
	int DATASOURCEROWID = 1168;
	int DEFAULTVALUE = 1169;
	int ERRORSTACKTRACE = 1170;
	int FINALLY = 1171;
	int FIRSTFORM = 1172;
	int LASTFORM = 1173;
	int LIKESEQUENTIAL = 1174;
	int MARKNEW = 1175;
	int MARKROWSTATE = 1176;
	int MAXIMUMLEVEL = 1177;
	int NOTACTIVE = 1178;
	int RESTARTROW = 1179;
	int ROUTINELEVEL = 1180;
	int STATIC = 1181;
	int STREAMHANDLE = 1182;
	int THROW = 1183;
	int TOPNAVQUERY = 1184;
	int UNBOX = 1185;
	int BOX = 1186;
	int DBREMOTEHOST = 1187;
	int DYNAMICCAST = 1188;
	int XMLNODENAME = 1189;
	int ABSTRACT = 1190;
	int DELEGATE = 1191;
	int DYNAMICINVOKE = 1192;
	int DYNAMICNEW = 1193;
	int EVENT = 1194;
	int SERIALIZEHIDDEN = 1195;
	int SERIALIZENAME = 1196;
	int SIGNATURE = 1197;
	int STOPAFTER = 1198;
	int Assign_dynamic_new = 1199;
	int FOREIGNKEYHIDDEN = 1200;
	int BLOCKLEVEL = 1201;
	int SERIALIZABLE = 1202;
	int GETCLASS = 1203;
	int TABLESCAN = 1204;
	int MESSAGEDIGEST = 1205;
	int Last_Token_Number = 1206;
}
