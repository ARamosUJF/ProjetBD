/* Generated By:JavaCC: Do not edit this line. Reader.java */
package jus.aoo.boole.reader;
import jus.aoo.boole.circuit.*;

public class Reader extends ReaderUtilities implements ReaderConstants {
  public static void main(String args []) throws ParseException
  {
    Reader parser = new Reader(System.in);
//    while (true){
      System.out.println("Reading from standard input...");
      System.out.print("Enter an expression like \u005c"1+(2+3)*4;\u005c" :");
      try
      {
                parser.DEF_CIRCUIT();
                System.out.println("OK.");
      }
      catch (Exception e)
      {
        System.out.println("NOK.");
        System.out.println(e.getMessage());
      }
      catch (Error e)
      {
        System.out.println("Oops.");
        System.out.println(e.getMessage());
 //       break;
      }
    }
        public static Circuit read() throws Exception{
        Reader parser = new Reader(System.in);

        return parser.DEF_CIRCUIT();
        }

  final public Circuit DEF_CIRCUIT() throws ParseException {
                        Circuit c=new Circuit();Token t;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case CIRCUIT:
      jj_consume_token(CIRCUIT);
      t = jj_consume_token(ID);
      c = CIRCUIT();
      break;
    default:
      jj_la1[0] = jj_gen;
      ;
    }
    jj_consume_token(14);
                                      {if (true) return c;}
    throw new Error("Missing return statement in function");
  }

  final public Circuit CIRCUIT() throws ParseException {
                   Circuit c=new Circuit();
    label_1:
    while (true) {
      DEF_COMPOSANT();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 15:
        ;
        break;
      default:
        jj_la1[1] = jj_gen;
        break label_1;
      }
    }
                     {if (true) return c;}
    throw new Error("Missing return statement in function");
  }

  final public void DEF_COMPOSANT() throws ParseException {
    jj_consume_token(15);
    jj_consume_token(NUM);
    jj_consume_token(16);
    jj_consume_token(ID);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case FLECHE:
      jj_consume_token(FLECHE);
      DEF_CONNEXION_INTERNE();
      label_2:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case 17:
          ;
          break;
        default:
          jj_la1[2] = jj_gen;
          break label_2;
        }
        jj_consume_token(17);
        DEF_CONNEXION_INTERNE();
      }
      break;
    default:
      jj_la1[3] = jj_gen;
      ;
    }
    jj_consume_token(18);
  }

  final public void DEF_CONNEXION_INTERNE() throws ParseException {
    jj_consume_token(DIESE);
    jj_consume_token(NUM);
    jj_consume_token(PARO);
    DEF_CONNEXION();
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 17:
        ;
        break;
      default:
        jj_la1[4] = jj_gen;
        break label_3;
      }
      jj_consume_token(17);
      DEF_CONNEXION();
    }
    jj_consume_token(PARF);
  }

  final public void DEF_CONNEXION() throws ParseException {
                      Token t1, t2;
    t1 = jj_consume_token(NUM);
    jj_consume_token(DIESE);
    t2 = jj_consume_token(NUM);
                                  int cs = Integer.parseInt(t1);
  }

  /** Generated Token Manager. */
  public ReaderTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[5];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x20,0x8000,0x20000,0x2000,0x20000,};
   }

  /** Constructor with InputStream. */
  public Reader(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Reader(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new ReaderTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Reader(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new ReaderTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Reader(ReaderTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(ReaderTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 5; i++) jj_la1[i] = -1;
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[19];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 5; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 19; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

  }
