
public class AustrailianTraffic implements CentralTraffic,ContinentalTraffic {

	
	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Green go implementation");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Red Stop implementation");
	}

	@Override
	public void FlashYellow() {
		System.out.println("Flash yellow implementation");
		
	}
	
	public void walkonsymbol()
	{
		System.out.println("walking");
	}
	
	@Override
	public void trainsymbol() {
		// TODO Auto-generated method stub
		System.out.println("stop walking");
	}
	public static void main(String[] args)
	{
		
		CentralTraffic a = new AustrailianTraffic(); //here as we are implementing methods of centraltraffic interface so class name is that
		// it means a new obj of class austrailiantraffic is created which is implementing methods of interface centraltraffic

		a.FlashYellow();
		a.redStop();
		a.greenGo();
		
		AustrailianTraffic a1 = new AustrailianTraffic();
		
		a1.walkonsymbol();
		
		ContinentalTraffic a2 = new AustrailianTraffic();
		a2.trainsymbol();
	}

	
}
