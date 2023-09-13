package btjava.bt3;

public class GiaoVien extends CaNhan{
    String  monDay,toBoMon;

    public GiaoVien(String hoTen, String diaChi, String sdt, int tuoi, String monDay, String toBoMon) {
        super(hoTen, diaChi, sdt, tuoi);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public String getToBoMon() {
        return toBoMon;
    }

    public void setToBoMon(String toBoMon) {
        this.toBoMon = toBoMon;
    }
}
