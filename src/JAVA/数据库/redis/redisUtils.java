package JAVA.数据库.redis;

import redis.clients.jedis.Jedis;

/*
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import redis.clients.jedis.Jedis;
*/
public class redisUtils {

	public static void main(String[] args) {

		Jedis jedis = new Jedis("localhost");
		jedis.set("runoobkey", "www.runoob.com");
		jedis.close();
		// 获取存储的数据并输出
		System.out.println("redis 存储的字符串为: " + jedis.get("runoobkey"));

	}
	
	/*
	*//**
	 * 检测是否成功连接Redis服务
	 *//*
	public static void conductRedis() {
		Jedis jedis = new Jedis("localhost"); // 连接本地的Redis服务
		System.out.println("连接Redis服务成功");
		System.out.println("服务正在运行: " + jedis.ping()); // 查看服务是否运行
	}

	*//**
	 * 插入字符串
	 *//*
	public static void insertStr(String str) {
		Jedis jedis = new Jedis("localhost");
		jedis.set("runoobkey", "www.runoob.com");
		// 获取存储的数据并输出
		System.out.println("redis 存储的字符串为: " + jedis.get("runoobkey"));
	}

	*//**
	 * 插入列表
	 *//*
	public static void insertList() {
		Jedis jedis = new Jedis("localhost");
		// 存储数据到列表中
		jedis.lpush("site-list", "Runoob");
		jedis.lpush("site-list", "Google");
		jedis.lpush("site-list", "Taobao");
		// 获取存储的数据并输出
		List<String> list = jedis.lrange("site-list", 0, 2);
		for (int i = 0; i < list.size(); i++) {
			System.out.println("列表项为: " + list.get(i));
		}
	}

	*//**
	 * 查询所有key
	 *//*
	public static void queryAllKey() {
		Jedis jedis = new Jedis("localhost");
		// 获取数据并输出
		Set<String> keys = jedis.keys("*");
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println(key);
		}
	}

*/}
