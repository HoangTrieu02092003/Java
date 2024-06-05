package structural.decorater.B2;


import java.util.List;

public class RemovePunc extends TokenizeDecorator{
    public RemovePunc(Tokenize tokenize) {
        super(tokenize);
    }

    @Override
    public List<String> tokenize() {
        List<String> kq = tokenize.tokenize();
        kq.replaceAll(s -> {
            return s.replaceAll( "\\p{Punct}", "");
        });
        return kq;
    }
}
