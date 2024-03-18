package builder_pattern.A1;

import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    private HoaDonHeader hoaDonHeader;
    private List<CTHD> CTHD;

    private HoaDon(Builder builder)
    {
        this.hoaDonHeader = builder.hoaDonHeader;
        this.CTHD = builder.DSCTHD;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append(hoaDonHeader).append("\n")
                .append("Chi tiết hóa đơn");
        for (CTHD c: CTHD)
            builder.append("\n")
                    .append(c.toString());
        return builder.toString();
    }

    public static class Builder {
        HoaDonHeader hoaDonHeader;
        ArrayList<CTHD> DSCTHD = new ArrayList<>();

        public Builder()
        {}

        public Builder getHoaDonHeader(HoaDonHeader hoaDonHeader)
        {
            this.hoaDonHeader = hoaDonHeader;
            return this;
        }

        public Builder getCTHD(CTHD cthd)
        {
            this.DSCTHD.add(cthd);
            return this;
        }

        public HoaDon build()
        {
            return new HoaDon(this);
        }
    }

}
