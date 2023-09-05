import java.util.Objects;

class SmartphonePrice implements Cloneable {
    private String priceType;
    private double priceInEuros;

    public SmartphonePrice(String priceType, double priceInEuros) {
        this.priceType = priceType;
        this.priceInEuros = priceInEuros;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Smartphone clonedSMartphone = (Smartphone) super.clone();
        return clonedSMartphone;
    }

    @Override
    public String toString() {
        return "SmartphonePrice{" +
                "priceType='" + priceType + '\'' +
                ", priceInEuros=" + priceInEuros +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartphonePrice that = (SmartphonePrice) o;
        return Double.compare(priceInEuros, that.priceInEuros) == 0 && Objects.equals(priceType, that.priceType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceType, priceInEuros);
    }


}