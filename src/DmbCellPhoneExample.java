// �ڽ� Ŭ���� ���

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		//DmbCellPhone(�ڽ�) ��ü ����
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);
		
		//CellPhone(�θ�)���κ��� ��ӹ��� �ʵ�
		System.out.println("��: " + dmbCellPhone.model);
		System.out.println("����: " + dmbCellPhone.color);
		
		//DmbCellPhone(�ڽ�)�� �ʵ�
		System.out.println("ä��: " + dmbCellPhone.channel);
		
		//CellPhone(�θ�) ���κ��� ��ӹ��� �޼ҵ� ȣ��
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("��������");
		dmbCellPhone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���");
		dmbCellPhone.sendVoice("��~ �� �ݰ����ϴ�");
		dmbCellPhone.hangUp();
		
		//DmbCellPhon�� �޼ҵ� ȣ��
		dmbCellPhone.turnOnDmb(15);
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}
}