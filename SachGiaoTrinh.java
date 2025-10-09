public class SachGiaoTrinh extends Sach 
{
    private String monHoc;
    private String capDo;
    public SachGiaoTrinh(String maSach, String tieuDe, String tacGia,int namXuatBan, int soLuong,String monHoc, String capDo) 
    {
        // Gọi constructor của lớp cha
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.monHoc = monHoc;
        this.capDo = capDo;
    }
    @Override
    public String toString() 
    {
        return super.toString() +
               "\nMon hoc: " + monHoc +
               "\nCap do: " + capDo;
    }
}