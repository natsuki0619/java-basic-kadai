package kadai_017;

// 子クラス加藤花子
public class KatoHanako_Chapter17 extends Kato_Chapter17 {
	
	String hanako ="";
	public void setgiveName(String name) {
		giveName = ("花子");
	}
	
	public void execIntroduce() {
			System.out.println("名前は" + familyName + giveName + "です");
			System.out.println("住所は" + address + "です");
	}
	
@Override
    public void eachIntroduce() {
	System.out.println("趣味は読書です");
	}
}
 