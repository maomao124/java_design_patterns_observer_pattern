package mao.t3;

import java.util.Observable;
import java.util.Observer;

/**
 * Project name(项目名称)：java设计模式_观察者模式
 * Package(包名): mao.t3
 * Class(类名): WechatUser
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/21
 * Time(创建时间)： 14:03
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class WechatUser implements Observer
{
    //微信用户名
    private final String name;

    public WechatUser(String name)
    {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg)
    {
        Message message = (Message) arg;
        System.out.println("微信用户" + name + "接收到" + message.getSubjectName() + "公众号的消息：" + message.getMessage());
    }
}
