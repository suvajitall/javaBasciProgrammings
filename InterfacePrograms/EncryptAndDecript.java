package InterfacePrograms;

interface encrypt_decrypt{
	public void encrypt();
	public void decrypt();
	
}

class AES implements encrypt_decrypt{
	
	String str="";
	AES(String str){
		this.str = str;
	}
	
	public void encrypt() {
	
		System.out.println("Encrypted for of "+str+" ==> ASDFGHJKSDFGHJ ==> AES ");
	}
	
	public void decrypt() {
		System.out.println("Decrypted for of "+str+" ==> AES ");
	}
}

class RSA implements encrypt_decrypt{
	String str="";
	
	RSA(String str){
		this.str = str;
	}
	
	public void encrypt() {
	
		System.out.println("Encrypted for of "+str+" ==> ASDFGHJKSDFGHJ ==> RSA ");
	}
	
	public void decrypt() {
		System.out.println("Decrypted for of "+str+" ==> RSA ");
	}
}
public class EncryptAndDecript {
	
		public static void main(String[] args) {
			
			String str = "Suvajit";
			encrypt_decrypt obj1 = new RSA(str);
			obj1.encrypt();
			obj1.decrypt();
		}
}
