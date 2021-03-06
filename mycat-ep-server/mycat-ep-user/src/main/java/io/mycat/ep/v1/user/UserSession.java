// **********************************************************************
//
// Copyright (c) 2003-2015 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.6.0
//
// <auto-generated>
//
// Generated from file `User.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package io.mycat.ep.v1.user;

public class UserSession implements java.lang.Cloneable, java.io.Serializable
{
    public int status;

    public String token;

    public long userId;

    public UserSession()
    {
        status = 1;
        token = "";
    }

    public UserSession(int status, String token, long userId)
    {
        this.status = status;
        this.token = token;
        this.userId = userId;
    }

    public boolean
    equals(java.lang.Object rhs)
    {
        if(this == rhs)
        {
            return true;
        }
        UserSession _r = null;
        if(rhs instanceof UserSession)
        {
            _r = (UserSession)rhs;
        }

        if(_r != null)
        {
            if(status != _r.status)
            {
                return false;
            }
            if(token != _r.token)
            {
                if(token == null || _r.token == null || !token.equals(_r.token))
                {
                    return false;
                }
            }
            if(userId != _r.userId)
            {
                return false;
            }

            return true;
        }

        return false;
    }

    public int
    hashCode()
    {
        int __h = 5381;
        __h = IceInternal.HashUtil.hashAdd(__h, "::user::UserSession");
        __h = IceInternal.HashUtil.hashAdd(__h, status);
        __h = IceInternal.HashUtil.hashAdd(__h, token);
        __h = IceInternal.HashUtil.hashAdd(__h, userId);
        return __h;
    }

    public UserSession
    clone()
    {
        UserSession c = null;
        try
        {
            c = (UserSession)super.clone();
        }
        catch(CloneNotSupportedException ex)
        {
            assert false; // impossible
        }
        return c;
    }

    public void
    __write(IceInternal.BasicStream __os)
    {
        __os.writeInt(status);
        __os.writeString(token);
        __os.writeLong(userId);
    }

    public void
    __read(IceInternal.BasicStream __is)
    {
        status = __is.readInt();
        token = __is.readString();
        userId = __is.readLong();
    }

    static public void
    __write(IceInternal.BasicStream __os, UserSession __v)
    {
        if(__v == null)
        {
            __nullMarshalValue.__write(__os);
        }
        else
        {
            __v.__write(__os);
        }
    }

    static public UserSession
    __read(IceInternal.BasicStream __is, UserSession __v)
    {
        if(__v == null)
        {
             __v = new UserSession();
        }
        __v.__read(__is);
        return __v;
    }
    
    private static final UserSession __nullMarshalValue = new UserSession();

    public static final long serialVersionUID = -1120188927L;
}
