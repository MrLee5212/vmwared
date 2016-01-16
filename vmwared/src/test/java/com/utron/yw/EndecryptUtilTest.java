package com.utron.yw;

import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.junit.Test;

import com.google.common.base.Preconditions;
import com.google.common.base.Strings;
import com.utron.yw.common.utils.EndecryptUtils;
import com.utron.yw.model.User;

public class EndecryptUtilTest {

	/**
	 * @param args
	 */
	@Test
	public void main() {
		
		Preconditions.checkArgument(!Strings.isNullOrEmpty("test"),"username不能为空");
        Preconditions.checkArgument(!Strings.isNullOrEmpty("111111"),"password不能为空");
        SecureRandomNumberGenerator secureRandomNumberGenerator=new SecureRandomNumberGenerator();
        String salt= secureRandomNumberGenerator.nextBytes().toHex();
        //组合username,两次迭代，对密码进行加密
        String password_cipherText= new Md5Hash("111111","test"+salt,2).toHex();
		
		System.out.println("salt:"+salt);
		System.out.println("password:"+password_cipherText);
	}

}
