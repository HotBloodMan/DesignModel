package obsermodel;

public class Test {

	public static void main(String[] args) {
		Watched w1=new ConcreteWatched();
		
		Watcher ww1=new ConcreteWatcher();
		Watcher ww2=new ConcreteWatcher();
		Watcher ww3=new ConcreteWatcher();
		
		w1.add(ww1);
		w1.add(ww2);
		w1.add(ww3);
		
		w1.notify("今天玩的开心哦。。。");
	}
}
