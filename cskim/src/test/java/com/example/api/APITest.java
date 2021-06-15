package com.example.api;

import org.junit.Test;
//import java.io.ByteArrayOutputStream;
//import java.io.InputStream;
//import java.io.IOException;
import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.ProtocolException;
import java.net.URL;
//import java.util.List;
//import java.util.Map;

import static org.junit.Assert.*;

public class APITest {
	@Test
	public void getTest() throws Exception {
		URL url;
		url = new URL("http://localhost:8080/api/members");
		// 문자열로 URL 표현
		System.out.println("URL :" + url.toExternalForm());
		// HTTP Connection 구하기
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		// 요청 방식 설정 ( GET or POST or .. 별도로 설정하지않으면 GET 방식 )
		con.setRequestMethod("GET");
		// 연결 타임아웃 설정
		con.setConnectTimeout(3000); // 3sec
		// 읽기 타임아웃 설정
		con.setReadTimeout(3000); // 3sec
		// 요청 방식 구하기
		//System.out.println("getRequestMethod():" + conn.getRequestMethod());
		// 응답 콘텐츠 유형 구하기
		//System.out.println("getContentType():" + conn.getContentType());
		// 응답 코드 구하기
		System.out.println("getResponseCode():" + con.getResponseCode());
		assertEquals(200, con.getResponseCode());
		/*try (InputStream in = conn.getInputStream();
		ByteArrayOutputStream out = new ByteArrayOutputStream()) {
			byte[] buf = new byte[1024 * 8];
			int length = 0;
			while ((length = in.read(buf)) != -1) {
				out.write(buf, 0, length);
			}
			String strBody = new String(out.toByteArray());
			System.out.println(strBody);
			//String[] array = strBody.split(":");
			//assertEquals(array[1], "1");
			//System.out.println(strBody);
		}*/
	} 
}	