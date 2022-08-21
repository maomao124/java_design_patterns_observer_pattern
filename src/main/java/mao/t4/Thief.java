package mao.t4;

import java.util.Observable;

/**
 * Project name(项目名称)：java设计模式_观察者模式
 * Package(包名): mao.t4
 * Class(类名): Thief
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/21
 * Time(创建时间)： 14:33
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Thief extends Observable
{
    private String name;

    public Thief(String name)
    {
        this.name = name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void sendMessage(String message)
    {
        System.out.println("小偷：本人在" + message + "偷东西，有本事来抓我");
        this.setChanged();
        this.notifyObservers(message);
        this.clearChanged();
    }
}
