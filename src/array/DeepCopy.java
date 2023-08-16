package array;

public class DeepCopy {

	public static void main(String[] args) {
			int []num= {0,1,2,3,4,5,6,7,8};
			int cloneNum[]=num.clone();
			System.out.println(num);
			System.out.println(cloneNum);
			System.out.println(num==cloneNum);
			for(int i=0; i<cloneNum.length; i++) {
				System.out.println(cloneNum[i]);
			}

	}

}
