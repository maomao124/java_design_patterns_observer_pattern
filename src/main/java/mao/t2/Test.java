package mao.t2;

/**
 * Project name(项目名称)：java设计模式_观察者模式
 * Package(包名): mao.t2
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/21
 * Time(创建时间)： 13:55
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    public static void main(String[] args)
    {
        Observable observable = new OilFutures(29);
        observable.setPrice(28);
        observable.setPrice(25);
        observable.setPrice(26);
        observable.setPrice(30);
    }
}
