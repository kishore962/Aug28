package org.sample;

public class PojoClass extends Encapsulation {
	private void sampleOne() {
    System.out.println("Extend the encapsulation");

	}
	public static void main(String[] args) {
		PojoClass k = new PojoClass();
		k.setId(77);
		k.setIdName("kishore");
		int j = k.getId();
		String a = k.getIdName();
		System.out.println(j);
		System.out.println(a);
	}

}
