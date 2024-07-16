package interfaceex;

public class Customer implements Buy, Sell{

	@Override
	public void buy() {
		System.out.println("�����ϱ�");
	}

	@Override
	public void sell() {
		System.out.println("�Ǹ��ϱ�");
	}

	@Override
	public void order() {
		System.out.println("�� �Ǹ� �ֹ�");
	}
}


