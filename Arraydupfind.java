package chinu.java;

public class Arraydupfind {
public static void main(String[] args) {
	int[]a={1,2,1,3,1,2,5,8,9,8};
	 int l= a.length;
	int[]dup=new int[l];
	for(int i=0;i<dup.length;i++){
		dup[i]=-1;
	}
	int count=0;
	for (int i = 0; i < dup.length; i++) {
	
		for(int j=i+1;j<dup.length;j++){
			
			if(a[i]==a[j]){
			  count++;
			  System.out.println(count);
			}
		}
		
	}
	/*for (int i : dup) {
		System.out.print(i);
	}*/
			

}
}
