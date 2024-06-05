package structural.decorater.B1;

public class GiaTriTuyetDoi extends BieuThucDecorator{


    public GiaTriTuyetDoi(BieuThuc bieuThuc) {
        super(bieuThuc);
    }

    @Override
    public float giaTri() {
        if(bieuThuc.giaTri() >=0)
            return bieuThuc.giaTri();
        else return -bieuThuc.giaTri();
    }

    @Override
    public String bieuThuc() {
        return "|"+ bieuThuc.giaTri()+"|";
    }
}
