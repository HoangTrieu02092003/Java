package stratery.CC2;

import bt_java.bt4.ChuyenXe;

import java.util.ArrayList;
import java.util.List;

public class QLSV {
    ISoSanh soSanh;

    public QLSV setSoSanh(ISoSanh soSanh) {
        this.soSanh = soSanh;
        return this;
    }

    public void them(SinhVien sinhVien){
        list.add(sinhVien);
    }
    List<SinhVien> list = new ArrayList<>();
    public void sapXep(){
        for (int i=0;i<list.size()-1;i++){
            for (int j=i+1;j<list.size();j++){
                //Nếu phần tử i lớn hơn phần tử j
                if (soSanh.soSanh(list.get(i),list.get(j))>0){
                    //Chuyển j về i
                    SinhVien tam = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, tam);
                }
            }
        }
    }
    public void sapXep2(){
        list.sort((o1, o2) -> soSanh.soSanh(o1,o2));
    }
    public void inDS(){
        for (SinhVien s:list)
            System.out.println(s.toString());
    }

}
