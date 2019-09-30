package api.thread;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @description: TODO
 * @author: dingj
 * @data: 2019年9月29日
 * @time: 下午2:07:42
 */

@Component
public class Test {

	@Async
	public void test(int i) {
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		try {
			Thread.sleep(10000);
			System.out.println(
					"多线程异步执行" + i + "  " + Thread.currentThread().getName() + "  " + format.format(new Date()));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
