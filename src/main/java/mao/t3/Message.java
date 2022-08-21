package mao.t3;

/**
 * Project name(项目名称)：java设计模式_观察者模式
 * Package(包名): mao.t3
 * Class(类名): Message
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/21
 * Time(创建时间)： 14:08
 * Version(版本): 1.0
 * Description(描述)： 消息对象
 */


public class Message
{
    private String message;
    private String subjectName;


    /**
     * Instantiates a new Message.
     */
    public Message()
    {
    }

    /**
     * Instantiates a new Message.
     *
     * @param message     the message
     * @param subjectName the subject name
     */
    public Message(String message, String subjectName)
    {
        this.message = message;
        this.subjectName = subjectName;
    }

    /**
     * Gets message.
     *
     * @return the message
     */
    public String getMessage()
    {
        return message;
    }

    /**
     * Sets message.
     *
     * @param message the message
     * @return the message
     */
    public Message setMessage(String message)
    {
        this.message = message;
        return this;
    }

    /**
     * Gets subject name.
     *
     * @return the subject name
     */
    public String getSubjectName()
    {
        return subjectName;
    }

    /**
     * Sets subject name.
     *
     * @param subjectName the subject name
     * @return the subject name
     */
    public Message setSubjectName(String subjectName)
    {
        this.subjectName = subjectName;
        return this;
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("message：").append(message).append('\n');
        stringbuilder.append("subjectName：").append(subjectName).append('\n');
        return stringbuilder.toString();
    }
}
