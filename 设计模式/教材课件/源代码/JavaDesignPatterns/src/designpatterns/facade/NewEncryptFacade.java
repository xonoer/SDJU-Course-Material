//designpatterns.facade.NewEncryptFacade.java
package designpatterns.facade;

public class NewEncryptFacade extends AbstractEncryptFacade {
	private FileReader reader;
	private NewCipherMachine cipher;
	private FileWriter writer;
	
	public NewEncryptFacade() {
		reader = new FileReader();
		cipher = new NewCipherMachine();
		writer = new FileWriter();
	}
	
	public void fileEncrypt(String fileNameSrc, String fileNameDes) {
		String plainStr = reader.read(fileNameSrc);
		String encryptStr = cipher.encrypt(plainStr);
		writer.write(encryptStr,fileNameDes);
	}
}