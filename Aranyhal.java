package dolgozat;

import java.util.List;

public class Aranyhal {
    private int KIVANSAGOKSZAMA = 3;
    private int kor;
    private String kifogta;
    private int [] kivansagok;

    public Aranyhal(String kifogta) {
        this.kifogta = kifogta;
    }

    public Aranyhal(int kor, String kifogta) {
        this.kor = kor;
        this.kifogta = kifogta;
    }

    public int getKor() {
        return kor;
    }

    public void setKifogta(String kifogta) {
        this.kifogta = kifogta;
    }

    public int kivansagokSzama(String kifogta){
        return 0;
    }
    public String kikkelTalalkozott(){
        return "";
    }
    
    public boolean kivansagotTeljesit(String kivansag){
        return false;
    }

    @Override
    public String toString() {
        return "Aranyhal{" + "KIVANSAGOKSZAMA=" + KIVANSAGOKSZAMA + ", kor=" + kor + ", kifogta=" + kifogta + ", kivansagok=" + kivansagok + '}';
    }
    
}
