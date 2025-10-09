public class Test {
    public static void main(String[] args) {
        // Tạo đối tượng Sach
        Sach sach1 = new Sach("S001", "Lap trinh Java", "Ts.Nguyen Tan Thuan", 2022, 150);
        Sach sach2 = new Sach("S002", "Co so du lieu II", "Ths.Nguyen Thi Thu Quyen", 2022, 100);
        Sach sach3 = new Sach();
        sach3.setMaSach("S003");
        sach3.setTieuDe("Thiet ke web");
        sach3.setTacGia("Ths.Tran Buu Dung");
        sach3.setNamXuatBan(2022);
        sach3.setSoLuong(120);

        // Tạo sách kế thừa từ Sach
        SachGiaoTrinh gt1 = new SachGiaoTrinh("GT01", "Lap trinh C", "Ts.Hoang Thi My Le", 2023, 150, "Lap trinh", "Dai hoc");
        SachTieuThuyet tt1 = new SachTieuThuyet("TT01", "Harry Potter", "J.K.Rowling", 2007, 800, "Phieu luu", true);

        // Tạo đối tượng QuanLySach để quản lý
        QuanLySach ql = new QuanLySach();

        // Thêm sách vào danh sách quản lý
        ql.themSach(sach1);
        ql.themSach(sach2);
        ql.themSach(sach3);
        ql.themSach(gt1);
        ql.themSach(tt1);

        // Hiển thị toàn bộ danh sách
        System.out.println("---- DANH SACH SACH HIEN CO ----");
        ql.hienThiTatCa();

        // Tìm sách
        System.out.println("---- TIM SACH MA GT01 ----");
        Sach ketQua = ql.timSach("GT01");
        if (ketQua != null) {
            System.out.println(ketQua);
        }
        // Cập nhật số lượng
        System.out.println("---- CAP NHAT SO LUONG CHO SACH TT01 ----");
        ql.capNhatSoLuong("TT01", 25);
        //Hiển thị toàn bộ danh sách sau khi cập nhật
        System.out.println("---- DANH SACH TAT CA CAC LOAI SACH SAU KHI CAP NHAT ----");
        ql.hienThiTatCa();
        // Xóa sách
        System.out.println("---- XOA SACH MA S003 ----");
        ql.xoaSach("S003");
        ql.hienThiTatCa();
    }
}
