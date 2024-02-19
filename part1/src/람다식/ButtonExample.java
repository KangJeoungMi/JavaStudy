package 람다식;

public class ButtonExample {
	public static void main(String[] args) {
		Button btnOK = new Button();
		
		btnOK.setClickListener(() -> {
			System.out.println(" ok 버튼클릭");
		});
		
		btnOK.Click();
		
		Button btnCancel = new Button();
		
		btnCancel.setClickListener(() -> {
			System.out.println("cancel 버튼 클릭");
		});
		
		btnCancel.Click();
		
	}
}
