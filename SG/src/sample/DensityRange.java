package sample;

public class DensityRange {
    private int karat;
    private double minRange;
    private double maxRange;
    private double density;

    public DensityRange(double density){
        this.density=density;
        range();
    }

    public void range(){
        if (this.density >= 19.3 && this.density <= 19.51){
            this.karat = 24;
            this.minRange=19.3;
            this.maxRange=19.51;
        } else if (this.density >= 17.45 && this.density <= 18.24){
            this.karat = 22;
            this.minRange=17.45;
            this.maxRange=18.24;
        } else if (this.density >= 16.03 && this.density <= 17.11){
            this.karat = 20;
            this.minRange=16.03;
            this.maxRange=17.11;
        } else if (this.density >= 14.84 && this.density <= 16.12){
            this.karat = 18;
            this.minRange=14.84;
            this.maxRange=16.12;
        } else if (this.density >= 12.91 && this.density <= 14.44){
            this.karat = 14;
            this.minRange=12.91;
            this.maxRange=14.44;
        } else if (this.density >= 11.42 && this.density <= 13.09){
            this.karat = 10;
            this.minRange=11.42;
            this.maxRange=13.09;
        }
    }

    public int getKarat() {
        return karat;
    }

    public void setKarat(int karat) {
        this.karat = karat;
    }

    public double getMinRange() {
        return minRange;
    }

    public void setMinRange(double minRange) {
        this.minRange = minRange;
    }

    public double getMaxRange() {
        return maxRange;
    }

    public void setMaxRange(double maxRange) {
        this.maxRange = maxRange;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }
}
