package obsermodel;

public interface Watched {
	public void add(Watcher w);
	public void remove(Watcher w);
	public void notify(String s);

}
