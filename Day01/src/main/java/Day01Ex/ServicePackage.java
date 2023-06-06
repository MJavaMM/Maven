package Day01Ex;

public abstract class ServicePackage {
    public double price;
    public abstract void showInfo();

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
