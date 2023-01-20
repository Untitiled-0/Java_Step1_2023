package chapter06;

public class TeamMember {

	public String teamName;// 팀명
	public String mName; // 팀장
	public String mphone;// 팀장번호
	public String sName; // 부팀장
	public String name;// 팀원
	public String gender; // 팀원들 성별

	public TeamMember() {
		// TODO Auto-generated constructor stub
	}

	public TeamMember(String name, String gender) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.gender = gender;
	}

	// 초기화
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public void setMphone(String mphone) {
		this.mphone = mphone;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getTeamName() {
		return teamName;
	}

	public String getmName() {
		return mName;
	}

	public String getMphone() {
		return mphone;
	}

	public String getsName() {
		return sName;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}
	
	
	
	
}
