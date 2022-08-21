package mao.t3;

import java.util.Observer;

/**
 * Project name(项目名称)：java设计模式_观察者模式
 * Package(包名): mao.t3
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/21
 * Time(创建时间)： 14:13
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

        SubscriptionSubject observable1 = new SubscriptionSubject("腾讯新闻官方公众号");

        observable1.addObserver(observer1);
        observable1.addObserver(observer2);
        observable1.addObserver(observer3);
        observable1.addObserver(observer4);
        observable1.addObserver(observer5);

        Observer observer6 = new WechatUser("张里");
        Observer observer7 = new WechatUser("李五");
        Observer observer8 = new WechatUser("王久");

        SubscriptionSubject observable2 = new SubscriptionSubject("百度地图");
        observable2.addObserver(observer6);
        observable2.addObserver(observer7);
        observable2.addObserver(observer8);
        observable2.addObserver(observer3);

        observable1.sendNotify("你好，欢迎关注");

        System.out.println("-------");

        observable2.sendNotify("欢迎关注━(*｀∀´*)ノ亻!");

        System.out.println("-------");

        observable1.sendNotify("震惊！鸡蛋和石头竟然不能一起吃！原因竟然是......");
    }
}
