package test;

public interface Testing {
		static void even() {
			System.out.println("static  method ");
		}
		default void odd() {
			System.out.println("default method ");
		}
		int minimal();
		
}
class TestingImp implements Testing{

	@Override
	public int minimal() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
