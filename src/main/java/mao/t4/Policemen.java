package mao.t4;

import java.util.Observable;
import java.util.Observer;

/**
 * Project name(项目名称)：java设计模式_观察者模式
 * Package(包名): mao.t4
 * Class(类名): Policemen
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/21
 * Time(创建时间)： 14:32
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Policemen implements Observer
{
    private String name;

    public Policemen(String name)
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

    @Override
    public void update(Observable o, Object arg)
    {
        System.out.println("警察：" + ((Thief) o).getName() + "，我在" + arg.toString() + "已经盯你很久了，你可以保持沉默，但你所说的将成为呈堂证供");
    }
}
