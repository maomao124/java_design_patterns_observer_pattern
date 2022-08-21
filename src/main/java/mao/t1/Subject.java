package mao.t1;

/**
 * Project name(项目名称)：java设计模式_观察者模式
 * Package(包名): mao.t1
 * Interface(接口名): Subject
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/21
 * Time(创建时间)： 13:15
 * Version(版本): 1.0
 * Description(描述)： 抽象主题类
 */

public interface Subject
{

    /**
     * 添加订阅者
     *
     * @param observer Observer
     */
    void attach(Observer observer);

    /**
     * 删除订阅者
     *
     * @param observer Observer
     */
    void detach(Observer observer);

    /**
     * 通知或者发送消息给订阅者
     *
     * @param message String
     */
    void notify(String message);
}
