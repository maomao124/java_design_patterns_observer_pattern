package mao.t1;

/**
 * Project name(项目名称)：java设计模式_观察者模式
 * Package(包名): mao.t1
 * Class(类名): WechatUser
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/21
 * Time(创建时间)： 13:12
 * Version(版本): 1.0
 * Description(描述)： 微信用户，具体观察者类
 */

public class WechatUser implements Observer
{
    //微信用户名
    private final String name;

    public WechatUser(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public void update(String message, String subjectName)
    {
        System.out.println("微信用户" + name + "接收到" + subjectName + "公众号的消息：" + message);
    }

}
