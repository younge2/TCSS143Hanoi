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
	
	public Disk getDisk(){
		int diskIndex = diskStack.size()-1;
		Disk toReturn = diskStack.get(diskIndex);
		diskStack.remove(diskIndex);
		return toReturn;
	}
	
	public boolean addDisk(Disk toAdd){
		int diskIndex = diskStack.size()-1;
		Disk topDisk = diskStack.get(diskIndex);
		if (topDisk.getSize()>=toAdd.getSize()){
			diskStack.add(toAdd);
			return true;
		} else return false;
	}
	
	public void addStateToSB(StringBuilder mySB, int diskNum){
		
	}
	public String toString(StringBuilder mySB, int diskNum){
		return "default";
	}
	
}
