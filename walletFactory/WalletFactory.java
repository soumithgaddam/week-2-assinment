
public class WalletFactory extends SourceWalletFactory{

	@Override
	public Wallet getWalletType(String type) {
		if(type.equals("BIFOLD"))
			return new BiFold();
		else if(type.equals("TRIFOLD"))
			return new TriFold();
		else if(type.contentEquals("TRAVEL"))
			return new Travel();
		else
		    return null;
	}
   
}
