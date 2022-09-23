// 자식 클래스 사용

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		//DmbCellPhone(자식) 객체 생성
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "검정", 10);
		
		//CellPhone(부모)으로부터 상속받은 필드
		System.out.println("모델: " + dmbCellPhone.model);
		System.out.println("색상: " + dmbCellPhone.color);
		
		//DmbCellPhone(자식)의 필드
		System.out.println("채널: " + dmbCellPhone.channel);
		
		//CellPhone(부모) 으로부터 상속받은 메소드 호출
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동인데요");
		dmbCellPhone.sendVoice("아~ 예 반갑습니다");
		dmbCellPhone.hangUp();
		
		//DmbCellPhon의 메소드 호출
		dmbCellPhone.turnOnDmb(15);
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}
}