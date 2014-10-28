package chapter2.firstimpl;

public interface Subject {
	public boolean registerObserver(Observer observer);
	public boolean removeObserver(Observer observer);
	public void notifyObservers();
}
