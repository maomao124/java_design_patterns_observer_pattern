package mao.t1;

/**
 * Project name(项目名称)：java设计模式_观察者模式
 * Package(包名): mao.t1
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/21
 * Time(创建时间)： 13:19
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    public static void main(String[] args)
    {
        Observer observer1 = new WechatUser("张三");
        Observer observer2 = new WechatUser("李四");
        Observer observer3 = new WechatUser("王五");
        Observer observer4 = new WechatUser("赵六");
        Observer observer5 = new WechatUser("王八");

        Subject subject1 = new SubscriptionSubject("腾讯新闻官方公众号");

        subject1.attach(observer1);
        subject1.attach(observer2);
        subject1.attach(observer3);
        subject1.attach(observer4);
        subject1.attach(observer5);

    }
}
