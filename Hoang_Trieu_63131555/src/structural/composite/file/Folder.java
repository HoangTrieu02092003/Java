package structural.composite.file;

import java.util.ArrayList;
import java.util.List;

public class Folder extends AbtrarctFile{
    List<AbtrarctFile> children = new ArrayList<>();
    public Folder(String ten, String ngayTao) {
        super(ten, ngayTao);
        this.children = new ArrayList<>();
    }

    @Override
    public void add(AbtrarctFile file) {
        children.add(file);
        file.duongDan = this.duongDan + "\\" + file.duongDan;
    }

    @Override
    public void remove(AbtrarctFile file) {
        children.remove(file);
    }

    @Override
    public String getStringTreeFolder() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.ten);
        for (AbtrarctFile child : children) {
            builder.append("\n\t").append(child.getStringTreeFolder().replaceAll("\n","\n\t"));
        }
        return builder.toString();
    }
}
