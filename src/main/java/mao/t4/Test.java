package mao.t4;

/**
 * Project name(项目名称)：java设计模式_观察者模式
 * Package(包名): mao.t4
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/21
 * Time(创建时间)： 14:37
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    public static void main(String[] args)
    {
        Thief thief = new Thief("法外狂徒张三");

        Policemen policemen1 = new Policemen("警察1");
        Policemen policemen2 = new Policemen("警察2");
        Policemen policemen3 = new Policemen("警察3");
        Policemen policemen4 = new Policemen("警察4");

        thief.addObserver(policemen1);
        thief.addObserver(policemen2);
        thief.addObserver(policemen3);
        thief.addObserver(policemen4);

        thief.sendMessage("北京故宫旁边");
    }
}
