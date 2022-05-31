import redis.clients.jedis.Jedis;

public class RedisDemo1 {

	public static void main(String[] args) {

		Jedis jedis = new Jedis("localhost");
		System.out.println("server is running: " + jedis.ping());
		
		jedis.set("user_name", "Mahesh");
		
		System.out.println(jedis.get("user_name"));
		
	}

}
