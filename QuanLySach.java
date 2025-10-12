import java.util.ArrayList;

public class QuanLySach {
    private ArrayList<Sach> danhSachSach;

    public QuanLySach(){
        danhSachSach = new ArrayList<>();
    }
    public void themSach(Sach s){
        danhSachSach.add(s);
    }
    public boolean xoaSach(String maSach){
        return danhSachSach.removeIf(s -> s.getMaSach().equalsIgnoreCase(maSach));
    }
    public Sach timKiemSach(String maSach){
        for (Sach s : danhSachSach){
            if (s.getMaSach().equalsIgnoreCase(maSach)){
                return s;
            }
        }
    return null;
    }
    public boolean capNhatSoLuong(String maSach, int soLuongMoi){
    boolean daCapNhat = false;
    for (Sach s : danhSachSach){
        if (s.getMaSach().equalsIgnoreCase(maSach)){
            s.setSoLuong(soLuongMoi);
            daCapNhat = true;
        }
    }
        return daCapNhat;
    }
    public void hienThiDanhSach(){
        if (danhSachSach.isEmpty()){
            System.out.println("Danh sach trong.");
            return;
        }
        for (Sach s : danhSachSach){
            System.out.println("\n---DANH SACH SACH---");
            System.out.println(s.toString());
        }
    }
}