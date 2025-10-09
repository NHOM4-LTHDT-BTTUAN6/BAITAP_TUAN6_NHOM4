public class Test 
{
    public static void main(String[] args) 
    {
        QuanLySach ql = new QuanLySach();
        // Tạo một số đối tượng sách
        SachGiaoTrinh sg1 = new SachGiaoTrinh("GT01", "Lap Trinh Java", "Nguyen Van A",
                2023, 5, "Cong nghe thong tin", "Dai hoc");
        SachTieuThuyet st1 = new SachTieuThuyet("TT01", "Harry Potter", "J.K. Rowling",
                2001, 10, "Phieu luu", true);
        // Thêm vào danh sách
        ql.themSach(sg1);
        ql.themSach(st1);
        // Hiển thị toàn bộ danh sách
        ql.hienThiDanhSach();
        // Tìm sách theo mã
        System.out.println("Tim sach co ma GT01:");
        Sach tim = ql.timSach("GT01");
        if (tim != null)
            System.out.println(tim.toString());
        else
            System.out.println("Khong tim thay sach!");
    }
}