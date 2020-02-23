/* The following code was generated by JFlex 1.4.3 on 22/02/20 06:43 PM */

package analizador;
import java_cup.runtime.*;
import java.util.LinkedList;
import inicio.VentanaInicio;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 22/02/20 06:43 PM from the specification file
 * <tt>Lexer.jflex</tt>
 */
public class AnalizadorLexico implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\3\2\0\1\3\22\0\1\3\1\0\1\37\1\1"+
    "\6\0\1\42\1\1\1\0\1\1\1\34\1\32\12\1\1\41\1\0"+
    "\1\4\1\40\1\33\1\0\1\1\1\22\1\2\1\12\1\2\1\11"+
    "\2\2\1\23\1\24\5\2\1\7\1\5\1\2\1\6\1\2\1\13"+
    "\1\2\1\25\2\2\1\10\1\2\1\0\1\43\2\0\1\1\1\0"+
    "\1\31\1\17\1\30\1\2\1\21\3\2\1\27\3\2\1\16\1\14"+
    "\1\15\2\2\1\20\1\35\1\2\1\26\1\36\4\2\uff85\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\3\1\4\2\2\1\5\1\6"+
    "\1\1\1\7\1\10\1\2\1\1\5\0\2\2\1\11"+
    "\1\0\1\12\5\0\2\2\6\0\2\2\1\13\5\0"+
    "\2\2\5\0\1\14\1\2\5\0\1\2\1\0\1\15"+
    "\1\16\2\0\1\2\1\17\2\0\1\20\1\0\1\21"+
    "\1\22";

  private static int [] zzUnpackAction() {
    int [] result = new int[74];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\44\0\110\0\154\0\220\0\264\0\330\0\374"+
    "\0\u0120\0\44\0\u0144\0\44\0\44\0\u0168\0\u0120\0\u0120"+
    "\0\u018c\0\u01b0\0\u01d4\0\u01f8\0\u021c\0\u0240\0\u0120\0\u0264"+
    "\0\44\0\u0288\0\u02ac\0\u02d0\0\u02f4\0\u0318\0\u033c\0\u0360"+
    "\0\u0384\0\u03a8\0\u03cc\0\u03f0\0\u0414\0\u0438\0\u045c\0\u0480"+
    "\0\44\0\u04a4\0\u04c8\0\u04ec\0\u0510\0\u0534\0\u0558\0\u057c"+
    "\0\u05a0\0\u05c4\0\u05e8\0\u060c\0\u0630\0\110\0\u0654\0\u0678"+
    "\0\u069c\0\u06c0\0\u06e4\0\u0708\0\u072c\0\u0750\0\44\0\44"+
    "\0\u0774\0\u0798\0\u07bc\0\44\0\u07e0\0\u0804\0\110\0\u0828"+
    "\0\44\0\44";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[74];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\7\4\1\7\11\4"+
    "\1\10\3\4\1\11\1\12\1\13\2\4\1\14\1\15"+
    "\1\2\1\16\1\17\45\0\2\3\2\0\25\3\3\0"+
    "\2\3\3\0\1\3\2\0\2\3\2\0\25\3\3\0"+
    "\2\3\2\0\1\20\1\3\4\0\1\5\45\0\1\21"+
    "\4\0\1\22\7\0\1\23\7\0\1\24\12\0\2\3"+
    "\2\0\10\3\1\25\14\3\3\0\2\3\2\0\1\20"+
    "\1\3\2\0\2\3\2\0\12\3\1\26\12\3\3\0"+
    "\2\3\2\0\1\20\1\3\2\0\2\27\2\0\26\27"+
    "\2\0\2\27\3\0\2\27\30\0\1\30\3\0\1\31"+
    "\10\0\2\3\2\0\25\3\3\0\2\3\3\0\1\3"+
    "\1\20\6\0\1\32\57\0\1\33\27\0\1\34\42\0"+
    "\1\35\4\0\1\36\32\0\2\3\2\0\11\3\1\37"+
    "\13\3\3\0\2\3\3\0\1\3\2\0\2\3\2\0"+
    "\22\3\1\40\2\3\3\0\2\3\3\0\1\3\36\0"+
    "\1\41\15\0\1\42\42\0\1\43\47\0\1\44\37\0"+
    "\1\45\57\0\1\46\22\0\2\3\2\0\12\3\1\47"+
    "\12\3\3\0\2\3\3\0\1\3\2\0\2\3\2\0"+
    "\23\3\1\50\1\3\3\0\2\3\3\0\1\3\37\0"+
    "\1\51\15\0\1\52\40\0\1\53\61\0\1\54\27\0"+
    "\1\55\42\0\1\56\36\0\2\3\2\0\13\3\1\57"+
    "\11\3\3\0\2\3\3\0\1\3\2\0\2\3\2\0"+
    "\24\3\1\60\3\0\2\3\3\0\1\3\12\0\1\61"+
    "\43\0\1\62\56\0\1\63\27\0\1\64\40\0\1\65"+
    "\37\0\2\3\2\0\14\3\1\66\10\3\3\0\2\3"+
    "\3\0\1\3\2\0\2\3\2\0\23\3\1\67\1\3"+
    "\3\0\2\3\3\0\1\3\13\0\1\70\44\0\1\71"+
    "\55\0\1\72\27\0\1\73\43\0\1\74\33\0\2\3"+
    "\2\0\22\3\1\75\2\3\3\0\2\3\3\0\1\3"+
    "\14\0\1\76\52\0\1\77\30\0\1\100\46\0\1\101"+
    "\44\0\1\102\31\0\2\3\2\0\10\3\1\103\14\3"+
    "\3\0\2\3\3\0\1\3\10\0\1\104\47\0\1\105"+
    "\52\0\1\106\22\0\2\3\2\0\7\3\1\107\15\3"+
    "\3\0\2\3\3\0\1\3\10\0\1\110\67\0\1\111"+
    "\43\0\1\112\10\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2124];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\7\1\1\11\1\1\2\11\2\1\5\0"+
    "\3\1\1\0\1\11\5\0\2\1\6\0\2\1\1\11"+
    "\5\0\2\1\5\0\2\1\5\0\1\1\1\0\2\11"+
    "\2\0\1\1\1\11\2\0\1\1\1\0\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[74];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    //coidgo de usuario en sintaxis java
    VentanaInicio ventana;
    public void setVentana(VentanaInicio ventana){
        this.ventana=ventana;
    }
    public void escribirErrores(Error lista){
            ventana.areaError.setText(ventana.areaError.getText()+lista.toString()+"\n");
        
    }

    //public static LinkedList<Error> tablaErrorLexico = new LinkedList<Error>();


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public AnalizadorLexico(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public AnalizadorLexico(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 138) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 13: 
          { System.out.println("carpeta"); return new Symbol(Simbolos.CARPETA , yycolumn, yyline, yytext());
          }
        case 19: break;
        case 4: 
          { System.out.println("menor que"); return new Symbol(Simbolos.MENOR , yycolumn, yyline, yytext());
          }
        case 20: break;
        case 1: 
          { System.out.println("error: "+"Columna: "+yycolumn+" linea: "+ yyline);
                 Error datos = new Error(yytext(),"Error Lexico","Simbolo invalido",yyline,yycolumn);
                 escribirErrores(datos);
          }
        case 21: break;
        case 11: 
          { System.out.println(".csv"); return new Symbol(Simbolos.CSV , yycolumn, yyline, yytext());
          }
        case 22: break;
        case 9: 
          { System.out.println("ruta"); return new Symbol(Simbolos.RUTA , yycolumn, yyline, yytext());
          }
        case 23: break;
        case 7: 
          { System.out.println("comillas"); return new Symbol(Simbolos.COMILLAS , yycolumn, yyline, yytext());
          }
        case 24: break;
        case 18: 
          { System.out.println("proyecto CIERRE"); return new Symbol(Simbolos.PROYECTO_CIERRE , yycolumn, yyline, yytext());
          }
        case 25: break;
        case 8: 
          { System.out.println("igual"); return new Symbol(Simbolos.IGUAL , yycolumn, yyline, yytext());
          }
        case 26: break;
        case 10: 
          { System.out.println("Punto"); return new Symbol(Simbolos.PUNTO , yycolumn, yyline, yytext());
          }
        case 27: break;
        case 5: 
          { System.out.println("diagonal"); return new Symbol(Simbolos.DIAGONAL , yycolumn, yyline, yytext());
          }
        case 28: break;
        case 15: 
          { System.out.println("proyecto"); return new Symbol(Simbolos.PROYECTO , yycolumn, yyline, yytext());
          }
        case 29: break;
        case 16: 
          { System.out.println("ubicacion"); return new Symbol(Simbolos.UBICACION , yycolumn, yyline, yytext());
          }
        case 30: break;
        case 2: 
          { System.out.println("palabra"); return new Symbol(Simbolos.PALABRA , yycolumn, yyline, yytext());
          }
        case 31: break;
        case 3: 
          { /*Ignore*/
          }
        case 32: break;
        case 17: 
          { System.out.println("carpeta CIERRE"); return new Symbol(Simbolos.CARPETA_CIERRE , yycolumn, yyline, yytext());
          }
        case 33: break;
        case 14: 
          { System.out.println("archivo"); return new Symbol(Simbolos.ARCHIVO , yycolumn, yyline, yytext());
          }
        case 34: break;
        case 12: 
          { System.out.println("nombre"); return new Symbol(Simbolos.NOMBRE , yycolumn, yyline, yytext());
          }
        case 35: break;
        case 6: 
          { System.out.println("mayor que"); return new Symbol(Simbolos.MAYOR , yycolumn, yyline, yytext());
          }
        case 36: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(Simbolos.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
