package mao.t2;

/**
 * Project name(项目名称)：java设计模式_观察者模式
 * Package(包名): mao.t2
 * Interface(接口名): Observer
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/21
 * Time(创建时间)： 13:42
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public interface Observer
{
    /**
     * 通知
     *
     * @param price 价格的涨跌
     */
    void update(float price);
}
