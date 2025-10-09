package quanlysach;

public class Testbook {
    public static void main(String[] args) {
        BookManager ql = new BookManager();

        // Tạo sách giáo trình
        Textbook sgk = new Textbook("TB01", "Lap trinh Java", "Nguyen Van A", 2023, 10, "Cong nghe thong tin", "Dai hoc");

        // Tạo sách tiểu thuyết
        Novel tth = new Novel("NV01", "Harry Potter", "J.K. Rowling", 2015, 5, "Phieu luu", true);

        // Thêm vào danh sách
        ql.themSach(sgk);
        ql.themSach(tth);

        // Hiển thị
        System.out.println("Danh sach trong thu vien");
        ql.hienThiDanhSach();
    }
}
