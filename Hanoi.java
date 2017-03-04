import java.util.*;
public class Hanoi {
	private Rod rod1;
	private Rod rod2;
	private Rod rod3;
	private StringBuilder mySB;
	private int initialDiskNum;
	
	public Hanoi (int diskNum){
		this.initialDiskNum=diskNum;
		this.rod1 = new Rod('A', diskNum);
		this.rod2 = new Rod('B', 0);
		this.rod3 = new Rod('C', 0);
		StringBuilder mySB = new StringBuilder();
		for(int i=0;i<diskNum;i++){
			mySB.append("        \n");
		}
		mySB.append("A  B  C \n");
		
	}
	
	public void printStatus(){
		this.rod1.addStateToSB(this.mySB, this.initialDiskNum);
		this.rod2.addStateToSB(this.mySB, this.initialDiskNum);
		this.rod3.addStateToSB(this.mySB, this.initialDiskNum);
		System.out.println(this.mySB.toString());
		mySB.delete(0, mySB.capacity());
	}
	
	public boolean move(Rod removedFrom, Rod addedTo){
		Disk toMove = removedFrom.getDisk();
		boolean successfulMove = addedTo.addDisk(toMove);
		if(!successfulMove){
			removedFrom.addDisk(toMove);
			System.out.println("Illegal Move");;
		}
		return successfulMove;
	}
	
	public void recursiveTOH(){
		
	}

}