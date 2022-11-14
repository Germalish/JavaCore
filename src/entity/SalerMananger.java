package entity;

import java.util.Arrays;

public class SalerMananger {
    private Saler saler;
    private SalerManangerDetail[] salerManangerDetails;
    private int totalProduct;

    public int getTotalProduct() {
        return totalProduct;
    }

    public void setTotalProduct(int totalProduct) {
        this.totalProduct = totalProduct;
    }

    public Saler getSaler() {
        return saler;
    }

    public void setSaler(Saler saler) {
        this.saler = saler;
    }

    public SalerManangerDetail[] getSalerManangerDetails() {
        return salerManangerDetails;
    }

    public void setSalerManangerDetails(SalerManangerDetail[] salerManangerDetails) {
        this.salerManangerDetails = salerManangerDetails;
    }

    @Override
    public String toString() {
        return "SalerMananger{" +
                "saler=" + saler +
                ", salerManangerDetails=" + Arrays.toString(salerManangerDetails) +
                '}';
    }

    public SalerMananger(Saler saler, SalerManangerDetail[] salerManangerDetails) {
        this.saler = saler;
        this.salerManangerDetails = salerManangerDetails;
    }
}
