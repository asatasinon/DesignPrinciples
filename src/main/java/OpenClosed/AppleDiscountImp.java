package OpenClosed;

/**
 * 创建人：Sinon
 * 创建时间：2020/7/14
 */
public class AppleDiscountImp extends AppleImp {

    private  double DiscountPrice;

    public AppleDiscountImp(int id, String name, Double price) {
            super(id, name, price);
        DiscountPrice = price * 0.6;
    }

    public double getDiscountPrice() {
        return  DiscountPrice;
    }

    public void setDiscountPrice(double discountPrice) {
        DiscountPrice = discountPrice;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AppleDiscountImp{");
        sb.append("ID=").append(super.getID());
        sb.append(", Name=\"").append(super.getName()).append('\"');
        sb.append(", Price=").append(super.getPrice());
        sb.append(", DiscountPrice=").append(DiscountPrice);
        sb.append('}');
        return sb.toString();
    }
}
