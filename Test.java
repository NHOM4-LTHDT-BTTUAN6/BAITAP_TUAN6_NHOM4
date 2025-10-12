public class Test {
    public static void main(String[] args) {
        Sach s1 = new Sach("S001", "Lap trinh Java", "Nguyen Van A", 2022, 10);
        Sach s2 = new Sach("S002", "Lap trinh C", "Tran Thi B", 2023, 5);
        s1.hienThiThongTin();
        s2.hienThiThongTin();

        QuanLySach ql = new QuanLySach();

        SachTieuThuyet tt1 = new SachTieuThuyet("TT01", "Cuon theo chieu gio", "Margaret Mitchell", 2015, 100, "Tinh cam", true);
        SachTieuThuyet tt2 = new SachTieuThuyet("TT02", "Dac nhan tam", "Dale Carnegie", 2020, 80, "Tam ly", false);
    
        SachGiaoTrinh gt1 = new SachGiaoTrinh("GT01", "Lap trinh Java", "Nguyen Van An", 2023, 50, "CNTT", "Dai hoc");
        SachGiaoTrinh gt2 = new SachGiaoTrinh("GT02", "Toan cao cap", "Le Van Binh", 2022, 30,  "Toan hoc", "Dai hoc");
        ql.themSach(tt1);
        ql.themSach(tt2);
        ql.themSach(gt1);
        ql.themSach(gt2);
        
        ql.hienThiDanhSach();

        System.out.println("\nKet qua tim kiem ma 'TT01':");
        System.out.println(ql.timKiemSach("TT01"));

        ql.capNhatSoLuong("GT02",11);
        System.out.println("\n Danh sách sau khi cap nhat so luong sach GT02:");
        ql.hienThiDanhSach();

        ql.xoaSach("GT01");
        System.out.println("\nSau khi xoa sach GT01:");
        ql.hienThiDanhSach();
    }
}
