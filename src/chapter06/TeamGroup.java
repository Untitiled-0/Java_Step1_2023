package chapter06;

public class TeamGroup {

	private TeamMember[] member = new TeamMember[6];
	
	public void init() {
		member[0] = new TeamMember("허초회" , "남");
		member[1] = new TeamMember("윤영훈" , "남");
		member[2] = new TeamMember("김찬희" , "남");
		member[3] = new TeamMember("이재민" , "남");
		member[4] = new TeamMember("전솔민" , "남");
		member[5] = new TeamMember("장여주" , "여");
	}
	
	public void Disp() {
		for(int i=0; i<member.length;i++) {
			System.out.println("팀원  : " + member[i].getName() + "\t성별 : " + member[i].getGender());
		}
	}
	
	
}
