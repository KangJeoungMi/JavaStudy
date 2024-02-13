package 중첩인터페이스;

public class button {
	public static interface ClickListener{
		void onClick();
	}
	
	private ClickListener clickListener;
	
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	public void Click() {
		this.clickListener.onClick();
	}
	

}
