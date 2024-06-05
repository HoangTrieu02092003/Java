package structural.decorater.B2;

public abstract class TokenizeDecorator implements Tokenize{
    Tokenize tokenize;

    public TokenizeDecorator(Tokenize tokenize) {
        this.tokenize = tokenize;
    }
}
