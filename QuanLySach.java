import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<Sach> danhSachSach;

    public QuanLySach() {
        danhSachSach = new ArrayList<>();
    }
    public void themSach(Sach s) {
        danhSachSach.add(s);
    }
    public void xoaSach(String maSach) {
        danhSachSach.removeIf(s -> s.getMaSach().equalsIgnoreCase(maSach));
    }
    public Sach timSach(String maSach) {
        for (Sach s : danhSachSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }
    public void capNhatSoLuong(String maSach, int soLuongMoi) {
        Sach s = timSach(maSach);
        if (s != null) {
            s.setSoLuong(s.getSoLuong() + soLuongMoi);

        } else {
            System.out.println("Không tìm thấy sách có mã: " + maSach);
        }
    }
    public void hienThiTatCa() {
        for (Sach s : danhSachSach) {
            System.out.println(s.toString());
        }
    }
}
