package api.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

/**
 * @description: TODO
 * @author: dingj
 * @data: 2019年9月29日
 * @time: 下午3:31:06
 */

@Service
public class BootService {

	private static final Logger logger = LoggerFactory.getLogger(BootService.class);

	@Resource(name = "defaultThreadPool")
	private ThreadPoolTaskExecutor poolTaskExecutor;

	@Async
	public void testPool() {
		logger.info("线程名称：" + Thread.currentThread().getName());
	}

	public void testNoPool() {
		logger.info("线程名称：" + Thread.currentThread().getName());
	}

	public int testPoolTaskExecutor(int n) throws InterruptedException, ExecutionException {
		CountDownLatch countDownLatch = new CountDownLatch(n);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			final int index = i;
			final Future<Integer> future = poolTaskExecutor.submit(() -> {
				Thread.sleep(5000);
				System.out.println(
						simpleDateFormat.format(new Date()) + " " + Thread.currentThread().getName() + " 执行 " + index);
				countDownLatch.countDown();
				return 1;
			});
		}
		countDownLatch.await();
		return sum;
	}
}
