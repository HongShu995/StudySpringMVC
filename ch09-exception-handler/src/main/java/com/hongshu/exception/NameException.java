package com.hongshu.exception;

//表示当用户的姓名有异常时，抛出NameException
public class NameException extends MyUserException
{
    public NameException()
    {
        super();
    }

    public NameException(String message)
    {
        super(message);
    }
}
