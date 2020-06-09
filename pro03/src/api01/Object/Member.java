package api01.Object;

public class Member {
	private String id;		// abc123  kim
	private String pass;

	public Member(String id) {
		this.id = id;
	}
	
	public Member(String id, String pass) {
		this.id = id;
		this.pass = pass;
	}
	
	@Override
	public boolean equals(Object obj) {			// lee
		if(obj instanceof Member) {
			Member mEq = (Member) obj;
			
			if(this.id.equals(mEq.id)&&this.pass.contentEquals(mEq.pass)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return id + "," + pass;
	}
}