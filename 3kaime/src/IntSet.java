
public class IntSet {
	int[] array;
	int num;
	
	public void init() {
		array = new int[4];
		num = 0;
	}
	public void add(int v) {
		if(find(v))return;
		if(num < 4 )array[num++] = v;
	}
	
	public boolean find(int v) {
		for(int i = 0;i < num;i++)
			if(array[i] == v)return true;
		return false;
	}
	
	public int count(){
		return array.length;
	}
	


	public void remove(int v) {
		int index = 0;
		int[] a = new int[array.length-1];
		for (int i : array) {
		    if (i == v) {
		        continue;
		    }
		    a[index] =  i;
		    index++;
		}
		
		array = a;
		num --;
	}
	
	public int getIndex(int v) {
		int index = 0;
		for(;index<array.length;index++) {
			if(array[index]==v)return index;
		}
		return -1;
		
	}
	
	
	

}
