package mao.t3;

import java.util.Observable;

/**
 * Project name(项目名称)：java设计模式_观察者模式
 * Package(包名): mao.t3
 * Class(类名): SubscriptionSubject
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/21
 * Time(创建时间)： 14:05
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class SubscriptionSubject extends Observable
{
    //公众号名称
    private final String name;

    public SubscriptionSubject(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    /**
     * 通知消息
     *
     * @param message 消息
     */
    public void sendNotify(String message)
    {
        Message msg = new Message()
                .setMessage(message)
                .setSubjectName(this.getName());
        this.setChanged();
        this.notifyObservers(msg);
        this.clearChanged();
    }
}
