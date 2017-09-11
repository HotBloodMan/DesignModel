package obsermodel;

import java.util.ArrayList;
import java.util.List;

public class ConcreteWatched implements Watched{

	
	private List<Watcher> list=new ArrayList<>();
	@Override
	public void add(Watcher w) {
		list.add(w);
		
	}

	@Override
	public void remove(Watcher w) {
		// TODO Auto-generated method stub
		list.remove(w);
	}

	@Override
	public void notify(String s) {
		// TODO Auto-generated method stub
		for(Watcher a:list){
			a.update(s);
		}
	}

}
