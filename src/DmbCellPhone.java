// �ڽ� Ŭ����

public class DmbCellPhone extends CellPhone {
	// field
	int channel;
	
	// creator
	
	DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	// method
	
	void turnOnDmb(int channel) {
		System.out.println("ä�� " + channel + "�� DMB ��� ������ �����մϴ�");
	}
	
	void changeChannelDmb(int channel) {
		System.out.println("ä�� " + channel + "������ �ٲߴϴ�");
	}
	
	void turnOffDmb() {
		System.out.println("DBM ��� ������ ����ϴ�");
	}
}
