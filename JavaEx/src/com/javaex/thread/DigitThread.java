package com.javaex.thread;

// Thread 상속
public class DigitThread extends Thread{

	@Override
	public void run() {
		// 쓰레드의 실행 로직
		// 주의 : 이 메소드는 직접 호출하지 말것! ->  Thread run (); (X)
		for(int i = 1; i <= 30; i++) {
			System.out.printf("%s: %d%n", getName(), i);  // 현재 쓰레드 이름
			
			// 0.3초 대기
			try{
				Thread.sleep(300); // 300ms = 0.3s
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
//		super.run();
	}
	

}
