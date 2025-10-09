import java.util.ArrayList;
public class QuanLySach 
{
    private ArrayList<Sach> danhSach;
    public QuanLySach() 
    {
        danhSach = new ArrayList<>();
    }
    public void themSach(Sach s) 
    {
        danhSach.add(s);
    }
    public void xoaSach(String maSach) 
    {
        danhSach.removeIf(s -> s.getMaSach().equalsIgnoreCase(maSach));
    }

    public Sach timSach(String maSach) 
    {
        for (Sach s : danhSach) {
            if (s.getMaSach().equalsIgnoreCase(maSach)) 
            {
                return s;
            }
        }
        return null;
    }
    public void hienThiDanhSach() 
    {
        for (Sach s : danhSach) {
            System.out.println(s.toString());
            System.out.println("---------------------------");
        }
    }
}