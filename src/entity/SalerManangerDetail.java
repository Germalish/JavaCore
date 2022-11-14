package entity;

public class SalerManangerDetail {
    protected Product product;
    protected int SoLuong;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    @Override
    public String toString() {
        return "SalerManangerDetail{" +
                "product=" + product +
                ", SoLuong=" + SoLuong +
                '}';
    }

    public SalerManangerDetail(Product product, int soLuong) {
        this.product = product;
        SoLuong = soLuong;
    }
}
