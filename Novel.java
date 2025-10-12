package quanlysach;

public class Novel extends Book {
    private String theLoai;
    private boolean laSachSeries;

    // Constructor đầy đủ
    public Novel(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong, String theLoai, boolean laSachSeries) {
        super(maSach, tieuDe, tacGia, namXuatBan, soLuong);
        this.theLoai = theLoai;
        this.laSachSeries = laSachSeries;
    }

    // Getter & Setter
    public String getTheLoai() 
    { 
        return theLoai; 
    }
    public void setTheLoai(String theLoai) 
    { 
        this.theLoai = theLoai; 
    }
    public boolean getLaSachSeries() 
    { 
        return laSachSeries; 
    }
    public void setLaSachSeries(boolean laSachSeries) 
    { 
        this.laSachSeries = laSachSeries;
     }

    // Ghi đè phương thức toString()
    @Override
    public String toString() {
        return super.toString() + 
               ", The loai: " + theLoai +
               ", Series: " + (laSachSeries ? "Co" : "Khong");
    }
}
