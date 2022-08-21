package mao.t1;

/**
 * Project name(项目名称)：java设计模式_观察者模式
 * Package(包名): mao.t1
 * Interface(接口名): Observer
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/21
 * Time(创建时间)： 13:10
 * Version(版本): 1.0
 * Description(描述)： 观察者类
 */

public interface Observer
{
    /**
     * 更新方法
     *
     * @param message 消息
     */
    void update(String message);
}
