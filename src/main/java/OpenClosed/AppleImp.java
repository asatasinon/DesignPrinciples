package OpenClosed;

/**
 * 创建人：Sinon
 * 创建时间：2020/7/14
 */
public class AppleImp implements IFruits {
    private  int ID;
    private  String Name;
    private  Double Price;

    public AppleImp(int id, String name, Double price) {
        ID = id;
        Name = name;
        Price = price;
    }

    public AppleImp() {

    }

    @Override
    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    @Override
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("AppleImp{");
        sb.append("ID=").append(ID);
        sb.append(", Name=\"").append(Name).append('\"');
        sb.append(", Price=").append(Price);
        sb.append('}');
        return sb.toString();
    }
}
