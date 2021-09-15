
public class Application {

	public static void main(String[] args) {
SourceWalletFactory wallet=FactoryCreator.getSourceWalletFactory();
System.out.println(wallet.getWalletType("BIFOLD").getType());	
System.out.println(wallet.getWalletType("TRIFOLD").getType());	
System.out.println(wallet.getWalletType("TRAVEL").getType());	

	}

}