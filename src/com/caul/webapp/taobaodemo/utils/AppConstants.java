package com.caul.webapp.taobaodemo.utils;

import org.apache.commons.codec.digest.DigestUtils;

public class AppConstants {

	public static final String URL_SERVER = "http://gw.api.taobao.com/router/rest";
	public static final String APP_KEY = "23040932";
	public static final String APP_SECRET = "5bd60ab025d56405cae453161b73af26";
	
	public static final String URL_SERVER_SANDBOX = "http://gw.api.tbsandbox.com/router/rest";
	public static final String APP_KEY_SANDBOX = "1023040932";
	public static final String APP_SECRET_SANDBOX = "sandbox025d56405cae453161b73af26";
	
	public static final String URL_TOKEN_SANDBOX = "http://container.api.tbsandbox.com/container?encode=utf-8&appkey=";
	/* http://localhost/?
	 * top_appkey=1023040932
	 * &top_parameters=ZXhwaXJlc19pbj0xMjk2MDAwMCZpZnJhbWU9MSZyMV9leHBpcmVzX2luPTEyOTYwMDAwJnIyX2V4cGlyZXNfaW49MjU5MjAwJnJlX2V4cGlyZXNfaW49MTU1NTIwMDAmcmVmcmVzaF90b2tlbj02MTAwODI1NmE0ZTI2Njc0NjZjM2Q3MjJmZGQ0YmQxYzAxZjExYTY3YjdlZmUzZTM2NDM1NzA3MzYmdHM9MTQxNjMwMjQxMDQwNCZ2aXNpdG9yX2lkPTM2NDM1NzA3MzYmdmlzaXRvcl9uaWNrPXNhbmRib3hfc2RsaWFuZzEwMTMmdzFfZXhwaXJlc19pbj0xMjk2MDAwMCZ3Ml9leHBpcmVzX2luPTE4MDA%3D
	 * &top_session=6101225061f0928247c0d301af48df272177d5deb1234203643570736
	 * &agreement=true
	 * &agreementsign=1023040932-23605039-3643570736-F621EEE4A94C158BEA9AA3F996B65C1F
	 * &_tb_token_=4FoQWuDon
	 * &top_sign=HXB87NS4nRVSSZ2jKHviRw%3D%3D
	 */
	public static final String URL_TOKEN = "http://container.api.taobao.com/container?encode=utf-8&appkey=";
	public static final String URL_TOKEN_REFRESH = "http://container.open.taobao.com/container/refresh?appkey={appKey}&refresh_token={refreshToken}&sessionkey={sessionKey}&sign={sign}";
	
	
	
	public static void main(String[] args) {
		String data = "ZXhwaXJlc19pbj0xMjk2MDAwMCZpZnJhbWU9MSZyMV9leHBpcmVzX2luPTEyOTYwMDAwJnIyX2V4cGlyZXNfaW49MjU5MjAwJnJlX2V4cGlyZXNfaW49MTU1NTIwMDAmcmVmcmVzaF90b2tlbj02MTAwODI1NmE0ZTI2Njc0NjZjM2Q3MjJmZGQ0YmQxYzAxZjExYTY3YjdlZmUzZTM2NDM1NzA3MzYmdHM9MTQxNjMwMjQxMDQwNCZ2aXNpdG9yX2lkPTM2NDM1NzA3MzYmdmlzaXRvcl9uaWNrPXNhbmRib3hfc2RsaWFuZzEwMTMmdzFfZXhwaXJlc19pbj0xMjk2MDAwMCZ3Ml9leHBpcmVzX2luPTE4MDA%3D";
		System.out.println(DigestUtils.md5Hex(data));
	}
	
}
