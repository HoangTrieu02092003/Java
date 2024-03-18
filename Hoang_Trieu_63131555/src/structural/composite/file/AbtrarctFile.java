package structural.composite.file;

public abstract class AbtrarctFile {
    String ten, ngayTao, duongDan;

    public AbtrarctFile(String ten, String ngayTao) {
        this.ten = ten;
        this.ngayTao = ngayTao;
        this.duongDan = ten;
    }

    public abstract void add(AbtrarctFile file);
    public abstract void remove(AbtrarctFile file);
    public abstract String getStringTreeFolder();
    public String getPath(){
        return duongDan;
    }
}
