package TypeofProduct;

public enum Type_Of_Product {
    DIEN_TU("Điện tử"),
    DIEN_LANH("Điện lạnh"),
    MAY_TINH("Máy tính"),
    THIET_BI_VP("Thiết bị văn phòng");
    public String value;

    Type_Of_Product(String value) {
        this.value = value;
    }
}
