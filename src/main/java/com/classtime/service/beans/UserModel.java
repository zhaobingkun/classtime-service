/**
 * 
 */
package com.classtime.service.beans;

import com.classtime.service.model.BaseObject;
import com.classtime.service.utils.StringTools;


@SuppressWarnings("serial")
public class UserModel extends BaseObject {
	private String username;
	private String password;
	private String validCode;// 验证码

	public UserModel()
	{

	}

	public UserModel(String username, String password)
	{
		this.username = username;
		this.password = password;
	}

	public String getUsername()
	{
		if (StringTools.hasText(username)) username = username.toLowerCase();
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getValidCode()
	{
		return validCode;
	}

	public void setValidCode(String validCode)
	{
		this.validCode = validCode;
	}

}
