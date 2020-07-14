package OpenClosed;

/**
 * 创建人：Sinon
 * 创建时间：2020/7/14
 * 开闭原则（Open-Closed Principle, OCP）：
 * 指一个软件实体（如：类、模块、函数）应该对扩展开放，对修改关闭。
 * 开闭即对扩展、修改两个行为的一个原则。
 * 强调的是：用抽象构建框架，用实现扩展细节。
 * 作用：提高系统的可复用性与可维护性。
 */
public class OpenClosedTest {
    public static void main(String[] args) {
        /*
         水果的实现类：AppleImp（苹果），只能以固定售价售卖，假如要打折，该类没有对应的方法进行售卖；
         如果修改 AppleImp 类，则有可能对曾经引用过该类的代码有影响；
         为了不影响已有的代码，则需要新增一个继承类 AppleDiscountImp；
         如果需要打折，则可以调用AppleDiscountImp类，进行打折售卖；
        */

        //水果的实现类，固定价格售卖
        AppleImp apple = new AppleImp(1, "Apple", 10.0D);
        System.out.println(apple);

        //AppleImp的继承类 AppleDiscountImp，可以以折扣价格售卖
        AppleDiscountImp appleDiscount = new AppleDiscountImp(1, "Apple", 10.0D);
        System.out.println(appleDiscount);

    }
}
