package 중첩인터페이스;

public class ButtonExample {
	public static void main(String[] args) {
		button btnok = new button();
		
		class okListener implements button.ClickListener{

			@Override
			public void onClick() {
				System.out.println("ok버튼 클릭");
			}
			
		}
		
		btnok.setClickListener(new okListener());
		
		btnok.Click();
		
		button btncancel = new button();
		class CancelListener implements button.ClickListener{

			@Override
			public void onClick() {
				System.out.println("cancel버튼 클릭");
			}
			
		}
		btncancel.setClickListener(new CancelListener());
		
		btncancel.Click();
	}

}
