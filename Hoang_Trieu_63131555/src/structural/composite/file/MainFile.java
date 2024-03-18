package structural.composite.file;

public class MainFile {
    public static void main(String[] args) {
        Folder data = new Folder("Data (D:)", "12/03/2024");

        Folder taiLieu = new Folder("TaiLieu", "15/03/2024");
        data.add(taiLieu);

        Folder designPattern = new Folder("Design Pattern", "18/03/2024");
        taiLieu.add(designPattern);
        Folder lapTrinhJava = new Folder("LapTrinhJava", "18/03/2024");
        taiLieu.add(lapTrinhJava);
        File ngonNguLapTrinhC = new File("NgonNguLapTrinhC.pdf", "18/03/2024");
        taiLieu.add(ngonNguLapTrinhC);
        Folder lapTrinhThietBiDiDong = new Folder("LapTrinhThietBiDiDong", "18/03/2024");
        taiLieu.add(lapTrinhThietBiDiDong);


        File creationalPattern = new File("CreationalPattern.pptx", "16/03/2024");
        designPattern.add(creationalPattern);
        File structuralPattern = new File("StructuralPattern.pptx", "17/03/2024");
        designPattern.add(structuralPattern);

        File lapTrinhJavaCoBan = new File("LapTrinhJavaCoBan.docx", "19/03/2024");
        lapTrinhJava.add(lapTrinhJavaCoBan);
        File lapTrinhJavaNangCao = new File("LapTrinhJavaNangCao.pdf", "20/03/2024");
        lapTrinhJava.add(lapTrinhJavaNangCao);


        File coBan = new File("CoBan.pptx", "19/03/2024");
        lapTrinhThietBiDiDong.add(lapTrinhJavaCoBan);
        File nangCao = new File("NangCao.pptx", "20/03/2024");
        lapTrinhThietBiDiDong.add(lapTrinhJavaNangCao);


        // Print the folder structure
        System.out.println(data.getStringTreeFolder());
        System.out.println(lapTrinhJavaCoBan.getPath());
        System.out.println(ngonNguLapTrinhC.getPath());
        System.out.println(nangCao.getPath());
    }
}
