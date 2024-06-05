package structural.decorater.B2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveStopword extends TokenizeDecorator{
    List<String> stopword;
    public RemoveStopword(Tokenize tokenize) {
        super(tokenize);
        stopword = new ArrayList<String>(Arrays.asList("thì","và","hoặc","mà"," là"));
    }

    @Override
    public List<String> tokenize() {
        List<String> kq = tokenize.tokenize();
        kq.removeAll(stopword);
        return kq;
    }
}
