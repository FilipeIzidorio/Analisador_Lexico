
package com.Auxiliares;

public class PalavrasChave {

  private static final String CHAR   = "char";
  private static final String ELSE = "else";
  private static final String FALSE = "false";
  private static final String INT   = "int";
  private static final String IF   = "if";
  private static final String MAIN = "main";
  private static final String OUT = "out";
  private static final String PRINTF   = "printf";
  private static final String RETURN = "return";
  private static final String STATIC = "static";
  private static final String VOID   = "void";
  private static final String WHILE = "while";
  //NOVO
  private static final String CLASS = "class";
  private static final String PUBLIC = "public";
  private static final String PRIVATE = "private";
  private static final String NEW = "new";
  private static final String THIS = "this";
  private static final String IMPORT = "import";
  private static final String PACKAGE = "package";

  public static boolean isPalavraChave(StringBuffer palavra) {
    String palavra1 = palavra.toString();
    return palavra1.equals(CHAR) || palavra1.equals(ELSE) || palavra1.equals(FALSE) ||
            palavra1.equals(INT) || palavra1.equals(IF) || palavra1.equals(MAIN) ||
            palavra1.equals(OUT) || palavra1.equals(PRINTF) || palavra1.equals(RETURN) ||
            palavra1.equals(STATIC) || palavra1.equals(VOID) || palavra1.equals(WHILE) ||
            palavra1.equals(CLASS) || palavra1.equals(PUBLIC) || palavra1.equals(PRIVATE) ||
            palavra1.equals(NEW) || palavra1.equals(THIS) || palavra1.equals(IMPORT) ||
            palavra1.equals(PACKAGE);
  }
	
  public static int tipoPalavraChave(StringBuffer palavra) {
		
    String palavra1 = palavra.toString();
	
    int resultado;
	
    if ( palavra1.equals(CHAR) ) {
    	
      resultado = Token.CHAR;
      
    } else if (palavra1.equals(ELSE)) {

      resultado = Token.ELSE;

    } else if (palavra1.equals(FALSE)) {
  
      resultado = Token.FALSE;

    } else if (palavra1.equals(INT)) {
  
      resultado = Token.INT;
	
    } else if (palavra1.equals(IF)) {
  
      resultado = Token.IF;
  	
    } else if (palavra1.equals(MAIN)) {
    
      resultado = Token.MAIN;
    	
    } else if (palavra1.equals(OUT)) {
       
      resultado = Token.OUT;
    	
    } else if (palavra1.equals(PRINTF)) {
        
      resultado = Token.PRINTF;
    	
    } else if (palavra1.equals(RETURN)) {
       
      resultado = Token.RETURN;
    	
    } else if (palavra1.equals(STATIC)) {
        
      resultado = Token.STATIC;
    	
    } else if (palavra1.equals(VOID)) {
        
      resultado = Token.VOID;

    	
    } else if (palavra1.equals(WHILE)) {
      resultado = Token.WHILE;

    } else if (palavra1.equals(CLASS)) {
      return Token.CLASS;
    } else if (palavra1.equals(PUBLIC)) {
      return Token.PUBLIC;
    } else if (palavra1.equals(PRIVATE)) {
      return Token.PRIVATE;
    } else if (palavra1.equals(NEW)) {
      return Token.NEW;
    } else if (palavra1.equals(THIS)) {
      return Token.THIS;
    } else if (palavra1.equals(IMPORT)) {
      return Token.IMPORT;
    } else {
      return Token.PACKAGE;
    }

    return resultado;
	
  }

}
