package ncs.test4;

public class FruitTest {

	public static void main(String[] args) {
		FruitTest f = new FruitTest();
		Fruit[] fArray =f.initFruit(5);
		fArray[0]= new Fruit("apple",1200,3);
		fArray[1]= new Fruit("banana",2500,2);
		fArray[2]= new Fruit("grape",4500,5);
		fArray[3]= new Fruit("orange",800,10);
		fArray[4]= new Fruit("melon",5000,2);
		
		f.printFruit(fArray);

	}
	public Fruit[]	initFruit(int length) {
		Fruit[] fArray=new Fruit[length];
		return fArray;
	}
	public void printFruit(Fruit[] fruits) {
		for(int i=0;i<fruits.length;i++) {
			System.out.println(i +" = "+fruits[i].toString());
		}
	}
	
}
