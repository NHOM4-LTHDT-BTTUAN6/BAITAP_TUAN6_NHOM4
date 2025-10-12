public class Test {
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();

        SachGiaoTrinh sg1 = new SachGiaoTrinh("GT01", "Giai tich 1", "Nguyen Van A", 2022, 10, "Toan hoc", "Dai hoc");
        SachGiaoTrinh sg2 = new SachGiaoTrinh("GT02", "Ly dai cuong", "Tran Van B", 2021, 5, "Vat ly", "Pho thong");

   
        SachTieuThuyet st1 = new SachTieuThuyet("TT01", "Harry Potter", "J.K. Rowling", 2010, 3, "Ky ao", true);
        SachTieuThuyet st2 = new SachTieuThuyet("TT02", "De Men Phieu Luu Ky", "To Hoai", 1999, 7, "Thieu nhi", false);

 
        ql.themSach(sg1);
        ql.themSach(sg2);
        ql.themSach(st1);
        ql.themSach(st2);

        ql.hienThiDanhSach();

        System.out.println("\nKet qua tim kiem ma 'TT01':");
        System.out.println(ql.timKiemTheoMa("TT01"));

        ql.capNhatSoLuong("GT01", 12);
        System.out.println("\nSau khi cap nhat so luong sach GT01:");
        ql.hienThiDanhSach();

        ql.xoaSach("TT02");
        System.out.println("\nSau khi xoa sach TT02:");
        ql.hienThiDanhSach();
    }
}