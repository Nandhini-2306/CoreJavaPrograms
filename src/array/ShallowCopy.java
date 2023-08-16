package array;

public class ShallowCopy {

	public static void main(String[] args) {
		int num[][]= {{1,2,3,4,5},{6,7,8,9,10}};
		int cloneNum[][]=num.clone();
		System.out.println(num==cloneNum);
		System.out.println(num[0]==cloneNum[0]);
		System.out.println(num[1]==cloneNum[1]);
		for(int i=0; i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				System.out.println("=> "+num[i][j]);
			}
		}
		for (int i=0;i<cloneNum.length;i++) {
			for(int j=0;j<cloneNum[i].length;j++) {
				System.out.println("=> "+cloneNum[i][j]);
			}
			System.out.println(cloneNum[i]+ " ");
		}

	}

}
