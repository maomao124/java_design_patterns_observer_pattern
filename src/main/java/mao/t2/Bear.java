package mao.t2;

/**
 * Project name(项目名称)：java设计模式_观察者模式
 * Package(包名): mao.t2
 * Class(类名): Bear
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/21
 * Time(创建时间)： 13:46
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Bear implements Observer
{
    @Override
    public void update(float price)
    {
        if (price > 0)
        {
            System.out.println("油价上涨" + price + "元，空方伤心了！");
        }
        else
        {
            System.out.println("油价下跌" + (-price) + "元，空方高兴了！");
        }
    }
}
