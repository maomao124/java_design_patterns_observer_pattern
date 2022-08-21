package mao.t1;

import java.util.ArrayList;
import java.util.List;

/**
 * Project name(项目名称)：java设计模式_观察者模式
 * Package(包名): mao.t1
 * Class(类名): SubscriptionSubject
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/21
 * Time(创建时间)： 13:17
 * Version(版本): 1.0
 * Description(描述)： 具体主题（具体被观察者）
 */

public class SubscriptionSubject implements Subject
{
    //公众号的名称
    private final String name;

    private final List<Observer> userList;

    public SubscriptionSubject(String name)
    {
        this.name = name;
        userList = new ArrayList<>();
    }

    @Override
    public void attach(Observer observer)
    {
        userList.add(observer);
    }

    @Override
    public void detach(Observer observer)
    {
        userList.remove(observer);
    }

    @Override
    public void notify(String message)
    {
        for (Observer observer : userList)
        {
            observer.update(message, name);
        }
    }
}
