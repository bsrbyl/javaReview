package hastaneYonetimi2;

public class Durum2 {
    private String aktuelDurum;
    private boolean aciliyet;

    public Durum2() {
    }

    public Durum2(String aktuelDurum, boolean aciliyet) {
        this.aktuelDurum = aktuelDurum;
        this.aciliyet = aciliyet;
    }

    public String getAktuelDurum() {
        return aktuelDurum;
    }

    public void setAktuelDurum(String aktuelDurum) {

        this.aktuelDurum = HastaneMethod2.durum;
    }

    public boolean isAciliyet() {
        return aciliyet;
    }

    public void setAciliyet(boolean aciliyet) {
        this.aciliyet = aciliyet;
    }
}
