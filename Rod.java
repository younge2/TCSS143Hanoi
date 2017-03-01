import java.util.*;

public class Rod {
	private List<Disk> diskStack;
	private char name;
	
	public Rod(char theName, int diskNum) {
		this.name = theName;
		for(int i=0;i<diskNum;i++){
			Disk newDisk = new Disk(diskNum-i);
			this.diskStack.add(newDisk);
		}
		
	}
	
	public void getDisk(){
		
	}
	
	public void addDisk(){
		
	}
	
	public String toString(){
		return "default";
	}
	
}
