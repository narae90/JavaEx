package com.javaex.thread;

public class MainThread {

	public static void main(String[] args) {
		// Working Thread 호출
		Thread thread = new DigitThread();
		thread.setName("DigitThread");
		// 쓰레드 시작
//		thread.run(); // 이렇게 직접 호출 하면 안됨
		thread.start();
		
		//main Thread 로직
		// A ~ Z 까지 출력
//		for(char ch = 'A'; ch <= 'Z'; ch++) {
//			System.out.println("Main Thread : " + ch);
//			
//			// 0.3초 대기
//			try {
//				Thread.sleep(300); // 300ms = 0.3s
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
		
		Thread thread2 = new Thread(new AlphabetThread());
		thread2.start();
		
		// 쓰레드의 우선순위 변경
		// 1 (MIN) ~ 5 (NOMAL) ~ 10 (MAX)
		thread.setPriority(Thread.MAX_PRIORITY);
		thread2.setPriority(Thread.MAX_PRIORITY);
		
		// MainThread의 흐름에 WorkingThread들의 흐름을 합류시켜야 함 //  다른 쓰레드들이 끝날때까지 Main도 함께 
		try {
			thread.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("End of MainThread!");
		
	}

}
