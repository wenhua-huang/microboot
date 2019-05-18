package com.example.micorbootrestfulconsumer;

import com.example.microbootrestfulapi.vo.Member;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMemberRestful {

	@Test
	public void contextLoads() {
	}

	@Resource
	private RestTemplate restTemplate;

	/**
	 * 没有成功
	 */
	@Test
	public void testAdd() {
		Member member=new Member();
		member.setMid(110L);
		member.setAge(10);
		member.setName("wen");
		ResponseEntity<Boolean> flag = this.restTemplate.postForEntity("http://localhost:8090/member/add", member, Boolean.class
		);

		System.out.println("【ConsumerTest.add()】" + flag);
	}
	@Test
	public void testGet() {
		// 通过远程的Rest服务中的信息将其自动转换为Member对象实例
		Member member = this.restTemplate.getForObject(
				"http://localhost:8090/member/get?mid=110", Member.class);
		System.out.println("【ConsumerTest.get()】" + member);
	}

}
