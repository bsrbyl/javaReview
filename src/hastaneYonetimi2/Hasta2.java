package hastaneYonetimi2;

import hastaneYonetimi2.HastaneMethod2;

public class Hasta2 {

    private String isim;
    private String soyIsim;
    private int hastaID;
    private String hastaDurumu;

    public Hasta2() {
    }

    public Hasta2(String isim, String soyIsim, String hastaDurumu) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.hastaDurumu = hastaDurumu;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public int getHastaID() {
        return hastaID;
    }

    public void setHastaID(int hastaID) {
        this.hastaID = hastaID;
    }

    public String getHastaDurumu() {
        return hastaDurumu;
    }

    public void setHastaDurumu(String hastaDurumu) {
        this.hastaDurumu = hastaDurumu;
    }

    @Override
    public String toString() {
        return "Hasta :\nhastaID=" + hastaID  +
                "\nisim='" + isim + '\'' +
                "\nsoyIsim='" + soyIsim + '\'';
    }
}
