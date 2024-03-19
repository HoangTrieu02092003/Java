package behavioral.chain_of_responsibility.F88;

public class ChuTich extends ChoVayF88{
    public ChuTich(String ten, String chucVu, int hanMucXuLyVay) {
        super(ten, chucVu, hanMucXuLyVay);
    }

    @Override
    public ChoVayF88 capCaoHon(ChoVayF88 capCao) {
        return null;
    }

    @Override
    public String xuLyVay(int soTienVay) {
        if(soTienVay <= hanMucXuLyVay){
            StringBuilder builder = new StringBuilder();
            builder.append(chucVu).append(" ").append(ten)
                    .append(" duyệt số tiền vay: ").append(soTienVay)
                    .append(" \n Nhớ trả lãi đúng hạn.");
            return builder.toString();
        }
        return "Không cho vay";
    }
}
