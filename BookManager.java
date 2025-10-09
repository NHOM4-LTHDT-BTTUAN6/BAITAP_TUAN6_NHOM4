package quanlysach;
import java.util.ArrayList;

public class BookManager {
    private ArrayList<Book> danhSachSach = new ArrayList<>();

    // Thêm sách
    public void themSach(Book sach) {
        danhSachSach.add(sach);
    }

    // Xoá sách theo mã
    public void xoaSach(String maSach) {
        danhSachSach.removeIf(sach -> sach.getMaSach().equalsIgnoreCase(maSach));
    }

    // Tìm kiếm theo mã
    public Book timKiem(String maSach) {
        for (Book sach : danhSachSach) {
            if (sach.getMaSach().equalsIgnoreCase(maSach)) {
                return sach;
            }
        }
        return null;
    }

    // Hiển thị toàn bộ danh sách
    public void hienThiDanhSach() {
        for (Book sach : danhSachSach) {
            sach.hienThiThongTin();
        }
    }
}
