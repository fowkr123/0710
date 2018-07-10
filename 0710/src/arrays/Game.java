package arrays;

//public class Game implements Comparable {
public class Game{
	//저장하고자 하는 항목
	private String job;
	private String nickname;
	private String createdate;
	private int money;
	private int level;

	//접근자메소드
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getCreatedate() {
		return createdate;
	}
	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	@Override
	public String toString() {
		return "Game [job=" + job + ", nickname=" + nickname + ", createdate=" + createdate + ", money=" + money
				+ ", level=" + level + "]";
	}
	
	/*
	//크기를 비교하는 메소드
	public int compareTo(Object o) {
		Game other = (Game)o;
		return other.level - this.level;
		//return this.job.compareTo(other.job);
	}
	 */
}
