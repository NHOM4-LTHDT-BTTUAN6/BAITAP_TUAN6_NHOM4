import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<Sach> danhSachSach;

    public QuanLySach() {
        danhSachSach = new ArrayList<>();
    }

    public void themSach(Sach s) {
        danhSachSach.add(s);
    }

    public boolean xoaSach(String maSach) {
        return danhSachSach.removeIf(s -> s.getMaSach().equalsIgnoreCase(maSach));
    }

    public boolean capNhatSoLuong(String maSach, int soLuongMoi) {
        for (Sach s : danhSachSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                s.setSoLuong(soLuongMoi);
                return true;
            }
        }
        return false;
    }

    public Sach timKiemTheoMa(String maSach) {
        for (Sach s : danhSachSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) {
                return s;
            }
        }
        return null;
    }

    public void hienThiDanhSach() {
        if (danhSachSach.isEmpty()) {
            System.out.println("Danh sach rong!");
        } else {
            System.out.println("\n=== DANH SACH SACH TRONG THU VIEN ===");
            for (Sach s : danhSachSach) {
                System.out.println(s.toString());
            }
        }
    }
}