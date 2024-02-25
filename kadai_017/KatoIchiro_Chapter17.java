package kadai_017;

// 子クラス加藤一郎
public class KatoIchiro_Chapter17 extends Kato_Chapter17 {
	
	String hanako ="";
	public void setgiveName(String name) {
		giveName = ("一郎");
	}
	
	public void execIntroduce() {
			System.out.println("名前は" + familyName + giveName + "です");
			System.out.println("住所は" + address + "です");
	}

@Override
    public void eachIntroduce() {
	System.out.println("好きな食べ物はリンゴです");
    }
}
