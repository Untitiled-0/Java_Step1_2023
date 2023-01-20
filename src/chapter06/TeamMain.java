package chapter06;

public class TeamMain {

	public static void main(String[] args) {
		TeamGroup team = new TeamGroup();
		TeamMember t = new TeamMember();
		
		t.setTeamName("팀허브");
		System.out.println("팀명 : " + t.getTeamName());
	
		System.out.println("----팀원명단----");
		team.init();
		team.Disp();
		
		//메소드를 통해서 팀명을 초기화	
		System.out.println();
		
		t.setmName("허초회");
		t.setMphone("010-1234-5678");
		t.setsName("윤영훈");
		
	
		System.out.println("팀명 : " + t.getTeamName());
		System.out.println("팀장 : " + t.getmName());
		System.out.println("팀장 전화번호 : " + t.getMphone());
		System.out.println("부팀장 : " + t.getsName());

	}
}
