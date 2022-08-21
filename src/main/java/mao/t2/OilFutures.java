package mao.t2;

import java.util.ArrayList;
import java.util.List;

/**
 * Project name(项目名称)：java设计模式_观察者模式
 * Package(包名): mao.t2
 * Class(类名): OilFutures
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/21
 * Time(创建时间)： 13:49
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class OilFutures implements Observable
{
    private float price;

    List<Observer> list;

    public OilFutures(float price)
    {
        this.price = price;
        list = new ArrayList<>(2);
        list.add(new Bear());
        list.add(new Bull());
    }

    @Override
    public void setPrice(float price)
    {
        float beforePrice = this.price;
        this.price = price;
        for (Observer observer : list)
        {
            observer.update(price - beforePrice);
        }
    }
}
