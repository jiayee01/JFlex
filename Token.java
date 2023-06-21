public class Token {
  private TokenType type;
  private String lexeme;

  public Token(TokenType type, String lexeme) {
    this.type = type;
    this.lexeme = lexeme;
  }

  public Token(TokenType type) {
    this.type = type;
    this.lexeme = "";
  }

  public TokenType getType() {
    return type;
  }

  public String getLexeme() {
    return lexeme;
  }

  @Override
  public String toString() {
    return "<type="+type+", "+"lexeme="+"\'"+lexeme+"\'"+">";
  }
}
