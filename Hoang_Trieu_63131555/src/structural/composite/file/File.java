package structural.composite.file;

public class File extends AbtrarctFile{
    public File(String ten, String ngayTao) {
        super(ten, ngayTao);
    }

    @Override
    public void add(AbtrarctFile file) {

    }

    @Override
    public void remove(AbtrarctFile file) {

    }

    @Override
    public String getStringTreeFolder() {
        return this.ten;
    }
}
