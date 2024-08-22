package mypackage;

interface I1 {
	int id=22;
}
interface I2 extends I1{
}
class Multiple implements I1,I2{
	public static void main(String[] args) {
		System.out.println("value of id:"+id);
	}
}