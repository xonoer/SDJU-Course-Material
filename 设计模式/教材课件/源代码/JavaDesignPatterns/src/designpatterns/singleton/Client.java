//designpatterns.singleton.Client.java
package designpatterns.singleton;

//客户端测试类
public class Client {
	public static void main(String args[]) {
		//创建4个LoadBalancer对象
		LoadBalancer balancer1,balancer2,balancer3,balancer4;
		balancer1 = LoadBalancer.getLoadBalancer();
		balancer2 = LoadBalancer.getLoadBalancer();
		balancer3 = LoadBalancer.getLoadBalancer();
		balancer4 = LoadBalancer.getLoadBalancer();
		
		//判断服务器负载均衡器是否相同
		if (balancer1 == balancer2 && balancer2 == balancer3 && balancer3 == balancer4) {
			System.out.println("服务器负载均衡器具有唯一性！");
		}
		
		//增加服务器
		balancer1.addServer("Server 1");
		balancer1.addServer("Server 2");
		balancer1.addServer("Server 3");
		balancer1.addServer("Server 4");
		
		//模拟客户端请求的分发，如果输出结果全为同一个server，可以将i适当放大，
		//例如改为"i < 100"
		for (int i = 0; i < 10; i++) {
            String server = balancer1.getServer();
            System.out.println("分发请求至服务器： " + server);
        }
	}
}